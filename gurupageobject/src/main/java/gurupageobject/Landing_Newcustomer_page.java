package gurupageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Landing_Newcustomer_page {

	@FindBy(linkText = "New Customer")
	public static WebElement Newcustomer;

	@FindBy(name = "name")
	public static WebElement customername;

	@FindBy(name = "rad1")
	public static WebElement gender;

	@FindBy(name = "addr")

	public static WebElement address;

	@FindBy(name = "city")
	public static WebElement cityobject;

	@FindBy(name = "state")
	public static WebElement stateobject;

	@FindBy(name = "pinno")
	public static WebElement pincode;

	@FindBy(id = "dob")
	public static WebElement dobenter;

	@FindBy(name = "telephoneno")
	public static WebElement phonenrobject;

	@FindBy(name = "sub")
	public static WebElement submmitbutton;

	@FindBy(name = "emailid")
	public static WebElement emailid;

	@FindBy(name = "password")
	public static WebElement password;
	
	@FindBy(linkText="Customer Registered Successfully!!!")
	public static WebElement successmessage;

}
