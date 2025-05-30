package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;

	@FindBy(xpath = "//img[@alt='client brand banner']")
	WebElement clientBrandBannerElement;

	@FindBy(xpath = "//a[@class='oxd-main-menu-item active']//span[1]")
	WebElement admin;

	@FindBy(xpath = "//span[text()='PIM']")
	WebElement pim;

	@FindBy(xpath = "//span[text()='Leave']")
	WebElement leave;

	@FindBy(xpath = "//span[text()='Time']")
	WebElement time;

	@FindBy(xpath = "//span[text()='recruitment']")
	WebElement recruitment;

	@FindBy(xpath = "//span[text()='My Info']")
	WebElement myInfo;

	@FindBy(xpath = "//span[text()='Performance']")
	WebElement performance;

	@FindBy(xpath = "//span[text()='Dashboard']")
	WebElement dashboard;

	@FindBy(xpath = "//span[text()='Directory']")
	WebElement directory;

	@FindBy(xpath = "//span[text()='Maintenance']")
	WebElement maintenance;

	@FindBy(xpath = "//span[text()='Claim']")
	WebElement claim;

	@FindBy(xpath = "//span[text()='Buzz']")
	WebElement buzz;

	@FindBy(xpath = "//button[@class='oxd-glass-button orangehrm-upgrade-button']")
	WebElement upgradeElement;

	@FindBy(xpath = "//p[@class='oxd-userdropdown-name']")
	WebElement profileBtnElement;

	@FindBy(xpath = "//a[text()='About']")
	WebElement aboutElement;

	@FindBy(xpath = "//a[text()='Support']")
	WebElement supportElement;

	@FindBy(xpath = "//a[text()='Change Password']")
	WebElement changePasswordElement;

	@FindBy(xpath = "//a[text()='Logout']")
	WebElement logoutElement;

	@FindBy(xpath = "//i[@class='oxd-icon bi-question-lg']")
	WebElement helpBtnElement;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public String getPageUrl() {
		return driver.getCurrentUrl();
	}

	public boolean isAdminMenuDisplayed() {
		return admin.isDisplayed();
	}

	public void adminMethod() {
		admin.click();
	}

	public boolean isPerformanceMenuDisplayed() {
		return performance.isDisplayed();
	}

	public void clickPerformanceMenu() {
		performance.click();
	}

	public boolean isPimMenuDisplayed() {
		return pim.isDisplayed();
	}

	public void pimMethod() {
		pim.click();
	}

	public boolean isLeaveMenuDisplayed() {
		return leave.isDisplayed();
	}

	public void leaveMethod() {
		leave.click();
	}

	public boolean isTimeMenuDisplayed() {
		return time.isDisplayed();
	}

	public void timeMethod() {
		time.click();
	}

	public boolean isRecruitmentDisplayed() {
		return recruitment.isDisplayed();
	}

	public void recruitmentMethod() {
		recruitment.click();
	}

	public boolean isMyInfoDisplayed() {
		return myInfo.isDisplayed();
	}
	public void myInfoMethod() {
		myInfo.click();
	}

	public boolean isDashboardDisplayed() {
		return dashboard.isDisplayed();
	}
	public void dashboardMethod() {
		dashboard.click();
	}

	
	public boolean isDirectoryDisplayed() {
		return directory.isDisplayed();
	}
	public void directoryMethod() {
		directory.click();
	}

	
	public boolean isMaintenanceMethod() {
		return maintenance.isDisplayed();
	}
	public void maintenanceMethod() {
		maintenance.click();
	}

	public boolean isClaimDisplayed() {
		return claim.isDisplayed();
	}
	public void claimMethod() {
		claim.click();
	}

	public boolean isBuzzDisplayed() {
		return buzz.isDisplayed();
	}
	public void buzzMethod() {
		buzz.click();
	}
	
	

	public void upgradeElementMethod() {
		upgradeElement.click();
	}

	public void profileBtnElementMethod() {
		profileBtnElement.click();
	}

	public void aboutElementMethod() {
		aboutElement.click();
	}

	public void supportElementMethod() {
		supportElement.click();
	}

	public void changePasswordElementMethod() {
		changePasswordElement.click();
	}

	public void logoutElementMethod() {
		logoutElement.click();
	}

	public void helpBtnElementMethod() {
		helpBtnElement.click();
	}

	public void clickOnAdminMenu() {
		// TODO Auto-generated method stub
		admin.click();
	}


}
