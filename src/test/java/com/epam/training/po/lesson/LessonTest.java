package com.epam.training.po.lesson;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LessonTest {

	private static WebDriver driver;
	private HomePage homePage;
	private SearchPage searchPage;

	@Before
	public void setUp() {

		driver = new FirefoxDriver();
		
		//Add URL
		driver.get("https://www.ebay.com");
		
		driver.manage().window().maximize();
		
		homePage = new HomePage(driver);
		searchPage = new SearchPage(driver);

	}
	
	@After
	public void tearDown() {
//		driver.quit();
	}
	
	@Test
	public void navigationTest() {
		homePage.fillSearch("EPAM");
		searchPage = homePage.submitForm();
		Assert.assertEquals("Search page was not loaded properly.", searchPage.getPageTitle() , "EPAM | eBay");
	}

}
