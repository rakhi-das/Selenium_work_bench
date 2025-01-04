package task;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Generic.Generic_open_browser;

public class selenium_dev{
public static void main (String [] args) throws InterruptedException, AWTException {
	System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	WebDriver driver = Generic_open_browser.open_chrome();
	driver.get("https://www.selenium.dev/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	List<WebElement> top_nav_ele = driver.findElements(By.xpath("//li[@class='nav-item mr-4 mb-2 mb-lg-0']"));
	for(WebElement ele :top_nav_ele) {
		Actions act = new Actions(driver);
		act.contextClick(ele).perform();
		Thread.sleep(2000);
		Robot new_tab = new Robot();
		new_tab.keyPress(KeyEvent.VK_T);
		new_tab.keyRelease(KeyEvent.VK_T);
	}
	driver.quit();
}
}
