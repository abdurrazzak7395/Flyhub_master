package page.registration;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


public class RegistrationLib extends RegistrationLocator{

	private final WebDriver driver;
	public 	RegistrationLib(WebDriver driver){
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
	}
	
	
	/**
	 * this method is used to navigate to given midofficeUrl
	 * @param url : midofficeUrl to be open
	 */
	public void navigateToRegisterPage(String registrationUrl)
	{
	
        
		try {
			driver.get(registrationUrl);
			System.out.println("application is opening");
		} 
		catch(Exception e)
		{
		System.out.println(e.getMessage());
		
		
		}
		
			
		}
	
	/**
	 * This method is used to sign in to mail for user
	 * @throws InterruptedException 
	 */
	
	public void gmailverification() throws InterruptedException

	{
		//((JavascriptExecutor) driver).executeScript("window.open('https://accounts.google.com/InteractiveLogin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F%3Fhl%3Den&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F%3Fhl%3Den&hl=en&osid=1&passive=1209600&service=mail&ifkv=AXo7B7X0I1jfR2r4b8bH44QePiWcfzFdq4k3b_tltjb-rKcveAcR-gQsPtFGBM7pLrLlK3UnvxA2dA&flowName=GlifWebSignIn&flowEntry=ServiceLogin')");
		
		driver.get("https://accounts.google.com/InteractiveLogin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F%3Fhl%3Den&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F%3Fhl%3Den&hl=en&osid=1&passive=1209600&service=mail&ifkv=AXo7B7X0I1jfR2r4b8bH44QePiWcfzFdq4k3b_tltjb-rKcveAcR-gQsPtFGBM7pLrLlK3UnvxA2dA&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		getEmail().sendKeys("johnsmithra253@gmail.com");
		
		Thread.sleep(6000);
		
		getNext().click();
		Thread.sleep(30000);
		getPassword().sendKeys("Azuga@123");
		Thread.sleep(3000);
		getNext().click();
		
		Thread.sleep(6000);
		getInbox().click();
		
		Thread.sleep(7000);
		List<WebElement> allMessages = driver.findElements(By.xpath("//*[contains(text(), 'Flyhub-Successful Registration')]"));
	      if(allMessages.isEmpty()) {
	    	  System.out.println("Test not passed");
	      }else {
	    	  System.out.println("Test passed");}

	} 
	
	
	
	/** 
	 * This method is to fill up the details for registration flow
	 * all the fields details to be passed 
	 * @throws InterruptedException 
	 */
    public void VerifyRegistrationOfClientByProvidingExistingEmailAddress() throws InterruptedException
    { 
    	getfirstName().sendKeys("john");
    	getlastName().sendKeys("smith");
    	gettxtCompanyName().sendKeys("jofsuhjnnhnnmbc773gv");
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("window.scrollBy(0,550)");
    	Thread.sleep(110000);
    	js.executeScript("window.scrollBy(0,-250)");
    	gettxtUserName().sendKeys("manishmd045@gmail.com"); 
    
    	gettelnumber().sendKeys("1778904532");
    
    	getAddress1().sendKeys("Dombivli");
    	
    	getAddress2().sendKeys("Thane");
    	
    	getCity().sendKeys("Mumbai");
    
    	getZIP().sendKeys("400001");
  
    	getcheckboxCustom().click();
    	
        getsubmit().click();
    	getokButton().click();
    	
   }

    /** 
	 * This method is to fill up the details for registration flow
	 * all the fields details to be passed 
	 * @throws InterruptedException 
	 */
    public void VerifyRegistrationOfClientByProvidingExistingCompanyName () throws InterruptedException
    { 
    	getfirstName().sendKeys("john");
    	getlastName().sendKeys("smith");
    	gettxtCompanyName().sendKeys("maniedtech");
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("window.scrollBy(0,550)");
    	Thread.sleep(120000);
    	js.executeScript("window.scrollBy(0,-250)");
    	gettxtUserName().sendKeys("j87njnhjnhju@gmal.com"); 
    	gettelnumber().sendKeys("1778904532");
    	getAddress1().sendKeys("Dombivli");
    	getAddress2().sendKeys("Thane");
    	getCity().sendKeys("Mumbai");
    	getZIP().sendKeys("400001");
    	getcheckboxCustom().click();
        getsubmit().click();
    	getokButton().click();
    	
    	}
    /** 
	 * This method is to fill up the details for registration flow
	 * all the fields details to be passed 
	 * @throws InterruptedException 
	 */
    public void Registration () throws InterruptedException
    { 
    	getfirstName().sendKeys("john");
    	getlastName().sendKeys("smith");
    	gettxtCompanyName().sendKeys("jgtgfcdcvcgfvvcvc");
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("window.scrollBy(0,550)");
    	Thread.sleep(120000);
    	js.executeScript("window.scrollBy(0,-250)");
    	gettxtUserName().sendKeys("bnj7ujuyutrfd@gmal.com"); 
    	
    	gettelnumber().sendKeys("1778904532");
    	getAddress1().sendKeys("Dombivli");
    	getAddress2().sendKeys("Thane");
    	getCity().sendKeys("Mumbai");
    	getZIP().sendKeys("400001");
    	
    	getcheckboxCustom().click();
    	Thread.sleep(1000);
    	 
    	getsubmit().click();
    	Thread.sleep(5000);
    	//getokButton().click();
    	//Thread.sleep(5000);
    	
    	
    	
	 
    }
    
    public void RegistrationForKyc () throws InterruptedException
    { 
    	getfirstName().sendKeys("john");
    	getlastName().sendKeys("smith");
    	gettxtCompanyName().sendKeys("jgt7743yecvc");
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("window.scrollBy(0,550)");
    	Thread.sleep(120000);
    	js.executeScript("window.scrollBy(0,-250)");
    	gettxtUserName().sendKeys("bn87ehehjd@gmal.com"); 
    	
    	gettelnumber().sendKeys("1778904532");
    	getAddress1().sendKeys("Dombivli");
    	getAddress2().sendKeys("Thane");
    	getCity().sendKeys("Mumbai");
    	getZIP().sendKeys("400001");
    	
    	getcheckboxCustom().click();
    	Thread.sleep(1000);
    	 
    	getsubmit().click();
    	Thread.sleep(5000);
    	//getokButton().click();
    	//Thread.sleep(5000);
    	
    	
    	
	 
    }
    public void kycSubmit() throws InterruptedException{
    	 
    	Thread.sleep(10000);
    	String pid =driver.getWindowHandle();
    	Set<String> allwh=driver.getWindowHandles();
    	for(String wh : allwh)
    	{
    		driver.switchTo().window(wh);
    		
    		getclickHereKyc().click();
    	}

    	 
    	
    	
    	getcontactNameKyc().sendKeys("contacts");
    	gettelNumberKyc().sendKeys("1789654356");
    	getcontactEmailKyc().sendKeys("contac@gmail.com");
    	getsaveAndNextKyc().click();
    	Thread.sleep(6000);
    	
    	getbusinessTypeKyc().click();
    	Thread.sleep(2000);
    	getselectbusinessTypeKyc().click();
    	getbusinessCategoryKyc().click();
    	Thread.sleep(2000);
    	getselectbusinessCategoryKyc().click();
    	JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,150)");
   	    Thread.sleep(120000);
    	getsubCategoryKyc().click();
    	getselectsubCategoryKyc().click();
    	getbillingLabelKyc().sendKeys("labxjdsh");
    	getsaveAndNextKyc().click();
    	Thread.sleep(2000);
    	
    	getbusinessTinKyc().sendKeys("6754342");
    	getbusinessNameKyc().sendKeys("bsink");
    	getauthorisedSignatoryTinKyc().sendKeys("453245");
    	js.executeScript("window.scrollBy(0,150)");
    	gettinOwnersNameKyc().sendKeys("tiede");
    	getaddressKyc().sendKeys("vijayanagar");
    	getzipCodeKyc().sendKeys("560020");
    	getcityKyc().click();
    	Thread.sleep(2000);
    	getcityKyc().sendKeys("3010");
    	Thread.sleep(2000);
    	getentercityKyc().click();
    	getsameAddressSaveKyc().click();
    	getsaveAndNextKyc().click();
    	Thread.sleep(2000);
    	
    	getbeneficiaryNameKyc().sendKeys("betys");
    	getroutingNumberKyc().sendKeys("020060288");
    	Thread.sleep(2000);
    	js.executeScript("window.scrollBy(0,150)");
    	getaccountNumberKyc().sendKeys("7689654381");
    	getreEnteraccountNumberKyc().sendKeys("7689654381");
    	getsaveAndNextKyc().click();
    	Thread.sleep(2000);
    	
    	getauthorizeSigntorysAddressProofKyc().click();
    	getselectAddressProofKyc().click();
    	getaddressproofFrontKyc().sendKeys("C:\\Users\\SHASHIKUMAR\\Documents");
    	getaddressproofBackKyc().sendKeys("C:\\Users\\SHASHIKUMAR\\Documents");
    	getbusinessRegistrationProofKyc().sendKeys("C:\\Users\\SHASHIKUMAR\\Documents");
    	js.executeScript("window.scrollBy(0,150)");
    	getcompanyTinKyc().sendKeys("C:\\Users\\SHASHIKUMAR\\Documents");
    	getadditionalDocKyc().click();
    	getselectadditionalDocKyc().click();
    	getadditionalDocProofKyc().click();
    	getsubmitFormKyc().click();
    	
    	
    }
    
    }

