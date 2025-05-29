package com.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void SelectOptionByVisibleText(WebDriver driver, WebElement ele, String text) {
		Select options= new Select(ele);
		options.selectByVisibleText(text);
	}
	public static void SelectOptionByValue(WebDriver driver, WebElement ele, String text) {
		Select options= new Select(ele);
		options.selectByValue(text);
	}
	public static void SelectOptionByIndex(WebDriver driver, WebElement ele, int value) {
		Select options= new Select(ele);
		options.selectByIndex(value);
	}
	
	public static void DeselectOptionByVisibleText(WebDriver driver, WebElement ele, String text) {
		Select options= new Select(ele);
		options.selectByVisibleText(text);
	}
	public static void DeselectOptionByValue(WebDriver driver, WebElement ele, String text) {
		Select options= new Select(ele);
		options.selectByValue(text);
	}
	public static void DeselectOptionByIndex(WebDriver driver, WebElement ele, int value) {
		Select options= new Select(ele);
		options.selectByIndex(value);
	}
	
}
