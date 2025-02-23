package com.seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath1 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		driver.manage().window().maximize();
		
		/*
		WebElement ele=driver.findElement(By.xpath("//td[text()='2000']"));
		System.out.println(ele.getText());
		WebElement ele2=driver.findElement(By.xpath("//a[text()='Sign in into account']"));
		System.out.println(ele2.getText());
		WebElement ele3=driver.findElement(By.xpath("//label[text()='Last Name']"));
		System.out.println(ele3.getText());
		*/
		driver.findElement(By.xpath("//input[@name='name'][2]")).sendKeys("srikala");
		System.out.println(driver.findElement(By.xpath("//label[normalize-space(text())='First Name']")).getText());
		
		
	}

}
