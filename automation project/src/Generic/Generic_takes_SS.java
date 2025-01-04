package Generic;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;


public class Generic_takes_SS {
	
	public static void  SS(WebDriver driver,int count){
		TakesScreenshot tcs =(TakesScreenshot)driver;
		File src = tcs.getScreenshotAs(OutputType.FILE);
		File target = new File ("C:\\Users\\user\\OneDrive\\Desktop\\SCREENSHOT\\defect"+count+".jpeg");
		count++;
		try {
		FileHandler.copy(src, target);
		}
		catch(Exception e){
			System.out.println("exception occured");
		}
		
		
	
	}
}
