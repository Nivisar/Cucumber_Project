package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Check_Data {
	
	public static WebDriver driver;
	
	@FindBy(id="radiobutton_0")
	private WebElement check;

	@FindBy(id="continue")
	private WebElement cont;
	
	public Check_Data(WebDriver driver3) {
		this.driver=driver3;
		PageFactory.initElements(driver, this);
	}
	
	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getCheck() {
		return check;
	}

	public WebElement getCont() {
		return cont;
	}
	
	

}
