package com.epam.training.gyongyi.po2;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EbayTest2 {
	@Test
	public void searchTest() {
		WebDriver ffDriver = new FirefoxDriver();
		ffDriver.manage().window().maximize();
		ffDriver.get("http://www.ebay.com/");

		Ebay2HomePage e = new Ebay2HomePage(ffDriver);
		e.search("dog");
		e.clickOnSearchButton();

		Ebay2SearchPage f = new Ebay2SearchPage(ffDriver);
		f.clickOnItem("Summer Cool Small Dog Cat Puppy Vest T-Shirt Coat Pet Clothes Apparel Costumes");

		Ebay2ResultPage g = new Ebay2ResultPage(ffDriver);
		g.selectSize("XS");
		g.clickOnBuyItNow();
	}

}
