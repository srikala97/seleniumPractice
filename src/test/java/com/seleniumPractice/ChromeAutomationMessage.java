package com.seleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeAutomationMessage {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeOptions option=new ChromeOptions();
		option.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
	
		WebDriver driver=new ChromeDriver(option);
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.quit();
		
		
	}

}
