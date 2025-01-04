package task;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Generic.Generic_open_browser;

public class child_browser_popup_task {
	public static void main (String [] args) throws InterruptedException{
		WebDriver driver = Generic_open_browser.open_chrome();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement search = driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']"));
				search.sendKeys("Titan watches for women");
				search.submit();
				String p_id = driver.getWindowHandle();
				System.out.println(p_id);
				Thread.sleep(4000);    
		driver.findElement(By.xpath("//a[@title='Ring Watch Analog Watch  - For Women ES5246']")).click();
		Set<String> all_id = driver.getWindowHandles();
		System.out.println(all_id);
		for(String id:all_id) {
		driver.switchTo().window(id);
		}
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='Add to cart']")).click();
		Thread.sleep(5000);
		driver.close();
	}
}
