package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Generic.Generic_open_browser;
import Generic.Handling_Dropdown;
// calendar pop-up
public class hidden_division {
	public static void main (String [] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = Generic_open_browser.open_firefox();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("dateOfBirthInput")).click();
		Thread.sleep(2000);
		
		WebElement dp= driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
		Select s1= Handling_Dropdown.dp(dp);
		Thread.sleep(1000);
		s1.selectByVisibleText("June");
		Thread.sleep(1000);

		WebElement dp2= driver.findElement(By.className("react-datepicker__year-select"));
		Select s2= Handling_Dropdown.dp(dp2);
		Thread.sleep(1000);
		s2.selectByVisibleText("2020");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//div[.='25']")).click();
		Thread.sleep(2000);
//		driver.quit();
	
	}
}
