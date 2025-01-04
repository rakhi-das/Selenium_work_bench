package task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class check_enabled {
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
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[2]")).click();
		Thread.sleep(1000);
		WebElement pdct_cart = driver.findElement(By.xpath("//body[@style='']//div[@id='bar-notification']"));
		boolean added = pdct_cart.isDisplayed();
		
		if(added) 
		{
			driver.findElement(By.linkText("Shopping cart")).click();
	        Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	        Thread.sleep(1000);
			driver.findElement(By.name("updatecart")).click();
	        Thread.sleep(2000);
		}
		else 
		{
			System.out.println("Confirmation Message is not displayed");
		}
		driver.findElement(By.className("ico-logout")).click();
        Thread.sleep(4000);
		driver.quit();
	}

}
