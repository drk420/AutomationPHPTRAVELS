package com.PHPTRAVEL.Utility;
import java.util.ArrayList;
import java.util.Set;


public class WindowHandling extends com.PHPTRAVEL.Testbaselayer.TestBase {

	public void handlingwindow(int index) {
	String parentid=	driver.getWindowHandle();
	
	System.out.println(parentid);
	
	Set<String>parentandchildid=driver.getWindowHandles();
	System.out.println(parentandchildid);
	
	
	
	
		ArrayList<String> i= new ArrayList(parentandchildid);
		driver.switchTo().window(i.get(index));
		
	}
	
	}

