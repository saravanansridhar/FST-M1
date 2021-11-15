package CRM_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Tc6 {
	

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
  public void test6() {
	  
	  WebElement Activities = driver.findElement(By.xpath("//a[@id='grouptab_3']"));
	  
	  System.out.println("The Activities item exists: " + Activities.isDisplayed());
	  
	  
	  
	  
  }
  
@AfterMethod
  
  public void close() {
	  
	  driver.close();
	  
  }
}
