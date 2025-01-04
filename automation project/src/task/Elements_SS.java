package task;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Generic.Generic_Screenshot;
import Generic.Generic_open_browser;

public class Elements_SS {
	public static void ss(WebDriver driver) throws InterruptedException{

		List<WebElement> cart=driver.findElements(By.xpath("//div[@class='product-item']"));
		Thread.sleep(2000);
		for(WebElement i:cart) {
			try {
				
		WebElement addtocart = i.findElement(By.xpath("(.//input[@value='Add to cart'])"));
		Thread.sleep(2000);
		boolean displayed = addtocart.isDisplayed();
		Thread.sleep(1000);
		if(displayed) {
	
				System.out.println("Add to Cart  button is displayed for");
			}
			}
		catch(Exception e){
			System.out.println("Add to cart is not displayed");
			Thread.sleep(2000);
			Generic_Screenshot.SS_of_ele(i);
		}
	}
	}
	public static void main(String[] args) throws IOException, InterruptedException{
		WebDriver driver = Generic_open_browser.open_chrome();

		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Apparel & Shoes")).click();
		Thread.sleep(1000);
		ss(driver);
		driver.findElement(By.xpath("//a[.='Next']")).click();
		ss(driver);
	Thread.sleep(2000);
	driver.quit();
	}

}




