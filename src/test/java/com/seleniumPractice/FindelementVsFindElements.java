package com.seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindelementVsFindElements {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		WebElement search =driver.findElement(By.xpath("(//input[@id='small-searchterms'])[1]"));
        search.sendKeys("phone");
        List<WebElement>  elements = driver.findElements(By.xpath("//div[@class='footer-upper']//a"));
		System.out.println(elements.size());
		
		for(WebElement e:elements)
		{
			System.out.println(e.getText());
		}
		driver.close();
		
	}

}
