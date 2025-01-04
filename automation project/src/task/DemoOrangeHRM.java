package task;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import Generic.Generic_open_browser;

public class DemoOrangeHRM {
	public static void main (String [] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = Generic_open_browser.open_chrome();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
//		LOGIN --->
		WebElement username_fetch = driver.findElement(By.xpath("//div[@class='orangehrm-login-error']/div/p[1]"));
		String txt_1 = username_fetch.getText();
		WebElement password_fetch = driver.findElement(By.xpath("//div[@class='orangehrm-login-error']/div/p[2]"));
		String txt_2 = password_fetch.getText();
		String UN =txt_1.replace("Username : " , "");
		String PWD =txt_2.replace("Password : " , "");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(UN);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(PWD);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[.=' Login ']")).click();
		Thread.sleep(1000);
		
//		PIM --->
		driver.findElement(By.xpath("//a//span[.='PIM']")).click();
		Thread.sleep(1000);
		
//		ADD EMPLOYEE
		driver.findElement(By.xpath("//a[.='Add Employee']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("popup");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("handle");
		Thread.sleep(1000);
		WebElement id = driver.findElement(By.xpath("//div[@class='oxd-grid-item oxd-grid-item--gutters']//input[@class='oxd-input oxd-input--active']"));
		id.sendKeys(Keys.CONTROL+"ax");
		id.sendKeys("5370");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type ='submit']")).click();
		
//		CHECK POP-UP DISPLAYED OR NOT --->
		WebDriverWait wait = new WebDriverWait(driver,3);
		try {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//node()[.='Successfully Saved']")));
		        		System.out.println("Confirmation Message is displayed");       	
		}
		catch(Exception e) {
				System.out.println("Confirmation Message is not displayed");
		}
	
		Thread.sleep(1000);
		driver.quit();
}
}


