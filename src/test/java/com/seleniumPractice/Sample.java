package com.seleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {

	public static void main(String[] args) {
		

		//System.setProperty("webdriver.chrome.driver","C:\\Users\\srika\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriverManager.chromedriver().setup();
		
		//System.setProperty("webdriver.edge.driver", "C:\\Users\\srika\\Downloads\\edgedriver_win64\\msedgedriver.exe");

		//WebDriverManager.edgedriver().setup();
		
		
		WebDriver driver= new ChromeDriver();
		//WebDriver driver=new EdgeDriver();
		driver.get("https://www.google.com");
		System.out.println("Title of the page..." +driver.getTitle());
		System.out.println("Current url of the page....."+driver.getCurrentUrl());
		//System.out.println("Page source...."+driver.getPageSource());
		
		
		driver.close();

        
        
		
		
	}

}
