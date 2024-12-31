package com.PHPTRAVEL.Testlayer;

import org.testng.annotations.Test;

import com.PHPTRAVEL.Pagelayer.Homepage;
import com.PHPTRAVEL.Pagelayer.Loginpage;
import com.PHPTRAVEL.Testbaselayer.TestBase;

public class LoginTest extends TestBase{

	@Test
	public void validateloginfunctionality() throws InterruptedException {
		
		Homepage h = new Homepage(driver);
		h.clickonloginbutton();
		//Thread.sleep(5000);
		Loginpage l = new Loginpage(driver);
		l.enteremail("kinikardnyaneshwar26@gmail.com");
		l.enterpassword("Dnyaneshwar@1234");
		l.clickoncheckbox();
		l.clickonloginbuttton();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
