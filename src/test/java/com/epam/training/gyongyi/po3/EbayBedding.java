package com.epam.training.gyongyi.po3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EbayBedding {
	private WebDriver webDriver;
	@FindBy(partialLinkText = "Bedding")
	private WebElement beddinglink;

	public EbayBedding(WebDriver driver) {
		webDriver = driver;
		PageFactory.initElements(webDriver, this);
	}
	public void clickOnBedding(){
		beddinglink.click();
	}
}
