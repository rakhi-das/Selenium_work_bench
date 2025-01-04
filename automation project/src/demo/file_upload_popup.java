package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Generic.Generic_open_browser;

public class file_upload_popup {
	public static void main (String [] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = Generic_open_browser.open_firefox();
		driver.get("file:///C:/Users/user/OneDrive/Desktop/file_upload.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("a1")).sendKeys("C:\\Users\\user\\OneDrive\\Pictures\\kitten-cat-butterflies-black-background-glowing-3840x2160-4495.jpg");
		Thread.sleep(2000);
		driver.quit();
	}
}
