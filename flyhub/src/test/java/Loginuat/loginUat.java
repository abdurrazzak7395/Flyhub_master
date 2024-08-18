package Loginuat;

import java.awt.AWTException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Testcomponents.BaseTest;
import loginuat.LoginLibUat;

public class loginUat extends BaseTest{
		
		public WebDriver driver;
		private LoginLibUat loginSource;
		String agentUrl;
		
		public void getmidoffice() throws IOException {

			// properties class

			Properties prop = new Properties();
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\flyhub\\resources\\GlobalData.properties");
			prop.load(fis);
			agentUrl = prop.getProperty("agentUrl");
		}

		
		
		@BeforeClass 
		public void beforeClass () throws IOException, InterruptedException
		{
			driver=BaseTest.initializeDriver();
			loginSource=new LoginLibUat(driver);
			
		}
		
	    @BeforeMethod
		public void beforeMethod () throws Exception
		{
			loginSource.navigateToAgentPortal("http://uat.dev.flyhub.com/login");
		}
	    
	 
		

	  @Test (priority = 2)
	 public void verifyLoginFunctionalityByEnteringValidUsernameAndPassword () throws InterruptedException, AWTException
	 { 
		//loginSource.clearCache();
	    loginSource.validlogin();
	    
	    Thread.sleep(3000);
		String actualUrl="http://in.dev.flyhub.com/searchpad";
		String expectedUrl= driver.getCurrentUrl();
		
		
	    Assert.assertEquals (actualUrl,expectedUrl);
	    
	    loginSource.agentLogout();
	 
	 }  
    @Test (priority = 1)
		 public void verifyLoginFunctionalityByEnteringInvalidUsernameAndPassword() throws InterruptedException
		 { 
		    loginSource.invalidlogin();       
		    
		   Thread.sleep(3000);  
			String actualUrl="http://uat.dev.flyhub.com/en/login";
			String expectedUrl= driver.getCurrentUrl();
			 
			
		    Assert.assertEquals (actualUrl,expectedUrl);
		 
		 } 
	 
	 
 @Test (priority = 0)
		 public void verifyForgotPasswordFuctionalityForLogin() throws InterruptedException
		 { 
		    loginSource.agentForgotpassword();    
		    Thread.sleep(3000); 
		   loginSource.forgotPasswordEmailVerification();
		    
		 }  
	   
}



