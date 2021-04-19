package WebDriver_Maven.WebDriver_Maven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\12408\\eclipse-workspace\\selenium-java-3.141.59\\d\\chromedriver.exe");
		 WebDriver driver 	  = new ChromeDriver();
			 driver.get("http://demo.guru99.com/test/delete_customer.php");
		  
			 driver.manage().window().maximize();
			 
			  driver.manage().timeouts().implicitlyWait(4000,TimeUnit.MILLISECONDS);
			   

				 driver.findElement(By.name("cusid")).sendKeys("12121");
				 driver.findElement(By.name("submit")).submit();
				 Alert alert= driver.switchTo().alert()	;
				 System.out.println(alert.getText());
				 alert.accept();
		
			  
	}

}
