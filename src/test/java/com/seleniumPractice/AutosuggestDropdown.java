package com.seleniumPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutosuggestDropdown {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.bing.com/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("sb_form_q")).sendKeys("Selenium");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[contains(@class, 'sa_dg')]")));

        // Find the autosuggest suggestions
        List<WebElement> list = driver.findElements(By.xpath("//ul[contains(@class, 'sa_dg')]/li"));

		//List<WebElement> list=driver.findElements(By.xpath("//li[@class='sa_sg']//span"));
		System.out.println(list.size());
		
		
		
		
		
		
		
		
		
	}

}
