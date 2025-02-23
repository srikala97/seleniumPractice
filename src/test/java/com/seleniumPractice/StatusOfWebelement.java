package com.seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StatusOfWebelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		//driver.close();
		// isDisplayed
		WebElement search=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		System.out.println(search.isDisplayed()); //true
		System.out.println(search.isEnabled());//true
		
		//isSelected()
		
		WebElement gender=driver.findElement(By.xpath("//input[@id='gender-male']"));
		System.out.println(gender.isSelected());
		
		gender.click();
		
		System.out.println(gender.isSelected());

		
	}

}
