package com.seleniumPractice;

import java.time.Duration;
import java.time.Month;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker2 {

	
	static Month convertMonth(String month)
	{
		
		HashMap<String,Month> monthMap=new HashMap<String,Month>();
		monthMap.put("January", Month.JANUARY);
		monthMap.put("February", Month.FEBRUARY);
		monthMap.put("March", Month.MARCH);
		monthMap.put("April", Month.APRIL);
		monthMap.put("May", Month.MAY);
		monthMap.put("June", Month.JUNE);
		monthMap.put("July", Month.JULY);
		monthMap.put("August", Month.AUGUST);
		monthMap.put("September", Month.SEPTEMBER);
		monthMap.put("November", Month.NOVEMBER);
		monthMap.put("December", Month.DECEMBER);

       Month vmonth=monthMap.get(month);
       
       if(vmonth==null)
       {
    	   System.out.println("Invalid Month...");
       }

    return vmonth;



	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		//Input DOB
		String year="2023";
		String month="May";
		String date="14";
		
		//selection year....
		driver.findElement(By.xpath("//input[@id='txtDate']")).click();
	  WebElement yearDropdown= driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
	   Select s1=new Select(yearDropdown);
	    s1.selectByVisibleText(year);
		
	    //selecting month...
		
	    
	    
	    
	    
		
	}

}
