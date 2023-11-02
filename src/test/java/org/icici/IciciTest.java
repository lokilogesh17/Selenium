package org.icici;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class IciciTest {
	WebDriver driver;
	@Given("To launch the chr browser")
	public void toLaunchTheChrBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\loges\\eclipse-workspace\\Cucumber\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
	
	}

	@When("To launch the icici url")
	public void toLaunchTheIciciUrl() {
		driver.get("https://www.icicibank.com/");
		driver.manage().window().maximize();
	
	}
	@When("To click the login button")
	public void toClickTheLoginButton() {
		WebElement f = driver.findElement(By.id("login-btn"));
		f.click();
	
	}

	@Then("To close the chr browser")
	public void toCloseTheChrBrowser() {
		driver.quit();
	
	}

}
