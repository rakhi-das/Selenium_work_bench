package task;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Generic.Generic_open_browser;
import Generic.Generic_takes_SS;

public class Takes_Screenshot {
	public static void main(String[] args) throws InterruptedException, IOException{
		WebDriver driver = Generic_open_browser.open_chrome();

		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Apparel & Shoes")).click();
		Thread.sleep(1000);
		int count=1;
		
		List<WebElement> cart=driver.findElements(By.xpath("//input[@value='Add to cart']"));

		for(WebElement i:cart) {
			i.click();
		Thread.sleep(2000);
		WebElement pdct_cart = driver.findElement(By.xpath("//div[@id='bar-notification']"));
		boolean added = pdct_cart.isDisplayed();
		
		try{
			if(added) {
				System.out.println("Confirmation Message is  displayed");

				driver.findElement(By.linkText("Shopping cart")).click();
	        	Thread.sleep(1000);
	            driver.findElement(By.name("removefromcart")).click();
	        	Thread.sleep(1000);
				driver.findElement(By.name("updatecart")).click();
				Thread.sleep(1000);
				driver.navigate().back();
				Thread.sleep(1000);
				driver.navigate().back();
			}
		else 
		{
			System.out.println("Confirmation Message is not displayed");
			driver.navigate().back();
			Generic_takes_SS.SS(driver,count);

		}
		}
		catch(Exception e) {
			System.out.println("Exception Handled");
		}
		
		Thread.sleep(2000);
	}
	
		
		
//		driver.findElement(By.className("ico-logout")).click();
//        Thread.sleep(000);
		driver.quit();
	}


}
