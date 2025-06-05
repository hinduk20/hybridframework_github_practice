package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
	WebDriver driver;
	public LogoutPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		}
	
	@FindBy(xpath="//p[@class='oxd-userdropdown-name']")
	WebElement txt_user;
	@FindBy(xpath="//a[text()='Logout']")
	WebElement txt_logoutlink;
	
	@FindBy(xpath="//a[text()='Change Password']")
	WebElement txt_changepassword;
	
	public void ClickUserLink() {
		txt_user.click();
	}
	public void ClickLogoutLink() {
		txt_logoutlink.click();
	}
	//public void ChangePassword() {
	//	 txt_changepassword.click();
	//}

}
