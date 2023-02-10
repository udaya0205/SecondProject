package com.automatiom.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdowndemo {

	public static void main(String[] args) throws InterruptedException  {
		
	
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569891%7Cb%7Cfacebook%20signin%7C&placement=&creative=589460569891&keyword=facebook%20signin&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221832%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-3821998899%26loc_physical_ms%3D1007816%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=Cj0KCQiA5NSdBhDfARIsALzs2EDpFIBqH1arCu_gsGnKKLL2tHevf3NdvQzuZxDOWDEBKr3W88U0GJYaAnhwEALw_wcB");
    WebElement dropdown1 = driver.findElement(By.id("day"));
    Select s1 = new Select (dropdown1);
    s1.selectByIndex(7);
    WebElement dropdown2 = driver.findElement(By.id("month"));
    Select s2 = new Select(dropdown2);
    s2.selectByVisibleText("Mar");
    WebElement dropdown3 = driver.findElement(By.id("year"));
    Select s3 = new Select (dropdown3);
    s3.selectByValue("2022");
    Thread.sleep(2000);
    driver.close();
    
    
    

		
		
		
	}

}
