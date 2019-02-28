package stepDef;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
//import org.openqa.selenium.By;

public class LoginstepDef{

	WebDriver driver;
	 
	
  @Given("^user is already on login Page$")	
	public void user_already_on_login_page() {
   System.setProperty("webdriver.chrome.driver","/home/sivaneeli/eclipse-workspace/chromedriver");
	driver = new ChromeDriver();
//	System.setProperty("webdriver.gecko.driver","/home/sivaneeli/eclipse-workspace/chromedriver.exe");  
//	driver = new FirefoxDriver();
//river.get("https://www.freecrm.com/index.html");
	driver.get("https://www.ultimatix.net");
}
	
@When ("^title of login page$")	
	public void title_of_login_page() {
	String title = driver.getTitle();
	System.out.println(title);
//ssert.assertEquals("Free CRM software in the cloud for sales and service", title);
	Assert.assertEquals("Ultimatix - Digitally Connected !" , title);   
}

@Then("^user enters \"(.*)\" and \"(.*)\"$")

	public void user_enters_username_and_password(String username, String password){
	driver.findElement(By.id("USER")).sendKeys(username);
    driver.findElement(By.id("PASSWORD")).sendKeys(password);
	//	 }river.findElement(By.name ("Password")).sendKeys("password");
	
}

@Then ("^User clicks on login button$")
	public void user_clicks_on_login_button() {
		WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",loginBtn);
	
}

 @Then ("^user is on home page$")
	public void user_is_on_home_page() {
	String title = driver.getTitle();
	System.out.println("Ultimatix: Digitally Connected"+ title);
	Assert.assertEquals("Ultimatix: Digitally Connected",title);
}
	
	
 @Then ("^close the browser$")
	public void close_the_browser(){
		 driver.quit();
		 }
	
	
	
	
	
}
