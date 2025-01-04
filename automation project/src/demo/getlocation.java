package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class getlocation {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://en-gb.facebook.com/?locale=en_GB");
		WebElement en = driver.findElement(By.xpath("//a[.='Forgotten password?']"));
	     Point loc = en.getLocation();
		System.out.println(loc);
		System.out.println(loc.getX()+"---"+loc.getY());

		Thread.sleep(1000);
		driver.quit();
	}
}
