package Testcomponents;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calender {
                 public static void main (String[] args)
                 {
                	 System.setProperty("webdriver.chrome.driver","C://work//chromedriver.exe");
                	 ChromeDriver driver=new ChromeDriver();
                	 driver.get("www.google.com");
                	 //september 10
                	 driver.findElement(By.xpath("//input[@id='departuredate_1']")).click();
                	 
                	 while(!driver.findElement(By.xpath("//body[@class='hideHeaderMsg']/div[@id='datepickers-container']/div[1]/nav[1]/div[2]")).getText().contains("September"))
                			 {
                				 driver.findElement(By.xpath("//body[@class='hideHeaderMsg']/div[@id='datepickers-container']/div[1]/nav[1]/div[3]/*[1]")).click();
                			 }
                	 
                	 List<WebElement> dates =driver.findElements(By.className("datepicker--cell datepicker--cell-day"));
                	 int count=driver.findElements(By.className("datepicker--cell datepicker--cell-day")).size();
                	 
                	 for (int i=0;i<count;i++)
                	 {
                		 String text=driver.findElements(By.className("datepicker--cell datepicker--cell-day")).get(i).getText();
                		 if(text.equalsIgnoreCase("23"))
                		 {
                			 driver.findElements(By.className("datepicker--cell datepicker--cell-day")).get(i).click();
                			 break;
                		 }
                		 
                	 }
                	 
                 }
}

/* public void calender() throws InterruptedException {
		 driver.findElement(By.xpath("//input[@id='departuredate_1']")).click();
   	 
   	 while(!driver.findElement(By.xpath("//body[@class='hideHeaderMsg']/div[@id='datepickers-container']/div[1]/nav[1]/div[2]")).getText().contains("September"))
   			 {
   				Thread.sleep(5000);
   				driver.findElement(By.xpath("//body[@class='hideHeaderMsg']/div[@id='datepickers-container']/div[1]/nav[1]/div[3]/*[1]")).click();
   			 }
   	 
   	 List<WebElement> dates =driver.findElements(By.xpath("//body[@class='hideHeaderMsg']/div[@id='datepickers-container']/div[1]/div[1]/div[1]/div[2]/div[26]"));
   	 int count=driver.findElements(By.xpath("//body[@class='hideHeaderMsg']/div[@id='datepickers-container']/div[1]/div[1]/div[1]/div[2]/div[26]")).size();
   	 
   	 for (int i=0;i<count;i++)
   	 {
   		 Thread.sleep(5000);
   		 String text=driver.findElements(By.xpath("//body[@class='hideHeaderMsg']/div[@id='datepickers-container']/div[1]/div[1]/div[1]/div[2]/div[26]")).get(i).getText();
   		 if(text.equalsIgnoreCase("23"))
   		 {
   			 Thread.sleep(5000);
   			 driver.findElements(By.xpath("//body[@class='hideHeaderMsg']/div[@id='datepickers-container']/div[1]/div[1]/div[1]/div[2]/div[26]")).get(i).click();
   			 System.out.println(text);
   			 break;
   		 }
   		 
   	 }
	} */
