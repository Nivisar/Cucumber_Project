package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Room_Details {
	public static WebDriver driver;
	@FindBy(id="location")
	private WebElement location;
	
	
	@FindBy(name="hotels")
	private WebElement hotel;
	
	@FindBy(name="room_type")
	private WebElement type;
	
	@FindBy(name="room_nos")
	private WebElement no_of_rooms;
	
	@FindBy(name="datepick_in")
	private WebElement datein;
	
	@FindBy(name="datepick_out")
	private WebElement dateout;
	
	@FindBy(id="adult_room")
	private WebElement adult;
	
	@FindBy(id="child_room")
	private WebElement child;
	
	@FindBy(id="Submit")
	private WebElement submit;
	
	public Room_Details(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver, this);
	}
	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getType() {
		return type;
	}

	public WebElement getNo_of_rooms() {
		return no_of_rooms;
	}

	public WebElement getDatein() {
		return datein;
	}

	public WebElement getDateout() {
		return dateout;
	}

	public WebElement getAdult() {
		return adult;
	}

	public WebElement getChild() {
		return child;
	}

	public WebElement getSubmit() {
		return submit;
	}

}
