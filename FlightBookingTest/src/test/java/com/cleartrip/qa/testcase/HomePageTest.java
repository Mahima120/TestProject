package com.cleartrip.qa.testcase;

import java.io.IOException;

import org.testng.annotations.*;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cleartrip.qa.base.TestBase;
import com.cleartrip.qa.pages.CTHomePage;
import com.cleartrip.qa.pages.FlightSelectionPage;

public class HomePageTest extends TestBase{
	
	CTHomePage HomePage;
	FlightSelectionPage FlightSelectionPage;
	
	public HomePageTest() throws IOException{
		super();
	}
	
	@BeforeTest
	public void setUp()
	{
		intialization();
		HomePage = new CTHomePage();
	}
	
	@Test (priority=1)
	public void PickDate() throws InterruptedException
	{
		HomePage.DatePicking();
	}
	
	@Test (priority=2)
	public void HomePageEntries() throws InterruptedException
	{
		FlightSelectionPage= HomePage.SourcetoDestination(prop.getProperty("From"),prop.getProperty("To"));
	}		
	
	@AfterTest
	public void tearDowm()
	{
		driver.quit();
	}
}
