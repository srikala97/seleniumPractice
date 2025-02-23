package com.seleniumPractice;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Brokenlink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 WebDriverManager.chromedriver().setup();
	      WebDriver driver=new ChromeDriver();
	      driver.get("http://www.deadlinkcity.com/");
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	      driver.manage().window().maximize();
	     List<WebElement> links=driver.findElements(By.tagName("a"));
	     System.out.println(links.size());
	     int brokenlinks=0;
	     for(WebElement link:links)
	     {
	      
		String hrefattribute=link.getDomAttribute("href");
	     
	      // System.out.println(hrefattribute);
		if(hrefattribute==null || hrefattribute.isEmpty())
		{
			System.out.println("href attribute value is null or empty. so not possible to check...");
			continue;
		}
		
		
		//hit url to server...
	     try
	     {
		 URL linkURL = new URL(hrefattribute);
	     HttpURLConnection conn=(HttpURLConnection) linkURL.openConnection();
	     conn.connect();
		
	    int responseCode = conn.getResponseCode();
	    if (responseCode >= 400) {
            System.out.println(hrefattribute + " is a broken link with response code: " + responseCode);
            brokenlinks++;
        } else {
            System.out.println(hrefattribute + " is a valid link with response code: " + responseCode);
        }
	    
	     }
	     
	     catch(Exception e)
	     {
	    	 System.out.println("Exception while checking the link: " + hrefattribute);
             e.printStackTrace();
	     }
	     
	     }
		
	     System.out.println(brokenlinks);
	     
	     
	     
	}

}
