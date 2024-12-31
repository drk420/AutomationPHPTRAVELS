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
		
		signuppage.enterfirstname("Dnyaneshwarr");
		signuppage.enterlastname("Kinikarr");
		signuppage.enteremail("kinikardnyaneshwar26@gmail.com");
		signuppage.enterpassword("Dnyaneshwar@1234");
		signuppage.selectcountry();
		signuppage.enterwhatsupnumber("8788172084");
		signuppage.clickoncheckbox();
		//Thread.sleep(10000);
		//signuppage.clickonsignupbutton();
		
	}
}
