package com.epam.training.gyongyi.po;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EbayTest {

	
	@Test
	public void searchTest(){
		System.out.println("Hello ");
		WebDriver ffDriver= new FirefoxDriver();
		ffDriver.manage().window().maximize();
		ffDriver.get("http://www.ebay.com/");
		
		EbayHomePage e = new EbayHomePage(ffDriver);
		e.search("watch");
		e.clickOnSearchButton();
		
		EbaySearchPage ebaySearchPage= new EbaySearchPage(ffDriver);
		ebaySearchPage.clickOnItem("Military");
		
		EbayResultsPage ebayResultsPage= new EbayResultsPage(ffDriver);
		ebayResultsPage.addQuantity("2");
		ebayResultsPage.clickOnBuyitNoWButton();
		
	}
	
}
