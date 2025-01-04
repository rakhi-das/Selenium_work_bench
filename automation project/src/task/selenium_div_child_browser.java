package task;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Generic.Generic_open_browser;

public class selenium_div_child_browser {
	public static void main (String [] args) throws InterruptedException, AWTException {
//		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = Generic_open_browser.open_firefox();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		List<WebElement> top_nav_ele = driver.findElements(By.xpath("//li[@class='nav-item mr-4 mb-2 mb-lg-0']"));
		Actions act = new Actions(driver);
		Robot new_tab = new Robot();

		for(WebElement ele :top_nav_ele) {
			act.contextClick(ele).perform();
//			Thread.sleep(1000);
			new_tab.keyPress(KeyEvent.VK_T);
			new_tab.keyRelease(KeyEvent.VK_T);
		}
		
		Set<String> all_id =driver.getWindowHandles();
		ArrayList<String> al = new ArrayList<String>(all_id);
		String child_id = al.get(1);
//		Thread.sleep(2000);
		driver.switchTo().window(child_id);
		System.out.println(driver.getTitle());
//		Thread.sleep(2000);
		driver.close();
//		Thread.sleep(6000);
//		driver.quit();
	}
}
