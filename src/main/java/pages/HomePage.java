package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver args) {
		driver=args;
		
	}
	
	public void personalDetails(String fname, String lname, String email, String password) {
		driver.findElement(By.name("firstname")).sendKeys(fname);
		driver.findElement(By.name("lastname")).sendKeys(lname);
		driver.findElement(By.name("reg_email__")).sendKeys(email);
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys(email);
		driver.findElement(By.name("reg_passwd__")).sendKeys(password);
		
		
	}
	public void bDate(String date) {
		
		String[] dob = date.split("-");
		String month = dob[0];
		String day = dob[1];
		String year = dob[2];
		
		
		/* 01-30-1999
		String month= date.substring(0, 2);
		String day = date.substring(3, 5);
		String year = date.substring(6, 10);*/
		System.out.println("D: "+ day+" M: "+month+" Y: "+year);
	Select m= new Select(driver.findElement(By.name("birthday_month"))); 
	 m.selectByValue(month);
	 Select d= new Select(driver.findElement(By.name("birthday_day"))); 
	 d.selectByVisibleText(day);
	 Select y= new Select(driver.findElement(By.name("birthday_year"))); 
	 y.selectByVisibleText(year);
}
	
    
    
    public void gender(String gender) {
    List<WebElement> genderList = driver.findElements(By.name("sex"));
    for(WebElement g : genderList) {
    //	int gend = Integer.parseInt(g.getAttribute("value"));
    	String gend = g.getAttribute("value");
    	if(gender.equalsIgnoreCase("Female") && gend.equalsIgnoreCase("1")) {
    		g.click();
    	}else if(gender.equalsIgnoreCase("Male") && gend.equalsIgnoreCase("2")) {
    		g.click();
    	}else if(gender.equalsIgnoreCase("Custom") && gend.equalsIgnoreCase("-1")){
    		g.click();
    	}
    	
    }
    }
    

public void click() {
	driver.findElement(By.name("websubmit")).click();
}

}




