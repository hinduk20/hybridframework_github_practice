package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage {
	
	WebDriver driver;
	
	@FindBy(xpath = "//span[text()='User Management ']")
	WebElement userManagementDropDownElement;
	
	@FindBy(xpath = "//span[text()='Job ']")
	WebElement jobDropDownElement;
	
	@FindBy(xpath = "//span[text()='Organization ']")
	WebElement organizationDropDownElement;
	
	@FindBy(xpath = "//span[text()='Qualifications ']")
	WebElement qualificationsDropDownElement;
	
	
	
	@FindBy(xpath = "//a[text()='Nationalities']")
	WebElement nationalitiesBtnElement;
	
	@FindBy(xpath = "//input[@class='oxd-input oxd-input--focus']")
	WebElement usernameElement;
	
	@FindBy(xpath = "(//div[@class='oxd-select-text oxd-select-text--active'])[1]" )
	WebElement userRoleDropDownElement;
	
	@FindBy(xpath = "//input[@placeholder='Type for hints...']")
	WebElement employeeNameElement;
	
	@FindBy(xpath = "(//div[@class='oxd-select-text oxd-select-text--active'])[2]")
	WebElement statusElement;
	
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--ghost']")
	WebElement resetBtnElement;
	
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
	WebElement searchBtnElement;
	
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
	WebElement addBtnElement;
	
	@FindBy(xpath = "//i[@class='oxd-icon bi-dash oxd-checkbox-input-icon']")
	WebElement selectAllUsernameBoxElement;
	
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-horizontal-margin']")
	WebElement deleteAllSelectedBoxElement;
	
	
	
	@FindBy(xpath = "(//div[@class='oxd-select-text oxd-select-text--active'])[1]")
	WebElement editUserRoleElement;
	
	@FindBy(xpath = "//div[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--focus']")
	WebElement editUserEmployeeNameElement;
	
	@FindBy(xpath = "(//div[@class='oxd-select-text oxd-select-text--active'])[2]")
	WebElement editUserStatusElement;
	
	@FindBy(xpath = "//input[@class='oxd-input oxd-input--focus']")
	WebElement editUserUsernameElement;
	
	@FindBy(xpath = "//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']")
	WebElement editUserChangePasswordBoxElement;
	
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
	WebElement editUserSaveBtnElement;
	
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--ghost']")
	WebElement editUserCancelBtnElement;
	
	
	
	
	
	

	public AdminPage(WebDriver driver) {
		this.driver=driver;
    	PageFactory.initElements(driver, this);
	}

	
	public void editUser() {
		
	}
}
