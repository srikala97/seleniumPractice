package com.seleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.get("https://testautomationpractice.blogspot.com/");
		driver.get("https://demo.opencart.com/admin/");
		driver.manage().window().maximize();
		//How many rows in a table...
		
		WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
		username.clear();
		username.sendKeys("demo");
		
		WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
		password.clear();
		password.sendKeys("demo");
		
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		
	}

}
