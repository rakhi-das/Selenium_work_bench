package task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Generic.Generic_open_browser;

public class title_name_rating_product {

public static void main(String[] args) throws InterruptedException{
	WebDriver driver = Generic_open_browser.open_firefox();
	driver.get("https://www.amazon.in/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys("books",Keys.ENTER);
	Thread.sleep(2000);
	List<WebElement> all =driver.findElements(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
	
	
	int i=1;
	for(WebElement title:all) {
		WebElement text =title.findElement(By.xpath("(//div[@class='a-section a-spacing-small a-spacing-top-small']/div[1]/a/h2/span)["+i+"]"));
		String title_name = text.getText();
		System.out.println("Title of the Book --->" + title_name);
		
		WebElement p =title.findElement(By.xpath("(//div[@class='a-row a-size-base a-color-base']/div/a/span/span[2]/span[2])["+i+"]"));
		String price = p.getText();
		System.out.println("price of the Book --->" + price);
		
		WebElement r =title.findElement(By.xpath("(//div[@class='a-row a-size-small']/span/a)["+i+"]"));
		String rating = r.getAttribute("aria-label");
		System.out.println(rating);
		
		i++;
	}

	/* ANOTHER WAY

	int count = all.size();
	for(int s=0;s<count;s++) {
	List<WebElement> all_product =driver.findElements(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']/div[1]/a/h2/span"));
	List<WebElement> product_price =driver.findElements(By.xpath("//div[@class='a-row a-size-base a-color-base']/div/a/span/span[2]/span[2]"));
	List<WebElement> product_rating =driver.findElements(By.xpath("//div[@class='a-row a-size-small']/span/a"));
	
	for(int i=s;i==s;i++) {
		WebElement details = all_product.get(i);
		String title = details.getText();
		System.out.println( i + "."+ " Title of the Book --->" + title);
	

			WebElement details_price = product_price.get(i);
			String price = details_price.getText();
			System.out.println("Price of the Book --->" +price);
		
			WebElement details_rating = product_rating.get(i);
			String rating = details_rating.getAttribute("aria-label");
			System.out.println("Rating --->" +rating);
		}
		
	} */
	
    /*
	for(int i=s;i<count;i++) {
		WebElement details = all_product.get(i);
		String title = details.getText();
		System.out.println("Title of the Book --->" + title);
	
		
		
		for(int j=i;j==i;j++) {
			WebElement details_price = product_price.get(j);
			String price = details_price.getText();
			System.out.println("Price of the Book --->" +price);
		}
		
		for(int k=i;k==i;k++) {
			WebElement details_rating = product_rating.get(k);
			String rating = details_rating.getAttribute("aria-label");
			System.out.println("Rating --->" +rating);
		}
		
	} */
	}
	
}
