package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Card_Details {
	public static WebDriver driver;
	@FindBy(name="first_name")
	private WebElement fname;

	@FindBy(name="last_name")
	private WebElement lname;
	
	@FindBy(name="address")
	private WebElement address;
	
	@FindBy(name="cc_num")
	private WebElement cardno;
	
	@FindBy(name="cc_type")
	private WebElement cardtype;
	
	@FindBy(id="cc_exp_month")
	private WebElement month;
	
	@FindBy(id="cc_exp_year")
	private WebElement year;
	
	@FindBy(name="cc_cvv")
	private WebElement cvv;
	
	@FindBy(id="book_now")
	private WebElement book;
	
	public Card_Details(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver, this);
	}
	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCardno() {
		return cardno;
	}

	public WebElement getCardtype() {
		return cardtype;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBook() {
		return book;
	}
	
	
}
