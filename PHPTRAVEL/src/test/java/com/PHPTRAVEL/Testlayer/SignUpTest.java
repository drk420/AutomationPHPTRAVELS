package com.PHPTRAVEL.Testlayer;

import org.testng.annotations.Test;

import com.PHPTRAVEL.Pagelayer.Homepage;
import com.PHPTRAVEL.Pagelayer.Signuppage;
import com.PHPTRAVEL.Testbaselayer.TestBase;

public class SignUpTest extends TestBase{

	@Test
	public void validatesignuptest() throws InterruptedException {
		
		Homepage homepage = new Homepage(driver);
		
		homepage.clickonsignupbutton();
		
		Signuppage signuppage= new Signuppage (driver);
		
		signuppage.enterfirstname("Dnyaneshwar");
		signuppage.enterlastname("Kinikar");
		signuppage.enteremail("kinikardnyaneshwar28@gmail.com");
		signuppage.enterpassword("Dnyaneshwar@123");
		signuppage.selectcountry();
		signuppage.enterwhatsupnumber("8788172074");
		signuppage.clickoncheckbox();
		//Thread.sleep(10000);
		//signuppage.clickonsignupbutton();
		
	}
}
