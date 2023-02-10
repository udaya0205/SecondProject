package com.automatiom.project;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookLogin {
	
	
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriverManager.edgedriver().setup();
		
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
	    driver.get("https://www.facebook.com/");
	    
	    TakesScreenshot tks = (TakesScreenshot) driver;
	    File tempFile = tks.getScreenshotAs(OutputType.FILE);
	    File permFile = new File("./Screenshots/ErrorSnapShot.png");
	    FileUtils.copyFile(tempFile, permFile);
	    
	    
	    Thread.sleep(2000);
	    driver.get("https://www.instagram.com/accounts/login/");
	    Thread.sleep(2000);
	    driver.get("https://www.google.co.in/");
	    Thread.sleep(2000);
	    driver.navigate().back();
	    Thread.sleep(2000);	    
	    driver.navigate().forward();
	    Thread.sleep(2000);
	    driver.navigate().refresh();
	    Thread.sleep(2000);
	    driver.close()
	    ;
	    
		
	}
	
	
	
	
	

}
