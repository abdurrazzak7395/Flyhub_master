package page.registration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationLocator {
	
	
	@FindBy(xpath="//input[@id='FirstName']")
	private WebElement firstName;
	
	public WebElement getfirstName()
	{
		return firstName;
	}

@FindBy(xpath="//input[@id='LastName']")
	private WebElement lastName;

	
	public WebElement getlastName()
	{
		return lastName;
	}


@FindBy(xpath="//input[@id='txtCompanyName']")
	private WebElement txtCompanyName;

	
	public WebElement gettxtCompanyName()
	{
		return txtCompanyName;
	}



@FindBy(xpath="//input[@id='txtUserName']")
	private WebElement txtUserName;

	
	public WebElement gettxtUserName()
	{
		return txtUserName;
	}


@FindBy(xpath="//input[@id='telnumber']")
	private WebElement telnumber;

	
	public WebElement gettelnumber()
	{
		return telnumber;
	}


@FindBy(xpath="//input[@id='Address1']")
	private WebElement Address1;

	
	public WebElement getAddress1()
	{
		return Address1;
	}




@FindBy(xpath="//input[@id='Address2']")
	private WebElement Address2;

	
	public WebElement getAddress2()
	{
		return Address2;
	}




@FindBy(xpath="//input[@id='City']")
	private WebElement City;

	
	public WebElement getCity()
	{
		return City;
	}


@FindBy(xpath="//input[@id='ZIP']")
	private WebElement ZIP;

	
	public WebElement getZIP()
	{
		return ZIP;
	}
	

@FindBy(xpath="//label[@for='chkAgree']")
private WebElement checkboxCustom;


public WebElement getcheckboxCustom()
{
	return checkboxCustom;
}

@FindBy(xpath="//button[@type='submit']")
private WebElement submit;

public WebElement getsubmit()
{
	return submit;
}

@FindBy(xpath="//button[contains(text(),'Ok')]")
private WebElement okButton;

public WebElement getokButton()
{
	return okButton;
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

//(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/p[2]/a[1]")
//a[contains(text(),'click here')]
@FindBy(xpath="//a[contains(text(),'click here')]")
private WebElement clickHereKyc;

public WebElement getclickHereKyc()
{
	return clickHereKyc;
}

//input[@id='contactInformation_name']
@FindBy(xpath="//input[@id='contactInformation_name']")
private WebElement contactNameKyc;

public WebElement getcontactNameKyc()
{
	return contactNameKyc;
}

//input[@id='telnumber']
@FindBy(xpath="//input[@id='telnumber']")
private WebElement telNumberKyc;

public WebElement gettelNumberKyc()
{
	return telNumberKyc;
}
//input[@id='contactInformation_email']
@FindBy(xpath="//input[@id='contactInformation_email']")
private WebElement contactEmailKyc;

public WebElement getcontactEmailKyc()
{
	return contactEmailKyc;
}


@FindBy(xpath="//button[contains(text(),'Save & Next')]")
private WebElement saveAndNextKyc;

public WebElement getsaveAndNextKyc()
{
	return saveAndNextKyc;
}

//select[@id='businessOverView_type']
@FindBy(xpath="//select[@id='businessOverView_type']")
private WebElement businessTypeKyc;

public WebElement getbusinessTypeKyc()
{
	return businessTypeKyc;
}

@FindBy(xpath="/html/body/div[1]/div[1]/div/div/div/div/div[2]/div/div[2]/form/div/div[1]/div[1]/div/select/option[3]")
private WebElement selectbusinessTypeKyc;

public WebElement getselectbusinessTypeKyc()
{
	return selectbusinessTypeKyc;
}

@FindBy(xpath="//select[@id='businessOverView_category']")
private WebElement businessCategoryKyc;

public WebElement getbusinessCategoryKyc()
{
	return businessCategoryKyc;
}

@FindBy(xpath="/html/body/div[1]/div[1]/div/div/div/div/div[2]/div/div[2]/form/div/div[1]/div[2]/div/select/option[2]")
private WebElement selectbusinessCategoryKyc;

public WebElement getselectbusinessCategoryKyc()
{
	return selectbusinessCategoryKyc;
}

//select[@id='businessOverView_subCategory']
@FindBy(xpath="//select[@id='businessOverView_subCategory']")
private WebElement subCategoryKyc;

public WebElement getsubCategoryKyc()
{
	return subCategoryKyc;
}


		@FindBy(xpath="/html/body/div[1]/div[1]/div/div/div/div/div[2]/div/div[2]/form/div/div[1]/div[3]/div/select/option[3]")
		private WebElement selectsubCategoryKyc;

		public WebElement getselectsubCategoryKyc()
		{
			return selectsubCategoryKyc;
		}	
		
		//input[@id='businessOverView_billingLabel']
		@FindBy(xpath="//input[@id='businessOverView_billingLabel']")
		private WebElement billingLabelKyc;

		public WebElement getbillingLabelKyc()
		{
			return billingLabelKyc;
		}	
		
		//input[@id='busineesDetails_PAN']
		
				@FindBy(xpath="//input[@id='busineesDetails_PAN']")
				private WebElement businessTinKyc;

				public WebElement getbusinessTinKyc()
				{
					return businessTinKyc;
				}	
				
				//input[@id='busineesDetails_name']
				@FindBy(xpath="//input[@id='busineesDetails_name']")
				private WebElement businessNameKyc;

				public WebElement getbusinessNameKyc()
				{
					return businessNameKyc;
				}	
				//input[@id='busineesDetails_authorisedSignatoryPAN']
				@FindBy(xpath="//input[@id='busineesDetails_authorisedSignatoryPAN']")
				private WebElement authorisedSignatoryTinKyc;

				public WebElement getauthorisedSignatoryTinKyc()
				{
					return authorisedSignatoryTinKyc;
				}	
				
				//input[@id='busineesDetails_PANOwnerName']
				@FindBy(xpath="//input[@id='busineesDetails_PANOwnerName']")
				private WebElement tinOwnersNameKyc;

				public WebElement gettinOwnersNameKyc()
				{
					return tinOwnersNameKyc;
				}	
				
				//input[@id='busineesDetails_address']
				@FindBy(xpath="//input[@id='busineesDetails_address']")
				private WebElement addressKyc;

				public WebElement getaddressKyc()
				{
					return addressKyc;
				}	
				
				
				//input[@id='busineesDetails_address']
				@FindBy(xpath="//input[@id='busineesDetails_address']")
				private WebElement zipCodeKyc;

				public WebElement getzipCodeKyc()
				{
					return zipCodeKyc;
				}	
				
				@FindBy(xpath="//input[@id='txtcity']")
				private WebElement cityKyc;

				public WebElement getcityKyc()
				{
					return cityKyc;
				}	
				
				//div[@id='ui-id-7307']
				@FindBy(xpath="//div[@id='ui-id-7307']")
				private WebElement entercityKyc;

				public WebElement getentercityKyc()
				{
					return cityKyc;
				}	
				
				
				//label[@for='samephysicaladdress']
				
				@FindBy(xpath="//label[@for='samephysicaladdress']")
				private WebElement sameAddressSaveKyc;

				public WebElement getsameAddressSaveKyc()
				{
					return sameAddressSaveKyc;
				}	
				
				//input[@id='accountDetails_beneficiaryName']
				@FindBy(xpath="//input[@id='accountDetails_beneficiaryName']")
				private WebElement beneficiaryNameKyc;

				public WebElement getbeneficiaryNameKyc()
				{
					return beneficiaryNameKyc;
				}	
				
				//input[@id='accountDetails_beneficiaryName']
				@FindBy(xpath="//input[@id='accountDetails_IFSCCode']")
				private WebElement routingNumberKyc;

				public WebElement getroutingNumberKyc()
				{
					return routingNumberKyc;
				}	
				
				//input[@id='accountDetails_accountNumber']
				@FindBy(xpath="//input[@id='accountDetails_accountNumber']")
				private WebElement accountNumberKyc;

				public WebElement getaccountNumberKyc()
				{
					return accountNumberKyc;
				}	
				
				
				@FindBy(xpath="//input[@id='txtreaccountnumber']")
				private WebElement reEnteraccountNumberKyc;

				public WebElement getreEnteraccountNumberKyc()
				{
					return reEnteraccountNumberKyc;
				}	
				
				//select[@id='documents_addressProof']
				@FindBy(xpath="//input[@id='txtreaccountnumber']")
				private WebElement authorizeSigntorysAddressProofKyc;

				public WebElement getauthorizeSigntorysAddressProofKyc()
				{
					return authorizeSigntorysAddressProofKyc;
				}	
				
			//	/html/body/div[1]/div[1]/div/div/div/div/div[2]/div/div[5]/form/div/div[1]/div[1]/div/select/option[2]
				@FindBy(xpath="/html/body/div[1]/div[1]/div/div/div/div/div[2]/div/div[5]/form/div/div[1]/div[1]/div/select/option[2]")
				private WebElement selectAddressProofKyc;

				public WebElement getselectAddressProofKyc()
				{
					return selectAddressProofKyc;
				}		
				
				//input[@id='documents_frontProofImage']
				@FindBy(xpath="//input[@id='documents_frontProofImage']")
				private WebElement addressproofFrontKyc;

				public WebElement getaddressproofFrontKyc()
				{
					return addressproofFrontKyc;
				}	
				//input[@id='documents_backProofImage']
				@FindBy(xpath="//input[@id='documents_backProofImage']")
				private WebElement addressproofBackKyc;

				public WebElement getaddressproofBackKyc()
				{
					return addressproofBackKyc;
				}	
				//input[@id='documents_registrationProofImage']
				@FindBy(xpath="//input[@id='documents_registrationProofImage']")
				private WebElement businessRegistrationProofKyc;

				public WebElement getbusinessRegistrationProofKyc()
				{
					return businessRegistrationProofKyc;
				}	
				
				
				@FindBy(xpath="//input[@id='documents_companyPANImage']")
				private WebElement companyTinKyc;

				public WebElement getcompanyTinKyc()
				{
					return companyTinKyc;
				}	
				//select[@id='additionaldoc']
				@FindBy(xpath="//select[@id='additionaldoc']")
				private WebElement additionalDocKyc;

				public WebElement  getadditionalDocKyc()
				{
					return  additionalDocKyc;
				}	
				
			//	/html/body/div[1]/div[1]/div/div/div/div/div[2]/div/div[5]/form/div/div[1]/div[6]/div[1]/select/option[2]
				
				@FindBy(xpath="/html/body/div[1]/div[1]/div/div/div/div/div[2]/div/div[5]/form/div/div[1]/div[6]/div[1]/select/option[2]")
				private WebElement selectadditionalDocKyc;

				public WebElement  getselectadditionalDocKyc()
				{
					return  selectadditionalDocKyc;
				}	
				//input[@id='documents_additionalDocumentProofImage']
				@FindBy(xpath="//input[@id='documents_additionalDocumentProofImage']")
				private WebElement additionalDocProofKyc;

				public WebElement  getadditionalDocProofKyc()
				{
					return  additionalDocProofKyc;
				}	
				
				//button[contains(text(),'Submit Form')]
				@FindBy(xpath="//button[contains(text(),'Submit Form')]")
				private WebElement submitFormKyc;

				public WebElement  getsubmitFormKyc()
				{
					return  submitFormKyc;
				}	
				
}
