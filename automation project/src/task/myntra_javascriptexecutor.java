package task;

import static Generic.Generic_open_browser.open_chrome;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class myntra_javascriptexecutor {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =open_chrome();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
	driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("bags for women",Keys.ENTER);
	WebElement sortby = driver.findElement(By.xpath("//div[text()='Sort by : ']"));

	Actions act = new Actions(driver);
	act.moveToElement(sortby).build().perform();
	Thread.sleep(2000);
	WebElement i=driver.findElement(By.xpath("//input[@value='new']"));
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();",i);
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//li[@class='product-base'])[1]")).click();
	Thread.sleep(2000);
	Set<String> all_id = driver.getWindowHandles();
	ArrayList<String> L = new ArrayList<>(all_id);
	String child =L.get(1);
	driver.switchTo().window(child);
	driver.findElement(By.xpath("//div[text()='ADD TO BAG']")).click();
	Thread.sleep(2000);
	driver.quit();
	}
}
