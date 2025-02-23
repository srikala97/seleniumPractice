package com.seleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavascriptExecutorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement inputbox=driver.findElement(By.xpath("//input[@id='name']"));
		
		//passing the text into inputbox - alternate of sendkeys
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','srikala')",inputbox);
	
		
		
		//clicking the button
		WebElement button=driver.findElement(By.xpath("//input[@id='male']"));
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",button);
		
		
		
		
		
		
		
		
		
		
	}

}
