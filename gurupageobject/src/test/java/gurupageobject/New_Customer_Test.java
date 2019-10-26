package gurupageobject;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Basecommanfuction.baseproperties;

public class New_Customer_Test extends baseproperties {

	static Logger logger = Logger.getLogger(New_Customer_Test.class);

	public void loginpage() {

		PageFactory.initElements(driver, Login_page_Object.class);

		Login_page_Object.Username.sendKeys(properties.getProperty("username"));

		Login_page_Object.password.sendKeys(properties.getProperty("password"));

		Login_page_Object.loginbutton.click();

	}

	public void NewCoustomertest() {

		logger.info("newcustomerpagelog");

		loginpage();

		PageFactory.initElements(driver, Landing_Newcustomer_page.class);

		Landing_Newcustomer_page.Newcustomer.click();

		Landing_Newcustomer_page.customername.sendKeys("sankar");

		Landing_Newcustomer_page.gender.click();

		Landing_Newcustomer_page.dobenter.sendKeys("10/28/2019");

		Landing_Newcustomer_page.address.sendKeys("45 moogabai nagar");

		Landing_Newcustomer_page.cityobject.sendKeys("pondy");

		Landing_Newcustomer_page.stateobject.sendKeys("pondicherry");

		Landing_Newcustomer_page.pincode.sendKeys("123645");

		Landing_Newcustomer_page.phonenrobject.sendKeys("9944236335");

		Landing_Newcustomer_page.emailid.sendKeys("sanp335@gmail.com");

		Landing_Newcustomer_page.password.sendKeys("qualityjjjj");

		Landing_Newcustomer_page.submmitbutton.click();

	}

	@Test
	public void scussesmeassage() throws InterruptedException {

		test = extentreport.createTest("login page going to start");

		test = extentreport.createTest("going to userpage");
		test = extentreport.createTest("succesmeaage going to apprere");

		NewCoustomertest();

		logger.info("sucesse meaage go to get");
		PageFactory.initElements(driver, New_Customer_Test.class);

		Landing_Newcustomer_page.successmessage.getText();

	}

}
