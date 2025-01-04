package task;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Generic.Generic_open_browser;

public class Myntra_child_browser {
	public static void main (String [] args) throws InterruptedException{
		WebDriver driver = Generic_open_browser.open_chrome();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement search = driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"));
				search.sendKeys("Titan watches for women",Keys.ENTER);
			
				String p_id = driver.getWindowHandle();
				System.out.println(p_id);
				Thread.sleep(4000);    
		driver.findElement(By.xpath("//img[@title='Titan Women White Brass Dial & Rose Gold Toned Straps Analogue Watch 2656WM01']")).click();
		Set<String> all_id = driver.getWindowHandles();
		System.out.println(all_id);
		for(String id:all_id) {
		driver.switchTo().window(id);
		}
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='ADD TO BAG']")).click();
		driver.findElement(By.xpath("//span[.='Bag']")).click();
		driver.findElement(By.xpath("//button[.='REMOVE']")).click();
		driver.findElement(By.xpath("(//button[.='REMOVE'])[2]")).click();
		Thread.sleep(2000);
		driver.close();
	}
}
