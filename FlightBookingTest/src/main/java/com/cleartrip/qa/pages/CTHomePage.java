package com.cleartrip.qa.pages;

import java.sql.Date;
import java.text.SimpleDateFormat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import com.cleartrip.qa.base.TestBase;

public class CTHomePage extends TestBase{
	//pagefactory
	@FindBy(xpath ="//p[contains(text(),'Round trip')]")
	WebElement RoundtripRadio;
	
	@FindBy (xpath ="//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
    WebElement FromTextBar;
	
	@FindBy (xpath ="//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[5]/div[1]/div[1]/div[1]/input[1]")
	WebElement ToTextBar;

	@FindBy (xpath = "//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[7]/div[2]/button[1]")
	WebElement SearchFlight;

	public CTHomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public FlightSelectionPage SourcetoDestination(String from, String to) throws InterruptedException
	{
		RoundtripRadio.click();
		FromTextBar.sendKeys(from);
		ToTextBar.sendKeys(to);
		
		
		
		 WebElement NumAdults = driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/select[1]"));
		  Actions mouse = new Actions(driver);
		  mouse.moveToElement(NumAdults).click();
		  Select sel = new Select(NumAdults);
		  sel.selectByVisibleText("2");
		  mouse.build();
		  Thread.sleep(4000);
		  mouse.perform();
		  
		  WebElement NumChildren = driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[3]/select[1]"));
		 Actions mouse2 = new Actions(driver);
		  mouse2.moveToElement(NumChildren).click();
		  Select sel2 = new Select(NumChildren);
		  sel2.selectByVisibleText("1");
		  mouse2.build();
		  Thread.sleep(4000);
		  mouse2.perform();
		
		return new FlightSelectionPage();
	}
	public static void DatePicking() throws InterruptedException
	{
		WebElement Cal = driver.findElement(By.xpath("//div[contains(@class, 'homeCalender')]"));
        Cal.click();
        

      //div[contains(@class, 'today')]//div[contains(text(), '14')]
      //div[contains(@aria-label, 'Fri Jul')]//div[contains(text(), '16')]
      //div[contains(@aria-label, 'Fri Jul 16 2021')]
      //div[contains(@class, 'today')]
      //Date date=java.util.Calendar.getInstance().getTime();


   //SimpleDateFormat formatter = new SimpleDateFormat("D M j Y");

     // Date today = new Date(today.getTime());
     // Date tomorrow = new Date(today.getTime() + (1000 * 60 * 60 * 48));
      
	  
	  //SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
	 // String dayafterTomorrowDate= formatter.format(tomorrow);
		 // String dayafterTomorrowDate = formatter;

      //String Dymaicxpath = "//div[contains(@aria-label, '"+dayafterTomorrowDate+"')]";

    		//  driver.findElement(By.xpath(Dymaicxpath));
    	
		  
	}
	
}
