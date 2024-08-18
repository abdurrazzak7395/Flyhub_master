package page.login;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import jdk.internal.org.jline.utils.Log;
import jdk.jfr.internal.Logger;


public class LoginLib extends LoginLocator {
	WebDriver driver;

	public LoginLib(WebDriver driver) {

		//LoginLib.driver = driver;
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}

	/**
	 * this method is used to navigate to given midofficeUrl
	 * 
	 * @param url
	 *            : midofficeUrl to be open
	 */
	public void navigateToFlyhub(String midofficeUrl) {

		try {
			driver.get(midofficeUrl);
			System.out.println("application is opening");
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}

	}

	/**
	 * this method is used to login to application
	 * 
	 * @param url
	 *            :
	 */
	public  void validLogin() {
		getuserNameBox().sendKeys("bdinfo@flyhub.com");
		getpasswordBox().sendKeys("bD$nfo@123");
		getloginButton().click();
	
	}

	public static void invalidLogin() {
		getuserNameBox().sendKeys("bdinf@gmail.com");
		getpasswordBox().sendKeys("bD$nfo3");
		getloginButton().click();
	}
	
	public static void midOfficeLogout() throws InterruptedException {
		getmyProfileButton().click();
		 Thread.sleep(5000);
		getlogoutButton().click();
	}
	

	public static void continueWithGoogle() throws InterruptedException {
		getcontinueWithGoogle().click();
		// getuseAnotherAccount().click();
		getEmail().sendKeys("musk82575@gmail.com");

		getNext().click();
		Thread.sleep(20000);

		getPassword().sendKeys("Azuga@123");
		Thread.sleep(5000);
		getNext().click();
		Thread.sleep(6000);

	}

	public static void ForgotPassword() throws InterruptedException {
		getforgotPassword().click();
		Thread.sleep(1000);
		getuserName().sendKeys("musk82575@gmail.com");
		Thread.sleep(1000);
		getSubmit().click();

	}

	public void forgotPasswordEmailVerification() throws InterruptedException

	{
       
		driver.get("https://accounts.google.com/InteractiveLogin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F%3Fhl%3Den&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F%3Fhl%3Den&hl=en&osid=1&passive=1209600&service=mail&ifkv=AXo7B7X0I1jfR2r4b8bH44QePiWcfzFdq4k3b_tltjb-rKcveAcR-gQsPtFGBM7pLrLlK3UnvxA2dA&flowName=GlifWebSignIn&flowEntry=ServiceLogin");

	/*	getEmail().sendKeys("musk82575@gmail.com");
		Thread.sleep(6000);

		getNext().click();

		Thread.sleep(60000);

		getPassword().sendKeys("Azuga@123");
		
		getNext().click();

		Thread.sleep(30000);
		getInbox().click();   */
		
	/*	getEmail().sendKeys("musk82575@gmail.com");

		getNext().click();
		Thread.sleep(20000);

		getPassword().sendKeys("Azuga@123");
		Thread.sleep(5000);
		getNext().click();
		Thread.sleep(6000); */

		Thread.sleep(3000);
		List<WebElement> allMessages = driver.findElements(By.xpath("//*[contains(text(), 'Password Request')]"));
		if (allMessages.isEmpty()) {
			System.out.println("Test not passed");
		} else {
			System.out.println("Test passed");
		}

	}
	
	
	public  void activateClient() throws InterruptedException {
		getMenu().click();
		Thread.sleep(2000);
		getmanageClients().click();
		Thread.sleep(1000);
		getselectingClient().click();
		Thread.sleep(1000);
		getselectingInactiveClient().click();
		geteditInactiveClient().click();
		Thread.sleep(12000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)");
		getconfigofClient().click();
		js.executeScript("window.scrollBy(0,250)");
		Thread.sleep(12000);
		getassociateBranch().click();
		getselectAssociateBranch().click();
		Thread.sleep(12000);
		getloginWhitelistedCountries().click();
		Thread.sleep(12000);
		getselectloginWhitelistedCountries().click();
		Thread.sleep(12000);
		 getselectcountryloginWhitelistedCountries().click();
		js.executeScript("window.scrollBy(0,250)");
		getselectSupplier().click();
		getactivateClient().click();
		Thread.sleep(12000);
		getupdateClient().click();
		Thread.sleep(12000);
		
	}



}
