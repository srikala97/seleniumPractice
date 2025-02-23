package com.seleniumPractice;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.Browser;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingCookie {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		
		//how to capture cookie from browser....
		Set<Cookie> cookie=driver.manage().getCookies();
		System.out.println("Number of cookies....." +cookie.size()); //6
		
		//How to print cookie from browser...
		for(Cookie cookies:cookie)
		{
			System.out.println(cookies.getName()+"     "+cookies.getValue());
		}
		
		//How to add cookie to the browser...
		Cookie cookieObj=new Cookie("myname:","12345");
		driver.manage().addCookie(cookieObj);
		
		cookie=driver.manage().getCookies();
		System.out.println("Number of cookies....." +cookie.size()); //7
		
		
		//How to delete the specific  cookie from browser....
		//driver.manage().deleteCookie(cookieObj); //6
		//System.out.println("Number of cookies....." +cookie.size());
		
		//How to delete all cookie from Browser.
		driver.manage().deleteAllCookies();
		cookie=driver.manage().getCookies();
		System.out.println("Number of cookies....." +cookie.size()); //0
		
		
		driver.quit();
		
		
		
	}

}
