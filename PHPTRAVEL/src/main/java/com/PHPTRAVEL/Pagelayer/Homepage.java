package com.PHPTRAVEL.Pagelayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.PHPTRAVEL.Testbaselayer.TestBase;

public class Homepage extends TestBase{

	
	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath="//header/nav[1]/div[1]/div[1]/div[1]/a[3]")
	private WebElement signup_button;
	
	
	
	
	
	
	
	public void clickonsignupbutton() {
		signup_button.click();
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
