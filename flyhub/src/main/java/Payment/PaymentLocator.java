package Payment;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentLocator {
	@FindBy(xpath = "//a[contains(text(),'Part Payment Slab')]")
	private WebElement partPaymentSlab;

	public WebElement getpartPaymentSlab() {
		return partPaymentSlab;
	}

	
	@FindBy(xpath = "//div[contains(text(),'SELECT')]")
	private WebElement startDay;

	public WebElement getstartDay() {
		return startDay;
	}

	
	@FindBy(xpath = "//span[contains(text(),'Sunday')]")
	private WebElement selectStartDay;

	public WebElement getselectStartDay() {
		return selectStartDay;
	}
	
	
	@FindBy(xpath = "//input[@id='newPartPaymentSlabConfiguration_CycleDays']")
	private WebElement cycleDays;

	public WebElement getcycleDays() {
		return cycleDays;
	}
	
	
	@FindBy(xpath = "//input[@id='txtDueInDays']")
	private WebElement dueInDays;

	public WebElement getdueInDays() {
		return dueInDays;
	}
	
	
	
	@FindBy(xpath = "//input[@id='txtTravelGapDays']")
	private WebElement travelGapDays;

	public WebElement gettravelGapDays() {
		return travelGapDays;
	}
	
	
	@FindBy(xpath = "//label[@for='IsActive']")
	private WebElement partPaymentSlabActivate;

	public WebElement getpartPaymentSlabActivate() {
		return partPaymentSlabActivate;
	}
	
	
	
	
}
