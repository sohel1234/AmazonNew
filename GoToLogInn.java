package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoToLogInn {

	
	public WebDriver driver;
	 
	  public GoToLogInn (WebDriver driver){
		  this.driver=driver;
	  }
	  
	  public  SignInn ToLogIn(){
		  driver.findElement(By.xpath(".//*[@id='ap_email']")).sendKeys("su.sohel@gmail.com");
		  driver.findElement(By.xpath(".//*[@id='ap_password']")).sendKeys("music1amazon");
		  driver.findElement(By.xpath(".//*[@id='signInSubmit']")).click();
		  
		  return new  SignInn(driver);
	  }
}
