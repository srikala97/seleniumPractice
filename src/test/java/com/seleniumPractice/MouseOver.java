package com.seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		WebElement desktopmenu=driver.findElement(By.xpath("//a[text()='Desktops']"));
		WebElement pc= driver.findElement(By.xpath("//a[text()='PC (0)']"));
		Actions act=new Actions(driver);
		act.moveToElement(desktopmenu).moveToElement(pc).click().perform();
		
		
		
		
	}

}
