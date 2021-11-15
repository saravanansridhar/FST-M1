package CRM_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Tc5 {
	
	
	WebDriver driver;
	
	
  @BeforeMethod
	
	public void setup() {
		
		driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/crm/");	
		
		driver.findElement(By.xpath("//*[@id='user_name']")).sendKeys("admin");
		
		driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
		driver.findElement(By.id("bigbutton")).click();
		
	}

  @Test
  public void test5() {
	  
	 System.out.println(driver.findElement(By.xpath("//*[@id='toolbar']")).getCssValue("color")); 	
	  
  }
  
 @AfterMethod
  
  public void close() {
	  
	  driver.close();
	  
  }
}
