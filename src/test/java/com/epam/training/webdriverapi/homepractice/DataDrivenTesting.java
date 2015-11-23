package com.epam.training.webdriverapi.homepractice;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * This class represents how to use Data Driven Testing in practice...
 * The most important experiences that always use org.junit.runner and runners
 * with Parameterized class!!
 * @author Imre_Papai
 *
 */
@RunWith(Parameterized.class)
public class DataDrivenTesting {
	private WebDriver driver;
	@Parameter(0)
    public String searchText;
    		
	@FindBy(id = "sq")
	private WebElement searchBox;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		PageFactory.initElements(driver,this);
		driver.manage().window().maximize();
	}

	@Test
	public void test() {
		driver.get("http://szeged.hu/");
		searchBox.sendKeys(searchText);
		searchBox.submit();
		new WebDriverWait(driver,10).until(ExpectedConditions.titleContains(searchText));
	    Assert.assertTrue(driver.getTitle().contains(searchText));
	}
	@Parameters
	 public static Object[][] searchParams() {
    	return new Object[][] {
    		{"EPAM"},
    		{"NNG"},
      	}; 
		
	}
	@After
	public void tearDown(){
		driver.quit();
	}
}
