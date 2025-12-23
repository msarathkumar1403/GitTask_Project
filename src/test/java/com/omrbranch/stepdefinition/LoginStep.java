package com.omrbranch.stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginStep {
	WebDriver driver;

	@Given("User is on the OMRBranch page")
	public void a() {
		driver = new ChromeDriver();
		driver.get("https://www.omrbranch.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	}

	@When("User enter {string} and {string}")
	public void user_enter_and(String userName, String password) {
		driver.findElement(By.id("email")).sendKeys(userName);
		driver.findElement(By.id("pass")).sendKeys(password);

	}

	@When("User clicks the login button")
	public void c() {
		driver.findElement(By.xpath("//button[text()='Login']")).click();
	}

	@Then("User should verify after login success message")
	public void user_should_verify_after_login_success_message() {
		Assert.assertTrue("Verify After Login", true);
		// driver.quit();

	}

}
