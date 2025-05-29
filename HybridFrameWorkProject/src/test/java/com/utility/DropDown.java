package com.utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void SelectOptionByVisibleText(WebElement ele, String text) {
		Select options= new Select(ele);
		options.selectByVisibleText(text);
	}
	public static void SelectOptionByValue(WebElement ele, String text) {
		Select options= new Select(ele);
		options.selectByValue(text);
	}
	public static void SelectOptionByIndex(WebElement ele, int value) {
		Select options= new Select(ele);
		options.selectByIndex(value);
	}
	
	public static void DeselectOptionByVisibleText(WebElement ele, String text) {
		Select options= new Select(ele);
		options.selectByVisibleText(text);
	}
	public static void DeselectOptionByValue(WebElement ele, String text) {
		Select options= new Select(ele);
		options.selectByValue(text);
	}
	public static void DeselectOptionByIndex(WebElement ele, int value) {
		Select options= new Select(ele);
		options.selectByIndex(value);
	}
	
}
