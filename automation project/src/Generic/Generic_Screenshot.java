package Generic;

import java.io.File;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class Generic_Screenshot {
	static String path = "C:\\Users\\user\\OneDrive\\Desktop\\SCREENSHOT\\";
	static String format = ".jpeg";
	public static void  SS_of_app(WebDriver driver){
		Date d = new Date();
		String s = d.toString();
		String date = s.replace(":", "-");
		try {
		TakesScreenshot tcs =(TakesScreenshot)driver;
		File src = tcs.getScreenshotAs(OutputType.FILE);
		File target = new File (path+date+format);
		
		FileHandler.copy(src, target);
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("exception occured");
		}
		
	}
	
	public static void  SS_of_ele(WebElement element){
		Date d = new Date();
		String s = d.toString();
		String date = s.replace(":", "-");
		try {
		File src= element.getScreenshotAs(OutputType.FILE);
		File target = new File (path+"element_photo\\"+date+format);
		FileHandler.copy(src, target);
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("exception occured");
		}
	}
		
}
