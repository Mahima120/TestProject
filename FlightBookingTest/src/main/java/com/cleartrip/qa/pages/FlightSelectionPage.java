package com.cleartrip.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cleartrip.qa.base.TestBase;

public class FlightSelectionPage extends TestBase {

	//pagefactory
	@FindBy (xpath ="//body/div[@id='root']/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[5]/div[1]/div[2]/button[1]")
    WebElement BookButton;
	
	@FindBy (xpath ="//span[contains(text(),'Airlines')]")
	WebElement AirlinesLabel;

	
	public FlightSelectionPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean PageLoadTest()
	{
		return AirlinesLabel.isDisplayed();
	}
	
	public ItineraryPage BookFlight()
	{
		BookButton.click();
		return new ItineraryPage();
	}
}
