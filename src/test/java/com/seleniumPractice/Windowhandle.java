package com.seleniumPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windowhandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//getWindowHandle....
		
		//getWindowHandles...
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		Set<String> handles=driver.getWindowHandles();
		
		//1. Iterator()
		/*
		Iterator<String> it=handles.iterator();
		String parentID=it.next();
		String childID=it.next();
		System.out.println(" Parent ID: " +parentID);
		System.out.println(" Child ID: " +childID);
		*/
		
		//2. By using list/ArrayList
		
		List<String> a1=new ArrayList(handles);
		
		/*String parentID=a1.get(0);
		String childID=a1.get(1);
		
		System.out.println(" Parent ID: " +parentID);
		System.out.println(" Child ID: " +childID);
		
		*/
		//How to use windowID's for switching...
		
		/*driver.switchTo().window(parentID);
		System.out.println(" Parent window..." +driver.getTitle());
		driver.switchTo().window(childID);
		System.out.println(" Child window..." +driver.getTitle());

		*/
		//For each loop....
		
		
		for(String winid:a1)
		{
			String title=driver.switchTo().window(winid).getTitle();
			System.out.println(title);
		}
		
		
		
		
		
		
	}

}
