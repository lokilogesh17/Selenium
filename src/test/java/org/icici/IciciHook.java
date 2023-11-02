package org.icici;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class IciciHook {
	WebDriver driver;
	@Before(order = 1, value = "scene2")
	private void tc1() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\loges\\eclipse-workspace\\Cucumber\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("browser open");
	}
	@Before(order = 2, value = "scene3")
	private void tc2() {
		driver.manage().window().maximize();
	}
	@After(order = 3)
	private void tc3() {
		driver.quit();
	}
	@After(order = 2)
	private void tc4() {
		System.out.println("browser close");
	}

}
