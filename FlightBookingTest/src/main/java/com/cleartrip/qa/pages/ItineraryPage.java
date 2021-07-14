package com.cleartrip.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cleartrip.qa.base.TestBase;

public class ItineraryPage extends TestBase{
	
	@FindBy (xpath ="//h2[contains(text(),'Review your itinerary')]")
    WebElement ReviewYourItenaryLabel;
	
	@FindBy (xpath="//body/div[@id='root']/div[1]/div[2]/div[1]/div[3]/div[2]/aside[1]/div[1]/div[1]")
	WebElement TotalPriceLabel;
	
	@FindBy (xpath="//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/main[1]/div[2]/div[1]/div[1]/div[14]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/button[1]")
	WebElement InsuranceAddButton;
	
	@FindBy (xpath="//button[contains(text(),'Continue')]")
	WebElement ContinueButton;
	
	public ItineraryPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean PageLoadTest()
	{
		return ReviewYourItenaryLabel.isDisplayed();
		 
	 }
	 public boolean ToatlpriceDisplayed()
	 {
	   return TotalPriceLabel.isDisplayed();	}
	
	public AddonsPage AddInsuarnceonItenary()
	{
		InsuranceAddButton.click();
		ContinueButton.clear();
		return new AddonsPage();
	}
	
}
