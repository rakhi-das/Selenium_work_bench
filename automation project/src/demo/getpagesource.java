package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class getpagesource {
	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	Thread.sleep(2000);
	driver.get("https://www.facebook.com/");
	String pagesource = driver.getPageSource();
	System.out.println(pagesource);
	driver.quit();
	}
}
