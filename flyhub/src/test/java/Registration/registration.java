package Registration;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Testcomponents.BaseTest;

import page.registration.RegistrationLib;

public class registration extends BaseTest {
	
	
	public WebDriver driver;
	private RegistrationLib RegistrationSource;
	
	
	@BeforeClass 
	public void beforeClass () throws IOException, InterruptedException
	{
		driver=BaseTest.initializeDriver();
		RegistrationSource=new RegistrationLib(driver);
		
	}
	
    @BeforeMethod
	public void beforeMethod ()
	{
    	RegistrationSource.navigateToRegisterPage("http://uat.dev.flyhub.com/en/register");
			
	}
	
    
 /* @Test (priority=2)
    public void verifyRegistrationOfClientByProvidingValidDetails() throws InterruptedException {
    	
    	
    	
    RegistrationSource.Registration();
    	Thread.sleep(5000);
    	//((JavascriptExecutor) driver).executeScript("window.open()");
    	RegistrationSource.gmailverification();
    	
    }  
    
  @Test (priority=0)
    public void VerifyRegistrationOfClientByProvidingExistingCompanyName  () throws InterruptedException {
    	
    	
    	
    	RegistrationSource.VerifyRegistrationOfClientByProvidingExistingCompanyName();
    	Thread.sleep(5000);
    	
    
    	
    } */
    
    
  /*  @Test (priority=1)
    public void VerifyRegistrationOfClientByProvidingExistingEmailAddress() throws InterruptedException {
    	
    	
    	
    	RegistrationSource.VerifyRegistrationOfClientByProvidingExistingEmailAddress();
    	Thread.sleep(5000);
    	
    	
    
    	
    }   */
    
    
    @Test (priority=3)
    public void kycsubmission() throws InterruptedException {
    	RegistrationSource.RegistrationForKyc ();
    	Thread.sleep(2000);
    	//RegistrationSource.kycSubmit();
    	
    	
    
    } 
}
