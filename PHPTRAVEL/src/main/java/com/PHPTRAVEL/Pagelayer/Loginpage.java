package com.PHPTRAVEL.Pagelayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

	
	
	public Loginpage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement email_textbox;
	
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement password_textbox;
	
	@FindBy(xpath="//button[@id='submit']")
	private WebElement login_button;
	
	@FindBy(xpath="//input[@id='flexCheckChecked']")
	private WebElement flexcheckbox_checkbox;
	
	public void enteremail(String email) {
		email_textbox.sendKeys(email);
		
	}
	
	public void enterpassword(String password) {
		password_textbox.sendKeys(password);
	}
	
	public void clickonloginbuttton() {
		login_button.click();
	}
	
	public void clickoncheckbox() {
		flexcheckbox_checkbox.click();
	}
	
	
	
}
