package task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demowebshop_registration {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		driver.findElement(By.className("ico-register")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("gender-female")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("FirstName")).sendKeys("Rakhi");
		Thread.sleep(1000);
		driver.findElement(By.id("LastName")).sendKeys("Das");
		Thread.sleep(1000);
		driver.findElement(By.id("Email")).sendKeys("rakhidas844129@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("Password")).sendKeys("Rakhi@123");
		Thread.sleep(1000);
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Rakhi@123");
		Thread.sleep(1000);
		driver.findElement(By.id("register-button")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("ico-logout")).click();

		//driver.quit();

	}


}
