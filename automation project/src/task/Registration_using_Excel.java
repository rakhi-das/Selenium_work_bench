package task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static Generic.Generic_DDT.read_data;
import static Generic.Generic_open_browser.open_chrome;

public class Registration_using_Excel {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver =open_chrome();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.xpath("//a[.='Register']")).click();
	driver.findElement(By.xpath("//input[@id='gender-female']")).click();
	String firstname = read_data("Sheet1", 0, 1);
	driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys(firstname);
	String lasttname = read_data("Sheet1", 1, 1);
	driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys(lasttname);
	String Email = read_data("Sheet1", 2, 1);
	driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(Email);
	String Password = read_data("Sheet1", 3, 1);
	driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(Password);
	String Confirm_Password = read_data("Sheet1", 3, 1);
	driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys(Confirm_Password);
	driver.findElement(By.xpath("//input[@id='register-button']")).click();
	Thread.sleep(3000);
	driver.quit();
}
}
