package com.seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTextVsgetAttribute {

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login");
		
		//clear()
		
		WebElement emailinputbox=driver.findElement(By.id("Email"));
		//emailinputbox.clear();
		
		//GetAttribute()
		System.out.println(emailinputbox.getAttribute("value"));
		
		//getText()
		WebElement login =driver.findElement(By.xpath("//button[normalize-space()='Log in']"));
		System.out.println(login.getText());
		
		
		
		
		
		
		
		
		
	}

}
