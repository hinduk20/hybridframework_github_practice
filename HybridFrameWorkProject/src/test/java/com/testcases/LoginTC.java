package com.testcases;

import org.testng.annotations.Test;

import com.pages.LoginPage;
import com.testbase.Base;

public class LoginTC extends Base
{
	@Test
   public void verifyAllData() 
   {
	  LoginPage lp=new LoginPage(driver);
	  
	  lp.userNameTextBox();
	  lp.passwordTextBox();
	  lp.sumbitBtnClick();
	  lp.loginTextCheck();
	  lp.logoImgageDisplay();
	  
   }
}
