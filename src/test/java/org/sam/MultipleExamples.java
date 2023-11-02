package org.sam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class MultipleExamples {
	WebDriver driver;
	@Given("To launch edge browser")
	public void to_launch_edge_browser() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\loges\\eclipse-workspace\\Cucumber\\driver\\chromedriver.exe");
	driver = new ChromeDriver();
	}

	@When("To launch the url of instagram")
	public void to_launch_the_url_of_instagram() {
		driver.get("https://en-gb.facebook.com/");
	
	}

	@When("To pass the data {string} to user data field")
	public void to_pass_the_data_to_user_data_field(String email) {
		WebElement f1 = driver.findElement(By.id("email"));
		f1.sendKeys(email);
	
	}

	@When("To pass the data {string} to password field")
	public void to_pass_the_data_to_password_field(String pass) {
		WebElement f2 = driver.findElement(By.name("pass"));
		f2.sendKeys(pass);
	  
	}

	@When("To click the login button")
	public void to_click_the_login_button() {
		WebElement f3 = driver.findElement(By.name("login"));
		f3.click();
	 
	}
	@Then("To close the entire browser")
	public void to_close_the_entire_browser() {
	    driver.quit();
	}


}
