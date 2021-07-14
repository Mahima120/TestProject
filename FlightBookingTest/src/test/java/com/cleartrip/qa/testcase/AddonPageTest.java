package com.cleartrip.qa.testcase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.cleartrip.qa.base.TestBase;
import com.cleartrip.qa.pages.AddonsPage;
import com.cleartrip.qa.pages.ContactDetailsPage;

public class AddonPageTest extends TestBase{


	AddonsPage AddonPageTest;
	ContactDetailsPage ContactDetailsPage;
		
	public AddonPageTest() throws IOException{
		super();
	}
		
		@BeforeTest
		public void setUp() throws IOException
		{
			intialization();
			AddonPageTest = new AddonsPage();
		}
		
		@Test(priority=1)
		public void VerifyPageLoads()
		{
			ContactDetailsPage=AddonPageTest.SelectMealandBaggage();
		}
		
		@AfterTest
		public void tearDowm()
		{
			driver.quit();
		}
}
