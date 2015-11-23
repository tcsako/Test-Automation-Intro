package com.epam.training.gyongyi.po2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ebay2HomePage {
	private WebDriver webDriver;
	@FindBy(id = "gh-ac")
	private WebElement searchField;
	@FindBy(id = "gh-btn")
	private WebElement searchButton;

	public Ebay2HomePage(WebDriver driver) {
		webDriver = driver;
		PageFactory.initElements(webDriver, this);
	}

	public void search(String thing) {
		searchField.sendKeys(thing);
	}

	public void clickOnSearchButton() {
		searchButton.click();
	}
}
