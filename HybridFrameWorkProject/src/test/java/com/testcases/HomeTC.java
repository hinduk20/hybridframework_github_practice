package com.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.HomePage;
import com.pages.LoginPage;
import com.testbase.Base;

public class HomeTC extends Base{
	/* LoginPage loginPage = new LoginPage();
     HomePage homePage = new HomePage();
     */
		WebDriver driver;
	    LoginPage loginPage;
	    HomePage homePage;

	@Test
    public void verifyNavigationToPerformancePage() {
		
       Assert.assertTrue(homePage.isPerformanceMenuDisplayed(), "Performance menu is not visible");
       homePage.clickPerformanceMenu();
       Assert.assertTrue(driver.getCurrentUrl().contains("performance"), "Navigation to Performance page failed");
	}
	/*
	@Test
	public void verifyNavigationToAdminPage() {
		Assert.assertTrue(homePage.isAdminMenuDisplayed(), "Admin menu not found");
		homePage.adminMethod();
		Assert.assertTrue(driver.getCurrentUrl().contains("admin"), "Navigation to admin page failed");
	}
	*/
	
	@Test
	public void verifyNavigationToAdminPage() {
	    Assert.assertTrue(homePage.isAdminMenuDisplayed(), "Admin menu not found");
	    homePage.clickOnAdminMenu();
	    String currentUrl = driver.getCurrentUrl();
	    Assert.assertTrue(currentUrl.contains("/admin/viewAdminModule"), "Navigation to Admin page failed. Current URL: " + currentUrl);
	}

	
	@Test
	public void verifyNavigationToPimPage() {
		Assert.assertTrue(homePage.isPimMenuDisplayed(), "PIM menu not found");
		homePage.pimMethod();
		Assert.assertTrue(driver.getCurrentUrl().contains("pim"), "Navigate to pim page failed");
	}
	
	@Test
	public void verifyNavigationToLeavePage() {
		Assert.assertTrue(homePage.isLeaveMenuDisplayed(), "Leave menu not found");
		homePage.leaveMethod();
		Assert.assertTrue(driver.getCurrentUrl().contains("leave"), "Navigation to leave page failed");
	}
	
	@Test
	public void verifyNavigationToTimePage() {
		Assert.assertTrue(homePage.isTimeMenuDisplayed(), "Time menu not found");
		homePage.timeMethod();
		Assert.assertTrue(driver.getCurrentUrl().contains("time"), "Navigation to time page failed");
	}
	
	@Test
	public void verifyNavigationToRecruitment() {
		Assert.assertTrue(homePage.isRecruitmentDisplayed(), "Recruitment menu not found");
		homePage.recruitmentMethod();
		Assert.assertTrue(driver.getCurrentUrl().contains("recruitment"), "Navigation to recruitment page failed");
	}
	
	@Test
	public void verifyNavigationToMyinfo() {
		Assert.assertTrue(homePage.isMyInfoDisplayed(), "Myinfo menu not found");
		homePage.myInfoMethod();
		Assert.assertTrue(driver.getCurrentUrl().contains("viewPersonalDetails"), "Navigation to my_info page failed");
	}
		
	@Test
	public void verifyNavigationToDashboard() {
		Assert.assertTrue(homePage.isDashboardDisplayed(), "Dashboard menu not found");
		homePage.dashboardMethod();
		Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"), "Navigation to dashboard page failed");
	}
	
	@Test
	public void verifyNavigationToDirectory() {
		Assert.assertTrue(homePage.isDirectoryDisplayed(), "Directory menu not found");
		homePage.directoryMethod();
		Assert.assertTrue(driver.getCurrentUrl().contains("directory"), "Navigation to directory page failed");
	}
	
	@Test
	public void verifyNavigationToMaintainance() {
		Assert.assertTrue(homePage.isMaintenanceMethod(), "Maintenance menu not found");
		homePage.maintenanceMethod();
		Assert.assertTrue(driver.getCurrentUrl().contains("maintenance"), "Navigation to maintenance page failed");
	}
	
	@Test
	public void verifyNavigationToClaim() {
		Assert.assertTrue(homePage.isClaimDisplayed(), "Claim menu not found");
		homePage.claimMethod();
		Assert.assertTrue(driver.getCurrentUrl().contains("claim"), "Navigation to claim page failed");
	
	}
	
	@Test
	public void verifyNavigationToBuzz() {
		Assert.assertTrue(homePage.isBuzzDisplayed(), "Buzz menu not found");
		homePage.buzzMethod();
		Assert.assertTrue(driver.getCurrentUrl().contains("buzz"), "Navigation to buzz page failed");
	
	}
		
	
		
		
	}