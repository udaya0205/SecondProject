package com.automatiom.project;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathLocatersDemo {

	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement SearchBox = driver.findElement(By.xpath("//input[@autocomplete='off']"));
		SearchBox.sendKeys("laptop" , Keys.ENTER);
		
		WebElement MobileSearch = driver.findElement(By.xpath("//a[contains(text(),'Mobiles')]"));
		MobileSearch.click();
		
		
		

	}

}
