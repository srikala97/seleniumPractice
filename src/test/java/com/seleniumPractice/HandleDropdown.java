package com.seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		WebElement allcountry=driver.findElement(By.id("input-country"));
		Select country= new Select(allcountry);
		//Select can be use by SelectByVisibleText(), SelectByValue(), SelectByIndex()
		
		//country.selectByVisibleText("Andorra");
		//country.selectByValue("3");
		//country.selectByIndex(5);
		
		//We can select the options without using "Select Class" 
		
		List<WebElement>alloptions=country.getOptions();
		for(WebElement ele:alloptions )
		{
			if(ele.getText().equals("Argentina"));
			{
				ele.click();
			} 
		}
		
		
		
	}

}
