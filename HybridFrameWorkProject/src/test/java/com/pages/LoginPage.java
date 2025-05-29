package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	WebDriver driver;
	
	@FindBy(name = "username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement submitBtn;
	
	@FindBy(xpath = "//h5[text()='Login']")
	WebElement loginText;
	
	@FindBy(xpath = "//img[@alt='company-branding']")
	WebElement logoImage;
	
 public LoginPage(WebDriver driver)
 {
	 this.driver=driver;
	 PageFactory.initElements(driver, this);
 }

 public void userNameTextBox() 
 {
	 username.sendKeys("Admin");
 }
public void passwordTextBox() 
{
	password.sendKeys("admin123");
}
public void sumbitBtnClick() 
{
	submitBtn.click();
}
public void loginTextCheck() 
{
	if(loginText.isDisplayed())
	{
		System.out.println("The text is display correctly");
	}
}
public void logoImgageDisplay() 
{
	if(logoImage.isDisplayed()) 
	{
		System.out.println("The image is correctly display");
	}
}
}
