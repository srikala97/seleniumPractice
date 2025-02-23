package com.seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkbox1 {

	public static void main(String[] args) throws InterruptedException
	
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//Select specific element.....
		//driver.findElement(By.cssSelector("#sunday")).click();
		List<WebElement> ele=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox' ]"));
		
		//System.out.println(ele.size());
		
		//Selecting all checkboxes....
		/*
		for(int i=0;i<ele.size();i++)
		{
			ele.get(i).click();
		}
		
		*/
		
		//Select last 3 checkboxes...
		//Total no.of checkboxes-how many checkboxes want to select= starting index...
		//7-3=4
		/*
		for(int i=4;i<ele.size();i++)
		{
			ele.get(i).click();
		}
		*/
		//Select first 3 checkboxes
		for(int i=0;i<3;i++)
		{
			ele.get(i).click();
		}
		Thread.sleep(200);
		for(int i=0;i<ele.size();i++)
		{
			if(ele.get(i).isSelected())
			{
			ele.get(i).click();
			}
		}
		
		
		
		
	}
	
	
	
}
