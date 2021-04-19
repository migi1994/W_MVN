package WebDriver_Maven.WebDriver_Maven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FilUpload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  WebDriver driver ;
			System.setProperty("webdriver.chrome.driver","C:\\Users\\12408\\eclipse-workspace\\selenium-java-3.141.59\\d\\chromedriver.exe");
			 driver = new ChromeDriver();
			 driver.get("http://demo.guru99.com/test/upload/\r\n");
		  
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(4000,TimeUnit.MILLISECONDS);
			 
			 WebElement uploadf= driver.findElement(By.name("uploadfile_0"));
			 uploadf.sendKeys("C:\\Users\\12408\\Downloads\\EBooks.zip");
			 
			 
			 WebElement chekterms= driver.findElement(By.name("terms"));
			 chekterms.click();
			 
			 
			 WebElement submit= driver.findElement(By.name("send"));
			 submit.click();
			 
			 
			 
	}

}
