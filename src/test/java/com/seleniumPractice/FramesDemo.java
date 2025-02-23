package com.seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesDemo {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("name")).sendKeys("Mainframe");
		//driver.findElement(By.id("course"));
		/*
		//Frame1....
		driver.switchTo().frame(driver.findElement(By.id("frm1")));
		
		Select option=new Select(driver.findElement(By.id("course")));
		option.selectByVisibleText("Java");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.findElement(By.id("name")).sendKeys("Back to main frame");
		
		
		
		//Frame2.....
		
		driver.switchTo().frame(driver.findElement(By.id("frm2")));
		driver.findElement(By.id("firstName")).sendKeys("srikala");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("name")).sendKeys("Back to main frame");
		
		*/
		
		// Frame 3(Having of nested Frame....)
		driver.switchTo().frame(driver.findElement(By.id("frm3")));
		driver.switchTo().frame(driver.findElement(By.id("frm1")));
		
		Select option=new Select(driver.findElement(By.id("course")));
		option.selectByVisibleText("Java");
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		driver.findElement(By.id("name")).sendKeys("frame3");
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys("Main page");
		
		
		
		
		
		
		
	}

}
