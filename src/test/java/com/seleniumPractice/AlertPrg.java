package com.seleniumPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPrg {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		driver.manage().window().maximize();
		/*
		//Simple Alert....
		driver.findElement(By.id("alertBox")).click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
		System.out.println(driver.findElement(By.id("output")).getText());
		
		
		//Confirmation Alert....
		driver.findElement(By.id("confirmBox")).click();
		Thread.sleep(2000);
		Alert comfirmationAlert=driver.switchTo().alert();
		comfirmationAlert.accept();
		System.out.println(driver.findElement(By.id("output")).getText());
		*/
		
		//Prompt Alert...
		driver.findElement(By.id("promptBox")).click();
		Thread.sleep(3000);
		Alert prompt=driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println(prompt.getText());
		prompt.sendKeys("Srikala");
		prompt.accept();
		System.out.println(driver.findElement(By.id("output")).getText());
		
		
		
		
	}

}
