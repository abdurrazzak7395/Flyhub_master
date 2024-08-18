package VoidRefundReissue;

import java.awt.AWTException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import FlightBook.FlightBookLib;
import page.login.LoginLib;

public class voidRefundReissueLib extends VoidRefundReissueLocator
{
	
	private static WebDriver driver;
	public voidRefundReissueLib(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public static void login() throws InterruptedException {
		getuserNameBox().sendKeys("messira786@gmail.com");
		getpasswordBox().sendKeys("Azuga@123");
		
		getloginButton().click();
		Thread.sleep(15000);
	 
		
	}
	
	public static void agentVoid() throws InterruptedException
	{
	/*	FlightBookLib book=new FlightBookLib(driver);
		book.domesticOneWayBookAdult() ; */
		getagentQueues().click();
		Thread.sleep(20000);
		getagentFlight().click();
		Thread.sleep(20000);
		getagentTicketedReferenceId().click();
		Thread.sleep(20000);
		getagentVoidButton().click();
		Thread.sleep(20000);
		getagentVoidYesButton().click();
		Thread.sleep(20000);
	//	String pid =driver.getWindowHandle();
    	Set<String> allwh=driver.getWindowHandles();
    /*	for(String wh : allwh)
    	{
    		driver.switchTo().window(wh);
    	
    		
    		getagentVoidRequestSelectAllPassengerCbox().click();
    		Thread.sleep(20000);
    		getagentVoidSendRequestButton().click();
    		Thread.sleep(20000);
    	} */
    	
    	Iterator<String> ab= allwh.iterator();
    	String parent=ab.next();
    	String child =ab.next();
    	driver.switchTo().window(child);
    	Thread.sleep(2000);
    	getagentVoidRequestSelectAllPassengerCbox().click();
		Thread.sleep(20000);
		getagentVoidSendRequestButton().click();
		Thread.sleep(20000);
    	
    	
	/*	Actions action = new Actions(driver); 
		WebElement element = driver.findElement(By.cssselector("body.hideHeaderMsg:nth-child(2) main.sideNavCollapsed:nth-child(1) section.searchMainSection:nth-child(6) div.columnBlock div.container div.columnBlock div.booking-flight.vrrRequestSection:nth-child(1) div.container form.has-validation-callback div.row:nth-child(6) div.col-lg-12 div.booking-section.bookingSection div.bookingContentSection.booking-section-content div.columnBlock.mb-30:nth-child(2) div.hal-responsive-table.without-border table.hal-table.fttable tbody.hal-table-content tr.flttab td:nth-child(1) div.hal-checkbox > label"));

		action.moveToElement(element).click();
/*		WebElement element = driver.findElement(By.xpath("//label[@title='Select Flight']"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);   */
//		getagentVoidRequestSelectFlightCbox().click();
	//	driver.findElement(By.cssSelector("label[title='Select Flight']")).click();
	//	Thread.sleep(20000);
		/*getagentVoidRequestSelectAllPassengerCbox().click();
	//	Thread.sleep(20000);
		getagentVoidSendRequestButton().click();
		Thread.sleep(20000);*/
	}
	public static void midVoid() throws InterruptedException, AWTException
	{
		
	//	FlightBookLib book=new FlightBookLib(driver);
	//	book.clearCache();
		LoginLib li=new LoginLib(driver);
		li.validLogin();
		Thread.sleep(15000);
		getMenu().click();
		Thread.sleep(20000);
		getmidvoidManagement().click();
		Thread.sleep(20000);
		getvoidRequestAssignTomelink().click();
		Thread.sleep(20000);
		getvoidRequestReferenceId().click();
		Thread.sleep(20000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,700)");
        getvoidConfirmationExpiresOn().click();
        Thread.sleep(20000);
        getpickvoidConfirmationExpiresOn().click();
        Thread.sleep(20000);
        getvoidStartVRRoperation().click();
        Thread.sleep(20000);
        getvoidSendToConfirmButton().click();
        Thread.sleep(20000);
        getvoidSendToConfirmYesButton().click();
        Thread.sleep(20000);
        getmidvoidManagementdropdown().click();
        Thread.sleep(20000);
   /*     getmidvoidToBeConfirmed().click();
        Thread.sleep(20000);
        getmidvoidToBeConfirmedReferenceId().click();
        Thread.sleep(20000);
        js.executeScript("window.scrollBy(0,700)");
        getmidvoidConfirmdatetime().click();
        Thread.sleep(20000);
        pickgetmidvoidConfirmdatetime().click();
        Thread.sleep(20000);
        getmidvoidConfirm1().click();
        Thread.sleep(20000);
        getmidvoidConfirm1YesButton().click();
        Thread.sleep(20000);
        getmidvoidManagementdropdown().click();
        Thread.sleep(20000);        */
        getselectVoiding().click();
        Thread.sleep(20000);
        getvoidingReferenceId().click();
        Thread.sleep(20000);
        getvoidApproveButton().click();
        Thread.sleep(20000);
        getvoidYesApproveButton().click();
        getvoidAutoApprove().click();
        
     }
	
	public static void agentRefund() throws InterruptedException
	{
		getagentQueues().click();
		Thread.sleep(20000);
		getagentFlight().click();
		Thread.sleep(20000);
		getagentTicketedReferenceId().click();
		Thread.sleep(20000);
		getrefundButton().click();
		Thread.sleep(20000);
		getrefundYesButton().click();
		Thread.sleep(30000);
		//driver.switchTo().frame(0);
	/*	getrefundSelectFlightCbox().click();
		Thread.sleep(20000);
		getrefundSelectAllPassengerCbox().click();
		Thread.sleep(20000); 
		getrefundReasonRadioButton().click();
		Thread.sleep(20000); */
		getrefundSendRequestButton().click();
		Thread.sleep(20000);
		
		
	}
	public static void midRefund() throws InterruptedException, AWTException
	{
		
		FlightBookLib book=new FlightBookLib(driver);
		book.clearCache();
		driver.get("http://bdmid.dev.flyhub.com");
		LoginLib li=new LoginLib(driver);
		li.validLogin();
		Thread.sleep(15000);
		getMenu().click();
		Thread.sleep(20000);
		getrefundManagement().click();
		Thread.sleep(20000);
		//getrefundAssignToMelink().click();
		//Thread.sleep(20000);
		getrefundReferenceId().click();
		Thread.sleep(20000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,800)");
        getrefundConfirmationExpiresOn().click();
        Thread.sleep(20000);
        getpickvoidConfirmationExpiresOn().click();
        Thread.sleep(20000);
       // getvoidStartVRRoperation().click();
        Thread.sleep(20000);
        getvoidSendToConfirmButton().click();
        Thread.sleep(20000);
        getvoidSendToConfirmYesButton().click();
        Thread.sleep(20000);
        getmidRefundManagementdropdown().click();
        Thread.sleep(20000);
        getmidvoidToBeConfirmed().click();
        Thread.sleep(20000);
        getmidvoidToBeConfirmedReferenceId().click();
        Thread.sleep(20000);
        js.executeScript("window.scrollBy(0,700)");
        getmidvoidConfirmdatetime().click();
        Thread.sleep(20000);
        pickgetmidvoidConfirmdatetime().click();
        Thread.sleep(20000);
        getmidvoidConfirm1().click();
        Thread.sleep(20000);
        getmidvoidConfirm1YesButton().click();
        Thread.sleep(20000);
        getmidvoidManagementdropdown().click();
        Thread.sleep(20000);        
        getselectVoiding().click();
        Thread.sleep(20000);
        getvoidingReferenceId().click();
        Thread.sleep(20000);
        getvoidApproveButton().click();
        Thread.sleep(20000);
        getvoidYesApproveButton().click();
        getvoidAutoApprove().click();
        
     }
	
	public static void agentReissue() throws InterruptedException
	{
		getagentQueues().click();
		Thread.sleep(20000);
		getagentFlight().click();
		Thread.sleep(20000);
		getagentTicketedReferenceId().click();
		Thread.sleep(20000);
		getreissueButton().click();
		Thread.sleep(20000);
		getrefundYesButton().click();
		Thread.sleep(30000);
		//driver.switchTo().frame(0);
		getrefundSelectFlightCbox().click();
		Thread.sleep(20000);
		getrefundSelectAllPassengerCbox().click();
		Thread.sleep(20000); 
		getrefundReasonRadioButton().click();
		Thread.sleep(20000); 
		getrefundSendRequestButton().click();
		Thread.sleep(20000);
		
		
	}
	}
	
	


