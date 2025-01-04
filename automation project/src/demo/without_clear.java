package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Generic.Generic_open_browser;

public class without_clear {
public static void main(String [] args) throws InterruptedException {
	WebDriver driver= Generic_open_browser.open_firefox();
	driver.get("file:///C:/Users/user/OneDrive/Desktop/WebPage12.html");
	WebElement username = driver.findElement(By.xpath("//input[@id='a1']"));
	username.sendKeys("Rakhi");
	Thread.sleep(1000);
	username.sendKeys(Keys.CONTROL+"a");
	Thread.sleep(1000);
	username.sendKeys(Keys.DELETE);
}
}
