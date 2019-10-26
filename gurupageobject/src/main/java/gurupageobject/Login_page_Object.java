package gurupageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_page_Object {
	
	@FindBy(name="uid")
	public static WebElement Username;
	
	@FindBy(name="password")
	public  static WebElement password;
	
	@FindBy(name="btnLogin")
	public  static WebElement loginbutton;
	

}
