package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.Cucumber_Base.Adactin_Base;
import com.adactin.pom.Login_Page;
import com.adactin.pom.Room_Details;
import com.adactin.runner.Runner_Class;
import com.sdp.Page_Object_Manager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Step_Definition extends Adactin_Base{
	
	public static WebDriver driver = Runner_Class.driver;
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	public static Login_Page lp = new Login_Page(driver);
	public static Room_Details rd = new Room_Details(driver);
	

	
	@Given("^user Launch The Url in Adactin Application$")
	public void user_Launch_The_Url_in_Adactin_Application() throws Throwable {
		launchurl("http://adactinhotelapp.com/");
	}

//	@When("^user Enter the Username in username field$")
//	public void user_Enter_the_Username_in_username_field() throws Throwable {
//		sendvalues(pom.getInstanceLp().getUser_id(), "Parkavig");
//	}
//
//	@When("^user Enters the Pasword in password field$")
//	public void user_Enters_the_Pasword_in_password_field() throws Throwable {
//		sendvalues(pom.getInstanceLp().getPass(), "NViyan@05");
//	}

	@When("^user Enter the \"([^\"]*)\" in username field$")
	public void user_Enter_the_in_username_field(String username) throws Throwable {
		sendvalues(pom.getInstanceLp().getUser_id(), username);
	}

	@When("^user Enters the \"([^\"]*)\" in password field$")
	public void user_Enters_the_in_password_field(String password) throws Throwable {
		sendvalues(pom.getInstanceLp().getPass(), password);
	}
	@Then("^user Click on the Login Button And it navigates to search Hotel Page$")
	public void user_Click_on_the_Login_Button_And_it_navigates_to_search_Hotel_Page() throws Throwable {
		clickable(pom.getInstanceLp().getLogin());
	}

	@Given("^user Select the location of the Hotel$")
	public void user_Select_the_location_of_the_Hotel() throws Throwable {
	
		singledropdown(pom.getInstanceRd().getLocation(),"selectByVisibleText", "London");
	}

	@Given("^user Select the name of the hotel in the above location$")
	public void user_Select_the_name_of_the_hotel_in_the_above_location() throws Throwable {
		singledropdown(pom.getInstanceRd().getHotel(), "selectByVisibleText", "Hotel Sunshine");
	}

	@Given("^user Select the type of room to stay in the hotel$")
	public void user_Select_the_type_of_room_to_stay_in_the_hotel() throws Throwable {
		singledropdown(pom.getInstanceRd().getType(), "selectByVisibleText", "Deluxe");
	}

	@Given("^user Select the No of Rooms to stay in the hotel$")
	public void user_Select_the_No_of_Rooms_to_stay_in_the_hotel() throws Throwable {
		singledropdown(pom.getInstanceRd().getNo_of_rooms(), "selectByVisibleText", "2 - Two");
	}

	@Given("^user Select the Date to check-in in date field in the format DD/MM/YYYY$")
	public void user_Select_the_Date_to_check_in_in_date_field_in_the_format_DD_MM_YYYY() throws Throwable {
		sendvalues(pom.getInstanceRd().getDatein(), "24/07/2022");
	}

	@Given("^user Select the Date to check-out in date field in the format DD/MM/YYY$")
	public void user_Select_the_Date_to_check_out_in_date_field_in_the_format_DD_MM_YYY() throws Throwable {
		sendvalues(pom.getInstanceRd().getDateout(), "26/07/2022");
	}

	@Given("^user Select the no of Adults in the Adult per room field$")
	public void user_Select_the_no_of_Adults_in_the_Adult_per_room_field() throws Throwable {
		singledropdown(pom.getInstanceRd().getAdult(),"selectbyVisibleText", "2 - Two");
	}

	@Given("^user Select the no of childrens in the child per room field$")
	public void user_Select_the_no_of_childrens_in_the_child_per_room_field() throws Throwable {
		singledropdown(pom.getInstanceRd().getChild(), "selectByValue", "2");
	}

	@Then("^user Click on the Submit Button And it Navigates to Check the above details page$")
	public void user_Click_on_the_Submit_Button_And_it_Navigates_to_Check_the_above_details_page() throws Throwable {
		clickable(pom.getInstanceRd().getSubmit());
	}

	@Given("^user click the radiobutton after checking the details to conform$")
	public void user_click_the_radiobutton_after_checking_the_details_to_conform() throws Throwable {
		clickable(pom.getInstanceCd().getCheck());
	}

	@Then("^user click Continue And it navigates to Hotel Booking Page$")
	public void user_click_Continue_And_it_navigates_to_Hotel_Booking_Page() throws Throwable {
		clickable(pom.getInstanceCd().getCont());
	}

	@Given("^user enter the First name in the First name field$")
	public void user_enter_the_First_name_in_the_First_name_field() throws Throwable {
		sendvalues(pom.getInstanceCard().getFname(), "Parkavi");
	}

	@Given("^user enter the last name in the last name field$")
	public void user_enter_the_last_name_in_the_last_name_field() throws Throwable {
		sendvalues(pom.getInstanceCard().getLname(), "Gnanasekaran");
	}

	@Given("^user enter the address in the Billing Address field$")
	public void user_enter_the_address_in_the_Billing_Address_field() throws Throwable {
		sendvalues(pom.getInstanceCard().getAddress(), "23,kattupakkam,robin nagar");
	}

	@Given("^user enter the Credit card number in Credit card number field$")
	public void user_enter_the_Credit_card_number_in_Credit_card_number_field() throws Throwable {
		sendvalues(pom.getInstanceCard().getCardno(), "1258963471253698");
	}

	@Given("^user enter the type of credit card$")
	public void user_enter_the_type_of_credit_card() throws Throwable {
		singledropdown(pom.getInstanceCard().getCardtype(),"selectByVisibleText", "Master Card");
	}

	@Given("^user enter the Expiry month And Expiry year$")
	public void user_enter_the_Expiry_month_And_Expiry_year() throws Throwable {
		singledropdown(pom.getInstanceCard().getMonth(), "selectByValue","11");
		singledropdown(pom.getInstanceCard().getYear(),"selectByVisibleText", "2022");
	}

	@Given("^user enter the Cvv number in the Cvv number field$")
	public void user_enter_the_Cvv_number_in_the_Cvv_number_field() throws Throwable {
		sendvalues(pom.getInstanceCard().getCvv(), "000");
	}

	@Then("^user click the Book Now Button and it navigates to Bookin confirmation page$")
	public void user_click_the_Book_Now_Button_and_it_navigates_to_Bookin_confirmation_page() throws Throwable {
		clickable(pom.getInstanceCard().getBook());
	}

	@Then("^user Click on the Logout Button and it Navigates to Click here to login page$")
	public void user_Click_on_the_Logout_Button_and_it_Navigates_to_Click_here_to_login_page() throws Throwable {
		clickable(pom.getInstanceLo().getLogout());
	}


}
