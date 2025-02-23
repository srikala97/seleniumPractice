package com.seleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollingPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//scrolling the page by pixel number....
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		/*
		js.executeScript("window.scrollBy(0,1500)", "");
		System.out.println(js.executeScript("return window.pageYOffset;", args));
		
		
		//scrolling the page by till the element is visible
		WebElement ele=driver.findElement(By.xpath("//h2[normalize-space()='Pagination Web Table']"));
		js.executeScript("arguments[0].scrollIntoView();",ele);
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		
		
		//scrolling till the end of the page....
		
			*/
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
	    Thread.sleep(3000);
		
		//scrolling upto initial position...
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		
		
		
	}

}
