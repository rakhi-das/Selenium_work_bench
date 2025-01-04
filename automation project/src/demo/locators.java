package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class locators {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/user/OneDrive/Desktop/WebPage12.html");
		Thread.sleep(2000);
		//driver.findElement(By.tagName("input")).sendKeys("Selenium");
		driver.findElement(By.id("a1")).sendKeys("Selenium");
		driver.findElement(By.className("c2")).sendKeys("Selenium2");
		driver.findElement(By.name("n1")).click();

		//driver.quit();

	}

}
