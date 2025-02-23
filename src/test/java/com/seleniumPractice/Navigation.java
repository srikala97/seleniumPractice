package com.seleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://snapdeal.com");
		driver.navigate().to("https://www.flipkart.com");
		//driver.get("https://www.flipkart.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		
		
	}

}
