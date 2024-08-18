package Testcomponents;

import java.util.Arrays;
import java.util.LinkedList;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Pattern;
import com.sun.org.apache.xerces.internal.impl.xs.identity.Selector.Matcher;

/*package Testcomponents;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class captcha { 

public static void main(String[] args) { 

System.setProperty("webdriver.chrome.driver", "C:\\Utility\\BrowserDrivers\\chromedriver.exe"); 

ChromeOptions options = new ChromeOptions();

options.addArguments("start-maximized");

options.addArguments("disable-infobars");

options.addArguments("--disable-extensions"); 

WebDriver driver = new ChromeDriver(options);

driver.get("https://rsps100.com/vote/760"); 

//new WebDriverWait(driver, 10).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[starts-with(@name, 'a-') and starts-with(@src, 'https://www.google.com/recaptcha')]"))); 

//new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.recaptcha-checkbox-checkmark"))).click(); 

} 

}  */

public class captcha { 

public static void main(String[] args) { 
	
	

	 String str = "ADT-40KG<br/>CarryOn :ADT-CARRY7KG 15LB UPTO45LI 115LCM<br/>";      
	    str = str.replaceAll("[^-?0-9]+", " "); 
	    System.out.println(Arrays.asList(str.trim().split(" ")));
		
		
}}



