package FlightBook;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import jdk.internal.org.jline.utils.Log;
import page.login.LoginLib;

public class FlightBookLib extends FlightBookLocator {

	static WebDriver driver;
	int clientAmount;
	int ticketAmount;

	public FlightBookLib(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public static void login() throws InterruptedException { 
		
		Thread.sleep(5000);
		getuserNameBox().sendKeys("gillraja@gmail.com");
		
		
		getpasswordBox().sendKeys("Azuga@123");

		
		getloginButton().click();
		
		Thread.sleep(35000);
	

	/*	// System.out.println(getbalanceAmount().getText());
		String alphaNumericString = (getbalanceAmount().getText());

		char[] carray = alphaNumericString.toCharArray();
		for (char c : carray) {
			if (Character.isDigit(c)) {
				String clientAmount = Character.toString(c);
				System.out.print(clientAmount);
			}
		}  */

	}

	public void domesticOneWayBookAdult() throws InterruptedException {
		
		//Thread.sleep(25000);
		
		getoneWayButton().click();
		
	//	Thread.sleep(25000);
		
		getFrom().sendKeys("DAC");
		Thread.sleep(1000);
		
		getfromSelect().click();
		
		getTo().sendKeys("SIN");
	
		gettoSelect().click();

		getdepartureDate().sendKeys("30/08/2024");
	
		getsearchFlights().click();
	
	}

		
		public void viewFareorBookNow() throws InterruptedException
		{
		
		
	    if(isElementdisplay(getviewFares()))
		{
			
				getviewFares().click();
				System.out.println("viewFare Available");
				
				getviewFarebookNow().click();
				Thread.sleep(3000);
			
				System.out.println(getviewFares());
			
		}
	    
							
	    else {
	    	
	    	getbookNow().click();
	    }
		}
	    
	    public void bookingForOnewayagentportal () throws InterruptedException
	    {
		
	    JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		
		getfirstGivenName().sendKeys("kyle");
	
		getlastSurname().sendKeys("smith");
		
		getpassengerAdultDob().click();
		
		getpickpassengerAdultDob().click();
		
		js.executeScript("window.scrollBy(0,500)");
		getpassportNumber().sendKeys("31195855");
		
		getexpiresOn().click();
	
		getpickexpiresOn().click();
		
		getaddToTravellersList().click();
		
		getemailAddress().sendKeys("messira786@gmail.com");
		
		getmobileNumber().sendKeys("1798765432");
		
		getfareRulescbox().click();
	
		gettermsAndConditionscbox().click();

		js.executeScript("window.scrollBy(0,100)");
	

		// getinstantTicketing().click();
		getBookAndHold().click();
		Thread.sleep(15000);
		getconfirmBooking().click();
		Thread.sleep(15000);
		}

		
		
		
	/*	if (clientAmount > ticketAmount)
		{

			Thread.sleep(15000);
			getconfirmBooking().click();
			Thread.sleep(15000);
			
		}
		else if (clientAmount < ticketAmount)
		{
			System.out.println("Insufficient balanace");
		}
		 
		}
		*/
		
		public  boolean isElementdisplay(WebElement ele)
		{
		    try{
		       
		        ele.isDisplayed();
		        

		    }
		    catch(Exception e)
		    {
		     
		        return false;
		    }
		    return true;
		}

		
		
		
		public void loginn() throws InterruptedException {
		// driver.manage().window();

		// driver.get("http://bdmid.dev.flyhub.com");
		// Thread.sleep(60000);
		// driver.manage().window();
		driver.get("http://bdmid.dev.flyhub.com");

		LoginLib li = new LoginLib(driver);
		li.validLogin();
		Thread.sleep(15000);
		getMenu().click();
		Thread.sleep(16000);
		getinprocessQueue().click();
		Thread.sleep(16000);
		getassignToMe().click();
		Thread.sleep(16000);
		getselectInProcessLink().click();
		Thread.sleep(30000);
		getstartTicketingOperation().click();
		Thread.sleep(30000);
		getselectVendor().click();
		Thread.sleep(15000);
		getselectingVendor().click();
		Thread.sleep(15000);
		getupdateVendor().click();
		Thread.sleep(15000);
		getticketUpdateManual().click();
		Thread.sleep(15000);
		getticketNumber().sendKeys("1278");
		Thread.sleep(15000);
		getticketUpdate().click();
		Thread.sleep(15000);

		getprintDownload().click();
		Thread.sleep(15000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");                                                                                                                                                                                                                                                                                                                                                                                                
		getprintInvoice().click();
		Thread.sleep(15000);
		getprintCustomerInvoice().click();
		Thread.sleep(15000);

		getprintConfirmationWithPrice().click();
		Thread.sleep(15000);
		getprintConfirmationWithoutPrice().click();
		Thread.sleep(15000);
		getticketWithPrice().click();
		Thread.sleep(15000);
		getticketWithPriceone().click();
		Thread.sleep(15000);
		getticketWithPriceEticket().click();
		Thread.sleep(15000);

		getticketWithoutPrice().click();
		Thread.sleep(15000);
		getticketWithoutPriceone().click();
		Thread.sleep(15000);
		getticketWithoutPriceEticket().click();
		Thread.sleep(15000);

	}

	public void domesticOneWayBookAdultandchild() throws InterruptedException {

		
       // Thread.sleep(25000);
		
		getoneWayButton().click();
		
//		Thread.sleep(25000);
		getselectPassenger().click();
		
		getincreaseChildPassenger().click();
		
		getselectPassenger().click();
		getFrom().sendKeys("DAC");
		Thread.sleep(1000);
		
		getfromSelect().click();
		getTo().sendKeys("SIN");
		
		gettoSelect().click();
		getdepartureDate().sendKeys("30/08/2024");
		
		getsearchFlights().click();
	}
	public void yourtwo() throws InterruptedException
	{
	
	
    if(isElementdisplay(getviewFares()))
	{
		
			getviewFare().click();
			System.out.println("not view");
			
			getviewFarebookNow().click();
		
			System.out.println(getviewFares());}
						
    else {
    	
    	getbookNow().click();
    }
	}
		
	public void bookingfordomesticOneWayBookAdultandchild() throws Exception
	{
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		
	//	Thread.sleep(5000);
		getfirstGivenName().sendKeys("kyle");
		
		getlastSurname().sendKeys("smith");
		
		getpassengerAdultDob().click();
		
		getpickpassengerAdultDob().click();
		
		js.executeScript("window.scrollBy(0,500)");
		getpassportNumber().sendKeys("31195855");
		
		getexpiresOn().click();
		
		getpickexpiresOn().click();
		
		//getaddToTravellersList().click();
		

		js.executeScript("window.scrollBy(0,500)");

		getsecondfirstGivenName().sendKeys("kyles");
		
		getsecondlastSurname().sendKeys("smiths");
		
		getsecondpassengerDob().click();
		
		getsecondpickpassengerDob().click();
		
		js.executeScript("window.scrollBy(0,500)");
		getsecondpassportNumber().sendKeys("31195855");
		
		getsecondexpiresOn().click();
		
		getsecondpickexpiresOn().click();
		
		getaddToTravellersList().click();
		
		getemailAddress().sendKeys("messira786@gmail.com");
		
		getmobileNumber().sendKeys("1798765432");
		
		getfareRulescbox().click();
		
		gettermsAndConditionscbox().click();
		
		js.executeScript("window.scrollBy(0,100)");
		

		// getinstantTicketing().click();
		getBookAndHold().click();
		Thread.sleep(15000);
		getconfirmBooking().click();
		Thread.sleep(15000);
	}

	public void midOfficeTicketingFordomesticOneWayBookAdultandchild() throws InterruptedException {
		driver.get("http://bdmid.dev.flyhub.com");

		LoginLib li = new LoginLib(driver);
		li.validLogin();
		Thread.sleep(15000);
		getMenu().click();
		Thread.sleep(16000);
		getinprocessQueue().click();
		Thread.sleep(16000);
		// getassignToMe().click();
		Thread.sleep(16000);
		getselectInProcessLink().click();
		Thread.sleep(30000);
		getstartTicketingOperation().click();
		Thread.sleep(30000);
		getselectVendor().click();
		Thread.sleep(15000);
		getselectingVendor().click();
		Thread.sleep(15000);
		getupdateVendor().click();
		Thread.sleep(15000);
		getticketUpdateManual().click();
		Thread.sleep(15000);
		getticketNumber().sendKeys("1278");
		Thread.sleep(15000);
		getticketNumbertwo().sendKeys("1298");
		Thread.sleep(15000);
		getticketUpdate().click();
		Thread.sleep(15000);

		getprintDownload().click();
		Thread.sleep(15000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		getprintInvoice().click();
		Thread.sleep(15000);
		getprintCustomerInvoice().click();
		Thread.sleep(15000);

		getprintConfirmationWithPrice().click();
		Thread.sleep(15000);
		getprintConfirmationWithoutPrice().click();
		Thread.sleep(15000);
		getticketWithPrice().click();
		Thread.sleep(15000);
		getticketWithPriceone().click();
		Thread.sleep(15000);
		getticketWithPriceEticket().click();
		Thread.sleep(15000);

		getticketWithoutPrice().click();
		Thread.sleep(15000);
		getticketWithoutPriceone().click();
		Thread.sleep(15000);
		getticketWithoutPriceEticket().click();
		Thread.sleep(15000);

	}

	/*
	 * public void domesticReturnBooktwoAdults() throws InterruptedException {
	 * getselectPassenger().click(); getincreaseadultPassenger().click();
	 * Thread.sleep(2000); getincreaseChildPassenger().click(); Thread.sleep(2000);
	 * getFrom().sendKeys("DAC"); getfromSelect().click(); getTo().sendKeys("CXB");
	 * Thread.sleep(2000); gettoSelect().click();
	 * getdepartureDate().sendKeys("20/09/2023"); Thread.sleep(5000);
	 * getsearchFlights().click(); Thread.sleep(4000); getbookNow().click();
	 * Thread.sleep(3000); getfirstGivenName().sendKeys("kyle");
	 * getlastSurname().sendKeys("smith"); getpassengerAdultDob().click();
	 * getpickpassengerAdultDob().click(); getpassportNumber().sendKeys("31195855");
	 * getexpiresOn().click(); getpickexpiresOn().click();
	 * getaddToTravellersList().click();
	 * getemailAddress().sendKeys("messira786@gmail.com");
	 * getmobileNumber().sendKeys("8767541298"); getfareRulescbox().click();
	 * gettermsAndConditionscbox().click(); getinstantTicketing().click();
	 * getconfirmBooking().click();
	 * 
	 * //LoginLib.validLogin(); getMenu().click(); getinprocessQueue().click();
	 * getassignToMe().click(); getselectInProcessLink().click();
	 * getstartTicketingOperation().click(); getselectVendor().click();
	 * getselectingVendor().click(); getupdateVendor().click();
	 * getticketUpdateManual().click(); getticketNumber().sendKeys("1278");
	 * getticketUpdate().click(); getprintDownload().click();
	 * getprintInvoice().click(); getprintCustomerInvoice().click();
	 * getticketWithPrice().click(); getticketWithoutPrice().click();
	 * getprintConfirmationWithPrice().click();
	 * getprintConfirmationWithoutPrice().click(); }
	 */

	

	public void domesticReturnBooktwoAdults() throws InterruptedException {
		getselectPassenger().click();
		getincreaseadultPassenger().click();
		

		getFrom().sendKeys("DAC");
		Thread.sleep(1000);
		getfromSelect().click();
		getTo().sendKeys("CXB");
	
		gettoSelect().click();
		getdepartureDate().sendKeys("30/08/2024");
		
		getreturningDate().sendKeys("31/08/2024");
		
		getsearchFlights().click();
		

	//	getdeparturePlane().click();
		
	//	getarrivalPlane().click();
		
		//getreturnflightBooknow().click();
	}
		
		public void bookingdomesticReturnBooktwoAdults() throws InterruptedException
		{
		
		getfirstGivenName().sendKeys("kyle");
		
		getlastSurname().sendKeys("smith");
		
		getpassengerAdultDob().click();
		
		getpickpassengerAdultDob().click();
		
		 getpassportNumber().sendKeys("31195855");
		 getexpiresOn().click();
		 getpickexpiresOn().click();
		 
		getsecondfirstGivenName().sendKeys("kylet");
		
		getsecondlastSurname().sendKeys("smitht");
		
		getsecondpassengerDob().click();
		
		getsecondpickpassengerDob().click();
		
		getsecondpassportNumber().sendKeys("31195955");
		
		Thread.sleep(5000);
		
		getsecondexpiresOn().click();
		
		Thread.sleep(5000);
		
		//getaddToTravellersList().click();
		
		getemailAddress().sendKeys("messira786@gmail.com");
		
		Thread.sleep(15000);
		
		getmobileNumber().sendKeys("1798765432");
		
		Thread.sleep(15000);
		
		getfareRulescbox().click();
		
		gettermsAndConditionscbox().click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
		

		// getinstantTicketing().click();
		getBookAndHold().click();
		Thread.sleep(15000);
		getconfirmBooking().click();
		Thread.sleep(15000);
		

		/*
		 * //LoginLib.validLogin(); getMenu().click(); getinprocessQueue().click();
		 * getassignToMe().click(); getselectInProcessLink().click();
		 * getstartTicketingOperation().click(); getselectVendor().click();
		 * getselectingVendor().click(); getupdateVendor().click();
		 * getticketUpdateManual().click(); getticketNumber().sendKeys("1278");
		 * getticketUpdate().click(); getprintDownload().click();
		 * getprintInvoice().click(); getprintCustomerInvoice().click();
		 * getticketWithPrice().click(); getticketWithoutPrice().click();
		 * getprintConfirmationWithPrice().click();
		 * getprintConfirmationWithoutPrice().click();
		 */
	}

	public void InternationalOnewayoneAdultoneChildoneInfant() throws InterruptedException {
		Thread.sleep(15000);
		getoneWayButton().click();
		
		getselectPassenger().click();
		Thread.sleep(5000);
		
		getincreaseChildPassenger().click();
		Thread.sleep(15000);
		
		getincreaseInfantPassenger().click();
		Thread.sleep(15000);
		
		getoneWayButton().click();
		
		getFrom().sendKeys("DAC");
		Thread.sleep(1000);
		getfromSelect().click();
		getTo().sendKeys("DXB");
	
		gettoSelect().click();
		
		getdepartureDate().sendKeys("30/08/2024");
		
		getsearchFlights().click();
	}
	public void bookingInternationalOnewayoneAdultoneChildoneInfant() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		getfirstGivenName().sendKeys("kyle");
		
		getlastSurname().sendKeys("smith");
		
		getpassengerAdultDob().click();
		
		getpickpassengerAdultDob().click();
		
		getpassportNumber().sendKeys("31195855");
		
		getexpiresOn().click();
		
		getpickexpiresOn().click();
		

		js.executeScript("window.scrollBy(0,200)");
		
		getsecondfirstGivenName().sendKeys("kyles");
		
		getsecondlastSurname().sendKeys("smiths");
		
		Thread.sleep(2000);
		
		getsecondpassengerDob().click();
		
		Thread.sleep(1000);
		
		getsecondpickpassengerDob().click();
		
		Thread.sleep(2000);
	
		js.executeScript("window.scrollBy(0,200)");
		getsecondpassportNumber().sendKeys("31195855");
		
		getsecondexpiresOn().click();
		
		getsecondpickexpiresOn().click();
		

		js.executeScript("window.scrollBy(0,200)");
		getthirdfirstGivenName().sendKeys("kylesgg");
		
		getthirdlastSurname().sendKeys("smithsgg");
		
		getthirdpassengerAdultDob().click();
		
		Thread.sleep(1000);
		
		getthirdpickpassengerDob().click();
		
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,200)");
		getthirdpassportNumber().sendKeys("31195855");
	
		getthirdexpiresOn().click();
		
		getthirdpickexpiresOn().click();
		
		getaddToTravellersList().click();
		
		getemailAddress().sendKeys("messira786@gmail.com");
		
		getmobileNumber().sendKeys("1798765432");
		
		getfareRulescbox().click();
		
		gettermsAndConditionscbox().click();
	
	//	getinstantTicketing().click();
		
		getBookAndHold().click();
		Thread.sleep(15000);
		
		getconfirmBooking().click();
		

		// LoginLib.validLogin();
		/*
		 * getMenu().click(); getinprocessQueue().click(); getassignToMe().click();
		 * getselectInProcessLink().click(); getstartTicketingOperation().click();
		 * getselectVendor().click(); getselectingVendor().click();
		 * getupdateVendor().click(); getticketUpdateManual().click();
		 * getticketNumber().sendKeys("1278"); getticketUpdate().click();
		 * getprintDownload().click(); getprintInvoice().click();
		 * getprintCustomerInvoice().click(); getticketWithPrice().click();
		 * getticketWithoutPrice().click(); getprintConfirmationWithPrice().click();
		 * getprintConfirmationWithoutPrice().click();
		 */
	}

	public void InternationalReturnTwoAdultTwoChildOneInfant() throws InterruptedException {
		getselectPassenger().click();
		
		getincreaseadultPassenger().click();
		Thread.sleep(1000);
		getincreaseChildPassenger().click();
		Thread.sleep(1000);
		getincreaseChildPassenger().click();
		Thread.sleep(2000);
		getincreaseInfantPassenger().click();
		
		getFrom().sendKeys("DAC");
		Thread.sleep(1000);
		getfromSelect().click();
		getTo().sendKeys("SIN");
	
		gettoSelect().click();
		getdepartureDate().sendKeys("30/08/2024");
		
		getreturningDate().sendKeys("31/09/2024");
		
		getsearchFlights().click();
		Thread.sleep(20000);
	}
	
	public void BookingforInternationalReturnTwoAdultTwoChildOneInfant() throws InterruptedException
	{
		

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		getfirstGivenName().sendKeys("kyle");
		
		getlastSurname().sendKeys("smith");
		
		getpassengerAdultDob().click();
		
		getpickpassengerAdultDob().click();
		
		getpassportNumber().sendKeys("31195855");
		
		getexpiresOn().click();
		
		getpickexpiresOn().click();
		

		js.executeScript("window.scrollBy(0,500)");
		
		getsecondfirstGivenName().sendKeys("kylel");
		
		getsecondlastSurname().sendKeys("smithl");
		
		getsecondpassengerDob().click();
		
		getsecondpickpassengerDob().click();
		
		getsecondpassportNumber().sendKeys("31195855");
		
		getsecondexpiresOn().click();
		
		getsecondpickexpiresOn().click();
		

		js.executeScript("window.scrollBy(0,500)");
		getthirdfirstGivenName().sendKeys("kyless");
		
		getthirdlastSurname().sendKeys("smithss");
		
		getthirdpassengerAdultDob().click();
		
		getthirdpickpassengerDob().click();
	
		getthirdpassportNumber().sendKeys("31195855");
		
		getthirdexpiresOn().click();
		
		getthirdpickexpiresOn().click();
		

		js.executeScript("window.scrollBy(0,500)");
		getfourthfirstGivenName().sendKeys("kylezz");
		
		getfourthlastSurname().sendKeys("smithzz");
		
		getfourthpassengerAdultDob().click();
		
		getfourthpickpassengerDob().click();
		
		getfourthpassportNumber().sendKeys("31195855");
		
		getfourthexpiresOn().click();
		
		getfourthpickexpiresOn().click();
		

		js.executeScript("window.scrollBy(0,500)");
		getfifthfirstGivenName().sendKeys("kylemm");
		
		getfifthlastSurname().sendKeys("smithnn");
		Thread.sleep(25000);
		
		getfifthpassengerAdultDob().click();
		Thread.sleep(25000);
		
		getfifthpickpassengerDob().click();
		Thread.sleep(25000);
		
		getfifthpassportNumber().sendKeys("31195855");
		Thread.sleep(25000);
		getfifthexpiresOn().click();
		Thread.sleep(25000);
		
		getfifthpickexpiresOn().click();
		Thread.sleep(25000);
	

		getaddToTravellersList().click();
		
		getemailAddress().sendKeys("messira786@gmail.com");
	
		getmobileNumber().sendKeys("1798765432");
		
		getfareRulescbox().click();
	
		gettermsAndConditionscbox().click();
		
		//getinstantTicketing().click();
		
		getBookAndHold().click();
		
		Thread.sleep(15000);
		getconfirmBooking().click();
		Thread.sleep(15000);

		// LoginLib.validLogin();
		/*
		 * getMenu().click(); getinprocessQueue().click(); getassignToMe().click();
		 * getselectInProcessLink().click(); getstartTicketingOperation().click();
		 * getselectVendor().click(); getselectingVendor().click();
		 * getupdateVendor().click(); getticketUpdateManual().click();
		 * getticketNumber().sendKeys("1278"); getticketUpdate().click();
		 * getprintDownload().click(); getprintInvoice().click();
		 * getprintCustomerInvoice().click(); getticketWithPrice().click();
		 * getticketWithoutPrice().click(); getprintConfirmationWithPrice().click();
		 * getprintConfirmationWithoutPrice().click();
		 */
	}

	public void multiWayTwoAdults() throws InterruptedException {

		Thread.sleep(10000);
		getmultiCityButton().click();
		Thread.sleep(10000);
		
		getselectPassenger().click();
		getincreaseadultPassenger().click();
		
		getmultiCityButton().click();
		

		getFrom().sendKeys("DAC");
		Thread.sleep(1000);
		getfromSelect().click();
		getTo().sendKeys("CXB");
	
		gettoSelect().click();
		
		getdepartureDate().sendKeys("30/08/2024");
		
		getfromSecond().sendKeys("CXB");
		Thread.sleep(10000);
		
		
		getselectfromSecond().click();
		Thread.sleep(10000);
		
		gettoSecond().sendKeys("DAC");
		Thread.sleep(10000);
		
		getselecttoSecond().click();
		Thread.sleep(10000);
		
		getseconddepartureDate().sendKeys("31/08/2024");
		
		Thread.sleep(15000);
		
		getsearchFlights().click();
		
		getviewFares().click();
		
	}
		
public void bookingformultiWayTwoAdults() throws InterruptedException
{
		
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,500)");
	
		getfirstGivenName().sendKeys("kyle");
		
		getlastSurname().sendKeys("smith");
		
		getpassengerAdultDob().click();
		
		getpickpassengerAdultDob().click();
		
		getpassportNumber().sendKeys("31195855");
		
		getexpiresOn().click();
		
		getpickexpiresOn().click();
		

		getsecondfirstGivenName().sendKeys("kylel");
		
		getsecondlastSurname().sendKeys("smithl");
		
		getsecondpassengerDob().click();
		
		getsecondpickpassengerDob().click();
		
		getsecondpassportNumber().sendKeys("31195855");
		
		getsecondexpiresOn().click();
		
		getsecondpickexpiresOn().click();
		
		getaddToTravellersList().click();
		
		getemailAddress().sendKeys("messira786@gmail.com");
		
		getmobileNumber().sendKeys("1798765432");
		
		getfareRulescbox().click();
		
		gettermsAndConditionscbox().click();
		
	//	getinstantTicketing().click();
		
        getBookAndHold().click();
		
	//	Thread.sleep(15000);
		getconfirmBooking().click();
//		Thread.sleep(15000);
		

		// LoginLib.validLogin();
		/*
		 * getMenu().click(); getinprocessQueue().click(); getassignToMe().click();
		 * getselectInProcessLink().click(); getstartTicketingOperation().click();
		 * getselectVendor().click(); getselectingVendor().click();
		 * getupdateVendor().click(); getticketUpdateManual().click();
		 * getticketNumber().sendKeys("1278"); getticketUpdate().click();
		 * getprintDownload().click(); getprintInvoice().click();
		 * getprintCustomerInvoice().click(); getticketWithPrice().click();
		 * getticketWithoutPrice().click(); getprintConfirmationWithPrice().click();
		 * getprintConfirmationWithoutPrice().click();
		 */
	}

	public void clearCache() throws AWTException, InterruptedException {

		driver.get("http://bdmid.dev.flyhub.com");
		Thread.sleep(5000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_SHIFT);
		robot.keyPress(KeyEvent.VK_DELETE);

		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_SHIFT);
		robot.keyRelease(KeyEvent.VK_DELETE);
		Thread.sleep(25000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		/*
		 * Alert alert = driver.switchTo().alert(); String alertText=alert.getText();
		 * System.out.println("alert test" + alertText);
		 * 
		 * //alert.accept();
		 * 
		 * WebDriverWait wait = new WebDriverWait(driver, null);
		 * wait.until(ExpectedConditions.alertIsPresent()); Alert alert =
		 * driver.switchTo().alert(); alert.accept();
		 * 
		 * 
		 * /* String pid =driver.getWindowHandle(); Set<String>
		 * allwh=driver.getWindowHandles(); for(String wh : allwh) {
		 * driver.switchTo().window(wh);
		 * 
		 * Thread.sleep(25000); WebElement
		 * m=driver.findElement(By.linkText("ClearNow")); JavascriptExecutor js =
		 * (JavascriptExecutor) driver; js.executeScript("arguments[0].click();", m); }
		 */

	}

	public void bookingConfirmationEmail() throws InterruptedException {

		// ((JavascriptExecutor)
		// driver).executeScript("window.open('https://accounts.google.com/InteractiveLogin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F%3Fhl%3Den&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F%3Fhl%3Den&hl=en&osid=1&passive=1209600&service=mail&ifkv=AXo7B7X0I1jfR2r4b8bH44QePiWcfzFdq4k3b_tltjb-rKcveAcR-gQsPtFGBM7pLrLlK3UnvxA2dA&flowName=GlifWebSignIn&flowEntry=ServiceLogin')");

		driver.get(
				"https://accounts.google.com/InteractiveLogin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F%3Fhl%3Den&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F%3Fhl%3Den&hl=en&osid=1&passive=1209600&service=mail&ifkv=AXo7B7X0I1jfR2r4b8bH44QePiWcfzFdq4k3b_tltjb-rKcveAcR-gQsPtFGBM7pLrLlK3UnvxA2dA&flowName=GlifWebSignIn&flowEntry=ServiceLogin");

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
		List<WebElement> allMessages = driver.findElements(By.xpath("//*[contains(text(), 'Ticket-In Process')]"));
		if (allMessages.isEmpty()) {
			System.out.println("Test not passed");
		} else {
			System.out.println("Test passed");
		}

	}

	public void ticketedConfirmationEmail() throws InterruptedException {

		// ((JavascriptExecutor)
		// driver).executeScript("window.open('https://accounts.google.com/InteractiveLogin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F%3Fhl%3Den&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F%3Fhl%3Den&hl=en&osid=1&passive=1209600&service=mail&ifkv=AXo7B7X0I1jfR2r4b8bH44QePiWcfzFdq4k3b_tltjb-rKcveAcR-gQsPtFGBM7pLrLlK3UnvxA2dA&flowName=GlifWebSignIn&flowEntry=ServiceLogin')");

		driver.get(
				"https://accounts.google.com/InteractiveLogin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F%3Fhl%3Den&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F%3Fhl%3Den&hl=en&osid=1&passive=1209600&service=mail&ifkv=AXo7B7X0I1jfR2r4b8bH44QePiWcfzFdq4k3b_tltjb-rKcveAcR-gQsPtFGBM7pLrLlK3UnvxA2dA&flowName=GlifWebSignIn&flowEntry=ServiceLogin");

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
		List<WebElement> allMessages = driver
				.findElements(By.xpath("//*[contains(text(), 'Ticketed itinerary & Invoice')]"));
		if (allMessages.isEmpty()) {
			System.out.println("Test not passed");
		} else {
			System.out.println("Test passed");
		}

	}

}
