package login;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.SessionNotCreatedException;

import Testcomponents.BaseTest;
import page.login.LoginLib;





public class LoginTest extends BaseTest{
	
	public WebDriver driver;
	private LoginLib loginSource;
	String midofficeUrl;
	
	public void getmidoffice() throws IOException {

		// properties class

		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\flyhub\\resources\\GlobalData.properties");
		prop.load(fis);
	     midofficeUrl = prop.getProperty("midofficeUrl");
	}

	
	
	@BeforeClass 
	public void beforeClass () throws IOException, InterruptedException
	{
		driver=BaseTest.initializeDriver();
		loginSource=new LoginLib(driver);
		
	}
	
    @BeforeMethod
	public void beforeMethod ()
	{
		loginSource.navigateToFlyhub("http://bdmid.dev.flyhub.com");
			
	}
    
  /*  @AfterMethod
   	public void afterMethod ()
   	{
   		loginSource.midOfficeLogout();
   			
   	}
    
    @AfterClass 
	public void afterClass () throws IOException, InterruptedException
	{
    	loginSource.midOfficeLogout();
		
	} */
    
    
	
  /* @Test (priority =0)
    public void verifyContinueWithGoogleFunctionalityForLogin () throws InterruptedException
    {
    	Thread.sleep(5000);
    	loginSource.continueWithGoogle();
    	String actualUrl="http://bdmid.dev.flyhub.com/Dashboard/Index/";
    	String expectedUrl= driver.getCurrentUrl();
    	
    	
         Assert.assertEquals (actualUrl,expectedUrl);
         Thread.sleep(5000);
         loginSource.midOfficeLogout();
         Thread.sleep(5000);
    } */
    
  @Test (priority =1)
 public void verifyLoginFunctionalityByEnteringValidUsernameandPassword() throws InterruptedException 
 { 
    loginSource.validLogin();
	String actualUrl="http://bdmid.dev.flyhub.com/Dashboard/Index/";
	String expectedUrl= driver.getCurrentUrl();
	
	
     Assert.assertEquals (actualUrl,expectedUrl);
     
     loginSource.midOfficeLogout();
     Thread.sleep(5000);
    
 
 } 
    @Test (priority =2)
     public void verifyLoginFunctionalityByEnteringinValidUsernameandPassword() throws InterruptedException
     {
    	 loginSource.invalidLogin();
    	 String actualUrl="http://bdmid.dev.flyhub.com/Login/Login/";
    	 String expectedUrl= driver.getCurrentUrl();
    	
    	 Assert.assertEquals (actualUrl,expectedUrl);
    	 Thread.sleep(5000);
     } 
   
 /* @Test (priority =3)
   public void verifyactivateClient () throws InterruptedException
   {
   	loginSource.validLogin();
   	loginSource.activateClient();
   	loginSource.midOfficeLogout();
   	
   	
   	
        
   }  
   
    @Test (priority =4)
    public void verifyforgotPasswordFuctionalityForLogin  () throws InterruptedException
    {
    	loginSource.ForgotPassword ();
    	Thread.sleep(2000);
    	loginSource.forgotPasswordEmailVerification();
    	
    	
    	
    } */
    
    
  
    }




