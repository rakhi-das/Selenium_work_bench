package task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class instagram_send_req {
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
		driver.findElement(By.cssSelector("svg[aria-label='Search']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[aria-label='Search input']")).sendKeys("niranjan_ka_18");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("span[class='x1lliihq x193iq5w x6ikm8r x10wlt62 xlyipyv xuxw1ft']")).click();
		Thread.sleep(10000);
		driver.findElement(By.cssSelector("div[class='_ap3a _aaco _aacw _aad6 _aade']")).click();
		Thread.sleep(10000);
		//driver.quit();
	}
}
