package com.seleniumPractice;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Implicitwait {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		driver.manage().window().maximize();
		
		//Implicitwait(long,TimeUnit): It is deprecated in latest version of java 8.0 .
		//Instead we use the Duration.Seconds in latest version java 8.0
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("btn1")).click();
		driver.findElement(By.id("txt1")).sendKeys("Hello");
		driver.quit();
		
		
		
		
	}

}
