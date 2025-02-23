package com.seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      WebDriverManager.chromedriver().setup();
      WebDriver driver=new ChromeDriver();
     
      
      /*
      driver.get("https://www.redbus.in/");
      driver.manage().window().maximize();
      driver.findElement(By.id("onwardCal")).click();
      String year="2025";
      String month="Mar";
      String date="11";
		
		while(true)
		{
			
		}
		
		*/
      
      driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
      driver.manage().window().maximize();
      driver.findElement(By.id("dob")).click();
      Select month_drp=new Select(driver.findElement(By.className("ui-datepicker-month")));
      month_drp.selectByVisibleText("Feb");
      
      Select year=new Select(driver.findElement(By.className("ui-datepicker-year")));
      year.selectByVisibleText("2025");
      
      String date="17";
     List<WebElement> eles=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
      
      for(WebElement optns:eles)
      {
    	  String dt=optns.getText();
    	  if(dt.equals(date))
    	  {
    		  optns.click();
    		  break;
    	  }
    	  
    	  
    	  
      }
      
      
      
		
	}

}
