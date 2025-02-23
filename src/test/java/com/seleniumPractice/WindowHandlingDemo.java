package com.seleniumPractice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandlingDemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		//driver.findElement(By.id("name")).sendKeys("window");
		
		//changing window ...
		String parenthandle=driver.getWindowHandle();
		System.out.println("Parent handle:" +parenthandle);
		driver.findElement(By.id("newWindowBtn")).click();
		Set<String> handle=driver.getWindowHandles();
		for(String e:handle)
		{
			System.out.println(e);
			
			if(!e.equals(parenthandle))
			{
				driver.switchTo().window(e);
				Thread.sleep(2000);
			   driver.findElement(By.id("firstName")).sendKeys("how u doing");
			   driver.close();
			
			}
			
		}
		driver.switchTo().window(parenthandle);
		driver.findElement(By.id("name")).sendKeys("window");
		
		driver.quit();
		
		//Changing of new tab...
		
		
		
		
		
		
	}

}
