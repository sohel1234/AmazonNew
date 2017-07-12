package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	public WebDriver driver;
	 
	  public HomePage (WebDriver driver){
		  this.driver=driver;
	  }
   public GoToLogInn  AmazonToLogIn(){
	   driver.findElement(By.xpath("//*[@id='nav-link-accountList']")).click();
	   return new GoToLogInn (driver);
   }
}
