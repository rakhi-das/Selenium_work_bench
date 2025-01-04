package task;

import static Generic.Generic_open_browser.open_chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Scroll {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver =open_chrome();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	Thread.sleep(2000);
	WebElement ele=driver.findElement(By.xpath("(//span[@class='icp-color-base'])[1]"));
	Point loc = ele.getLocation();
	int y=loc.getY();
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,"+y+")");
	Thread.sleep(2000);
	Actions act = new Actions(driver);
	Thread.sleep(2000);
	act.moveToElement(ele).build().perform();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//span[.='বাংলা'])[2]")).click();
	driver.quit();
}
}
