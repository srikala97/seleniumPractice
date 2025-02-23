package com.seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		/*
		boolean logo=driver.findElement(By.id("logo")).isDisplayed();
		System.out.println(logo);
		driver.findElement(By.name("search")).sendKeys("iphone");
	    driver.findElement(By.linkText("Tablets")).click();
		driver.findElement(By.partialLinkText("Table")).click();
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		*/
		
	     List<WebElement> link=	driver.findElements(By.className("list-inline-item"));
		System.out.println(link.size());
		
		//driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
