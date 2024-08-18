package VoidRefundReissue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VoidRefundReissueLocator {
	
/*	@FindBy(xpath="//body[@class='hideHeaderMsg']/main/section[@class='searchMainSection']/div[@class='container']/div[@class='booking-flight']/div[@class='container print-container']/div[@class='row']/div[@class='col-lg-3']/div[@class='right-sidebar']/div[24]/button[1]")
	private WebElement Void;
	
	public WebElement getVoid()
	{
		return Void;
	}

	
	@FindBy(xpath="//button[@id='CnfmVRRBtn']")
	private WebElement voidYesButton;
	
	public WebElement getvoidYesButton()
	{
		return voidYesButton;
	}
	
	
	@FindBy(xpath="//label[@for='flightchk_59630_0']")
	private WebElement voidFlightItineraryCbox;
	
	public WebElement getvoidFlightItineraryCbox()
	{
		return voidFlightItineraryCbox;
	}
	
	
	
	@FindBy(xpath="//label[@for='selectall_59630_0']")
	private WebElement voidSelectAllPassengersCbox;
	
	public WebElement getvoidSelectAllPassengersCbox()
	{
		return voidSelectAllPassengersCbox;
	}
	
	
	@FindBy(xpath="//button[@id='vrrrequestbtn']")
	private WebElement voidSendRequestButton;
	
	public WebElement getvoidSendRequestButton()
	{
		return voidSendRequestButton;
	} */
	
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
	//body[contains(@class,'hideHeaderMsg')]/main[contains(@class,'')]/div[@class='mainNavigationWrap']/nav/ul[@class='firstLevelMenu']/li[4]/span[1]

	@FindBy(xpath="//body[contains(@class,'hideHeaderMsg')]/main[contains(@class,'')]/div[@class='mainNavigationWrap']/nav/ul[@class='firstLevelMenu']/li[4]/span[1]")
	private static WebElement agentQueues;
	
	public static WebElement getagentQueues()
	{
		return agentQueues;
	}

	
	@FindBy(xpath="//a[contains(@href,'/Queues/Ticketed')]")
	private static WebElement agentFlight;
	
	public static WebElement getagentFlight()
	{
		return agentFlight;
	} 

	
    @FindBy(xpath="/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/a[1]")
	private static WebElement agentTicketedReferenceId;
	
	public static WebElement getagentTicketedReferenceId()
	{
		return agentTicketedReferenceId;
	} 
	
	
	@FindBy(xpath="//button[@id='VoidRequestBtn']")
	private static WebElement agentVoidButton;
	
	public static WebElement getagentVoidButton()
	{
		return agentVoidButton;
	} 
	
	
	@FindBy(xpath="//button[@id='CnfmVRRBtn']")
	private static WebElement agentVoidYesButton;
	
	public static WebElement getagentVoidYesButton()
	{
		return agentVoidYesButton;
	} 
	
	
	@FindBy(xpath="//label[@title='Select Flight']")
	private static WebElement agentVoidRequestSelectFlightCbox;
	
	public static WebElement getagentVoidRequestSelectFlightCbox()
	{
		return agentVoidRequestSelectFlightCbox;
	} 
	
	@FindBy(xpath="/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/label[1]")  
	private static WebElement agentVoidRequestSelectAllPassengerCbox;
	
	public static WebElement getagentVoidRequestSelectAllPassengerCbox()
	{
		return agentVoidRequestSelectAllPassengerCbox;
	} 
	
	
	@FindBy(xpath="//button[@id='vrrrequestbtn']")
	private static WebElement agentVoidSendRequestButton;
	
	public static WebElement getagentVoidSendRequestButton()
	{
		return agentVoidSendRequestButton;
	} 
	
	@FindBy(xpath = "//button[@class='navToggleBtn navigationToggleBtn']")
	private static WebElement Menu;

	public static WebElement getMenu() {
		return Menu;
	}
	
	@FindBy(xpath = "//a[contains(text(),'Void Management')]")
	private static WebElement midvoidManagement;

	public static WebElement getmidvoidManagement() {
		return midvoidManagement;
	}
	
	
	@FindBy(xpath="/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[2]/td[5]/span[1]/a[1]")
	private static WebElement voidRequestAssignTomelink;
	
	public static WebElement getvoidRequestAssignTomelink()
	{
		return voidRequestAssignTomelink;
	} 
	
	
	@FindBy(xpath="/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/a[1]")
	private static WebElement voidRequestReferenceId;
	
	public static WebElement getvoidRequestReferenceId()
	{
		return voidRequestReferenceId;
	} 
		
	
	@FindBy(xpath="//input[@id='confrimDateTimeLimit']")
	private static WebElement voidConfirmationExpiresOn;
	
	public static WebElement getvoidConfirmationExpiresOn()
	{
		return voidConfirmationExpiresOn;
	} 
		

	
	@FindBy(xpath="//div[@class='datepicker--cell datepicker--cell-day -current-']")
	private static WebElement pickvoidConfirmationExpiresOn;
	
	public static WebElement getpickvoidConfirmationExpiresOn()
	{
		return pickvoidConfirmationExpiresOn;
	} 
	
	
	@FindBy(xpath="//button[@id='vrrstartoperation']")
	private static WebElement voidStartVRRoperation;
	
	public static WebElement getvoidStartVRRoperation()
	{
		return voidStartVRRoperation;
	} 
	
	
	@FindBy(xpath="//button[@id='vrrconfirmSubmit']")
	private static WebElement voidSendToConfirmButton;
	
	public static WebElement getvoidSendToConfirmButton()
	{
		return voidSendToConfirmButton;
	} 
	
	
	@FindBy(xpath="//div[@id='divConfirmVRRSubmit']//div[@class='modal-dialog modal-dialog-centered']//div[@class='modal-content']//div[@class='modal-body hal-modal-content confirmation_details-modal-content']//div[@class='hal-modal-content-details confirmation_details']//div[@class='text-center']//button[@id='YesBtn']")
	private static WebElement voidSendToConfirmYesButton;
	
	public static WebElement getvoidSendToConfirmYesButton()
	{
		return voidSendToConfirmYesButton;
	} 
	
	
	@FindBy(xpath="//button[@id='vrrconfirm']")
	private WebElement voidConfirmButton;
	
	public WebElement getvoidConfirmButton()
	{
		return voidConfirmButton;
	} 
	
	
	@FindBy(xpath="//button[@id='YesBtn']")
	private WebElement voidYesConfirmButton;
	
	public WebElement getvoidYesConfirmButton()
	{
		return voidYesConfirmButton;
	} 
	
	
	@FindBy(xpath="//div[@class='custom-dropdown']//button[@type='button']")
	private static WebElement midvoidManagementdropdown;
	
	public static WebElement getmidvoidManagementdropdown()
	{
		return midvoidManagementdropdown;
	} 
	
	
	@FindBy(xpath="//label[contains(text(),'To Be Confirmed')]")
	private static WebElement midvoidToBeConfirmed;
	
	public static WebElement getmidvoidToBeConfirmed()
	{
		return midvoidToBeConfirmed;
	} 
	
	
	@FindBy(xpath="/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/a[1]")
	private static WebElement midvoidToBeConfirmedReferenceId;
	
	public static WebElement getmidvoidToBeConfirmedReferenceId()
	{
		return midvoidToBeConfirmedReferenceId;
	} 	
	

	@FindBy(xpath="//button[@id='vrrconfirm']")
	private static WebElement midvoidConfirm1;
	
	public static WebElement getmidvoidConfirm1()
	{
		return midvoidConfirm1;
	} 	
	
	
	@FindBy(xpath="//input[@id='confrimDateTimeLimit']")
	private static WebElement midvoidConfirmdatetime;
	
	public static WebElement getmidvoidConfirmdatetime()
	{
		return midvoidConfirmdatetime;
	} 	
	
	
	
			
   @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[20]")
    private static WebElement pickmidvoidConfirmdatetime;
			
    public static WebElement pickgetmidvoidConfirmdatetime()
	{
				return pickmidvoidConfirmdatetime;
    } 	
			
			
	
	
	@FindBy(xpath="//div[@id='divConfirmVRRSubmit']//div[@class='modal-dialog modal-dialog-centered']//div[@class='modal-content']//div[@class='modal-body hal-modal-content confirmation_details-modal-content']//div[@class='hal-modal-content-details confirmation_details']//div[@class='text-center']//button[@id='YesBtn']")
	private static WebElement midvoidConfirm1YesButton;
	
	public static WebElement getmidvoidConfirm1YesButton()
	{
		return midvoidConfirm1YesButton;
	} 	
	
	
	@FindBy(xpath="//label[@class='flight-result-item-select-label mb-0 font-weight-normal'][contains(text(),'Voiding')]")
	private static WebElement selectVoiding;
	
	public static WebElement getselectVoiding()
	{
		return selectVoiding;
	} 
	
	
	@FindBy(xpath="/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/a[1]")
	private static WebElement voidingReferenceId;
	
	public static WebElement getvoidingReferenceId()
	{
		return voidingReferenceId;
	} 
	
	
	@FindBy(xpath="//button[@id='vrrapprove']")
	private static WebElement voidApproveButton;
	
	public static WebElement getvoidApproveButton()
	{
		return voidApproveButton;
	} 
	
			
	@FindBy(xpath="//div[@id='divConfirmVRRSubmit']//div[@class='modal-dialog modal-dialog-centered']//div[@class='modal-content']//div[@class='modal-body hal-modal-content confirmation_details-modal-content']//div[@class='hal-modal-content-details confirmation_details']//div[@class='text-center']//button[@id='YesBtn']")
	private static WebElement voidYesApproveButton;
	
	public static WebElement getvoidYesApproveButton()
	{
		return voidYesApproveButton;
	} 
	
	@FindBy(xpath="//button[@id='vrrautoapprove']")
	private static WebElement voidAutoApprove;
	
	public static WebElement getvoidAutoApprove()
	{
		return voidAutoApprove;
	} 
	
	//div[@id='divConfirmVRRSubmit']//div[@class='modal-dialog modal-dialog-centered']//div[@class='modal-content']//div[@class='modal-body hal-modal-content confirmation_details-modal-content']//div[@class='hal-modal-content-details confirmation_details']//div[@class='text-center']//button[@id='YesBtn']
	@FindBy(xpath="//div[@id='divConfirmVRRSubmit']//div[@class='modal-dialog modal-dialog-centered']//div[@class='modal-content']//div[@class='modal-body hal-modal-content confirmation_details-modal-content']//div[@class='hal-modal-content-details confirmation_details']//div[@class='text-center']//button[@id='YesBtn']")
	private static WebElement voidAutoApproveYesButton;
	
	public static WebElement getvoidAutoApproveYesButton()
	{
		return voidAutoApproveYesButton;
	} 
	
	//button[@id='RefundRequestBtn']
	@FindBy(xpath="//button[@id='RefundRequestBtn']")
	private static WebElement refundButton;
	
	public static WebElement getrefundButton()
	{
		return refundButton;
	} 
	
	//button[@id='CnfmVRRBtn']
	@FindBy(xpath="//button[@id='CnfmVRRBtn']")
	private static WebElement refundYesButton;
	
	public static WebElement getrefundYesButton()
	{
		return refundYesButton;
	} 
	
	//label[@for='flightchk_59707_0']
	@FindBy(xpath="//label[@for='flightchk_59707_0']")
	private static WebElement refundSelectFlightCbox;
	
	public static WebElement getrefundSelectFlightCbox()
	{
		return refundSelectFlightCbox;
	} 
	
	@FindBy(xpath="//label[@for='chk_72513-59707_0']")
	private static WebElement refundSelectAllPassengerCbox;
	
	public static WebElement getrefundSelectAllPassengerCbox()
	{
		return refundSelectAllPassengerCbox;
	} 
	
	//label[contains(text(),'Voluntary refund according to Refund Policy')]
	@FindBy(xpath="/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/label[1]")
	private static WebElement refundReasonRadioButton;
	
	public static WebElement getrefundReasonRadioButton()
	{
		return refundReasonRadioButton;
	} 
	
	//button[@id='vrrrequestbtn']
	@FindBy(id="vrrrequestbtn")
	private static WebElement refundSendRequestButton;
	
	public static WebElement getrefundSendRequestButton()
	{
		return refundSendRequestButton;
	} 
	
	//a[contains(text(),'Refund Management')]
		@FindBy(xpath="//a[contains(text(),'Refund Management')]")
		private static WebElement refundManagement;
		
		public static WebElement getrefundManagement()
		{
			return refundManagement;
		} 
	
		//a[contains(text(),'AssignToMe')]
		@FindBy(xpath="//a[contains(text(),'AssignToMe')]")
		private static WebElement refundAssignToMelink;
		
		public static WebElement getrefundAssignToMelink()
		{
			return refundAssignToMelink; 
		} 
		
	//	/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/a[1]
		
		@FindBy(xpath="/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/a[1]")
		private static WebElement refundReferenceId;
		
		public static WebElement getrefundReferenceId()
		{
			return refundReferenceId;
		} 
		
		//input[@id='confrimDateTimeLimit']
		@FindBy(xpath="//input[@id='confrimDateTimeLimit']")
		private static WebElement refundConfirmationExpiresOn;
		
		public static WebElement getrefundConfirmationExpiresOn()
		{
			return refundConfirmationExpiresOn;
		} 
		
		//button[@id='vrrconfirmSubmit']
		@FindBy(xpath="//button[@id='vrrconfirmSubmit']")
		private static WebElement refundSendToConfirmButton;
		
		public static WebElement getrefundSendToConfirmButton()
		{
			return refundSendToConfirmButton;
		} 
	
		@FindBy(xpath="//div[@id='divConfirmVRRSubmit']//div[@class='modal-dialog modal-dialog-centered']//div[@class='modal-content']//div[@class='modal-body hal-modal-content confirmation_details-modal-content']//div[@class='hal-modal-content-details confirmation_details']//div[@class='text-center']//button[@id='YesBtn']")
	    private static WebElement refundSendToConfirmYesButton;
				
		public static WebElement getrefundSendToConfirmYesButton()
		{
			return refundSendToConfirmYesButton;
		} 
				
		//body[@class='hideHeaderMsg']/main/section[@class='searchMainSection']/div[@class='container']/div[@class='insideMainCommonSection']/div[@id='myTabContent']/div[@id='dvvrrlistview']/div[@class='filter-box']/div[@class='row mx-0 justify-content-between profile-filter vrrqueue_filter']/div[@class='d-flex']/div[@class='form-group form-inline mb-0']/div[@class='custom-dropdown show shown-dropdown']/div[@class='custom-dropdown-menu left-align-dropdown ticketing-status-dropdown dropdown-menu show']/div[4]/div[1]/label[1]
	    @FindBy(xpath="//body[@class='hideHeaderMsg']/main/section[@class='searchMainSection']/div[@class='container']/div[@class='insideMainCommonSection']/div[@id='myTabContent']/div[@id='dvvrrlistview']/div[@class='filter-box']/div[@class='row mx-0 justify-content-between profile-filter vrrqueue_filter']/div[@class='d-flex']/div[@class='form-group form-inline mb-0']/div[@class='custom-dropdown show shown-dropdown']/div[@class='custom-dropdown-menu left-align-dropdown ticketing-status-dropdown dropdown-menu show']/div[4]/div[1]/label[1]")
		private static WebElement refundingDropdown;
				
		public static WebElement getrefundingDropdown()
		{
			return refundingDropdown;
		} 
			
	//	/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/a[1]
		@FindBy(xpath="/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/a[1]")
		private static WebElement refundingreferenceId;
		
		public static WebElement getrefundingreferenceId()
		{
			return refundingreferenceId;
		} 
		
		//div[@class='custom-dropdown']//button[@type='button']
		@FindBy(xpath="//div[@class='custom-dropdown']//button[@type='button']")
		private static WebElement  midRefundManagementdropdown;
		
		public static WebElement getmidRefundManagementdropdown()
		{
			return  midRefundManagementdropdown;
		} 
		
		//label[contains(text(),'To Be Confirmed')]
		@FindBy(xpath="//label[contains(text(),'To Be Confirmed')]")
		private static WebElement  midRefundToBeConfirmed;
		
		public static WebElement getmidRefundToBeConfirmed()
		{
			return  midRefundToBeConfirmed;
		} 
		
	//	/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/a[1]
		@FindBy(xpath="/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/a[1]")
		private static WebElement  getmidRefundToBeConfirmedReferenceId;
		
		public static WebElement getmidRefundToBeConfirmedReferenceId()
		{
			return  midvoidToBeConfirmedReferenceId;
		} 
		
		//input[@id='confrimDateTimeLimit']
		@FindBy(xpath="//input[@id='confrimDateTimeLimit']")
		private static WebElement  getmidRefundConfirmdatetime;
		
		public static WebElement getmidRefundConfirmdatetime()
		{
			return  getmidRefundConfirmdatetime;
		} 
		
		//div[@class='datepicker--cell datepicker--cell-day -current- -selected-']
		@FindBy(xpath="//div[@class='datepicker--cell datepicker--cell-day -current- -selected-']")
		private static WebElement  pickgetmidRefundConfirmdatetime;
		
		public static WebElement pickgetmidRefundConfirmdatetime()
		{
			return  pickgetmidRefundConfirmdatetime;
		} 
		
		//button[@id='vrrconfirm']
		@FindBy(xpath="//button[@id='vrrconfirm']")
		private static WebElement  midRefundConfirm1;
		
		public static WebElement midRefundConfirm1()
		{
			return  midRefundConfirm1;
		} 
		
		//div[@id='divConfirmVRRSubmit']//div[@class='modal-dialog modal-dialog-centered']//div[@class='modal-content']//div[@class='modal-body hal-modal-content confirmation_details-modal-content']//div[@class='hal-modal-content-details confirmation_details']//div[@class='text-center']//button[@id='YesBtn']
		@FindBy(xpath="//div[@id='divConfirmVRRSubmit']//div[@class='modal-dialog modal-dialog-centered']//div[@class='modal-content']//div[@class='modal-body hal-modal-content confirmation_details-modal-content']//div[@class='hal-modal-content-details confirmation_details']//div[@class='text-center']//button[@id='YesBtn']")
		private static WebElement  midRefundYesConfirm1;
		
		public static WebElement midRefundYesConfirm1()
		{
			return  midRefundYesConfirm1;
		} 
		
		//button[@id='vrrapprove']
		@FindBy(xpath="//button[@id='vrrapprove']")
		private static WebElement  midRefundApprove;
		
		public static WebElement midRefundApprove()
		{
			return  midRefundApprove;
		} 
		
		//button[@id='ReissueRequestBtn']
		@FindBy(xpath="//button[@id='ReissueRequestBtn']")
		private static WebElement  reissueButton;
		
		public static WebElement getreissueButton()
		{
			return  reissueButton;
		} 
			
		//button[@id='CnfmVRRBtn']
		@FindBy(xpath="//button[@id='CnfmVRRBtn']")
		private static WebElement reissueYesButton;
		
		public static WebElement getreissueYesButton()
		{
			return reissueYesButton;
		} 
		
		@FindBy(xpath="/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/ng-include[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/label[1]")
		private static WebElement reissueSelectFlightCbox;
		
		public static WebElement getreissueSelectFlightCbox()
		{
			return reissueSelectFlightCbox;
		} 
		
		@FindBy(xpath="/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/ng-include[1]/div[1]/div[2]/div[1]/table[1]/thead[1]/tr[1]/td[1]/div[1]/label[1]")
		private static WebElement reissueSelectAllPassengerCbox;
		
		public static WebElement getreissueSelectAllPassengerCbox()
		{
			return reissueSelectAllPassengerCbox;
		} 
		
		//label[contains(text(),'Voluntary refund according to Refund Policy')]
		@FindBy(xpath="//label[contains(text(),'Voluntary reissue')]")
		private static WebElement reissueReasonRadioButton;
		
		public static WebElement getreissueReasonRadioButton()
		{
			return reissueReasonRadioButton;
		} 
		
		
		@FindBy(id="//button[@id='reissuereqbtn']")
		private static WebElement reissueRequestSubmitButton;
		
		public static WebElement getreissueRequestSubmitButton()
		{
			return reissueRequestSubmitButton;
		} 
		
		
		//a[contains(text(),'Reissue Management')]
		@FindBy(id="//a[contains(text(),'Reissue Management')]")
		private static WebElement reissueManagementButton;
		
		public static WebElement getreissueManagementButton()
		{
			return reissueManagementButton;
		} 
		
	//	/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[2]/td[4]/span[1]/a[1]
		@FindBy(id="/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[2]/td[4]/span[1]/a[1]")
		private static WebElement reissueAssignToMeButton;
		
		public static WebElement getreissueAssignToMeButton()
		{
			return reissueAssignToMeButton;
		} 		
		
	//	/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/a[1]
		@FindBy(id="/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/a[1]")
		private static WebElement reissueReferenceId;
		
		public static WebElement getreissueReferenceId()
		{
			return reissueReferenceId;
		} 
			
		
		//button[@id='vrrstartoperation']
		@FindBy(id="//a[contains(text(),'Reissue Management')]")
		private static WebElement reissuestartVRRoperationButton;
		
		public static WebElement getreissuestartVRRoperationButton()
		{
			return reissuestartVRRoperationButton;
		} 
		
		//button[@id='reissuebutton_2']
		@FindBy(id="//button[@id='reissuebutton_2']")
		private static WebElement reissueSendToConfirmButton;
		
		public static WebElement getreissueSendToConfirmButton()
		{
			return reissueSendToConfirmButton;
		} 
		

		@FindBy(id="/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/ng-include[1]/div[2]/div[4]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/input[1]")
		private static WebElement reissueFareBase;
		
		public static WebElement getreissueFareBase()
		{
			return reissueFareBase;
		} 
		
		@FindBy(id="/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/ng-include[1]/div[2]/div[4]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/div[1]/input[1]")
		private static WebElement reissueFareTaxes;
		
		public static WebElement getreissueFareTaxes()
		{
			return reissueFareTaxes;
		} 
		
		@FindBy(id="/html[1]/body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/ng-include[1]/div[2]/div[4]/div[1]/table[1]/tbody[1]/tr[1]/td[7]/div[1]/input[1]")
		private static WebElement getreissueFareOther;
		
		public static WebElement getreissueFareOther()
		{
			return getreissueFareOther;
		} 
		
		@FindBy(id="body[1]/main[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]")
		private static WebElement reissueFareMarkup;
		
		public static WebElement getreissueFareMarkup()
		{
			return reissueFareMarkup;
		} 
		


		//button[@id='YesBtn']
		@FindBy(id="//button[@id='YesBtn']")
		private static WebElement  reissueSendToConfirmYesButton;
		
		public static WebElement getreissueSendToConfirmYesButton()
		{
			return reissueSendToConfirmYesButton;
		} 
		
}
