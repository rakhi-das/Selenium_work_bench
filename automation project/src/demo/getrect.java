package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class getrect {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://en-gb.facebook.com/?locale=en_GB");
		WebElement login = driver.findElement(By.name("login"));
		 Rectangle size = login.getRect();
		System.out.println(size.getHeight());
		System.out.println(size.getWidth());
		Thread.sleep(1000);
		driver.quit();
	}
}
