package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webpage_sourcecode {
	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("file:///C:/Users/user/OneDrive/Desktop/WebPage12.html");
	Thread.sleep(2000);
	String pagesource = driver.getPageSource();
	System.out.println(pagesource);
	driver.quit();
	}


}
