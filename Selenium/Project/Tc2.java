package CRM_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Tc2 {
 

	WebDriver driver;
	
	
  @BeforeMethod
	
	public void setup() {
		
		driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/crm/");	
			
	}
  
  
  @Test
  
  public void test2() {
	  
	  String urlLocator =  driver.findElement(By.tagName("img")).getAttribute("src");
	  
	  
	  System.out.println( urlLocator);
	  
	  
	  
	  
  }
  

  @AfterMethod
  
  public void close() {
	  
	  driver.close();
	  
  }

  
}
