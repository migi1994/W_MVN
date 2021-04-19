package WebDriver_Maven.WebDriver_Maven;



import java.util.concurrent.TimeUnit; 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
 WebDriver driver ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  LoginTest obj = new LoginTest();
		  obj.Setup();
		  obj.Login();
	}
	       
	   
	  public void Setup() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\12408\\eclipse-workspace\\selenium-java-3.141.59\\d\\chromedriver.exe");
		driver= new ChromeDriver();
			 driver.get("https://www.simplilearn.com/");
		  
			 driver.manage().window().maximize();
			 
			  driver.manage().timeouts().implicitlyWait(4000,TimeUnit.MILLISECONDS);
	  }
			public void Login() {
		    WebElement loginlink = driver.findElement(By.partialLinkText("Log in"));
	        loginlink.click();
	       
	  	  driver.manage().timeouts().implicitlyWait(4000,TimeUnit.MILLISECONDS);
	        WebElement username = driver.findElement(By.name(" user_login"));
	        username.sendKeys("bCcb@123");
	  
	  	  driver.manage().timeouts().implicitlyWait(4000,TimeUnit.MILLISECONDS);
	        WebElement pwd = driver.findElement(By.name("user_pwd"));
	        pwd.sendKeys("114@123");
	        
	  	  driver.manage().timeouts().implicitlyWait(4000,TimeUnit.MILLISECONDS);
	        WebElement check = driver.findElement(By.className("rememberMe"));
            check.click();
           
          //driver.close();
	}

}
