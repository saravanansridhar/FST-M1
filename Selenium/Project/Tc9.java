package CRM_Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Tc9 {
  
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
public void test8() throws InterruptedException {
	  
	    
	  driver.findElement(By.xpath("//*[@id='grouptab_0']")).click();	  
	  	  
	  driver.findElement(By.xpath("//*[@id='moduleTab_9_Accounts']")).click();
	  
	  Thread.sleep(10000);
	  
	  
	 // WebElement rows = driver.findElement(By.xpath("//table/tbody/tr[1]/td[3]/b/a"));
	  
	//  List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@class, 'list view table-responsive')]/tbody/tr"));
	  	  
	  
	 // System.out.println(rows.size());  
	
	// WebElement a = driver.findElement(By.xpath("//table[contains(@class, 'list view table-responsive')]/tbody/tr[1]/td[3]/b/a"));
	 
	// System.out.println(a.getText());
	
	for(int i=1; i<=10; i++) {
		
	    WebElement row = driver.findElement(By.xpath("//table[contains(@class, 'list view table-responsive')]/tbody/tr[" + i + "]/td[3]/b/a"));
	    System.out.println("Name " + i + ": " + row.getText());
		
	}  
	
for(int i=1; i<=10; i++) {
		
	    WebElement row = driver.findElement(By.xpath("//table[contains(@class, 'list view table-responsive')]/tbody/tr[" + i + "]/td[7]/a"));
	    System.out.println("User " + i + ": " + row.getText());
		
	} 
	  
	  	  		  		  		  
  }
@AfterMethod
  
  public void close() {
	  
	  driver.close();
	  
  }
}
