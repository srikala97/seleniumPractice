package com.seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		//Xpath with single attribute....
		//driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("iphone");
		
		//Xpath with multiple attribute....
		//driver.findElement(By.xpath("//input[@placeholder='Search'][@name='search']")).sendKeys("iphone");
		
		//Xpath with 'and' 'or' operator....
		//driver.findElement(By.xpath("//input[@placeholder='Search' and @name='search']")).sendKeys("iphone");
		
		
		//xpath with innertext- text()
		//driver.findElement(By.xpath("//a[text()='Components']")).click();
		
		//Xpath with contains()
		//driver.findElement(By.xpath("//input[contains(@placeholder,'Search')]")).sendKeys("iphone");
		
		//Xpath with startwith()
		//driver.findElement(By.xpath("//input[starts-with(@placeholder,'Search')]")).sendKeys("iphone");
		
		
		//Chainxpath(absoultexpath & relativexpath)
		Boolean text=driver.findElement(By.xpath("//div[@id='logo']/a/img")).isDisplayed();
		System.out.println(text);
		
		
		
		
		
		
		
		
	}

}
