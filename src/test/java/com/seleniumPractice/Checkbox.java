package com.seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkbox {

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		driver.manage().window().maximize();
		
		//1. select specific checkbox...
	//	driver.findElement(By.id("hobbies")).click();
		
		//2. want to see check all the checkboxes...
		
		List<WebElement> all=driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		System.out.println(all.size());
		int number=all.size();
		for(int i=0;i<number;i++)
		{
			all.get(i).click();
		}
		//3. Multiple checkboxes by choice....
		
		
		
		
		
		
		
		
		
		
	}

}
