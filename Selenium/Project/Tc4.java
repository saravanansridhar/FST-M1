package CRM_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Tc4 {
	  WebDriver driver;
				
	  @BeforeMethod
				public void setup() {
			
			driver = new FirefoxDriver();
			driver.get("https://alchemy.hguy.co/crm/");	
		
		}
	  
	 
	  @Test
	  public void test3() {
		  
		  driver.findElement(By.xpath("//*[@id='user_name']")).sendKeys("admin");
			
			driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
			driver.findElement(By.id("bigbutton")).click();
			System.out.println(driver.getTitle()); 
			
			String  heading =   driver.getTitle(); 
			  
		Assert.assertEquals("Login unsuccessfull", "SuiteCRM",heading);	 
			
			 
		  
	}
	  

	  @AfterMethod
	 
	  public void close() {
		 
		  driver.close();
		  
	  }
}
