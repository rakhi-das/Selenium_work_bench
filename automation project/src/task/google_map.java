package task;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
public class google_map {

		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			Thread.sleep(2000);
			driver.get("https://www.google.com/maps");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@aria-label='Directions']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@placeholder='Choose starting point, or click on the map...']")).sendKeys("Dakshineswar");
			Thread.sleep(4000);
			driver.findElement(By.xpath("//span[@class='XYuRPe' and text()='Dakshineswar']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@aria-label='Choose destination, or click on the map...']")).sendKeys("QSpiders JSpiders Kolkata");
			Thread.sleep(4000);
			driver.findElement(By.xpath("//span[@class='XYuRPe' and text()='QSpiders JSpiders Kolkata']")).click();

		}

	
}
