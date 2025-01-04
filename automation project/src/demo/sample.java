package demo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class sample {
	
public static void main(String[] args) throws InterruptedException
{
String key ="webdriver.gecko.driver";
String value = "./softwares/geckodriver.exe";
 
System.setProperty(key, value);
FirefoxDriver driver = new FirefoxDriver();

Thread.sleep(2000);
driver.close();

String key1 ="webdriver.chrome.driver";
String value1 = "./softwares/chromedriver.exe";
 
System.setProperty(key1, value1);
ChromeDriver driver1 = new ChromeDriver();

Thread.sleep(2000);
driver1.quit();


}
}
