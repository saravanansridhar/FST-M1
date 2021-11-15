package CRM_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Tc7 {
	

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
  public void test7() throws InterruptedException {
	  
	    
	  driver.findElement(By.xpath("//*[@id='grouptab_0']")).click();
	  
	  driver.findElement(By.xpath("//*[@id='moduleTab_9_Leads']")).click();
	  
	  Thread.sleep(1000);
	  
	  driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/form[2]/div[3]/table/tbody/tr[1]/td[10]/span/span")).click();
	  
	 System.out.println(driver.findElement(By.className("phone")).getText()); 
	  
  }
  
@AfterMethod
  
  public void close() {
	  
	  driver.close();
	  
  }
}
