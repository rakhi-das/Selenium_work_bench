package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class getcssvalue {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://en-gb.facebook.com/?locale=en_GB");
		WebElement login = driver.findElement(By.name("login"));
		 String cssvalue = login.getCssValue("width");
		System.out.println(cssvalue);

		Thread.sleep(1000);
		driver.quit();
	}
}
