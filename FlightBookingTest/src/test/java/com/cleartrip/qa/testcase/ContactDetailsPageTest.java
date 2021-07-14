package com.cleartrip.qa.testcase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.cleartrip.qa.base.TestBase;
import com.cleartrip.qa.pages.AddonsPage;
import com.cleartrip.qa.pages.ContactDetailsPage;
import com.cleartrip.qa.pages.ItineraryPage;

public class ContactDetailsPageTest extends TestBase{

	
	ContactDetailsPage ContactDetailTest;
		
	public ContactDetailsPageTest() throws IOException{
		super();
	}
		
		@BeforeTest
		public void setUp() throws IOException
		{
			intialization();
			ContactDetailTest = new ContactDetailsPage();
		}
		
		@Test(priority=1)
		public void ContactInformation() throws InterruptedException
		{
			ContactDetailTest.ContactInformation(prop.getProperty("Number"),prop.getProperty("To"));
		}
		
		@Test(priority=2)
		public void PersonalInformation() throws InterruptedException
		{
			ContactDetailTest.PersonalDetail(prop.getProperty("FirstName"),prop.getProperty("LastName"));
		}
		
		@AfterTest
		public void tearDowm()
		{
			driver.quit();
		}
}
