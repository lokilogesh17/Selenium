package org.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class AmazonHook {
	WebDriver driver;
	@Before(order = 1)
	private void openbrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\loges\\eclipse-workspace\\Cucumber\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Before(order = 2)
	private void maxwindow() {
		driver.manage().window().maximize();
	}
	@After(order = 3)
	private void closebrowser() {
		driver.quit();
	}

}
