package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.base.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.pojo.ForgotPassPojo;
import org.pojo.LoginPojo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition extends BaseClass {

	public LoginPojo l;
	public ForgotPassPojo f;

	@Given("User have to enter facebook login page through chrome browser")
	public void user_have_to_enter_facebook_login_page_through_chrome_browser() {
		// chromeBrowser();
		urlLaunch("https://www.facebook.com/");
		// maxWindow();
	}

	@Given("User have to click the forgotten password")
	public void user_have_to_click_the_forgotten_password() throws InterruptedException {
		f = new ForgotPassPojo();
		btnClick(f.getBtnFrgtPass());
		Thread.sleep(3000);
	}

	@When("User have to enter email or phonenumber")
	public void user_have_to_enter_email_or_phonenumber() {
		f = new ForgotPassPojo();
		fillTextBox(f.getTxtSearchBox(), "9876543210");
	}

	@Then("User have to click search button")
	public void user_have_to_click_search_button() {
		f = new ForgotPassPojo();
		btnClick(f.getBtnSearch());

	}

	@Given("User is in facebook login page")
	public void user_is_in_facebook_login_page() {
		// chromeBrowser();
		urlLaunch("https://www.facebook.com/");
		// maxWindow();
	}

	@When("User have to enter {string} and {string}")
	public void user_have_to_enter_and(String user, String pass) {
		l = new LoginPojo();
		fillTextBox(l.getUser(), user);
		fillTextBox(l.getPass(), pass);
	}

	@When("User enter invalid username and invalid password")
	public void user_enter_invalid_username_and_invalid_password(io.cucumber.datatable.DataTable d) {
		// 1D List
		// List<String> allData = d.asList();
		// String email = allData.get(2);
		// String pass = allData.get(3);
		// l = new LoginPojo();
		// fillTextBox(l.getUser(), email);
		// fillTextBox(l.getPass(), pass);
		// 1D Map

		Map<String, String> mp = d.asMap(String.class, String.class);
		String user = mp.get("email");
		String pass = mp.get("password");

		l = new LoginPojo();
		fillTextBox(l.getUser(), user);
		fillTextBox(l.getPass(), pass);
	}

	@When("User enter valid username and invalid password")
	public void user_enter_valid_username_and_invalid_password(io.cucumber.datatable.DataTable d) {
		// 2D List
		// List<List<String>> li = d.asLists();
		// String user = li.get(2).get(1);
		// String pass = li.get(0).get(2);
		// l = new LoginPojo();
		// fillTextBox(l.getUser(), user);
		// fillTextBox(l.getPass(), pass);
		// 2D Map

		List<Map<String, String>> p = d.asMaps();
		String user = p.get(0).get("Email");
		String pass = p.get(2).get("Password");
		l = new LoginPojo();
		fillTextBox(l.getUser(), user);
		fillTextBox(l.getPass(), pass);

	}

	@When("User enter Invalid username and invalid password")
	public void user_enter_Invalid_username_and_invalid_password() {
		l = new LoginPojo();
		fillTextBox(l.getUser(), "pkt124@gmail.com");
		fillTextBox(l.getPass(), "pkt124");
	}

	@When("User click login button")
	public void user_click_login_button() throws InterruptedException {
		l = new LoginPojo();
		btnClick(l.getLogin());
		Thread.sleep(2000);
	}

	@Then("User should be in invalid credential page")
	public void user_should_be_in_invalid_credential_page() {
		// String url = driver.getCurrentUrl();
		// Assert.assertTrue("To check Login credentials",
		// url.contains("privacy_mutation_token"));
		System.out.println("==========TaskCompleted========== ");
	}

	// public WebDriver driver;
	//
	// @Given("User is in facebook login page")
	// public void user_is_in_facebook_login_page() {
	// WebDriverManager.chromedriver().setup();
	// driver = new ChromeDriver();
	// driver.get("https://www.facebook.com/");
	// driver.manage().window().maximize();
	// }
	//
	// @When("User enter invalid username and invalid password")
	// public void user_enter_invalid_username_and_invalid_password() {
	// WebElement user = driver.findElement(By.id("email"));
	// user.sendKeys("greens124@gmail.com");
	//
	// WebElement pass = driver.findElement(By.id("pass"));
	// pass.sendKeys("greens124");
	// }
	//
	// @When("User click login button")
	// public void user_click_login_button() {
	// WebElement login = driver.findElement(By.name("login"));
	// login.click();
	// }
	//
	// @Then("User should be in invalid credential page")
	// public void user_should_be_in_invalid_credential_page() {
	// String url = driver.getCurrentUrl();
	// Assert.assertTrue("To check Login credentials",
	// url.contains("privacy_mutation_token"));
	// System.out.println(url);
	// }

}
