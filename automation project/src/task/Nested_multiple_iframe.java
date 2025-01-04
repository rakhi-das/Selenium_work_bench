package task;

import static Generic.Generic_open_browser.open_chrome;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Nested_multiple_iframe {
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver =open_chrome();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/frames/nestedWithMultiple?sublist=3");
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		List<WebElement> data = driver.findElements(By.xpath("//p[@class='para']"));
		int index =0;
		for(WebElement i:data)
		{
			String copy= i.getText();
			driver.switchTo().frame(0);
			driver.switchTo().frame(index);
			driver.findElement(By.xpath(".//input")).sendKeys(copy);
			driver.switchTo().parentFrame();
			driver.switchTo().parentFrame();
			index++;
		}
		
		driver.switchTo().frame(0);
		driver.switchTo().frame(3);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='Submit']")).click();
		
		driver.switchTo().defaultContent();
		boolean display = driver.findElement(By.xpath("//node()[.='Login successful!']")).isDisplayed();
		if(display) {
			System.out.println("Confirmation Message is displayed");
		}
		Thread.sleep(3000);
		driver.quit();
	}
}
