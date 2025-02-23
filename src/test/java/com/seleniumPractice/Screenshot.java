package com.seleniumPractice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {

	public static void main(String[] args) throws IOException, InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		//driver.findElement(By.xpath("//a[@id='navbtn_certified']")).click();
		
		//Capturing of screenshot of fullpage....
		/*TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File trg=new File(".//Screenshot//image1.png");
		FileUtils.copyFile(src, trg);
	    driver.quit();
		
		
		//Capturing the screenshot of portion of page...
	    
	    WebElement ele= driver.findElement(By.className("tnb-services-headlines"));
	    File src= ele.getScreenshotAs(OutputType.FILE);
	    File trg=new File(".//Screenshot//image2.png");
	    FileUtils.copyFile(src, trg);
	    driver.quit();
	    
		*/
		
	    //Capturing the screenshot of a webelement...
	    Thread.sleep(2000);
	    WebElement element=driver.findElement(By.xpath("//i[@class='fa fa-logo ws-hover-text-green']"));
	    File src= element.getScreenshotAs(OutputType.FILE);
	    File trg=new File(".//Screenshot//image3.png");
	    FileUtils.copyFile(src, trg);
	    driver.quit();
	    
	    
		
	}

}
