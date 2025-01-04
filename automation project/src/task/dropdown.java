package task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Generic.Generic_open_browser;


public class dropdown {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= Generic_open_browser.open_chrome();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.findElement(By.partialLinkText("Apparel & Shoes")).click();
		WebElement dp1= driver.findElement(By.id("products-orderby"));
		Select s1= new Select(dp1);
		Thread.sleep(1000);
		s1.selectByIndex(1);
		
		WebElement dp2= driver.findElement(By.id("products-pagesize"));
		Select s2= new Select(dp2);
		Thread.sleep(1000);
		s2.selectByVisibleText("12");
		
		WebElement dp3= driver.findElement(By.id("products-viewmode"));
		Select s3= new Select(dp3);
		Thread.sleep(1000);
		s3.selectByIndex(1);
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[3]")).click();
		driver.findElement(By.xpath("//span[.='Shopping cart']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='removefromcart']")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("updatecart")).click();
		Thread.sleep(2000);
		driver.quit();
	}
}