package task;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Generic.Generic_open_browser;

public class facebook_langchange {
	public static void main(String [] args) throws InterruptedException, AWTException {
		WebDriver driver= Generic_open_browser.open_chrome();
		driver.get("https://www.facebook.com/");
		WebElement lang= driver.findElement(By.xpath("//a[@title='Hindi']"));
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.moveToElement(lang).build().perform();
		Thread.sleep(2000);
		act.contextClick(lang).build().perform();
		Thread.sleep(2000);
//		act.sendKeys(lang,Keys.CONTROL+"t" ).build().perform();
//		act.sendKeys(lang,"t").build().perform();
		Robot rob = new Robot();
		rob.keyPress(KeyEvent.VK_T);
		rob.keyRelease(KeyEvent.VK_T);
		
//		rob.keyPress(KeyEvent.VK_PAGE_DOWN);
//		rob.keyRelease(KeyEvent.VK_PAGE_DOWN);
//		rob.keyPress(KeyEvent.VK_ENTER);
//		rob.keyRelease(KeyEvent.VK_ENTER);

}
}