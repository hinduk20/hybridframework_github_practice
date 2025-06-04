package com.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PerformancePage {
	
	WebDriver driver;
	
	public PerformancePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//h6[text()='Performance']")
	WebElement performance;
	
	@FindBy(xpath = "//nav[@role='navigation']/ul/li/span[text()='Configure ']")
	WebElement configure;
		
	@FindBy(xpath="//nav[@role='navigation']/ul/li/span[text()='Manage Reviews ']")
	WebElement manageReview;
	
	@FindBy(xpath = "//nav[@role='navigation']/ul/li/a[text()='My Trackers']")
	WebElement myTracker;
	
	@FindBy(xpath = "//nav[@role='navigation']/ul/li/a[text()='Employee Trackers']")
	WebElement employeeTracker;
	
	//configure Page 
	
	@FindBy(xpath="oxd-dropdown-menu")
	WebElement confiugreDropDown;
	
	//ManageReviewPage
	
	@FindBy(xpath="//ul[@class='oxd-dropdown-menu']/li")
	WebElement manageReviewDD;
	
	@FindBy(xpath = "//input[@placeholder='Type for hints...']")
	WebElement employeeName;
	
	@FindBy(xpath="(//div[@class='oxd-select-text-input'])[1]")
	WebElement jobTitle;
	
	@FindBy(xpath = "//div[text()='Account Assistant']")
	WebElement accountAssitant;
	
	@FindBy(xpath = "//div[text()='Automaton Tester']")
	WebElement automationTester;
	
	@FindBy(xpath="/(//div[@class='oxd-select-text-input'])[2]")
	WebElement subunit;
	
	@FindBy(xpath="(//div[@class='oxd-select-text-input'])[3]")
	WebElement include;
	
	@FindBy(xpath="(//div[@class='oxd-select-text-input'])[4]")
	WebElement reviewStatus;
	
	@FindBy(xpath="//div[text()='Activated']")
	WebElement Activated;
	
	@FindBy(xpath="//div[text()='In Progress']")
	WebElement inProgress;
	
	@FindBy(xpath="//div[text()='Completed']")
	WebElement completed;
	
	@FindBy(xpath="(//input[@placeholder='yyyy-dd-mm'])[1]")
	WebElement toDate;
	
	@FindBy(xpath="(//input[@placeholder='yyyy-dd-mm'])[2]")
	WebElement fromDate;
	
	@FindBy(xpath="//button[@type='reset']")
	WebElement reset;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement search;
	
	//MyTracker Page
	@FindBy(xpath="//button[@name='view']")
	WebElement view;
	
	//employee Tracker page
	@FindBy(xpath="//div[@class='oxd-select-wrapper']")
	WebElement includeDD;
	
	@FindBy(xpath= "//div[@class='oxd-autocomplete-wrapper']")
	WebElement employeeName1;
	
	
	public void clickOnManageReview() {
		manageReview.click();
	}
	
	public boolean displayPerformanceTitle() {
		return performance.isDisplayed();
	}
	
	public void selectJobTitle(String jobTilte) {
		if(jobTitle.equals("Automation Tester")) {
			automationTester.click();
		}
		else if(jobTitle.equals("Account Assitant")){
			accountAssitant.click();
		}
	}
	
	public void selectReviewStatus(String reviewStatus ) {
		if(reviewStatus.equals("Activated")) {
			Activated.click();
		}
		else if(reviewStatus.equals("In Progress")){
			inProgress.click();
		}
		
		else if(reviewStatus.equals("Completed")){
			completed.click();
		}
	}
	
	
	
	
	
	
	
	
	
	

}
