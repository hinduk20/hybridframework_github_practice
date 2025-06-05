package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeavePage {
 
	WebDriver driver;
 	
	public LeavePage(WebDriver driver) {
		this.driver=driver;
    	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[text()=\"Leave\"]")
	WebElement leaveclick;
	
	@FindBy(xpath = "//a[text()=\"Leave List\"]")
	WebElement leavelist;
	
	@FindBy(xpath = "//button[text()=\" Search \"]")
	WebElement leavesearch;
	
	@FindBy(xpath = "//div[@class=\"oxd-table-card\"][1]")
	WebElement recordfound;
	
	
	
	
	public void leaveTextCheck() 
	{
		leaveclick.click();
	}

	
	public void leaveListClick() 
	{
		leavelist.click();
	}
	
	
	public boolean leaveFound() 
	{
		  boolean  value = recordfound.isEnabled();
		  return value;
	}
	
	
	public void leaveListSearchClick() 
	{
		leavesearch.click();
	}


}
 
