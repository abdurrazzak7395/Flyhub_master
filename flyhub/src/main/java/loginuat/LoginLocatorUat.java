package loginuat;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginLocatorUat {
	@FindBy(xpath="//input[@id='txtUserName']")
	private static WebElement userNameBox;

	
	public static WebElement getuserNameBox()
	{
		return userNameBox;
	}
	
	@FindBy(xpath="//input[@id='txtPassword']")
	private static WebElement passwordBox;
	
	public static WebElement getpasswordBox()
	{
		return passwordBox;
	}
	
	@FindBy(xpath="//button[@id='load']")
	private static WebElement loginButton;
	
	public static WebElement getloginButton()
	{
		return loginButton;
	}
	
	@FindBy(xpath="//span[@class='UserName']")
	private static WebElement myProfileButton;
	
	public static WebElement getmyProfileButton()
	{
		return myProfileButton;
	}
	
	@FindBy(xpath="//a[@class='tabTitle d-flex align-items-center'][contains(text(),'Logout')]")
	private static WebElement logoutButton;
	
	public static WebElement getlogoutButton()
	{
		return logoutButton;
	}
	
	@FindBy(xpath="/html[1]/body[1]/main[1]/header[2]/div[1]/div[2]/div[1]/ul[1]/li[2]/div[1]/div[1]/a[2]")
	private static WebElement indialogoutButton;
	
	public static WebElement getindialogoutButton()
	{
		return indialogoutButton;
	}
	
	
	@FindBy(xpath="//a[@class='forgot-pass']")
	private static WebElement forgotpassword;
	
	public static WebElement getforgotpassword()
	{
		return forgotpassword;
	}
	
	
	@FindBy(xpath="//input[@id='txtUname']")
	private static WebElement forgotpasswordEmail;
	
	public static WebElement getforgotpasswordEmail()
	{
		return forgotpasswordEmail;
	}
	
	@FindBy(xpath="//button[@id='load']")
	private static WebElement forgotpasswordSubmit;
	
	public static WebElement getforgotpasswordSubmit()
	{
		return forgotpasswordSubmit;
	}
	
	@FindBy(xpath="//input[@id='identifierId']")
	private static WebElement Email;
	
	public static WebElement getEmail()
	{
		return Email;
	}
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/c-wiz[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/span[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
	public static WebElement Password;

	public static WebElement getPassword()
	{
		return Password;
	}
	
	@FindBy(xpath="//span[contains(text(),'Next')]")
	private static WebElement Next;
	
	public static WebElement getNext()
	{
		return Next;
	}
	
	@FindBy(xpath="//a[contains(text(),'Inbox')]")
	private WebElement Inbox;

	public WebElement getInbox()
	{
		return Inbox;
	}
	
	
			
			
	@FindBy(xpath="/html[1]/body[1]/div[2]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[2]/div[1]/span[1]/span[1]/span[1]/span[1]/span[1]/span[1]")
	private static WebElement loginDropdown;

	public static WebElement getloginDropdown()
	{
		return loginDropdown;
	}
}
