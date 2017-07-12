package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import Pages.GoToLogInn;
import Pages.HomePage;


public class GoToLogInTest {
  WebDriver driver = new FirefoxDriver();
  
  
  @Test
  public void AmazonLogInPageTest(){
	  
	  driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		HomePage hp = new HomePage(driver);
		GoToLogInn gl = new GoToLogInn(driver);
		hp.AmazonToLogIn();
		gl.ToLogIn();
		driver.close();
		
		
		
  }
  
}

