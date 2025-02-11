package loginuat;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;



public class LoginLibUat extends LoginLocatorUat {

	public static WebDriver driver;

	public LoginLibUat(WebDriver driver) {

		LoginLibUat.driver = driver;
		PageFactory.initElements(driver, this);

	}

	/**
	 * this method is used to navigate to agent portal
	 * 
	 * @param url
	 *            : agent portal to be opened
	 * @throws Exception
	 * @throws IOException
	 */
	public static void navigateToAgentPortal(String agentUrl) throws Exception {
		{
			driver.get(agentUrl);
			System.out.println("application is opening");
		}

	}

	/**
	 * this method is used to login to application and user should be able to login
	 * 
	 * @throws InterruptedException
	 */
	public static void validlogin() throws InterruptedException {
		getuserNameBox().sendKeys("babar@gmal.com");
		getpasswordBox().sendKeys("Azuga@123");
		/*	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
         wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(
                 By.xpath("//iframe[starts-with(@name, 'a-') and starts-with(@src, 'https://www.google.com/recaptcha')]")));
        
         wait.until(ExpectedConditions.elementToBeClickable(
                     By.xpath("//div[@class='recaptcha-checkbox-border']"))).click();

         System.out.println("Clicked the checkbox");*/
	
		getloginButton().click(); 
		Thread.sleep(7000);
	}
	
	public static void invalidlogin() throws InterruptedException {
		
	/*	WebElement loginDropdown= driver.findElement(By.xpath("//body[contains(@class,'homeBody')]/div[contains(@class,'bodyMainWrapper')]/section[contains(@class,'loginSignUpSection signInSection')]/div[contains(@class,'container-fluid')]/div[contains(@class,'row align-items-center')]/div[contains(@class,'col-12 col-lg-5 col-xl-4 loginFormMainCol')]/div[contains(@class,'columnBlock')]/div[contains(@class,'row')]/form[@id='LoginForm']/div[contains(@class,'businessLoginWrap')]/div[contains(@class,'loginFormMainBox')]/div[contains(@class,'loginFormBox columnBlock')]/div[contains(@class,'form-group slectCountryCol')]/div[contains(@class,'d-flex align-items-center')]/span[contains(@class,'select2 select2-container select2-container--default select2-container--above select2-container--focus')]/span[contains(@class,'selection')]/span[contains(@class,'select2-selection select2-selection--single')]/span[@id='select2-countries-container']/span[1]"));
		
		 Select sc = new Select(loginDropdown); 
		 sc.selectByIndex(0); */
		 
		getuserNameBox().sendKeys("mera6@gmail.com");
		getpasswordBox().sendKeys("Azug6tr5");
		
	/*	WebElement loginDropdown= driver.findElement(By.xpath("/html[1]/body[1]/div[2]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[2]/div[1]/span[1]/span[1]/span[1]/span[1]/span[1]"));
		
		 Select sc = new Select(loginDropdown); 
		 sc.selectByIndex(0);  */
		 
		getloginButton().click();
	}

	public static void agentLogout() throws InterruptedException {
		getmyProfileButton().click();
		 Thread.sleep(5000);
		//getlogoutButton().click();
		 getindialogoutButton().click();
		 
	}
	
	public static void agentForgotpassword()  {
		getforgotpassword().click();
		getforgotpasswordEmail().sendKeys("musk82575@gmail.com");

		getforgotpasswordSubmit().click();
	}
	
	 public void forgotPasswordEmailVerification() throws InterruptedException

	  	{
	  		
	  		
	  		driver.get("https://accounts.google.com/InteractiveLogin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F%3Fhl%3Den&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F%3Fhl%3Den&hl=en&osid=1&passive=1209600&service=mail&ifkv=AXo7B7X0I1jfR2r4b8bH44QePiWcfzFdq4k3b_tltjb-rKcveAcR-gQsPtFGBM7pLrLlK3UnvxA2dA&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	  		
	  		getEmail().sendKeys("musk82575@gmail.com");

	  		getNext().click();
	  		Thread.sleep(20000);
	  		
	  		getPassword().sendKeys("Azuga@123");
	  		Thread.sleep(3000);
	  		getNext().click();
	  		
	  		Thread.sleep(6000);
	  		getInbox().click();
	  		
	  		Thread.sleep(7000);
	  		List<WebElement> allMessages = driver.findElements(By.xpath("//*[contains(text(), 'Password Request')]"));
	  	      if(allMessages.isEmpty()) {
	  	    	  System.out.println("Test not passed");
	  	      }else {
	  	    	  System.out.println("Test passed");}

	  	} 
	 
	 public void clearCache() throws AWTException, InterruptedException
		{
			
			driver.get("http://uat.dev.flyhub.com/login");
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
			}

}
