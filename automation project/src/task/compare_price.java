package task;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Generic.Generic_open_browser;

public class compare_price {
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = Generic_open_browser.open_firefox();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']")).sendKeys("samsung s24 ultra",Keys.ENTER);
		Thread.sleep(3000);
		//WebElement price = driver.findElement(By.xpath("//div[text()='Relevance']/../../../../../../div[2]//div[text()='SAMSUNG Galaxy S24 Ultra 5G (Titanium Violet, 256 GB)']/../..//div[@class='col col-5-12 BfVC2z']/div[1]/div[1]/div[1]"));

		WebElement price = driver.findElement(By.xpath("(//div[text()='SAMSUNG Galaxy S24 Ultra 5G (Titanium Violet, 256 GB)'])[1]/../..//div[@class='col col-5-12 BfVC2z']/div[1]/div[1]/div[1]"));
		Thread.sleep(3000);

		String text = price.getText();

		String num = text.replace("₹", "").replace(",", "");
		
		int Flipkart_price= Integer.parseInt(num);
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys("samsung s24 ultra",Keys.ENTER);
		Thread.sleep(3000);

		WebElement price2 = driver.findElement(By.xpath("//span[text()='Samsung Galaxy S24 Ultra 5G (Titanium Violet, 256 GB) (12 GB RAM)']/../../../..//span[@class='a-price-whole'] "));
	
		String text2 = price2.getText();
		String num2 = text2.replace(",", "");

		int Amazon_price= Integer.parseInt(num2);

		System.out.println("In Flipkart Price is" + "-->" +Flipkart_price);
		System.out.println("In Amazon Price is" + "-->" +Amazon_price);
		
		if(Flipkart_price>Amazon_price) {
			System.out.println("In Flipkart Price of samsung s24 ultra is more than Amazon");
		}
		else {
			System.out.println("In Amazon Price of samsung s24 ultra is more than Flipkart");
	
		}
	}
}
