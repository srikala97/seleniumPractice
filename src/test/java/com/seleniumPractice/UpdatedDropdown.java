package com.seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.booking.com/");
		//driver.get("https://www.spicejet.com");
		Thread.sleep(2000);
		//driver.findElement(By.id("divpaxinfo")).click();
		
		driver.findElement(By.id("b2indexPage")).click();
		
		
	}

}
