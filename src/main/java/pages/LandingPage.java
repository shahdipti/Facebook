package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LandingPage {
	WebDriver driver;

	public LandingPage(WebDriver args) {
		driver=args;
}

	public String error() {
		WebDriverWait wait=new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("reg_error_inner"))));
		
	   String actualinfo =	driver.findElement(By.id("reg_error_inner")).getText();
	   return actualinfo;
	 
	   
	    
		
}
}