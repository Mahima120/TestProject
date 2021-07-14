package com.cleartrip.qa.testcase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.cleartrip.qa.base.TestBase;
import com.cleartrip.qa.pages.AddonsPage;
import com.cleartrip.qa.pages.FlightSelectionPage;
import com.cleartrip.qa.pages.ItineraryPage;

public class ItineraryPageTest extends TestBase {

	AddonsPage AddonPageTest;
	ItineraryPage ItineraryPage;
		
	public ItineraryPageTest() throws IOException{
		super();
	}
		
		@BeforeTest
		public void setUp()
		{
			intialization();
			ItineraryPage = new ItineraryPage();
		}
		
		@Test(priority=1)
		public void VerifyPageLoads()
		{
			Assert.assertTrue(ItineraryPage.PageLoadTest());
		}
		
		@Test(priority =2)
		public void VeriftFareLabel()
		{
			Assert.assertTrue(ItineraryPage.ToatlpriceDisplayed());
		}

		@Test(priority=3)
		public void BookfirstFlight()
		{
			AddonPageTest= ItineraryPage.AddInsuarnceonItenary();
		}
		
		@AfterTest
		public void tearDowm()
		{
			driver.quit();
		}
}
