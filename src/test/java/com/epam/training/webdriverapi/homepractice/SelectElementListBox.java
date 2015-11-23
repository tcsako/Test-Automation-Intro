package com.epam.training.webdriverapi.homepractice;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectElementListBox {
	
	private WebDriver driver;
	
	@FindBy(id = "qsconnew")
	private WebElement checkBoxNew;
	@FindBy(id = "qsconusd")
	private WebElement checkBoxUsage;
	@FindBy(id = "qsmake")
	private WebElement selectElement;
	@FindBy(id = "qssub")
	private WebElement submitButton;
	
	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		driver.get("http://www.mobile.de/?lang=de");
		PageFactory.initElements(driver, this);
		driver.manage().window().maximize();
		
	}

	@Test
	public void test() {
		
		
		checkBoxNew.click();
		checkBoxUsage.click();
		Select selection = new Select(selectElement);
		selection.selectByIndex(3);
		submitButton.click();
		System.out.println("Webpage title is: "+driver.getTitle());
		new WebDriverWait(driver,100).until(ExpectedConditions.titleContains(driver.getTitle()));
	    Assert.assertTrue(driver.getTitle().contains("Acura Angebote bei mobile.de"));
	}
	@After
	public void tearDown(){
		driver.close();
	}
}
