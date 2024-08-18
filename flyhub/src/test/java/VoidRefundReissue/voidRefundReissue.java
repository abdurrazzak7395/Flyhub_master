package VoidRefundReissue;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Testcomponents.BaseTest;
import loginuat.LoginLibUat;


public class voidRefundReissue extends BaseTest 
{
	public WebDriver driver;
	private voidRefundReissueLib voidRefundReissueSource;

	@BeforeClass
	public void beforeClass() throws IOException, InterruptedException {
		driver = BaseTest.initializeDriver();
		voidRefundReissueSource = new voidRefundReissueLib(driver);
}
	@BeforeMethod
	public void beforeMethod() throws Exception {
		LoginLibUat.driver = driver;
		LoginLibUat.navigateToAgentPortal("http://uat.dev.flyhub.com/login");

	} 
	
	
	@Test
	public void verifyvoidingfunctionality() throws InterruptedException, AWTException
	{
	    voidRefundReissueLib.login();
   
       voidRefundReissueLib.agentVoid();  
	//	voidRefundReissueLib.midVoid();
        
	}   
		

		@Test
	public void verifyRefundfunctionality() throws InterruptedException, AWTException
	{
	    voidRefundReissueLib.login();
   
      voidRefundReissueLib.agentRefund();  
	//	voidRefundReissueLib.midRefund();
        
	} 
	
	}
