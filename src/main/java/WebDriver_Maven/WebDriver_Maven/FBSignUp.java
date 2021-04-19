package WebDriver_Maven.WebDriver_Maven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FBSignUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	         WebDriver driver ;
			System.setProperty("webdriver.chrome.driver","C:\\Users\\12408\\eclipse-workspace\\selenium-java-3.141.59\\d\\chromedriver.exe");
			 driver = new ChromeDriver();
			 driver.get("https://www.facebook.com/");
		  
			 driver.manage().window().maximize();
			   
	
			 
                 driver.manage().timeouts().implicitlyWait(4000,TimeUnit.MILLISECONDS);
				 WebElement newAccount=driver.findElement(By.xpath("//a[text()='Create New Account']"));
				 newAccount.click();
				
				
				 WebElement firstname= driver.findElement(By.xpath("//input[@name='firstname']"));
				 firstname .sendKeys("migi");
			
				 driver.manage().timeouts().implicitlyWait(4000,TimeUnit.MILLISECONDS);
				 WebElement lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
				 lastname .sendKeys("Mesfun");
				
				
				 driver.manage().timeouts().implicitlyWait(4000,TimeUnit.MILLISECONDS);
				 WebElement email=driver.findElement(By.xpath("//input[@name='reg_email__']"));
				 email.sendKeys("defg@123.com");
				
				 driver.manage().timeouts().implicitlyWait(3000,TimeUnit.MILLISECONDS);
				 WebElement reemail=driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
				 reemail.sendKeys("defg@123.com");
				
				 driver.manage().timeouts().implicitlyWait(4000,TimeUnit.MILLISECONDS);
				 WebElement password=driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
				 password .sendKeys("12345@abc");
		 	
					
				 driver.manage().timeouts().implicitlyWait(3000,TimeUnit.MILLISECONDS);
				 WebElement Month=driver.findElement(By.xpath("//select[@title='Month']"));
				Select month = new Select (Month);
				 month.selectByVisibleText("Jan");
				 
				 driver.manage().timeouts().implicitlyWait(3000,TimeUnit.MILLISECONDS);
				 WebElement Day=driver.findElement(By.xpath("//select[@title='Day']"));
				Select day = new Select (Day);
				 day.selectByVisibleText("1");
				 
				 driver.manage().timeouts().implicitlyWait(3000,TimeUnit.MILLISECONDS);
				 WebElement Year=driver.findElement(By.xpath("//select[@title='Year']"));
				Select year = new Select (Year);
				year.selectByVisibleText("1970");
		
			       driver.manage().timeouts().implicitlyWait(4000,TimeUnit.MILLISECONDS);
					 WebElement gender=driver.findElement(By.xpath("//input[@type='radio' and @value='2']"));
					 gender.click();
					 
					  driver.manage().timeouts().implicitlyWait(4000,TimeUnit.MILLISECONDS);
						 WebElement SignUp=driver.findElement(By.xpath("//button[@type='submit'and @name='websubmit']"));
						 SignUp.click();
	}

}
