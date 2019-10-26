package gurupageobject;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Basecommanfuction.baseproperties;

public class Login_Test_case extends baseproperties  {
	
	Logger logger= Logger.getLogger(Login_Test_case.class);
	
	@Test
	public void logintestcase() {
		
		test=extentreport.createTest("going to launch test case");
		
		logger.info("login page going to Test");
		
		PageFactory.initElements(driver,Login_page_Object.class);
		
		Login_page_Object.Username.sendKeys(properties.getProperty("username"));
		
		Login_page_Object.password.sendKeys(properties.getProperty("password"));
		
		Login_page_Object.loginbutton.click();
		
		
		
	}
	

}
