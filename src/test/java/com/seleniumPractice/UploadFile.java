package com.seleniumPractice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadFile {

	public static void main(String[] args) throws InterruptedException, AWTException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.foundit.in/upload");
		driver.findElement(By.xpath("//div[contains(text(),'Upload Resume')]")).click();
		Thread.sleep(2000);
		//if type=file then we can use sendkey() to upload the file...
		
		//Using SendKey() method....
	//	driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\srika\\OneDrive\\Documents\\sri\\myfile.txt");
		
		//if sendKeys() method doesn't work we can use Robot class....
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()",driver.findElement(By.id("file-upload")) );
		
		Thread.sleep(2000);
		
		
		//1. Copy the filepath into click board...
		
		StringSelection filepathselection= new StringSelection("C:\\Users\\srika\\OneDrive\\Documents\\sri\\myfile.txt");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepathselection, null);
		
		
		//2. ctrl+V
		
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		Thread.sleep(2000);
	
		//3. Click on return/Enter.....
		 
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		
		
		
		/*
		//CTRL+V
		Actions act=new Actions(driver);
				act.keyDown(Keys.CONTROL);
				act.sendKeys("v");
				act.keyUp(Keys.CONTROL);
				act.perform();
		
				Thread.sleep(2000);
				
				act.sendKeys(Keys.ENTER).perform();
		
		*/
		
		
	}

}
