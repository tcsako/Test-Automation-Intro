package com.epam.training.gyongyi.po3;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EbayGardenTest {
	@Test
	public void test() {
		WebDriver ffDriver = new FirefoxDriver();
		ffDriver.manage().window().maximize();
		ffDriver.get("http://www.ebay.com/");
		
		EbayHomeGarden e = new EbayHomeGarden(ffDriver);
		e.clickOnHomeAndGarden();
		
		EbayBedding f= new EbayBedding(ffDriver);
		f.clickOnBedding();
		
		EbayResult g= new EbayResult(ffDriver);
		g.clickOnBuyItNow();
		g.clickOnHotelCollection();
	}
	

}
