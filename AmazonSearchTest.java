package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import Pages.GoToLogInn;
import Pages.HomePage;
import Pages.SignInn;

public class AmazonSearchTest {
	 WebDriver driver = new FirefoxDriver();
	  
	  
	  @Test
	  public void AmazonSearchTestt(){
		  
		  driver.get("https://www.amazon.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			HomePage hp = new HomePage(driver);
			GoToLogInn gl = new GoToLogInn(driver);
			SignInn si = new SignInn(driver);
			hp.AmazonToLogIn();
			gl.ToLogIn();
			si.Search();
			driver.close();
			
	  }		
			 
}
