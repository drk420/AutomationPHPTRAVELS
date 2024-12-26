package com.PHPTRAVEL.Utility;


import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Explicitewait extends com.PHPTRAVEL.Testbaselayer.TestBase {

	
	public static void waity(WebElement element) {
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		w.until(ExpectedConditions.visibilityOf(element));
		

	}
	
	
	
	
	
}
