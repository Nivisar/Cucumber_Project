package com.Cucumber;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.ui.Select;

import com.Cucumber_Base.Adactin_Base;
import com.sdp.Page_Object_Manager;

public class Runner extends Adactin_Base{
	public static WebDriver driver1;
	
	public static Page_Object_Manager pom = new Page_Object_Manager(driver1);
	
	public static void main(String[] args) throws  Throwable {
		 driver1= browser("chrome");
		
		 launchurl("http://adactinhotelapp.com/");
		   
		 String username = read_Data("C:\\Users\\Sarav\\Desktop\\id_name.xlsx", 2, 0);
	
	//	 WebElement mail = driver.findElement(By.id("email"));
			sendvalues(pom.getInstanceLp().getUser_id(),username);
	      String password = read_Data("C:\\\\Users\\\\Sarav\\\\Desktop\\id_name.xlsx", 2, 1);
		//	WebElement pass = driver.findElement(By.name("pass"));
			sendvalues(pom.getInstanceLp().getPass(),password);
			clickable(pom.getInstanceLp().getLogin());
		System.out.println("completed");
		closewindow();
		quit();
	
		
//		 driver.getCurrentUrl();
//		 driver.navigate().to("http://www.amazon.in/"); // navigate to another url
//			driver.navigate().back();  // navigating to back
//			driver.navigate().refresh(); // navigating to refresh
//			driver.navigate().forward(); // navigating frwd
//			driver.close();
//			driver.quit();				
//			System.out.println("Done");
//		 launchurl("https://www.amazon.in/");
//		 JavascriptExecutor js=(JavascriptExecutor)driver;
//		 js.executeScript("window.scrollBy(0,8000)");
//			
//			js.executeScript("window.scrollBy(0,-4500)");
//			
//		 WebElement mob = driver.findElement(By.linkText("Mobiles"));
//		 Actions act= new Actions(driver);
//			act.contextClick(mob).click().build().perform();
//			
//			Robot rob = new Robot();  //robot is a class
//			rob.keyPress(KeyEvent.VK_DOWN);
//			rob.keyRelease(KeyEvent.VK_DOWN);
//			
//			rob.keyPress(KeyEvent.VK_ENTER);
//			rob.keyRelease(KeyEvent.VK_ENTER);
//			
//			 WebElement fas = driver.findElement(By.linkText("Fashion"));
//				act.contextClick(fas).click().build().perform();
//				
//				rob.keyPress(KeyEvent.VK_DOWN);
//				rob.keyRelease(KeyEvent.VK_DOWN);
//				
//				rob.keyPress(KeyEvent.VK_ENTER);
//				rob.keyRelease(KeyEvent.VK_ENTER);
//Thread.sleep(3000);
//			 WebElement el = driver.findElement(By.xpath("//a[normalize-space()='Electronics']"));
//				act.contextClick(el).build().perform();
//					
//					rob.keyPress(KeyEvent.VK_DOWN);
//					rob.keyRelease(KeyEvent.VK_DOWN);
//					
//					rob.keyPress(KeyEvent.VK_ENTER);
//					rob.keyRelease(KeyEvent.VK_ENTER);
					
	//				String windowHandle = driver.getWindowHandle();
		//			System.out.println(windowHandle);
					
//					Set<String> whs = driver.getWindowHandles();
//					for (String string : whs) {
//						System.out.println(string);
//						
//					}
//					for (String string : whs) {
//						String title = driver.switchTo().window(string).getTitle();	
//						System.out.println(title);
//					}
//					
//					String s1 ="Buy products across Home,Kitchen,Garden,Furniture,Sports and more now online at Amazon India ";
//					for (String string : whs) {
//						if (driver.switchTo().window(string).getTitle().equals(s1)) {
//							System.out.println("Done");
//							break;
//						}
//						
//					}
//			
//			
//		System.out.println("Done");
//	
//	WebElement Login = driver.findElement(By.name("login"));
//  // Displayed
//	 movable(Login);
//	 
//	 boolean displayed=Login.isDisplayed();
//	 System.out.println(displayed);
//  
//	boolean enabled = Login.isEnabled();
//	System.out.println(enabled);
//	
//	boolean selected = Login.isSelected();
//	System.out.println(selected);
//	
//	String text = Login.getText();
//	System.out.println(text);
//	
//	String attribute = Login.getAttribute("class");
//	System.out.println(attribute);
//	
//	
//	clickable(Login);
//	System.out.println("done");
//}
//    Thread.sleep(5000);
//    WebElement create = driver.findElement(By.xpath("//h5[text()='Drop down']"));
//	clickable(create);
//	WebElement drop1 = driver.findElement(By.id("dropdown1"));
//	clickable(drop1);
//	singledropdown(drop1, "selectByValues", "1");
	
     	
//	s.selectByIndex(2);	
	//select visible text
	
//	WebElement drop2 = driver.findElement(By.name("dropdown2"));
//	Select s1 = new Select(drop2);
	// singledropdown(drop2, "selectByVisibleText", "Selenium");
//	s1.selectByVisibleText("Selenium");
	}
//	//Select value
//	
//	WebElement drop3 = driver.findElement(By.name("dropdown3"));
//	Select s2 = new Select(drop3);
//	s2.selectByValue("4");
//	

	private static void closewindow() {
		// TODO Auto-generated method stub
		
	}


//	
//	WebElement firstname = driver.findElement(By.name("firstname"));
//	sendvalues(firstname,"kavi");
//	
//    WebElement surname = driver.findElement(By.name("lastname"));
//    sendvalues(surname,"Gnanasekaran");
//    
//    WebElement email= driver.findElement(By.name("reg_email__"));
//    sendvalues(email,"kavi1205@gmail.com");
//    
//   WebElement reemail = driver.findElement(By.name("reg_email_confirmation__"));
//   sendvalues(reemail,"kavi1205@gmail.com");
//   
//    WebElement password = driver.findElement(By.id("password_step_input"));
//    sendvalues(password,"14785239");
//    
//    WebElement date = driver.findElement(By.id("day"));
//    singledropdown(date,"Select", "5");
//    sendvalues(date, "5");
//    
//    WebElement month = driver.findElement(By.id("month"));
//    singledropdown(month, "Select", "1");
//    sendvalues(month, "1");
//    
//    WebElement year = driver.findElement(By.id("year"));
//    sendvalues(year, "1995");
//    
//    WebElement gender = driver.findElement(By.xpath("//label[text()='Female']"));
//    clickable(gender);
//    
//    WebElement signup = driver.findElement(By.xpath("//button[text()='Sign Up']"));
//    clickable(signup);
//    
//    launchurl("https://demoqa.com/alerts");
//    
//    WebElement confirm = driver.findElement(By.id("confirmButton"));
//    clickable(confirm);
//    accept();
//	
//
//    System.out.println("success");
//    printsrcn("practice");
//    
	//}
	
}