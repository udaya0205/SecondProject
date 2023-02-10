package com.automatiom.project;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InstaLogin {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
	    driver.get("https://www.instagram.com/accounts/login/");
	    WebElement emailtextbox   = driver.findElement(By.name("username"));
	    emailtextbox.sendKeys("UdaySona");
	    
	    driver.findElement(By.name("password")).sendKeys("0205");
	    Thread.sleep(3000);
	    driver.findElement(By.name("login")).click();
	    Thread.sleep(3000);
		
		
	}

}
