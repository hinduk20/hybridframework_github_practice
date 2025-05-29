package com.utility;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShotUtility {

	public static void TakeScreenShot(WebDriver driver, String ImageName) {
		String filePath = System.getProperty("user.dir") + "/screenshots/" + ImageName + ".png";

		TakesScreenshot sc = (TakesScreenshot) driver;
		File sourceFile = sc.getScreenshotAs(OutputType.FILE);
		File destFile = new File(filePath);
		
		try {
			// Create directory if it doesn't exist
			destFile.getParentFile().mkdirs();
			Files.copy(sourceFile.toPath(), destFile.toPath());
			System.out.println("Screenshot saved to: " + filePath);
		} catch (IOException e) {
			System.err.println("Failed to save screenshot: " + e.getMessage());
		}
	}

}
