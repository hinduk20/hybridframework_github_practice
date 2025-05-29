package com.utility;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;

public class AlertUtility {
	
	static Alert alert;
	
	public static void AcceptAlert(WebDriver driver) {
		if (isAlertPresent(driver)) {
			System.out.println(alert.getText());
			alert.accept();
		}
		else {
			System.out.println("Alert Not Present On The Page");
		}
	}
	
	public static void DismissAlert(WebDriver driver) {
		if (isAlertPresent(driver)) {
			System.out.println(alert.getText());
			alert.dismiss();
		}
		else {
			System.out.println("Alert Not Present On The Page");
		}
	}
	
	public static boolean isAlertPresent(WebDriver driver) {
		
		try {
			alert = driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
	}

}
