package CRM_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Tc3 {
 
  WebDriver driver;
	
	
  @BeforeMethod
	
	public void setup() {
		
		driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/crm/");	
			
	}
  
  
  @Test
  
  public void test3() {
	  
	  String CopyRightTXT =  driver.findElement(By.id("admin_options")).getText();
	  
	  
	  System.out.println( CopyRightTXT);
	  
	  
	  
	  
  }
  

  @AfterMethod
  
  public void close() {
	  
	  driver.close();
	  
  }

}
