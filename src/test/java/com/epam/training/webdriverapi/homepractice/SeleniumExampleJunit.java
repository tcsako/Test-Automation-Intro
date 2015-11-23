package com.epam.training.webdriverapi.homepractice;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This class represents how to use FindBy annotation with PageFactory
 * 
 * @author Imre_Papai
 *
 */


public class SeleniumExampleJunit {
	private WebDriver driver;
	
	//I shouln't forget to use PageFactory, because FindBy is not working 
	@FindBy(name = "q")
	private WebElement element;
	
	@Before
	//Set up FireFox driver
	
	public void SetUp(){
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
	
		//Without PageFactory - FindBy is not working 
		PageFactory.initElements(driver, this);

	}
	
	 /**
     * Test: Search for 'EPAM' on www.szeged.hu
     *
     * Steps:
     * 1. Open 'http://www.szeged.hu'
     * 2. Type 'EPAM' into the search input field
     * 3. Submit the form
     * 4. Check whether the title of the browser contains the word 'EPAM'
     */
	@Test
	public void test() {
		//1. Open 'http://www.szeged.hu'
		driver.get("http://szeged.hu/");
		
		//2. Type 'EPAM' into the search input field
		element.sendKeys("EPAM");
		
		//3. Submit the form
		element.submit();
		
		
		//System.out.println("Page title is --> "+driver.getTitle());
		//4. Check whether the title of the browser contains the word 'EPAM'
		Assert.assertEquals("Current result is not equals", "Keresés: EPAM - Szeged.hu", driver.getTitle());
	}
	@After
	//Close current Windows
	public void TearDown(){
		driver.close();
	}
	

}
