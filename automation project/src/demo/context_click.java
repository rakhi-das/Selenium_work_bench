package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Generic.Generic_open_browser;

public class context_click {
	public static void main(String [] args) throws InterruptedException {
		WebDriver driver= Generic_open_browser.open_firefox();
		driver.get("https://www.facebook.com/");
		WebElement lang= driver.findElement(By.xpath("//a[@title='Hindi']"));
		Thread.sleep(1000);
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		act.moveToElement(lang).build().perform();
		Thread.sleep(2000);
		act.contextClick(lang).build().perform();
		Thread.sleep(2000);
}
}
