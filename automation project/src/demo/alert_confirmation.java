package demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Generic.Generic_open_browser;

public class alert_confirmation {
	public static void main (String [] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = Generic_open_browser.open_firefox();
		driver.get("https://demoapps.qspiders.com/ui/alert/confirm?sublist=1");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("buttonAlert5")).click();
		Thread.sleep(2000);
		Alert a = driver.switchTo().alert();
		a.accept();
//		a.dismiss();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='/ui/alert/prompt?sublist=2']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("buttonAlert1")).click();
		Thread.sleep(2000);
		System.out.println(a.getText());
		a.sendKeys("yes");
		a.accept();
		Thread.sleep(2000);
		driver.quit();
	}
}
