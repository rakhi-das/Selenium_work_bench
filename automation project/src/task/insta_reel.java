package task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class insta_reel {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.findElement(By.cssSelector("input[class='_aa4b _add6 _ac4d _ap35']")).sendKeys("rakhidas8443@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[aria-label='Password']")).sendKeys("dasrakhi@887");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button[class=' _acan _acap _acas _aj1- _ap30']")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("svg[aria-label='Reels']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[name()='svg' and @aria-label='Audio is muted']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[name()='svg' and @aria-label='Like']")).click();
		driver.findElement(By.xpath("//*[name()='svg' and @aria-label='Like']")).click();
		

		
		//driver.quit();
	}
}
