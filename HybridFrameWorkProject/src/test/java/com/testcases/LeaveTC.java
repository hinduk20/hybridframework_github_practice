package com.testcases;

import org.testng.annotations.Test;

import com.pages.LeavePage;
import com.pages.LoginPage;
 
import com.testbase.Base;

public class LeaveTC extends Base{
	
	@Test
	   public void verifyAllData() 
	   {
		  LoginPage lp=new LoginPage(driver);
		  
		  lp.userNameTextBox();
		  lp.passwordTextBox();
		  lp.sumbitBtnClick();
		  
		  LeavePage llp = new LeavePage(driver);
		  llp.leaveTextCheck();
		  llp.leaveListSearchClick();
		  llp.leaveFound();
		  
		  
 		  
	   }

}