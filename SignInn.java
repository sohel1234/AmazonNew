package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInn {

	public WebDriver driver;
	 
	  public SignInn  (WebDriver driver){
		  this.driver=driver;
	  }

	  public void Search(){
		  driver.findElement(By.xpath(".//*[@id='twotabsearchtextbox']")).sendKeys("Book");
		  driver.findElement(By.xpath(".//*[@id='nav-search']/form/div[2]/div/input")).click();
		  
		  
	  }
	  
	  
	  
}
