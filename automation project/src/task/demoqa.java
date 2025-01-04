package task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demoqa {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Rakhi");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Das");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("Rakhi12@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='gender-radio-2']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).sendKeys("9234567891");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='subjectsInput']")).sendKeys("com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(text(),'Computer')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='hobbies-checkbox-3']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("kolkata");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		Thread.sleep(1000);


	}
}
