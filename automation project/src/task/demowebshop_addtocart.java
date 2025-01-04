package task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demowebshop_addtocart {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		driver.findElement(By.className("ico-login")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("Email")).sendKeys("rakhidas8443@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("Password")).sendKeys("Rakhi@123");
		Thread.sleep(1000);
		driver.findElement(By.className("login-button")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Apparel & Shoes")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("50's Rockabilly Polka Dot Top JR Plus Size")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("add-to-cart-button-5")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Shopping cart")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("termsofservice")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("checkout")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("ico-logout")).click();
		Thread.sleep(1000);


		driver.quit();
	}

}
