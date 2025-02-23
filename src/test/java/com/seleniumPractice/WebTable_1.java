package com.seleniumPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable_1 {

	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
	
		List<WebElement> rows=driver.findElements(By.xpath("//table[@id='productTable']//tr"));
		System.out.println(rows.size());
		
		List<WebElement> coln=driver.findElements(By.xpath("//table[@id='productTable']//tr//th"));
		System.out.println(coln.size());
		
		for(int i=1;i<rows.size();i++)
		{
			//if(i>1)
			//{
			for(int j=1;j<=coln.size();j++)
			{
				WebElement s1= driver.findElement(By.xpath("//table[@id='productTable']//tr["+i+"]//td["+j+"]"));
				System.out.print(s1.getText()+"\t");
				
			}
			
			System.out.println();
			}
			
		//}
		
		
		
		
	}
	
	
	
}
