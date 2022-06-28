Feature: Hotel Booking in Adactin Application
@smoketest
Scenario Outline: user Login the Application
Given user Launch The Url in Adactin Application
When user Enter the "<username>" in username field
And user Enters the "<password>" in password field
Then user Click on the Login Button And it navigates to search Hotel Page

Examples:
      |username|password|
      |Parkavig|NViyan@05|
      |AAA|123|
      |NJuhu|456|

@sanitytest
Scenario: user to the Search Hotel Page
When user Select the location of the Hotel
And user Select the name of the hotel in the above location
And user Select the type of room to stay in the hotel
And user Select the No of Rooms to stay in the hotel
And user Select the Date to check-in in date field in the format DD/MM/YYYY
And user Select the Date to check-out in date field in the format DD/MM/YYY
And user Select the no of Adults in the Adult per room field
And user Select the no of childrens in the child per room field
Then user Click on the Submit Button And it Navigates to Check the above details page

@sanitytest
Scenario: user to Check the above details page
When user click the radiobutton after checking the details to conform
Then user click Continue And it navigates to Hotel Booking Page

@sanitytest
Scenario: user fills the details for Hotel Booking
And user enter the First name in the First name field
And user enter the last name in the last name field
And user enter the address in the Billing Address field
And user enter the Credit card number in Credit card number field
And user enter the type of credit card
And user enter the Expiry month And Expiry year
And user enter the Cvv number in the Cvv number field
Then user click the Book Now Button and it navigates to Bookin confirmation page

@regressiontest
Scenario: user Bookin Confirmation Page
Then user Click on the Logout Button and it Navigates to Click here to login page




