package com.epam.training.gyongyi.po3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EbayResult {
	private WebDriver webDriver;
	@FindBy(partialLinkText="Buy It Now")
	private WebElement buyItNow;
	@FindBy(partialLinkText="Hotel Collection")
	private WebElement hotelCollection;

	public EbayResult(WebDriver driver) {
		webDriver = driver;
		PageFactory.initElements(webDriver, this);
	}
	public void clickOnBuyItNow(){
		buyItNow.click();
	}
	public void clickOnHotelCollection(){
		hotelCollection.click();
	}
}
