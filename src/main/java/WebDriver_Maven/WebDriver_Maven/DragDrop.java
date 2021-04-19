package WebDriver_Maven.WebDriver_Maven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\12408\\eclipse-workspace\\selenium-java-3.141.59\\d\\chromedriver.exe");
		 WebDriver driver 	  = new ChromeDriver();
			 driver.get("http://demo.guru99.com/test/drag_drop.html\r\n");
		  
			 driver.manage().window().maximize();
			 
			  driver.manage().timeouts().implicitlyWait(4000,TimeUnit.MILLISECONDS);
	
	
	   WebElement From =driver.findElement(By.xpath("//*[@id='credit2']/a"));
	   WebElement To =driver.findElement(By.xpath("//*[@id='bank']/li"));
	   Actions action =new Actions(driver);
	   action.dragAndDrop(From, To).build().perform();
	
	}

}
