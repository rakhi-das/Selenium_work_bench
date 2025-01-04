package task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class qtalk
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://chat.qspiders.com/");
		driver.findElement(By.name("username")).sendKeys("rakhidas8443@gmail.com");
		driver.findElement(By.name("password")).sendKeys("dasrakhi@887");
		driver.findElement(By.cssSelector("button[type='submit'")).click();
		Thread.sleep(60000);
		driver.findElement(By.name("search")).sendKeys("Niranjan L T");
		Thread.sleep(20000);
		driver.findElement(By.cssSelector("div[class='_chat_tickmark__SjNlz']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='message']")).sendKeys("hii");
        Thread.sleep(1000);
		driver.findElement(By.className("chatSubmitButton")).click();
		Thread.sleep(4000);
		//driver.quit();
	}
}
