package com.seleniumPractice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleAlertUsingExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(200));
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Alert myalert=wait.until(ExpectedConditions.alertIsPresent());
		myalert.accept();
		
		
		
		
		
		
	}

}
