package task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class pushpa2_trailer {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.youtube.com/");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='search']")).sendKeys("pushpa2 trailer");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[id='search-icon-legacy']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[title='Pushpa 2 - The Rule Trailer (Hindi) | Allu Arjun | Sukumar | Rashmika Mandanna | Fahadh Faasil | DSP']")).click();
		

		//driver.quit();

	}

}
