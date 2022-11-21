package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BaseClass {
	// 1.Default Constructor
	public LoginPojo() {
		PageFactory.initElements(driver, this);
	}

	// 2.Private Web Elements
	// only one criteria
	@FindBy(id = "email")
	private WebElement user;

	// more than one criteria (AND Operator)
	@FindBys({

			@FindBy(id = "pass"), // T
			@FindBy(xpath = "//input[@data-testid='royal_pass']")// T
	})
	private WebElement pass;

	// more than one criteria (OR Operator)
	@FindAll({

			@FindBy(name = "login"), // T
			@FindBy(xpath = "//input[@data-testid='royal_pass']") // F
	})
	private WebElement login;

	// 3.Create Getters

	public WebElement getUser() {
		return user;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLogin() {
		return login;
	}

}
