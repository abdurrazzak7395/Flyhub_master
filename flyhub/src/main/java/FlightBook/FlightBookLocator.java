package FlightBook;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlightBookLocator {

	@FindBy(xpath = "//label[contains(text(),'One-Way')]")
	private WebElement oneWayButton;

	public WebElement getoneWayButton() {
		return oneWayButton;
	}

	@FindBy(xpath = "//div[@class='form-check hal-radio multi']")
	private WebElement multiCityButton;

	public WebElement getmultiCityButton() {
		return multiCityButton;
	}

	@FindBy(xpath = "//div[@id='from_airport_dropdown']//input[@id='departure_1']")
	private WebElement From;

	public WebElement getFrom() {
		return From;
	}
	
	
	//@FindBy(xpath = "//div[@class='dropdown col col-md-6 col-sm-12']//div[@class='typeahead dropdown-menu flightDropDownData']//div[@class='dropdown-item flightDataList columnBlock d-flex flex-wrap justify-content-between active']//div[@class='airPortDataBox']//span[@class='airportNameBox columnBlock'][contains(text(),'Hazrat Shahjalal International Airport')]")
	@FindBy(xpath = "/html/body/main/section/div/div/div/div[1]/div[2]/div[1]/form/div[3]/div[1]/div[1]/div/div[1]/div[2]")
	private WebElement fromSelect;

	public WebElement getfromSelect() {
		return fromSelect;
	}
	
	@FindBy(xpath = "//div[@class='typeahead dropdown-menu flightDropDownData show']")
	private WebElement toSelect;

	public WebElement gettoSelect() {
		return toSelect;
		
		
	}
	@FindBy(xpath = "//div[@id='to_airport_dropdown']//input[@id='arrival_1']")
	private WebElement To;

	public WebElement getTo() {
		return To;
	}

	@FindBy(xpath = "//input[@id='prefferedCarriers']")
	private WebElement preferredAirline;

	public WebElement getpreferredAirline() {
		return preferredAirline;
	}

	@FindBy(xpath = "//input[@id='departure_2']")
	private WebElement fromSecond;

	public WebElement getfromSecond() {
		return fromSecond;
	}
	
	//span[contains(text(),'DXB')]
	@FindBy(xpath = "/html/body/main/section/div/div/div/div[1]/div[2]/div[1]/form/div[3]/div[2]/div[1]/div/div[1]/div[2]")
	private WebElement selectfromSecond;

	public WebElement getselectfromSecond() {
		return selectfromSecond;
	}
	
	
	@FindBy(xpath = "//input[@id='arrival_2']")
	private WebElement toSecond;

	public WebElement gettoSecond() {
		return toSecond;
	}
	
	//span[contains(text(),'SIN')]
		@FindBy(xpath = "/html/body/main/section/div/div/div/div[1]/div[2]/div[1]/form/div[3]/div[2]/div[1]/div/div[3]/div[2]")
		private WebElement selecttoSecond;

		public WebElement getselecttoSecond() {
			return selecttoSecond;
		}

	@FindBy(xpath = "//button[contains(text(),'Search Flights')]")
	private WebElement searchFlights;

	public WebElement getsearchFlights() {
		return searchFlights;
	}
	
	

	@FindBy(xpath = "(//button[normalize-space()='View Fares'])[1]")
	private WebElement viewFares;

	public WebElement getviewFares() {
		return viewFares;
	}
	
/*	@FindBy(xpath = "//button[@id='btnb1_0']")
	private WebElement bookNow; */

	@FindBy(xpath = "//*[@id='btnb1_0-0']")  
	protected
	 WebElement viewFarebookNow;
	public WebElement getviewFarebookNow() {
		return viewFarebookNow;
	}
	
	
	@FindBy(xpath = "//*[@id='btnb1_0-0']")
	private WebElement bookNow;
	public WebElement getbookNow() {
		return bookNow;
	}
	
	
	

			@FindBy(xpath = "/html/body/main/section/div/div/div/div[2]/div[3]/div[2]/div[4]/div[3]/div[1]/div[1]/div[2]/button")
	private WebElement viewFare;

	public WebElement getviewFare() {
		return viewFare;
	}
	
	
	@FindBy(xpath = "//input[@id='Passengers_0__FirstName']")
	private WebElement firstGivenName;

	public WebElement getfirstGivenName() {
		return firstGivenName;
	}

	@FindBy(xpath = "//input[@id='Passengers_0__LastName']")
	private WebElement lastSurname;

	public WebElement getlastSurname() {
		return lastSurname;
	}

	@FindBy(xpath = "//input[@id='Passengers_0__DOB']")
	private WebElement passengerAdultDob;

	public WebElement getpassengerAdultDob() {
		return passengerAdultDob;
	}

	@FindBy(xpath = "//div[@class='picker__day picker__day--infocus picker__day--highlighted'][contains(text(),'21')]")
	private WebElement pickpassengerAdultDob;

	public WebElement getpickpassengerAdultDob() {
		return pickpassengerAdultDob;
	}

	@FindBy(xpath = "//input[@id='Passengers_0__PassportNum']")
	private WebElement passportNumber;

	public WebElement getpassportNumber() {
		return passportNumber;
	}

	@FindBy(xpath = "//input[@id='Passengers_0__PDOE']")
	private WebElement expiresOn;

	public WebElement getexpiresOn() {
		return expiresOn;
	}

/*	@FindBy(xpath = "//div[@class='picker__day picker__day--infocus picker__day--highlighted'][contains(text(),'2')]")
	private WebElement pickexpiresOn;

	public WebElement getpickexpiresOn() {
		return pickexpiresOn;
	}  */
	
	@FindBy(xpath = "//div[@class='picker__day picker__day--infocus picker__day--highlighted'][contains(text(),'5')]")
	private WebElement pickexpiresOn;

	public WebElement getpickexpiresOn() {
		return pickexpiresOn;
	}

	
	@FindBy(xpath = "//label[@class='m-0']")
	private WebElement addToTravellersList;

	public WebElement getaddToTravellersList() {
		return addToTravellersList;
	}

	@FindBy(xpath = "//input[@id='Passengers_1__FirstName']")
	private WebElement secondfirstGivenName;

	public WebElement getsecondfirstGivenName() {
		return secondfirstGivenName;
	}

	@FindBy(xpath = "//input[@id='Passengers_1__LastName']")
	private WebElement secondlastSurname;

	public WebElement getsecondlastSurname() {
		return secondlastSurname;
	}

	@FindBy(xpath = "//input[@id='Passengers_1__DOB']")
	private WebElement secondpassengerDob;

	public WebElement getsecondpassengerDob() {
		return secondpassengerDob;
	}

	@FindBy(xpath = "//table[@id='Passengers_1__DOB_table']//tbody//tr//td[@role='presentation']//div[@class='picker__day picker__day--infocus picker__day--highlighted'][contains(text(),'21')]")
	private WebElement secondpickpassengerDob;

	public WebElement getsecondpickpassengerDob() {
		return secondpickpassengerDob;
	}

	@FindBy(xpath = "//input[@id='Passengers_1__PassportNum']")
	private WebElement secondpassportNumber;

	public WebElement getsecondpassportNumber() {
		return secondpassportNumber;
	}

	@FindBy(xpath = "//input[@id='Passengers_1__PDOE']")
	private WebElement secondexpiresOn;

	public WebElement getsecondexpiresOn() {
		return secondexpiresOn;
	}

	@FindBy(xpath = "//table[@id='Passengers_1__PDOE_table']//tbody//tr//td[@role='presentation']//div[@class='picker__day picker__day--infocus picker__day--highlighted'][contains(text(),'5')]")
	private WebElement secondpickexpiresOn;

	public WebElement getsecondpickexpiresOn() {
		return secondpickexpiresOn;
	}

	

	
	@FindBy(xpath = "//input[@id='Email']")
	private WebElement emailAddress;

	public WebElement getemailAddress() {
		return emailAddress;
	}

	@FindBy(xpath = "//input[@id='PhoneNo']")
	private WebElement mobileNumber;

	public WebElement getmobileNumber() {
		return mobileNumber;
	}

	@FindBy(xpath = "//label[@for='chkfare']")
	private WebElement fareRulescbox;

	public WebElement getfareRulescbox() {
		return fareRulescbox;
	}

	@FindBy(xpath = "//label[@for='chkterms']")
	private WebElement termsAndConditionscbox;

	public WebElement gettermsAndConditionscbox() {
		return termsAndConditionscbox;
	}

	@FindBy(xpath = "//button[contains(text(),'Book and Hold')]")
	private WebElement bookAndHold;

	public WebElement getbookAndHold() {
		return bookAndHold;
	}

	@FindBy(xpath = "//button[contains(text(),'Instant Ticketing')]")
	private WebElement instantTicketing;

	public WebElement getinstantTicketing() {
		return instantTicketing;
	}

	@FindBy(xpath = "//button[@id='btnbook']")
	private WebElement confirmBooking;

	public WebElement getconfirmBooking() {
		return confirmBooking;
	}

	@FindBy(xpath = "//button[@id='OrderTktConfirmBtn']")
	private WebElement orderTicket;

	public WebElement getorderTicket() {
		return orderTicket;
	}

	@FindBy(xpath = "//button[@id='confirmPaymentBtn']")
	private WebElement confirmWithPayment;

	public WebElement getconfirmWithPayment() {
		return confirmWithPayment;
	}

	@FindBy(xpath = "//button[@class='navToggleBtn navigationToggleBtn']")
	private WebElement Menu;

	public WebElement getMenu() {
		return Menu;
	}

	@FindBy(xpath = "//a[contains(text(),'In Process')]")
	private WebElement inprocessQueue;

	public WebElement getinprocessQueue() {
		return inprocessQueue;
	}

	@FindBy(xpath = "//a[contains(text(),'AssignToMe')]")
	private WebElement assignToMe;

	public WebElement getassignToMe() {
		return assignToMe;
	}

	@FindBy(xpath = "/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/a[1]")
	private WebElement selectInProcessLink;

	public WebElement getselectInProcessLink() {
		return selectInProcessLink;
	}

	@FindBy(xpath = "//body[@class='hideHeaderMsg']/main/section[@class='searchMainSection']/div[@class='container']/div[@class='booking-flight']/div[@class='container print-container']/div[@class='row']/div[@class='col-lg-3']/div[@class='right-sidebar']/div[3]/button[1]")
	private WebElement startTicketingOperation;

	public WebElement getstartTicketingOperation() {
		return startTicketingOperation;
	}

	@FindBy(xpath = "//div[@class='filter-option-inner']")
	private WebElement selectVendor;

	public WebElement getselectVendor() {
		return selectVendor;
	}

	@FindBy(xpath = "//a[@id='bs-select-1-1']")
	private WebElement selectingVendor;

	public WebElement getselectingVendor() {
		return selectingVendor;
	}

	@FindBy(xpath = "//button[@id='btnEditVendor']")
	private WebElement updateVendor;

	public WebElement getupdateVendor() {
		return updateVendor;
	}

	@FindBy(xpath = "/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[6]/button[1]")
	private WebElement ticketUpdateManual;

	public WebElement getticketUpdateManual() {
		return ticketUpdateManual;
	}

	@FindBy(xpath = "/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[7]/form[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/input[1]")
	private WebElement ticketNumber;

	public WebElement getticketNumber() {
		return ticketNumber;
	}
//	/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[7]/form[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[4]/div[1]/input[1]
		
	@FindBy(xpath = "/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[7]/form[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[4]/div[1]/input[1]")
	private WebElement ticketNumbertwo;

	public WebElement getticketNumbertwo() {
		return ticketNumbertwo;
	}
	
	@FindBy(xpath = "//button[@id='btnManualUpdate']")
	private WebElement ticketUpdate;

	public WebElement getticketUpdate() {
		return ticketUpdate;
	}

	@FindBy(xpath = "//div[@class='d-flex align-items-center']")
	private WebElement printDownload;

	public WebElement getprintDownload() {
		return printDownload;
	}

	@FindBy(xpath = "//a[contains(text(),'Print Invoice')]")
	private WebElement printInvoice;

	public WebElement getprintInvoice() {
		return printInvoice;
	}

	@FindBy(xpath = "//a[contains(text(),'Print Customer Invoice')]")
	private WebElement printCustomerInvoice;

	public WebElement getprintCustomerInvoice() {
		return printCustomerInvoice;
	}

	@FindBy(xpath = "/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[12]/div[1]/div[1]/a[3]")
	private WebElement ticketWithPrice;

	public WebElement getticketWithPrice() {
		return ticketWithPrice;
	}

	@FindBy(xpath = "//a[contains(text(),'Ticket Without Price(Per Passenger)')]")
	private WebElement ticketWithoutPrice;

	public WebElement getticketWithoutPrice() {
		return ticketWithoutPrice;
	}

	@FindBy(xpath = "//a[contains(text(),'Print Confirmation With Price')]")
	private WebElement printConfirmationWithPrice;

	public WebElement getprintConfirmationWithPrice() {
		return printConfirmationWithPrice;
	}

	@FindBy(xpath = "//a[contains(text(),'Print Confirmation Without Price')]")
	private WebElement printConfirmationWithoutPrice;

	public WebElement getprintConfirmationWithoutPrice() {
		return printConfirmationWithoutPrice;
	}

	@FindBy(xpath = "//input[@id='departuredate_1']")
	private WebElement departureDate;

	public WebElement getdepartureDate() {
		return departureDate;
	}
	
	@FindBy(xpath = "//input[@id='departuredate_2']")
	private WebElement seconddepartureDate;

	public WebElement getseconddepartureDate() {
		return seconddepartureDate;
	}
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
	
	
	@FindBy(xpath="//span[contains(@class,'total_passengers')]")
	private static WebElement selectPassenger;
	
	public static WebElement getselectPassenger()
	{
		return selectPassenger;
	}
	
	
	@FindBy(xpath="//div[contains(@class,'dropdown-item d-flex justify-content-between')]//div[contains(@class,'passengers adult_passengers')]//div[contains(@class,'quantity-nav')]//div[contains(@class,'quantity-button quantity-up')]")
	private static WebElement increaseadultPassenger;
	
	public static WebElement getincreaseadultPassenger()
	{
		return increaseadultPassenger;
	}
	
	@FindBy(xpath="//div[contains(@class,'dropdown-item d-flex flex-wrap justify-content-between')]//div[contains(@class,'passengers child_passengers')]//div[contains(@class,'quantity-nav')]//div[contains(@class,'quantity-button quantity-up')]")
	private static WebElement increaseChildPassenger;
	
	public static WebElement getincreaseChildPassenger()
	{
		return increaseChildPassenger;
	}
	
	@FindBy(xpath="//div[contains(@class,'passengers infant_passengers')]//div[contains(@class,'quantity-nav')]//div[contains(@class,'quantity-button quantity-up')]")
	private static WebElement increaseInfantPassenger;
	
	public static WebElement getincreaseInfantPassenger()
	{
		return increaseInfantPassenger;
	}
	//input[@id='arrivaldate']
	@FindBy(xpath="//input[@id='arrivaldate']")
	private static WebElement returningDate;
	
	public static WebElement getreturningDate()
	{
		return returningDate;
	}
	@FindBy(xpath="//label[@for='selectAirline-0']")
	private static WebElement departurePlane;
	
	public static WebElement getdeparturePlane()
	{
		return departurePlane;
	}
	@FindBy(xpath="//label[@for='airline-0']")
	private static WebElement arrivalPlane;
	
	public static WebElement getarrivalPlane()
	{
		return arrivalPlane;
	}
	//button[@class='flyBtn greenBtn fillBtn btnRevalidate']
	@FindBy(xpath="//button[@class='flyBtn greenBtn fillBtn btnRevalidate']")
	private static WebElement returnflightBooknow;
	
	public static WebElement getreturnflightBooknow()
	{
		return returnflightBooknow;
	}
	
	//input[@id='Passengers_2__FirstName']
	@FindBy(xpath = "//input[@id='Passengers_2__FirstName']")
	private WebElement thirdfirstGivenName;

	public WebElement getthirdfirstGivenName() {
		return thirdfirstGivenName;
	}

	@FindBy(xpath = "//input[@id='Passengers_2__LastName']")
	private WebElement thirdlastSurname;

	public WebElement getthirdlastSurname() {
		return thirdlastSurname;
	}

	@FindBy(xpath = "//input[@id='Passengers_2__DOB']")
	private WebElement thirdpassengerDob;

	public WebElement getthirdpassengerAdultDob() {
		return thirdpassengerDob;
	}

	@FindBy(xpath = "//table[@id='Passengers_2__DOB_table']//tbody//tr//td[@role='presentation']//div[@class='picker__day picker__day--infocus picker__day--highlighted'][contains(text(),'3')]")
	private WebElement thirdpickpassengerDob;

	public WebElement getthirdpickpassengerDob() {
		return thirdpickpassengerDob;
	}

	@FindBy(xpath = "//input[@id='Passengers_2__PassportNum']")
	private WebElement thirdpassportNumber;

	public WebElement getthirdpassportNumber() {
		return thirdpassportNumber;
	}

	@FindBy(xpath = "//input[@id='Passengers_2__PDOE']")
	private WebElement thirdexpiresOn;

	public WebElement getthirdexpiresOn() {
		return thirdexpiresOn;
	}

	@FindBy(xpath = "//table[@id='Passengers_2__PDOE_table']//tbody//tr//td[@role='presentation']//div[@class='picker__day picker__day--infocus picker__day--highlighted'][contains(text(),'7')]")
	private WebElement thirdpickexpiresOn;

	public WebElement getthirdpickexpiresOn() {
		return thirdpickexpiresOn;
	}

	@FindBy(xpath = "//input[@id='Passengers_3__FirstName']")
	private WebElement fourthfirstGivenName;

	public WebElement getfourthfirstGivenName() {
		return fourthfirstGivenName;
	}

	@FindBy(xpath = "//input[@id='Passengers_3__LastName']")
	private WebElement fourthlastSurname;

	public WebElement getfourthlastSurname() {
		return fourthlastSurname;
	}

	@FindBy(xpath = "//input[@id='Passengers_3__DOB']")
	private WebElement fourthpassengerDob;

	public WebElement getfourthpassengerAdultDob() {
		return fourthpassengerDob;
	}

	@FindBy(xpath = "//table[@id='Passengers_3__DOB_table']//tbody//tr//td[@role='presentation']//div[@class='picker__day picker__day--infocus picker__day--highlighted'][contains(text(),'3')]")
	private WebElement fourthpickpassengerDob;

	public WebElement getfourthpickpassengerDob() {
		return fourthpickpassengerDob;
	}

	@FindBy(xpath = "//input[@id='Passengers_3__PassportNum']")
	private WebElement fourthpassportNumber;

	public WebElement getfourthpassportNumber() {
		return fourthpassportNumber;
	}

	@FindBy(xpath = "//input[@id='Passengers_3__PDOE']")
	private WebElement fourthexpiresOn;

	public WebElement getfourthexpiresOn() {
		return fourthexpiresOn;
	}

	@FindBy(xpath = "//table[@id='Passengers_3__PDOE_table']//tbody//tr//td[@role='presentation']//div[@class='picker__day picker__day--infocus picker__day--highlighted'][contains(text(),'7')]")
	private WebElement fourthpickexpiresOn;

	public WebElement getfourthpickexpiresOn() {
		return fourthpickexpiresOn;
	}


	@FindBy(xpath = "//input[@id='Passengers_4__FirstName']")
	private WebElement fifthfirstGivenName;

	public WebElement getfifthfirstGivenName() {
		return fifthfirstGivenName;
	}

	@FindBy(xpath = "//input[@id='Passengers_4__LastName']")
	private WebElement fifthlastSurname;

	public WebElement getfifthlastSurname() {
		return fifthlastSurname;
	}

	@FindBy(xpath = "//input[@id='Passengers_4__DOB']")
	private WebElement fifthpassengerDob;

	public WebElement getfifthpassengerAdultDob() {
		return fifthpassengerDob;
	}

	@FindBy(xpath = "/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[6]/form[1]/div[10]/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/div[1]")
	private WebElement fifthpickpassengerDob;

	public WebElement getfifthpickpassengerDob() {
		return fifthpickpassengerDob;
	}

	@FindBy(xpath = "//input[@id='Passengers_4__PassportNum']")
	private WebElement fifthpassportNumber;

	public WebElement getfifthpassportNumber() {
		return fifthpassportNumber;
	}

	@FindBy(xpath = "//input[@id='Passengers_4__PDOE']")
	private WebElement fifthexpiresOn;

	public WebElement getfifthexpiresOn() {
		return fifthexpiresOn;
	}

	@FindBy(xpath = "//table[@id='Passengers_4__PDOE_table']//tbody//tr//td[@role='presentation']//div[@class='picker__day picker__day--infocus picker__day--highlighted'][contains(text(),'7')]")
	private WebElement fifthpickexpiresOn;

	public WebElement getfifthpickexpiresOn() {
		return fifthpickexpiresOn;
	}
	
	//a[contains(text(),'Ticketed')]
	@FindBy(xpath = "//a[contains(text(),'Ticketed')]")
	private WebElement ticketedQueue;

	public WebElement getticketedQueue() {
		return  ticketedQueue;
	}


	//  /html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/a[1]
	@FindBy(xpath = "/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/a[1]")
	private WebElement pickticketedlink;

	public WebElement getpickticketedlink() {
		return  pickticketedlink;
	}
	
	@FindBy(xpath = "/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[12]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")
	private WebElement ticketWithPriceone;

	public WebElement getticketWithPriceone() {
		return  ticketWithPriceone;
	}

@FindBy(xpath = "/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[12]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")
	private WebElement ticketWithPriceEticket;

	public WebElement getticketWithPriceEticket() {
		return  ticketWithPriceEticket;
	}

@FindBy(xpath = "/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[12]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/a[1]")
	private WebElement ticketWithoutPriceone;

	public WebElement getticketWithoutPriceone() {
		return  ticketWithoutPriceone;
	}

@FindBy(xpath = "/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[12]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/a[1]")
	private WebElement ticketWithoutPriceEticket;

	public WebElement getticketWithoutPriceEticket() {
		return  ticketWithoutPriceEticket;
	}

	@FindBy(xpath="//input[@id='identifierId']")
	private static WebElement Email;

	public static WebElement getEmail()
	{
		return Email;
	}
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/c-wiz[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/span[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
	public WebElement Password;

	public WebElement getPassword()
	{
		return Password;
	}
	@FindBy(xpath="//a[contains(text(),'Inbox')]")
	private WebElement Inbox;

	public WebElement getInbox()
	{
		return Inbox;
	}

	@FindBy(xpath="//span[contains(text(),'Next')]")
	private WebElement Next;

	public WebElement getNext()
	{
		return Next;
	}
	
	
	
			@FindBy(xpath="/html/body/div[2]/div[3]/div[1]/div/div/span/div[1]")
	private WebElement captchaBox;

	public WebElement getcaptchaBox()
	{
		return captchaBox;
	}
	
	
	@FindBy(xpath="//button[contains(text(),'Book and Hold')]")
	private WebElement BookAndHold;

	public WebElement getBookAndHold()
	{
		return BookAndHold;
	}
			
	
	
	@FindBy(xpath="//span[@id='balAmount']")
	private static WebElement balanceAmount;

	public static WebElement getbalanceAmount()
	{
		return balanceAmount;
	}
	
			@FindBy(xpath="/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[5]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]")
	private static WebElement ticketAmount;

	public static WebElement getticketAmount()
	{
		return ticketAmount;
	}
}

