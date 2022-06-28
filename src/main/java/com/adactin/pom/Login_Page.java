package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	public static WebDriver driver;
	@FindBy(name="username")
	private WebElement user_id;
	@FindBy(name="password")
	private WebElement pass;
	
@FindBy(name="login")
private WebElement login;
public Login_Page(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver, this);
}

public static WebDriver getDriver() {
	return driver;
}

public WebElement getUser_id() {
	return user_id;
}

public WebElement getPass() {
	return pass;
}

public WebElement getLogin() {
	return login;
}

	
	

}
