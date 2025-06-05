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
	
	@FindBy(tagName = "h5")
	WebElement loginText;
	
	@FindBy(xpath = "//img[@alt='company-branding']")
	WebElement logoImage;
	
	@FindBy(xpath = "//p[text()='Forgot your password? ']")
	WebElement forgetPass;
	
	@FindBy(xpath = "//p[text()='OrangeHRM OS 5.7']")
	WebElement footerText;
    
	@FindBy(linkText = "OrangeHRM OS 5.7")
	WebElement footerLink;
	
	@FindBy(xpath = "//a[@href='https://www.linkedin.com/company/orangehrm/mycompany/']//*[name()='svg']")
	WebElement linkdinLogo;
	
	@FindBy(xpath = "//a[@href='https://www.facebook.com/OrangeHRM/']//*[name()='svg']")
	WebElement facebookLogo;
	
	@FindBy(xpath = "//a[@href='https://twitter.com/orangehrm?lang=en']//*[name()='svg']")
	WebElement twitterLogo;
	
	@FindBy(xpath = "(//*[name()='path'][@class='st0'])[4]")
	WebElement youTube;
	
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
public void forgetPasswordMethod() 
{
	if(forgetPass.isEnabled())
	{
		forgetPass.click();
		System.out.println("The forgetpassword link is clickable ");
	}
}
public void footerLinkClick() 
{
	if(footerLink.isEnabled()) 
	{
		footerLink.click();
		System.out.println("The link is clickable");
	}
}
public void footerAllLinks() 
{
	if(linkdinLogo.isDisplayed()) 
	{
		linkdinLogo.click();
		System.out.println("The linkdinlink is clickable");
	}
	if(facebookLogo.isDisplayed()) 
	{
		facebookLogo.click();
		System.err.println("The facebooklink is clickable ");
	}
	if(twitterLogo.isDisplayed()) {
		twitterLogo.click();
		System.out.println("the twittwer link is display and clickable ");
	}
	if(youTube.isDisplayed()) {
		youTube.click();
		System.out.println("The youtube link is display and clickable ");
	}
	
}
}
