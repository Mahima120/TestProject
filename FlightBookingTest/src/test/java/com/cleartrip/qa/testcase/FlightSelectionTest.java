package com.cleartrip.qa.testcase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cleartrip.qa.base.TestBase;

import com.cleartrip.qa.pages.ItineraryPage;
import com.cleartrip.qa.pages.FlightSelectionPage;


public class FlightSelectionTest extends TestBase {
FlightSelectionPage FlightSelectionPage;
ItineraryPage ItineraryPage;
	

	public FlightSelectionTest() throws IOException{
		super();
	}
	
	@BeforeTest
	public void setUp()
	{
		intialization();
		FlightSelectionPage = new FlightSelectionPage();
	}
	
	@Test(priority=1)
	public void VerifyPageLabel()
	{
		Assert.assertTrue(FlightSelectionPage.PageLoadTest());
	}
	

	@Test(priority=2)
	public void BookfirstFlight()
	{
		ItineraryPage= FlightSelectionPage.BookFlight();
	}
	
	@AfterTest
	public void tearDowm()
	{
		driver.quit();
	}
}
