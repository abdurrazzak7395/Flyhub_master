package web;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Testcomponents.BaseTest;

public class abcd
{
	@Test
    public void abcde()
    {
        System.out.println( "Hello Shashi!" );
    }
}
class a extends BaseTest{
	
public void main (WebDriver driver)
{
	System.out.println( "this is driver" );
	
	System.out.println( "this is driver macha" );
	driver.close();
	
	}
}

class b extends BaseTest{
	
public void main (WebDriver driver)
{
	
	driver.quit();
	
	}
}