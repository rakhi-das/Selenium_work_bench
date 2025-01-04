package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Generic_open_browser 
{
	public static WebDriver driver;
	public static WebDriver open_chrome()
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		driver=new ChromeDriver();
		return driver;
	}
	public static WebDriver open_firefox()
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		driver=new FirefoxDriver();
		return driver;
	}
}
