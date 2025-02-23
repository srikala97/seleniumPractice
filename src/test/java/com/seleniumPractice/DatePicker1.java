package com.seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker1 {

	
	static void FutureDate(WebDriver driver,String year,String month,String date)
	{
		while(true)
	    {
	    	
	    	String currentmonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
	    	String currentyear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
	    	
	    	if(currentmonth.equals(month) && currentyear.equals(year))
	    	{
	    		break;
	    	}
	    	
	    	driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); //next
	    	
	    }
		
      List<WebElement> dates= driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody/tr/td//a"));
	    
	    for(WebElement currentdate:dates)
	    {
	    	if(currentdate.getText().equals(date))
	    	{
	    		currentdate.click();
	    		break;
	    	}
	    }
		
		
	}
	
	
	
	static void PastDate(WebDriver driver,String year,String month,String date)
	{
		
		while(true)
	    {
	    	
	    	String currentmonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
	    	String currentyear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
	    	
	    	if(currentmonth.equals(month) && currentyear.equals(year))
	    	{
	    		break;
	    	}
	    	
	    	driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();//prev
	    	
	    }
		
      List<WebElement> dates= driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody/tr/td//a"));
	    
	    for(WebElement currentdate:dates)
	    {
	    	if(currentdate.getText().equals(date))
	    	{
	    		currentdate.click();
	    		break;
	    	}
	    }
			
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		
		//method 1 - using sendKeys();
	    //driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("01/08/2025");
		
		//method 2- using date picker
	    
	    driver.findElement(By.xpath("//input[@id='datepicker']")).click();
	    String year="2024";
	    String month="May";
	    String date="16";
	    
	    //FutureDate(driver,year,month,date);
	    PastDate(driver,year,month,date);
	    
	   
	    
	    
	    
		
	
}
}