package page.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginLocator {
	
	
	@FindBy(xpath="//input[@id='Staff_UserName']")
	private static WebElement userNameBox;

	
	public static WebElement getuserNameBox()
	{
		return userNameBox;
	}
	
	@FindBy(xpath="//input[@id='Staff_Password']")
	private static WebElement passwordBox;
	
	public static WebElement getpasswordBox()
	{
		return passwordBox;
	}
	
	@FindBy(xpath="//button[text()='Login']")
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
	
	@FindBy(xpath="//a[contains(text(),'Logout')]")
	private static WebElement logoutButton;
	
	public static WebElement getlogoutButton()
	{
		return logoutButton;
	}
	
	
	@FindBy(xpath="//a[contains(text(),'Continue with Google')]")
	private static WebElement continueWithGoogle;
	
	public static WebElement getcontinueWithGoogle()
	{
		return continueWithGoogle;
	}
	
	
	@FindBy(xpath="//li[@class='JDAKTe eARute W7Aapd zpCp3 SmR8']//div[@class='lCoei YZVTmd SmR8']")
	private static WebElement useAnotherAccount;
	
	public static WebElement getuseAnotherAccount()
	{
		return useAnotherAccount;
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
	
	
	@FindBy(xpath="//a[@class='forgot-pass']")
	private static WebElement forgotPassword;
	
	public static WebElement getforgotPassword()
	{
		return forgotPassword;
	}
	
	
	@FindBy(xpath="//input[@id='txtUname']")
	private static WebElement userName;
	
	public static WebElement getuserName()
	{
		return userName;
	}
	
	@FindBy(xpath="//button[@id='load']")
	private static WebElement Submit;
	
	public static WebElement getSubmit()
	{
		return Submit;
	}
	
	@FindBy(xpath="//a[contains(text(),'Inbox')]")
	private WebElement Inbox;

	public WebElement getInbox()
	{
		return Inbox;
	}
	
	
	
	@FindBy(xpath="//a[contains(text(),'Manage Clients')]")
	private WebElement manageClients;

	public WebElement getmanageClients()
	{
		return manageClients;
	}
	
	//span[contains(text(),'New')]
	@FindBy(xpath="//span[contains(text(),'New')]")
	private WebElement selectingClient;

	public WebElement getselectingClient()
	{
		return selectingClient;
	}
	

	//div[@id='lnknonactive']
	@FindBy(xpath="//div[@id='lnknonactive']")
	private WebElement selectingInactiveClient;

	public WebElement getselectingInactiveClient()
	{
		return selectingInactiveClient;
	}
	
	//body[@class='hideHeaderMsg']/main/section[@class='searchMainSection']/div[@class='container']/div[@class='container']/div[@class='traveller_profile traveller_section_content contentWhiteBox columnBlock pt-10']/div[@class='columnBlock']/div[@id='divManageClientPagination']/div[@class='hal-responsive-table hal-mobile-table']/table[@class='hal-table']/tbody[@class='hal-table-content']/tr[1]/td[1]/ul[1]/li[1]/a[1]
	@FindBy(xpath="//body[@class='hideHeaderMsg']/main/section[@class='searchMainSection']/div[@class='container']/div[@class='container']/div[@class='traveller_profile traveller_section_content contentWhiteBox columnBlock pt-10']/div[@class='columnBlock']/div[@id='divManageClientPagination']/div[@class='hal-responsive-table hal-mobile-table']/table[@class='hal-table']/tbody[@class='hal-table-content']/tr[1]/td[1]/ul[1]/li[1]/a[1]")
	private WebElement editInactiveClient;

	public WebElement geteditInactiveClient()
	{
		return editInactiveClient;
	}
	
	//a[@class='filter-card-title traveller-form-title d-flex justify-content-between align-items-center collapsed']//span
	@FindBy(xpath="//a[@class='filter-card-title traveller-form-title d-flex justify-content-between align-items-center collapsed']//span")
	private WebElement configofClient;

	public WebElement getconfigofClient()
	{
		return configofClient;
	}
	
	//label[contains(text(),'Activate Client')]
	@FindBy(xpath="//label[contains(text(),'Activate Client')]")
	private WebElement activateClient;

	public WebElement getactivateClient()
	{
		return activateClient;
	}
	
	//button[@id='btnSubmit']
	@FindBy(xpath="//button[@id='btnSubmit']")
	private WebElement updateClient;

	public WebElement getupdateClient()
	{
		return updateClient;
	}
	
	@FindBy(xpath = "//button[@class='navToggleBtn navigationToggleBtn']")
	private static WebElement Menu;

	public static WebElement getMenu() {
		return Menu;
	}
	
	//body[@class='hideHeaderMsg']/main/section[@class='searchMainSection']/div[@class='container']/div[@class='ticketing']/div[@class='container']/div[@class='tab-content ticketing-tab']/div[@id='HeadQuarter']/div[@class='row']/div[@id='main']/div/div/form[@id='registrationForm']/div[@class='add-travellers']/div[@class='single-traveller-add']/div[@class='add-traveller-form']/div[@id='Configuration-details']/div/div[@class='row']/div[7]/div[1]/div[1]/button[1]/div[1]/div[1]/div[1]

	@FindBy(xpath = "//body[@class='hideHeaderMsg']/main/section[@class='searchMainSection']/div[@class='container']/div[@class='ticketing']/div[@class='container']/div[@class='tab-content ticketing-tab']/div[@id='HeadQuarter']/div[@class='row']/div[@id='main']/div/div/form[@id='registrationForm']/div[@class='add-travellers']/div[@class='single-traveller-add']/div[@class='add-traveller-form']/div[@id='Configuration-details']/div/div[@class='row']/div[7]/div[1]/div[1]/button[1]/div[1]/div[1]/div[1]")
	private static WebElement associateBranch;

	public static WebElement getassociateBranch() {
		return  associateBranch;
	}
	
	//a[@id='bs-select-5-1']
	@FindBy(xpath = "//a[@id='bs-select-5-1']")
	private static WebElement  selectAssociateBranch;

	public static WebElement getselectAssociateBranch() {
		return selectAssociateBranch;
	}
	
	@FindBy(xpath = "//div[@class='dropdown bootstrap-select show-tick']//button[@type='button']//div[@class='filter-option']//div[@class='filter-option-inner']")
	private static WebElement loginWhitelistedCountries;

	public static WebElement getloginWhitelistedCountries() {
		return loginWhitelistedCountries;
	}
	
	@FindBy(xpath = "//div[@class='dropdown-menu show']//div[@class='bs-searchbox']//input[@type='text']")
	private static WebElement selectloginWhitelistedCountries;

	public static WebElement getselectloginWhitelistedCountries() {
		return selectloginWhitelistedCountries;
	}
		
		
		//a[@id='bs-select-6-1']
		@FindBy(xpath = "//a[@id='bs-select-6-1']")
		private static WebElement selectcountryloginWhitelistedCountries;

		public static WebElement getselectcountryloginWhitelistedCountries() {
			return selectcountryloginWhitelistedCountries;
	}
		
		//div[@id='dvFlightSuppliers']//div[@class='col-sm-6 col-md-4 col-lg-3']//div[@class='hal-checkbox secondary-checkbox']//label[@class='flight-result-item-select-label mb-0 font-weight-normal'][contains(text(),'1A')]
		@FindBy(xpath = "//div[@id='dvFlightSuppliers']//div[@class='col-sm-6 col-md-4 col-lg-3']//div[@class='hal-checkbox secondary-checkbox']//label[@class='flight-result-item-select-label mb-0 font-weight-normal'][contains(text(),'1A')]")
		private static WebElement selectSupplier;

		public static WebElement getselectSupplier() {
			return selectSupplier;
	
}}



