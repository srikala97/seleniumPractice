package com.seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiselectDropdown {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		WebElement multi=driver.findElement(By.id("ide"));
		Select options=new Select(multi);
		Thread.sleep(3000);
		options.selectByIndex(1);
		options.selectByValue("nb");
		List<WebElement> alloptions=options.getOptions();
		for( WebElement e:alloptions)
		{
			System.out.println(e.getText());
		}
		System.out.println(options.getFirstSelectedOption().getText());
		
		
		
	}

}
