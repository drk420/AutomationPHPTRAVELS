package com.PHPTRAVEL.Utility;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;


public class Takesscreenshot extends com.PHPTRAVEL.Testbaselayer.TestBase {

public static void getscreenshot(String filename) {
		
	try {
	TakesScreenshot ts = (TakesScreenshot)driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	String path = "D:\\velocity training\\ECLIPS-2022-26\\ECLIPS_WORKSPACE\\Facebook\\Screenshot\\";
	File des = new File(path+filename+".png");
	
		FileHandler.copy(src, des);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}}