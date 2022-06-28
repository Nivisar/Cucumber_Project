package com.sdp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.adactin.pom.Card_Details;
import com.adactin.pom.Check_Data;
import com.adactin.pom.Login_Page;
import com.adactin.pom.Logout;
import com.adactin.pom.Room_Details;

public class Page_Object_Manager {
public static WebDriver driver;
	
	private Login_Page lp;
	private Room_Details rd;
	private Check_Data cd;
	private Card_Details card;
	private Logout lo;
	
	public Room_Details getInstanceRd() {
		Room_Details rd = new Room_Details(driver);
		//return null;
		return rd;
	}

	public Check_Data getInstanceCd() {
		Check_Data cd = new Check_Data(driver);
		return cd;
	}
	public Card_Details getInstanceCard() {
		Card_Details card = new Card_Details(driver);
		return card;
	}

	public Logout getInstanceLo() {
		Logout lo= new Logout(driver);
		return lo;
	}



	public Page_Object_Manager(WebDriver driver1) {
		
		this.driver=driver1;
		
		PageFactory.initElements(driver, this);
	}

	

	public Login_Page getInstanceLp() {
		Login_Page lp = new Login_Page(driver);
	
		return lp;
	}

    
}
