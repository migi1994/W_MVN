

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {




	public static void main(String[] args)  throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\12408\\eclipse-workspace\\selenium-java-3.141.59\\d\\chromedriver.exe");
		 WebDriver driver 	  = new ChromeDriver();
			 driver.get("http://demo.guru99.com/test/drag_drop.html\r\n");
		  
			 driver.manage().window().maximize();
			 
			  driver.manage().timeouts().implicitlyWait(4000,TimeUnit.MILLISECONDS);
			   
			  TakesScreenshot obj= (TakesScreenshot) driver;
			     File source = obj.getScreenshotAs(OutputType.FILE);
			        
			        FileUtils.copyFile(source, new File("screenshots/test.png"));



 
			  
	}

}
