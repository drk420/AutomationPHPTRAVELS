package com.PHPTRAVEL.Pagelayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.PHPTRAVEL.Testbaselayer.TestBase;
import com.PHPTRAVEL.Utility.Dropdown;
import com.PHPTRAVEL.Utility.Iframehandling;
import com.PHPTRAVEL.Utility.MoveUpTo;
import com.PHPTRAVEL.Utility.WindowHandling;

public class Signuppage extends TestBase {

	public Signuppage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement email_textbox;
	
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement password_textbox;
	
	@FindBy(xpath="//input[@id='mobile']")
	private WebElement whatsup_textbox;
	
	@FindBy(xpath="//body/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[7]")
	private WebElement Signup_button;
	
	@FindBy(xpath="//select[@id='country_id']")
	private WebElement country_dropdown;
	
	@FindBy(xpath="//input[@id='first_name']")
	private WebElement firstname_textbox;
	
	@FindBy(xpath="//input[@id='last_name']")
	private WebElement lastname_textbox;
	
	@FindBy(xpath="//span[@id=\"recaptcha-anchor\"]")
	private WebElement recaptcha_checkbox;
	
	public void enteremail(String email) {
		email_textbox.sendKeys(email);
	}
	
	public void enterpassword(String Password) {
		password_textbox.sendKeys(Password);
	}
	
	public void enterwhatsupnumber(String number) {
		whatsup_textbox.sendKeys(number);
	}
	
	public void clickonsignupbutton() {
		MoveUpTo m = new MoveUpTo();
		m.scrollupto(Signup_button);
		Signup_button.click();
	}
	
	public void clickoncheckbox() {
		Iframehandling h = new Iframehandling();
		h.framehandling();
		recaptcha_checkbox.click();
	}
	
	public void enterfirstname(String firstname) {
		WindowHandling w = new WindowHandling();
		w.handlingwindow(1);
		firstname_textbox.sendKeys(firstname);
	}
	
	public void enterlastname(String lastname) {
		lastname_textbox.sendKeys(lastname);
	}
	
	public void selectcountry() {
		Dropdown d = new Dropdown();
		d.dropdownhandling(country_dropdown, "India +91");
	}
	
	
	
}
