package com.PHPTRAVEL.Utility;

import com.PHPTRAVEL.Testbaselayer.TestBase;

public class AlertPopUp extends TestBase {

	
	public void handlealertpopupaccept() {
		
		
		driver.switchTo().alert().accept();
		
		
		
	}
	
public void handlealertpopupdissmis() {
		
		
		driver.switchTo().alert().dismiss();
		
		
		
	}
	
public void handlealertpopsendkeys(String text) {
	
	
	driver.switchTo().alert().sendKeys(text);
	
	
	
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
