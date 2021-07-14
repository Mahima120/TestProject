package com.cleartrip.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.cleartrip.qa.base.TestBase;

public class ContactDetailsPage extends TestBase{
	@FindBy(xpath ="//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/main[1]/div[8]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]")
	WebElement ContactNum;
	
	@FindBy(xpath ="//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/main[1]/div[8]/div[1]/div[1]/div[3]/div[1]/div[1]/input[1]")
	WebElement Email;

	@FindBy(xpath ="//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/main[1]/div[8]/div[1]/div[1]/div[7]/button[1]")
	WebElement ContinueButton;

	@FindBy(xpath ="//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/main[1]/div[11]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/input[1]")
	WebElement FirstName;

	@FindBy(xpath ="//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/main[1]/div[11]/div[1]/div[1]/div[2]/div[3]/div[2]/div[1]/input[1]")
	WebElement LastName;
	
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/main[1]/div[11]/div[1]/div[1]/div[6]/div[1]/button[1]")
	WebElement ContinueTo;

	public ContactDetailsPage()
	{
		PageFactory.initElements(driver, this);
	}

	public void ContactInformation(String Num , String Mail)
	{
		ContactNum.sendKeys(Num);
		Email.sendKeys(Mail);
		ContinueButton.click();
	}
	
	public void PersonalDetail(String FtName , String LtName) throws InterruptedException
	{
		FirstName.sendKeys(FtName);
		LastName.sendKeys(LtName);
		
		 WebElement Gender = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/main[1]/div[11]/div[1]/div[1]/div[2]/div[3]/div[3]/div[1]/div[1]/button[1]"));
		  Actions mouse = new Actions(driver);
		  mouse.moveToElement(Gender).click();
		  Select sel = new Select(Gender);
		  sel.selectByVisibleText("Male");
		  mouse.build();
		  Thread.sleep(4000);
		  mouse.perform();
		  
		  ContinueTo.click();
	}
	
}
