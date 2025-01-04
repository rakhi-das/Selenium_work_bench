package demo;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;

import Generic.Generic_open_browser;

public class resolution_browser {
	public static void main(String [] args) throws InterruptedException {
		WebDriver driver= Generic_open_browser.open_firefox();
		driver.get("https://facebook.com");
		driver.manage().window().fullscreen();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		Dimension d = new Dimension(800,600);
		driver.manage().window().setSize(d);
		Point p = new Point(100,300);
		
		driver.manage().window().setPosition(p);
		driver.manage().deleteAllCookies();
		
		driver.quit();
	}
}
