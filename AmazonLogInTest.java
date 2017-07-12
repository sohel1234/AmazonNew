package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import Pages.HomePage;

public class AmazonLogInTest {
	
	 WebDriver driver = new FirefoxDriver();
	  
	  
	  @Test
	  public void AmazonSignINTest(){
		  
		  driver.get("https://www.amazon.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			 HomePage hp =new  HomePage(driver);
			 hp.AmazonToLogIn();
			 driver.close();
			 
			 
	  }
}
