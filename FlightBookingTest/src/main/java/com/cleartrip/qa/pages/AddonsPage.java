package com.cleartrip.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cleartrip.qa.base.TestBase;

public class AddonsPage extends TestBase {
	
	@FindBy(xpath="//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/main[1]/div[5]/div[1]/div[1]/div[9]/div[1]/div[3]/div[2]")
	WebElement Meal;
	
	@FindBy(xpath ="//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/main[1]/div[5]/div[1]/div[1]/div[12]/div[1]/div[3]/div[2]")
	WebElement Baggage;

	@FindBy(xpath ="//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/main[1]/div[5]/div[1]/div[1]/button[1]")
	WebElement ContinueButt;

	public AddonsPage()
	{
		PageFactory.initElements(driver, this);
	}

	public ContactDetailsPage SelectMealandBaggage()
	{
		Meal.click();
		Baggage.click();
		ContinueButt.click();
		
		return new ContactDetailsPage();
	}
}
