package com.automatiom.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatersProjectDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://www.facebook.com/");
	    WebElement emailtextbox   = driver.findElement(By.id("email"));
	    emailtextbox.sendKeys("UdaySona");
	    
	    driver.findElement(By.name("pass")).sendKeys("0205");
	    Thread.sleep(3000);
	    driver.findElement(By.name("login")).click();
	    Thread.sleep(3000);
	    
	    driver.get("https://www.instagram.com/accounts/login/");
	    
	  WebElement emailtextbox1 =  driver.findElement(By.name("username"));
	    emailtextbox1.sendKeys("oranium");
	}

}



