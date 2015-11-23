package com.epam.training.gyongyi.po2;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByPartialLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Ebay2SearchPage {
	private WebDriver webDriver;

	public Ebay2SearchPage(WebDriver driver) {
		webDriver = driver;
		PageFactory.initElements(webDriver, this);
	}

	public void clickOnItem(String linktext) {
		WebElement resultItem = webDriver.findElement(By.partialLinkText(linktext));
		resultItem.click();
	}
}
