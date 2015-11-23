package com.epam.training.gyongyi.po3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EbayHomeGarden {
	private WebDriver webDriver;
	@FindBy(partialLinkText="Home & Garden")
	private WebElement homeAndGardenLink;

	public EbayHomeGarden(WebDriver driver) {
		webDriver = driver;
		PageFactory.initElements(webDriver, this);
	}
	
	public void clickOnHomeAndGarden(){
		homeAndGardenLink.click();
	}
}
