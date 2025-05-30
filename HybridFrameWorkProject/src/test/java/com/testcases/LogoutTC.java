package com.testcases;

import org.testng.annotations.Test;

import com.pages.LogoutPage;

public class LogoutTC {
	LogoutPage lp;
	
	@Test
	public void LogoutTest() {
		lp.ClickUserLink();
		lp.ClickLogoutLink();
		
	}

}
