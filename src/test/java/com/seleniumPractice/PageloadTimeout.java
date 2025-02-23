package com.seleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageloadTimeout {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		//By default selenium takes 300 sec to load a page....
		//We can restrict the page by give time to load a page is "PageloadTimeout"....
		
		driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		driver.quit();
		
		
		
	}

}
