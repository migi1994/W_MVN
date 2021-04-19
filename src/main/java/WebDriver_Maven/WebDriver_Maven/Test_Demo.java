package WebDriver_Maven.WebDriver_Maven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Demo {
	 WebDriver driver ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test_Demo obj=new Test_Demo ();
		obj.setup();
		obj.Login();
		
		}	
		public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\12408\\eclipse-workspace\\selenium-java-3.141.59\\d\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://www.youtube.com/");
	  
		 driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(300,TimeUnit.MILLISECONDS);
	}
	 
	public void Login(){
		
	    
	  driver.findElement(By.id("search")) .sendKeys("bethel music");
	   
   
	     driver.findElement(By.id("search-icon-legacy"))
	    .click();
	    
	     driver.findElement(By.id("logo-icon"))
		    .click();
	 
	
	
   

}
}