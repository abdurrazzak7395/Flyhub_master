package FlightBook;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;

public class FlightBookLocator {

	@FindBy(xpath = "//label[contains(text(),'One-Way')]")
	private WebElement oneWayButton;

	public WebElement getOneWayButton() {
		return oneWayButton;
	}

	@FindBy(xpath = "//div[@class='form-check hal-radio multi']")
	private WebElement multiCityButton;

	public WebElement getMultiCityButton() {
		return multiCityButton;
	}

	@FindBy(xpath = "//div[@id='from_airport_dropdown']//input[@id='departure_1']")
	private WebElement from;

	public WebElement getFrom() {
		return from;
	}
	
	
	//@FindBy(xpath = "//div[@class='dropdown col col-md-6 col-sm-12']//div[@class='typeahead dropdown-menu flightDropDownData']//div[@class='dropdown-item flightDataList columnBlock d-flex flex-wrap justify-content-between active']//div[@class='airPortDataBox']//span[@class='airportNameBox columnBlock'][contains(text(),'Hazrat Shahjalal International Airport')]")
	@FindBy(xpath = "/html/body/main/section/div/div/div/div[1]/div[2]/div[1]/form/div[3]/div[1]/div[1]/div/div[1]/div[2]")
	private WebElement fromSelect;

	public WebElement getFromSelect() {
		return fromSelect;
	}
	
	@FindBy(xpath = "//div[@class='typeahead dropdown-menu flightDropDownData show']")
	private WebElement toSelect;

	public WebElement getToSelect() {
		return toSelect;
		
		
	}
	@FindBy(xpath = "//div[@id='to_airport_dropdown']//input[@id='arrival_1']")
	private WebElement to;

	public WebElement getTo() {
		return to;
	}

	@FindBy(xpath = "//input[@id='prefferedCarriers']")
	private WebElement preferredAirline;

	public WebElement getPreferredAirline() {
		return preferredAirline;
	}

	@FindBy(xpath = "//input[@id='departure_2']")
	private WebElement fromSecond;

	public WebElement getFromSecond() {
		return fromSecond;
	}
	
	//span[contains(text(),'DXB')]
	@FindBy(xpath = "/html/body/main/section/div/div/div/div[1]/div[2]/div[1]/form/div[3]/div[2]/div[1]/div/div[1]/div[2]")
	private WebElement selectFromSecond;

	public WebElement getSelectFromSecond() {
		return selectFromSecond;
	}
	
	
	@FindBy(xpath = "//input[@id='arrival_2']")
	private WebElement toSecond;

	public WebElement getToSecond() {
		return toSecond;
	}
	
	//span[contains(text(),'SIN')]
		@FindBy(xpath = "/html/body/main/section/div/div/div/div[1]/div[2]/div[1]/form/div[3]/div[2]/div[1]/div/div[3]/div[2]")
		private WebElement selectToSecond;

		public WebElement getSelectToSecond() {
			return selectToSecond;
		}

	@FindBy(xpath = "//button[contains(text(),'Search Flights')]")
	private WebElement searchFlights;

	public WebElement getSearchFlights() {
		return searchFlights;
	}
	
	

	@FindBy(xpath = "(//button[normalize-space()='View Fares'])[1]")
	private WebElement viewFares;

	public WebElement getViewFares() {
		return viewFares;
	}
	
/*	@FindBy(xpath = "//button[@id='btnb1_0']")
	private WebElement bookNow; */

	@FindBy(xpath = "//*[@id='btnb1_0-0']")  
	protected
	 WebElement viewFareBookNow;
	public WebElement getViewFareBookNow() {
		return viewFareBookNow;
	}
	
	
	@FindBy(xpath = "//*[@id='btnb1_0-0']")
	private WebElement bookNow;
	public WebElement getBookNow() {
		return bookNow;
	}
	
	
	

			@FindBy(xpath = "/html/body/main/section/div/div/div/div[2]/div[3]/div[2]/div[4]/div[3]/div[1]/div[1]/div[2]/button")
	private WebElement viewFare;

	public WebElement getViewFare() {
		return viewFare;
	}
	
	
	@FindBy(xpath = "//input[@id='Passengers_0__FirstName']")
	private WebElement firstGivenName;

	public WebElement getFirstGivenName() {
		return firstGivenName;
	}

	@FindBy(xpath = "//input[@id='Passengers_0__LastName']")
	private WebElement lastSurname;

	public WebElement getLastSurname() {
		return lastSurname;
	}

	@FindBy(xpath = "//input[@id='Passengers_0__DOB']")
	private WebElement passengerAdultDob;

	public WebElement getPassengerAdultDob() {
		return passengerAdultDob;
	}

	@FindBy(xpath = "//div[@class='picker__day picker__day--infocus picker__day--highlighted'][contains(text(),'21')]")
	private WebElement pickPassengerAdultDob;

	public WebElement getPickPassengerAdultDob() {
		return pickPassengerAdultDob;
	}

	@FindBy(xpath = "//input[@id='Passengers_0__PassportNum']")
	private WebElement passportNumber;

	public WebElement getPassportNumber() {
		return passportNumber;
	}

	@FindBy(xpath = "//input[@id='Passengers_0__PDOE']")
	private WebElement expiresOn;

	public WebElement getExpiresOn() {
		return expiresOn;
	}

/*	@FindBy(xpath = "//div[@class='picker__day picker__day--infocus picker__day--highlighted'][contains(text(),'2')]")
	private WebElement pickexpiresOn;

	public WebElement getpickexpiresOn() {
		return pickexpiresOn;
	}  */
	
	@FindBy(xpath = "//div[@class='picker__day picker__day--infocus picker__day--highlighted'][contains(text(),'5')]")
	private WebElement pickExpiresOn;

	public WebElement getPickExpiresOn() {
		return pickExpiresOn;
	}

	
	@FindBy(xpath = "//label[@class='m-0']")
	private WebElement addToTravellersList;

	public WebElement getAddToTravellersList() {
		return addToTravellersList;
	}

	@FindBy(xpath = "//input[@id='Passengers_1__FirstName']")
	private WebElement secondFirstGivenName;

	public WebElement getSecondFirstGivenName() {
		return secondFirstGivenName;
	}

	@FindBy(xpath = "//input[@id='Passengers_1__LastName']")
	private WebElement secondLastSurname;

	public WebElement getSecondLastSurname() {
		return secondLastSurname;
	}

	@FindBy(xpath = "//input[@id='Passengers_1__DOB']")
	private WebElement secondPassengerDob;

	public WebElement getSecondPassengerDob() {
		return secondPassengerDob;
	}

	@FindBy(xpath = "//table[@id='Passengers_1__DOB_table']//tbody//tr//td[@role='presentation']//div[@class='picker__day picker__day--infocus picker__day--highlighted'][contains(text(),'21')]")
	private WebElement secondPickPassengerDob;

	public WebElement getSecondPickPassengerDob() {
		return secondPickPassengerDob;
	}

	@FindBy(xpath = "//input[@id='Passengers_1__PassportNum']")
	private WebElement secondPassportNumber;

	public WebElement getSecondPassportNumber() {
		return secondPassportNumber;
	}

	@FindBy(xpath = "//input[@id='Passengers_1__PDOE']")
	private WebElement secondExpiresOn;

	public WebElement getSecondExpiresOn() {
		return secondExpiresOn;
	}

	@FindBy(xpath = "//table[@id='Passengers_1__PDOE_table']//tbody//tr//td[@role='presentation']//div[@class='picker__day picker__day--infocus picker__day--highlighted'][contains(text(),'5')]")
	private WebElement secondPickExpiresOn;

	public WebElement getSecondPickExpiresOn() {
		return secondPickExpiresOn;
	}

	

	
	@FindBy(xpath = "//input[@id='Email']")
	private WebElement emailAddress;

	public WebElement getEmailAddress() {
		return emailAddress;
	}

	@FindBy(xpath = "//input[@id='PhoneNo']")
	private WebElement mobileNumber;

	public WebElement getMobileNumber() {
		return mobileNumber;
	}

	@FindBy(xpath = "//label[@for='chkfare']")
	private WebElement fareRulesCbox;

	public WebElement getFareRulesCbox() {
		return fareRulesCbox;
	}

	@FindBy(xpath = "//label[@for='chkterms']")
	private WebElement termsAndConditionsCbox;

	public WebElement getTermsAndConditionsCbox() {
		return termsAndConditionsCbox;
	}

	@FindBy(xpath = "//button[contains(text(),'Book and Hold')]")
	private WebElement bookAndHold;

	public WebElement getBookAndHold() {
		return bookAndHold;
	}

	@FindBy(xpath = "//button[contains(text(),'Instant Ticketing')]")
	private WebElement instantTicketing;

	public WebElement getInstantTicketing() {
		return instantTicketing;
	}

	@FindBy(xpath = "//button[@id='btnbook']")
	private WebElement confirmBooking;

	public WebElement getConfirmBooking() {
		return confirmBooking;
	}

	@FindBy(xpath = "//button[@id='OrderTktConfirmBtn']")
	private WebElement orderTicket;

	public WebElement getOrderTicket() {
		return orderTicket;
	}

	@FindBy(xpath = "//button[@id='confirmPaymentBtn']")
	private WebElement confirmWithPayment;

	public WebElement getConfirmWithPayment() {
		return confirmWithPayment;
	}

	@FindBy(xpath = "//button[@class='navToggleBtn navigationToggleBtn']")
	private WebElement menu;

	public WebElement getMenu() {
		return menu;
	}

	@FindBy(xpath = "//a[contains(text(),'In Process')]")
	private WebElement inProcessQueue;

	public WebElement getInProcessQueue() {
		return inProcessQueue;
	}

	@FindBy(xpath = "//a[contains(text(),'AssignToMe')]")
	private WebElement assignToMe;

	public WebElement getAssignToMe() {
		return assignToMe;
	}

	@FindBy(xpath = "/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/a[1]")
	private WebElement selectInProcessLink;

	public WebElement getSelectInProcessLink() {
		return selectInProcessLink;
	}

	@FindBy(xpath = "//body[@class='hideHeaderMsg']/main/section[@class='searchMainSection']/div[@class='container']/div[@class='booking-flight']/div[@class='container print-container']/div[@class='row']/div[@class='col-lg-3']/div[@class='right-sidebar']/div[3]/button[1]")
	private WebElement startTicketingOperation;

	public WebElement getStartTicketingOperation() {
		return startTicketingOperation;
	}

	@FindBy(xpath = "//div[@class='filter-option-inner']")
	private WebElement selectVendor;

	public WebElement getSelectVendor() {
		return selectVendor;
	}

	@FindBy(xpath = "//a[@id='bs-select-1-1']")
	private WebElement selectingVendor;

	public WebElement getSelectingVendor() {
		return selectingVendor;
	}

	@FindBy(xpath = "//button[@id='btnEditVendor']")
	private WebElement updateVendor;

	public WebElement getUpdateVendor() {
		return updateVendor;
	}

	@FindBy(xpath = "/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[6]/button[1]")
	private WebElement ticketUpdateManual;

	public WebElement getTicketUpdateManual() {
		return ticketUpdateManual;
	}

	@FindBy(xpath = "/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[7]/form[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/input[1]")
	private WebElement ticketNumber;

	public WebElement getTicketNumber() {
		return ticketNumber;
	}
//	/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[7]/form[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[4]/div[1]/input[1]
		
	@FindBy(xpath = "/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[7]/form[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[4]/div[1]/input[1]")
	private WebElement ticketNumberTwo;

	public WebElement getTicketNumberTwo() {
		return ticketNumberTwo;
	}
	
	@FindBy(xpath = "//button[@id='btnManualUpdate']")
	private WebElement ticketUpdate;

	public WebElement getTicketUpdate() {
		return ticketUpdate;
	}

	@FindBy(xpath = "//div[@class='d-flex align-items-center']")
	private WebElement printDownload;

	public WebElement getPrintDownload() {
		return printDownload;
	}

	@FindBy(xpath = "//a[contains(text(),'Print Invoice')]")
	private WebElement printInvoice;

	public WebElement getPrintInvoice() {
		return printInvoice;
	}

	@FindBy(xpath = "//a[contains(text(),'Print Customer Invoice')]")
	private WebElement printCustomerInvoice;

	public WebElement getPrintCustomerInvoice() {
		return printCustomerInvoice;
	}

	@FindBy(xpath = "/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[12]/div[1]/div[1]/a[3]")
	private WebElement ticketWithPrice;

	public WebElement getTicketWithPrice() {
		return ticketWithPrice;
	}

	@FindBy(xpath = "//a[contains(text(),'Ticket Without Price(Per Passenger)')]")
	private WebElement ticketWithoutPrice;

	public WebElement getTicketWithoutPrice() {
		return ticketWithoutPrice;
	}

	@FindBy(xpath = "//a[contains(text(),'Print Confirmation With Price')]")
	private WebElement printConfirmationWithPrice;

	public WebElement getPrintConfirmationWithPrice() {
		return printConfirmationWithPrice;
	}

	@FindBy(xpath = "//a[contains(text(),'Print Confirmation Without Price')]")
	private WebElement printConfirmationWithoutPrice;

	public WebElement getPrintConfirmationWithoutPrice() {
		return printConfirmationWithoutPrice;
	}

	@FindBy(xpath = "//input[@id='departuredate_1']")
	private WebElement departureDate;

	public WebElement getDepartureDate() {
		return departureDate;
	}
	
	@FindBy(xpath = "//input[@id='departuredate_2']")
	private WebElement secondDepartureDate;

	public WebElement getSecondDepartureDate() {
		return secondDepartureDate;
	}
	@FindBy(xpath="//input[@id='txtUserName']")
	private static WebElement userNameBox;

	
	public static WebElement getUserNameBox()
	{
		return userNameBox;
	}
	
	@FindBy(xpath="//input[@id='txtPassword']")
	private static WebElement passwordBox;
	
	public static WebElement getPasswordBox()
	{
		return passwordBox;
	}
	
	@FindBy(xpath="//button[@id='load']")
	private static WebElement loginButton;
	
	public static WebElement getLoginButton()
	{
		return loginButton;
	}
	
	
	@FindBy(xpath="//span[contains(@class,'total_passengers')]")
	private static WebElement selectPassenger;
	
	public static WebElement getSelectPassenger()
	{
		return selectPassenger;
	}
	
	
	@FindBy(xpath="//div[contains(@class,'dropdown-item d-flex justify-content-between')]//div[contains(@class,'passengers adult_passengers')]//div[contains(@class,'quantity-nav')]//div[contains(@class,'quantity-button quantity-up')]")
	private static WebElement increaseAdultPassenger;
	
	public static WebElement getIncreaseAdultPassenger()
	{
		return increaseAdultPassenger;
	}
	
	@FindBy(xpath="//div[contains(@class,'dropdown-item d-flex flex-wrap justify-content-between')]//div[contains(@class,'passengers child_passengers')]//div[contains(@class,'quantity-nav')]//div[contains(@class,'quantity-button quantity-up')]")
	private static WebElement increaseChildPassenger;
	
	public static WebElement getIncreaseChildPassenger()
	{
		return increaseChildPassenger;
	}
	
	@FindBy(xpath="//div[contains(@class,'passengers infant_passengers')]//div[contains(@class,'quantity-nav')]//div[contains(@class,'quantity-button quantity-up')]")
	private static WebElement increaseInfantPassenger;
	
	public static WebElement getIncreaseInfantPassenger()
	{
		return increaseInfantPassenger;
	}
	//input[@id='arrivaldate']
	@FindBy(xpath="//input[@id='arrivaldate']")
	private static WebElement returningDate;
	
	public static WebElement getReturningDate()
	{
		return returningDate;
	}
	@FindBy(xpath="//label[@for='selectAirline-0']")
	private static WebElement departurePlane;
	
	public static WebElement getDeparturePlane()
	{
		return departurePlane;
	}
	@FindBy(xpath="//label[@for='airline-0']")
	private static WebElement arrivalPlane;
	
	public static WebElement getArrivalPlane()
	{
		return arrivalPlane;
	}
	//button[@class='flyBtn greenBtn fillBtn btnRevalidate']
	@FindBy(xpath="//button[@class='flyBtn greenBtn fillBtn btnRevalidate']")
	private static WebElement returnFlightBookNow;
	
	public static WebElement getReturnFlightBookNow()
	{
		return returnFlightBookNow;
	}
	
	//input[@id='Passengers_2__FirstName']
	@FindBy(xpath = "//input[@id='Passengers_2__FirstName']")
	private WebElement thirdFirstGivenName;

	public WebElement getThirdFirstGivenName() {
		return thirdFirstGivenName;
	}

	@FindBy(xpath = "//input[@id='Passengers_2__LastName']")
	private WebElement thirdLastSurname;

	public WebElement getThirdLastSurname() {
		return thirdLastSurname;
	}

	@FindBy(xpath = "//input[@id='Passengers_2__DOB']")
	private WebElement thirdPassengerDob;

	public WebElement getThirdPassengerAdultDob() {
		return thirdPassengerDob;
	}

	@FindBy(xpath = "//table[@id='Passengers_2__DOB_table']//tbody//tr//td[@role='presentation']//div[@class='picker__day picker__day--infocus picker__day--highlighted'][contains(text(),'3')]")
	private WebElement thirdPickPassengerDob;

	public WebElement getThirdPickPassengerDob() {
		return thirdPickPassengerDob;
	}

	@FindBy(xpath = "//input[@id='Passengers_2__PassportNum']")
	private WebElement thirdPassportNumber;

	public WebElement getThirdPassportNumber() {
		return thirdPassportNumber;
	}

	@FindBy(xpath = "//input[@id='Passengers_2__PDOE']")
	private WebElement thirdExpiresOn;

	public WebElement getThirdExpiresOn() {
		return thirdExpiresOn;
	}

	@FindBy(xpath = "//table[@id='Passengers_2__PDOE_table']//tbody//tr//td[@role='presentation']//div[@class='picker__day picker__day--infocus picker__day--highlighted'][contains(text(),'7')]")
	private WebElement thirdPickExpiresOn;

	public WebElement getThirdPickExpiresOn() {
		return thirdPickExpiresOn;
	}

	@FindBy(xpath = "//input[@id='Passengers_3__FirstName']")
	private WebElement fourthFirstGivenName;

	public WebElement getFourthFirstGivenName() {
		return fourthFirstGivenName;
	}

	@FindBy(xpath = "//input[@id='Passengers_3__LastName']")
	private WebElement fourthLastSurname;

	public WebElement getFourthLastSurname() {
		return fourthLastSurname;
	}

	@FindBy(xpath = "//input[@id='Passengers_3__DOB']")
	private WebElement fourthPassengerDob;

	public WebElement getFourthPassengerAdultDob() {
		return fourthPassengerDob;
	}

	@FindBy(xpath = "//table[@id='Passengers_3__DOB_table']//tbody//tr//td[@role='presentation']//div[@class='picker__day picker__day--infocus picker__day--highlighted'][contains(text(),'3')]")
	private WebElement fourthPickPassengerDob;

	public WebElement getFourthPickPassengerDob() {
		return fourthPickPassengerDob;
	}

	@FindBy(xpath = "//input[@id='Passengers_3__PassportNum']")
	private WebElement fourthPassportNumber;

	public WebElement getFourthPassportNumber() {
		return fourthPassportNumber;
	}

	@FindBy(xpath = "//input[@id='Passengers_3__PDOE']")
	private WebElement fourthExpiresOn;

	public WebElement getFourthExpiresOn() {
		return fourthExpiresOn;
	}

	@FindBy(xpath = "//table[@id='Passengers_3__PDOE_table']//tbody//tr//td[@role='presentation']//div[@class='picker__day picker__day--infocus picker__day--highlighted'][contains(text(),'7')]")
	private WebElement fourthPickExpiresOn;

	public WebElement getFourthPickExpiresOn() {
		return fourthPickExpiresOn;
	}


	@FindBy(xpath = "//input[@id='Passengers_4__FirstName']")
	private WebElement fifthFirstGivenName;

	public WebElement getFifthFirstGivenName() {
		return fifthFirstGivenName;
	}

	@FindBy(xpath = "//input[@id='Passengers_4__LastName']")
	private WebElement fifthLastSurname;

	public WebElement getFifthLastSurname() {
		return fifthLastSurname;
	}

	@FindBy(xpath = "//input[@id='Passengers_4__DOB']")
	private WebElement fifthPassengerDob;

	public WebElement getFifthPassengerAdultDob() {
		return fifthPassengerDob;
	}

	@FindBy(xpath = "/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[6]/form[1]/div[10]/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/div[1]")
	private WebElement fifthPickPassengerDob;

	public WebElement getFifthPickPassengerDob() {
		return fifthPickPassengerDob;
	}

	@FindBy(xpath = "//input[@id='Passengers_4__PassportNum']")
	private WebElement fifthPassportNumber;

	public WebElement getFifthPassportNumber() {
		return fifthPassportNumber;
	}

	@FindBy(xpath = "//input[@id='Passengers_4__PDOE']")
	private WebElement fifthExpiresOn;

	public WebElement getFifthExpiresOn() {
		return fifthExpiresOn;
	}

	@FindBy(xpath = "//table[@id='Passengers_4__PDOE_table']//tbody//tr//td[@role='presentation']//div[@class='picker__day picker__day--infocus picker__day--highlighted'][contains(text(),'7')]")
	private WebElement fifthPickExpiresOn;

	public WebElement getFifthPickExpiresOn() {
		return fifthPickExpiresOn;
	}
	
	//a[contains(text(),'Ticketed')]
	@FindBy(xpath = "//a[contains(text(),'Ticketed')]")
	private WebElement ticketedQueue;

	public WebElement getTicketedQueue() {
		return  ticketedQueue;
	}


	//  /html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/a[1]
	@FindBy(xpath = "/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/a[1]")
	private WebElement pickTicketedLink;

	public WebElement getPickTicketedLink() {
		return  pickTicketedLink;
	}
	
	@FindBy(xpath = "/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[12]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")
	private WebElement ticketWithPriceone;

	public WebElement getTicketWithPriceone() {
		return  ticketWithPriceone;
	}

@FindBy(xpath = "/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[12]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")
	private WebElement ticketWithPriceEticket;

	public WebElement getTicketWithPriceEticket() {
		return  ticketWithPriceEticket;
	}

@FindBy(xpath = "/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[12]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/a[1]")
	private WebElement ticketWithoutPriceone;

	public WebElement getTicketWithoutPriceone() {
		return  ticketWithoutPriceone;
	}

@FindBy(xpath = "/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[12]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/a[1]")
	private WebElement ticketWithoutPriceEticket;

	public WebElement getTicketWithoutPriceEticket() {
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

	public WebElement getCaptchaBox()
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

	public static WebElement getBalanceAmount()
	{
		return balanceAmount;
	}
	
			@FindBy(xpath="/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/div[5]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]")
	private static WebElement ticketAmount;

	public static WebElement getTicketAmount()
	{
		return ticketAmount;
	}

	public FlightBookLocator(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}

