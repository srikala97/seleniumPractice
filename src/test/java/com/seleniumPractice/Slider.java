package com.seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Slider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI");
		driver.manage().window().maximize();
		WebElement min_slider=driver.findElement(By.xpath("//body/div[3]/div[2]/span[1]"));
		System.out.println("Location of the min slider..."+min_slider.getLocation());
		System.out.println("Height and width of the element..."+min_slider.getSize());
		
		//Location of the min slider...(59, 293)
		//Height and width of the element...(21, 21)
		
		/*
		Actions act=new Actions(driver);
		act.dragAndDropBy(min_slider, 100, 0).perform();
		System.out.println("Location of the min slider..."+min_slider.getLocation());
		System.out.println("Height and width of the element..."+min_slider.getSize());
		
	   WebElement max_slider= driver.findElement(By.xpath("//div[@id='slider-range']//span[2]"));
		act.dragAndDropBy(max_slider, -100, 0).perform();
	   
	   */
		
	}

}
