package com.cleartrip.qa.base;

import java.io.*;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;

import com.cleartrip.qa.util.Testutil;


public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	
	
	public TestBase() {
	try {
		prop = new Properties();
		FileInputStream ip = new FileInputStream("C:\\Users\\mahima.a.maheshwari\\eclipse-workspace\\FlightBookingTest\\src\\main\\java\\com\\cleartrip\\qa\\config\\config.properties");
	    prop.load(ip);
	}
	catch (FileNotFoundException e)
	{e.printStackTrace();}
	catch (IOException e)
	{e.printStackTrace();}
	
	}
	
	public static void intialization()
	{
		String browserName = prop.getProperty("browser");
		if(browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\browserdriver\\chromedriver_win32_91\\chromedriver.exe");	
			driver = new ChromeDriver(); 
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Testutil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Testutil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
	}
}
