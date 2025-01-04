package task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demowebshop_login {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.className("ico-login")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys("rakhidas8443@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("Password")).sendKeys("Rakhi@123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input [@class = 'button-1 login-button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("ico-logout")).click();
		Thread.sleep(4000);


		driver.quit();

	}



}
