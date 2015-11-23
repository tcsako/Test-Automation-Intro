package com.epam.training.gyongyi.po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EbaySearchPage {
	private WebDriver webDriver;

	public EbaySearchPage(WebDriver driver) {
		webDriver = driver;
		PageFactory.initElements(webDriver, this);

	}

	public void clickOnItem(String linktext) {

		WebElement resultItem = webDriver.findElement(By.partialLinkText(linktext));
		resultItem.click();
	}
}
