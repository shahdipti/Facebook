package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HomePage;
import pages.LandingPage;

public class steps {
	WebDriver driver;
	

@Given("^open google chrome and lunch home page$")
public void open_google_chrome_and_lunch_home_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\14193\\eclipse-workspace\\Kayak\\Drivers\\chromedriver.exe");					
    driver= new ChromeDriver();					
    driver.manage().window().maximize();			
    driver.get("https://www.facebook.com/");
   
}

@When("^user fills registration form with following details ([^\\\"]*) ([^\\\"]*) ([^\\\"]*) ([^\\\"]*) ([^\\\"]*) ([^\\\"]*)$")
public void enter_the_detail_and_signup(String firstname, String lastname, String email, String password, String birthday,String gender) {
    System.out.println(firstname+ lastname + email + password + gender + birthday);
    HomePage home = new HomePage(driver);
    home.personalDetails(firstname, lastname, email, password);
    home.bDate(birthday);
    home.gender(gender);
    
}

@When("^user clicks signup button$")
public void user_clicks_signup_button() {
	HomePage home = new HomePage(driver);
	home.click();
}

@Then("^user verifies the error ([^\\\"]*)$")
public void user_verifies_the_error(String message){
	LandingPage landing = new LandingPage(driver);
	String actualinfo = landing.error();
	
	 Assert.assertEquals(actualinfo, message);  
	 
	System.out.println("matched");
	
    
}

}

