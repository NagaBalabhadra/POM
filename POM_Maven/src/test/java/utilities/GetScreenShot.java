package utilities;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class GetScreenShot {
	static WebDriver driver;
	public static void screenshot(WebDriver driver,String name) throws IOException{
		
		TakesScreenshot sc= (TakesScreenshot)driver;
	File s = sc.getScreenshotAs(OutputType.FILE);
		String destination="C:/Selenium/POM_Maven"+name+".png";
		File finaldestination = new File(destination);
		FileUtils.copyFile(s, finaldestination);
		//return destination;
	}
}
