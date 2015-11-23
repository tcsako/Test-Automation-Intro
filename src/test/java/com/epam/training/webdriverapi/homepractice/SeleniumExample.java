package com.epam.training.webdriverapi.homepractice;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
/**
 * This class represents how to use training basic knowledge at home
 * It was the first step when I used my own knowledge. 
 * @author Imre_Papai
 * 22.11.2015
 */
public class SeleniumExample {
	public static String searchText;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	//1. step - Set up driver	
	WebDriver driver = new FirefoxDriver();
	
	//2. step - Open url and maximize current window
	driver.get("https://www.google.com");
	driver.manage().window().maximize();
	
	//3. step - Find Webelements on webpage
	searchText = "Dr. Morvai Gizella";	
	WebElement searchBox = driver.findElement(By.id("lst-ib"));
	searchBox.clear();
	searchBox.sendKeys(searchText);
	
	WebElement searchButton = driver.findElement(By.name("btnG"));
	searchButton.click();
	System.out.println("Current Page Title: "+driver.getTitle());

	new WebDriverWait(driver , 30).until(ExpectedConditions.titleContains(searchText));
    Assert.assertTrue(driver.getTitle().contains(searchText));
 
	//Close driver and current window
	driver.quit();
	}
	
}


