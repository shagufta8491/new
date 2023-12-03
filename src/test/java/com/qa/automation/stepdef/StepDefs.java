package com.qa.automation.stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefs {
	WebDriver driver;
	String baseUrl = "http://automationexercise.com";
	int implictlywaitTimeoutSec = 20;
	
	@Given("browser is open")
	public void browser_is_open() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions opt = new  ChromeOptions();
		opt.setBinary("C:\\Users\\Admin\\eclipse-workspace\\chrome-win64\\chrome.exe");
		 driver= new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(implictlywaitTimeoutSec,TimeUnit.SECONDS);

	   	}

@Given("user is on google search page")
public void user_is_on_google_search_page() {
    
}
@When("user enters a text in search box")
public void user_enters_a_text_in_search_box() {
    
}
@When("hits enter")
public void hits_enter() {
    }
@Then("User is navigate to search result")
public void user_is_navigate_to_search_result() {
    
}





}
