package com.Cucumber_Base;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Adactin_Base {
	public static WebDriver driver;
	public static String value;
	public static WebDriver browser(String name) {
		if(name.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sarav\\eclipse-workspace\\Maven_Project\\Driver1\\chromedriver.exe" );
		
			driver = new ChromeDriver();
			
		}else {
			System.out.println("Invalid Browser");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	public static void printsrcn(String filename) throws Throwable {
			TakesScreenshot ts = (TakesScreenshot)driver;  
			File src = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File("C:\\Users\\Sarav\\eclipse-workspace\\Maven_Project\\Screenshot\\"+filename+".png");
			FileUtils.copyFile(src,dest);

		}
	//driver.get
	public static void launchurl(String url) {
		
			driver.get(url);
			driver.getTitle();
			System.out.println(url);
			driver.getCurrentUrl();
			System.out.println(url);
		
		
	}	
	//element.sendkeys
	public static void sendvalues(WebElement element,String values) {
		element.sendKeys(values);
		}
	//sendkeys through xpath
	public static void input_xpath(String path,String values) {
		driver.findElement(By.xpath(path)).sendKeys(values);
	}
	public static void input_xpath_click(String path) {
		driver.findElement(By.xpath(path)).click();
	}
	//implicitwait
	public static void time(int values) {
	 Timeouts implicitlyWait = driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}
	
	//element.click
	public static void clickable(WebElement elements) {
		elements.click();
	}
	public static void navigate(String url) {
		driver.navigate().to(url);
	}
	public static void navigateback(String url) {
	driver.navigate().back();
	}
	public static void navigaterefresh(String url) {
	driver.navigate().refresh();
	}
	public static void navigatefrwd(String url) {
	driver.navigate().forward();
	}

	public static void accept() {	
		driver.switchTo().alert().accept();
	}
	public static void dismiss() {
	driver.switchTo().alert().dismiss();
	}
		public static void gettext() {
			driver.switchTo().alert().getText();
		}
		public static void singleframe() {
		driver.switchTo().frame("singleframe");
		}
		public static void multipleframe() {
		driver.switchTo().frame(1);
		driver.switchTo().frame(0);
		}
		public static void scroll(WebElement element) throws Throwable {
		Actions act = new Actions(driver);	
		act.contextClick(element).click().build().perform();
		act.click(element).build().perform();
		act.doubleClick(element).build().perform();
		act.clickAndHold().build().perform();
		act.moveToElement(element).click().build().perform();
		
			Robot rob = new Robot();
			
			
		}
		public static void jsclick(WebElement element) {
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();",element);

		}
		public static void jsscrollup(String values) {
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,values)");
		}
		public static void jsscrolldown(String values) {
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,values)");

		}
			
		public static void handle(WebElement element) {
		String windowHandle = driver.getWindowHandle();
		}
		public static void handles() {
			Set<String> st = driver.getWindowHandles();
		for (String string : st) {
			String title = driver.switchTo().window(string).getTitle();
		}

		}

		public static void ismultiple(WebElement element,String method,String values) {
		Select s1 = new Select(element);
		if (method.equalsIgnoreCase("values")) {
			s1.getAllSelectedOptions();
		}else if (method.equalsIgnoreCase("values")) {
			s1.getOptions();
		}else if (method.equalsIgnoreCase("values")) {
			s1.getFirstSelectedOption();
		}

		}
public static boolean movable(WebElement element) {
	//	element.getAttribute();
		
		element.getText();
		
		element.isDisplayed();
		boolean displayed = element.isDisplayed();
		if (displayed==true) {
			System.out.println("displayed");
		}else {
			System.out.println("not displayed");
		}
		                                                                                                                                                 
		element.isEnabled();
		boolean enabled=element.isEnabled();
		if (enabled==true) {
			System.out.println("enabled");
		}else {
			System.out.println("not enabled");
		}
		
		element.isSelected();
		boolean selected = element.isSelected();
		if (selected==true) {
			System.out.println("selected");
		}else {
			System.out.println("not selected");
		}
		
		return false;
		
	}
	public static void singledropdown(WebElement element,String method,String values) {
		Select s = new Select(element);
		if (method.equalsIgnoreCase("selectByValue")) {
			s.selectByValue(values);
		}else if (method.equalsIgnoreCase("selectByIndex")) {
			int data = Integer.parseInt(values);
			s.selectByIndex(data);
     	}else if (method.equalsIgnoreCase("selectByVisibleText")) {
    		s.selectByVisibleText(values);
   
    	}
//     	else if (method.equalsIgnoreCase("deselectByIndex")) {
//    		int data = Integer.parseInt(values);
//    		s.deselectByIndex(values);		
//    	}else if (method.equalsIgnoreCase("values")) {
//    		s.deselectByValue(values);
//    	}else if (method.equalsIgnoreCase("visible")) {
//    		s.deselectByVisibleText(values);
//    	}
			
	}
	public static WebDriver close() {
		driver.close();
		return driver;
		}
	public static void quit() {
		
driver.quit();
	}
public static String read_Data(String path,int row_index,int cell_index) throws IOException {
	File f = new File(path);
	FileInputStream fis = new FileInputStream(f);
	Workbook wb = new XSSFWorkbook(fis);
	
	Sheet sheetAt = wb.getSheetAt(0);
	
	Row row = sheetAt.getRow(row_index);
	
	Cell cell = row.getCell(cell_index);
	
	CellType cellType = cell.getCellType();
	
	if (cellType.equals(CellType.STRING)) {
		value = cell.getStringCellValue();
	}
	else if (cellType.equals(CellType.NUMERIC)) {
		double numericCellValue = cell.getNumericCellValue();
		int data=(int) numericCellValue;
		value = String.valueOf(data);
	}
	return value;
	
}
}