package task;

import static Generic.Generic_open_browser.open_chrome;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Nested_iframe {
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver =open_chrome();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/frames/nested?sublist=1");
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		List<WebElement> data = driver.findElements(By.xpath("//p[@class='para']"));
		int c =1;
		for(WebElement i:data)
		{
			String copy= i.getText();
			driver.switchTo().frame(0);
			driver.findElement(By.xpath("(//div[@class='form-group']//input)["+c+"]")).sendKeys(copy);
			driver.switchTo().parentFrame();
			c++;
		}
		
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='Sign Up']")).click();
		
		driver.switchTo().defaultContent();
		boolean display = driver.findElement(By.xpath("//node()[.='Sign up successful!']")).isDisplayed();
		if(display) {
			System.out.println("Confirmation Message is displayed");
		}
		Thread.sleep(3000);
		driver.quit();
	}

}
