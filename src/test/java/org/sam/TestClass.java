package org.sam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestClass {
	WebDriver driver;
	@Given("To launch the chrome browser")
	public void to_launch_the_chrome_browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\loges\\eclipse-workspace\\Cucumber\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@When("To launch to open the flipkart url")
	public void to_launch_to_open_the_flipkart_url() {
		driver.get("https://www.flipkart.com/account/login?signup=true&ret=/");
	}

	@When("To pass the invalid mobile number in mobile number field")
	public void to_pass_the_invalid_mobile_number_in_mobile_number_field() {
		WebElement f1 = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		f1.sendKeys("6354894549");
	}

	@When("To click enter after mobile number entered")
	public void to_click_enter_after_mobile_number_entered() {
		WebElement f2 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		f2.click();
	}
	

	@Then("To close the browser")
	public void to_close_the_browser() {
		driver.quit();
	}

}
