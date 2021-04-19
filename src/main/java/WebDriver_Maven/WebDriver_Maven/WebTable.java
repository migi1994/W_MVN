package WebDriver_Maven.WebDriver_Maven;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
					System.setProperty("webdriver.chrome.driver","C:\\Users\\12408\\eclipse-workspace\\selenium-java-3.141.59\\d\\chromedriver.exe");
				 WebDriver driver 	  = new ChromeDriver();
					 driver.get("https://www.w3schools.com/html/html_tables.asp\r\n");
				  
					 driver.manage().window().maximize();
					 
					  driver.manage().timeouts().implicitlyWait(4000,TimeUnit.MILLISECONDS);
					List <WebElement> table= driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th"));
					System.out.println("Total no Columns :" + table.size ());
					
					  driver.manage().timeouts().implicitlyWait(4000,TimeUnit.MILLISECONDS);
						List <WebElement> table2= driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
						System.out.println("Total no row :" + table2.size ());
					
					  driver.manage().timeouts().implicitlyWait(4000,TimeUnit.MILLISECONDS);
						 WebElement table1= driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[4]/td[1]"));
						System.out.println("Data  :" + table1.getText ());
				         
						//============================scroll Example================================================]
						                                                                                                
						  driver.manage().timeouts().implicitlyWait(4000,TimeUnit.MILLISECONDS);
						 WebElement scrollElement=driver.findElement(By.xpath("//*[text()='Define an HTML Table']"));
						 JavascriptExecutor obj =(JavascriptExecutor) driver;
						 obj.executeScript("agruments[0]. scrollIntoView());",scrollElement);
								 
						  //============================scroll Example=================================================
						
						
						
						//driver.quit();
	}

}
