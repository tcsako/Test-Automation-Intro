package com.epam.training.po.example;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.epam.training.po.example.HomePage;
import com.epam.training.po.example.SearchPage;
import com.epam.training.po.example.SearchResultsPage;

/**
 * This class represents the Test Class of the PageObject Framework
 * 
 * @author Nandor_Rigo
 *
 */

public class PageObjectTest {

	private static WebDriver driver;

	private HomePage homePage;
	private SearchPage searchPage;
	private SearchResultsPage searchResultsPage;

	@Before
	public void setUp() {
		driver = new FirefoxDriver();
		driver.get("https://www.ebay.com");
		driver.manage().window().maximize();
		homePage = new HomePage(driver);
		searchPage = new SearchPage(driver);
		searchResultsPage = new SearchResultsPage(driver);
	}

	@After
//	public void tearDown() {
//		driver.quit();
//	}

	@Test
	public void advancedSearchTest() {
		homePage.clickOnAdvancedSearchLink();
		searchPage.fillSearchForm("watch", "Price + Shipping: lowest first");
		searchPage.submitForm();
		Assert.assertTrue("Check if the Search Result page is opened.", searchResultsPage.isResultPageOpened());
	}
}
