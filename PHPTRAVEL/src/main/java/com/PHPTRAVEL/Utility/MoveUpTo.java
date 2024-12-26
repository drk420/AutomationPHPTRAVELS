package com.PHPTRAVEL.Utility;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.PHPTRAVEL.Testbaselayer.TestBase;



public class MoveUpTo extends TestBase {

	public static void scrollupto(WebElement element) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		
		js.executeScript("arguments[0].scrollIntoView(true);",element);
		
		
		
		
	}
	
	public static void by() {
		JavascriptExecutor j = (JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,2000)");
	}
	
	
	
	
	
	
	
	
	
	
}
