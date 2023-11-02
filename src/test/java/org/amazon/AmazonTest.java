package org.amazon;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import io.cucumber.datatable.*;

public class AmazonTest {
	WebDriver driver;
	@Given("To launch the browser")
	public void toLaunchTheBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\loges\\eclipse-workspace\\Cucumber\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
	  
	}

	@When("To launch amazon sign in page url")
	public void toLaunchAmazonSignInPageUrl() {
		driver.get("https://www.amazon.in/ap/register?showRememberMe=true&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&prevRID=372YRKC1SJZQF1S1TXPR&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=inflex&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		
	    
	}

	@When("To pass the data to first and last name field")
	public void toPassTheDataToFirstAndLastNameField(DataTable d) {
		List<List<String>> l = d.asLists();
		WebElement f1 = driver.findElement(By.name("customerName"));
		f1.sendKeys(l.get(1).get(2));
	    
	}

	@When("To pass the data to mobile number field")
	public void toPassTheDataToMobileNumberField(DataTable d) {
		List<Map<String, String>> m = d.asMaps();
		WebElement f2 = driver.findElement(By.id("ap_phone_number"));
		f2.sendKeys(m.get(1).get("mobilenumber3"));
	   
	}

	@When("To pass the data to password field")
	public void toPassTheDataToPasswordField() {
		WebElement f3 = driver.findElement(By.name("password"));
		f3.sendKeys("hguhg");
	   
	}

	@Then("To close the browsers")
	public void toCloseTheBrowsers() {
		driver.quit();
	   
	}


}
