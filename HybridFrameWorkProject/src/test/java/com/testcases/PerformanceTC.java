package com.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.LoginPage;
import com.pages.PerformancePage;
import com.testbase.Base;

public class PerformanceTC extends Base {
	
	@Test
	public void verifyPerformancePageTitle() {
		  LoginPage lp = new LoginPage(driver);
		  PerformancePage pp = new PerformancePage(driver);
		  Assert.assertTrue(pp.displayPerformanceTitle(), "title should be matched");
		  
	}
	

}
