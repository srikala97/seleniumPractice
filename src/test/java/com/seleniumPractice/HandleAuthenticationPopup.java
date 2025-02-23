package com.seleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAuthenticationPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		//driver.get("http://the-internet.herokuapp.com/basic_auth");
		
		//http://username:password@http://the-internet.herokuapp.com/basic_auth
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		//driver.get("https://www.amazon.in/");
		//driver.get("http://admin:admin@https://www.amazon.in/");
		
		
		
		
		
		
	}

}
