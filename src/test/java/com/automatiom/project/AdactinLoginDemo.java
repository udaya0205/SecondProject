package com.automatiom.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactinLoginDemo {
	
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://adactinhotelapp.com/");
	    WebElement username  = driver.findElement(By.id("username"));
	    username.sendKeys("udaydhatchan");
	    
	    driver.findElement(By.name("password")).sendKeys("udaysona0205");
	    Thread.sleep(3000);
	    driver.findElement(By.name("login")).click();
	    
	    WebElement dropdown1 = driver.findElement(By.id("location"));
	    Select s1 = new Select (dropdown1);
	    s1.selectByValue("Brisbane");
	    WebElement dropdown2 = driver.findElement(By.id("hotels"));
	    Select s2 = new Select(dropdown2);
	    s2.selectByValue("Hotel Sunshine");
	    WebElement dropdown3 = driver.findElement(By.id("room_type"));
	    Select s3 = new Select (dropdown3);
	    s3.selectByValue("Double");
	    WebElement dropdown4 = driver.findElement(By.id("room_nos"));
	    Select s4 = new Select (dropdown4);
	    s4.selectByValue("3");
	    
	    
	    WebElement dropdown7 = driver.findElement(By.id("adult_room"));
	    Select s7 = new Select (dropdown7);
	    s7.selectByValue("3");
	    WebElement dropdown8 = driver.findElement(By.id("child_room"));
	    Select s8 = new Select (dropdown8);
	    s8.selectByValue("4");
	    Thread.sleep(2000);
	    driver.findElement(By.name("Submit")).click();
	    driver.findElement(By.id("radiobutton_0")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.name("continue")).click();
	    Thread.sleep(2000);

	    driver.findElement(By.name("first_name")).sendKeys("uday");

	    driver.findElement(By.name("last_name")).sendKeys("prasad");
	    driver.findElement(By.name("address")).sendKeys("no.33 abbu bubbaiyar st gym");
	    driver.findElement(By.id("cc_num")).sendKeys("9876543210235789");
	    
	    WebElement dropdown9 = driver.findElement(By.id("cc_type"));
	    Select s9 = new Select (dropdown9);
	    s9.selectByValue("VISA");
	    WebElement dropdown10 = driver.findElement(By.name("cc_exp_month"));
	    Select s10 = new Select (dropdown10);
	    s10.selectByValue("11");
	    WebElement dropdown11 = driver.findElement(By.name("cc_exp_year"));
	    Select s11 = new Select (dropdown11);
	    s11.selectByValue("2013");
	    
	    driver.findElement(By.id("cc_cvv")).sendKeys("099");
	    driver.findElement(By.id("book_now")).click();
	   
	   
	    
	    


	}
	
       
		
	
	
	
}
