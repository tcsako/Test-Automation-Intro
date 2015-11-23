package com.epam.training.gyongyi.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EbayHomePage {
	private WebDriver webDriver;
	@FindBy(id="gh-ac")
	private WebElement searchField;
	@FindBy(id= "gh-btn")
	private WebElement searchButton;

	public EbayHomePage(WebDriver driver) {
		webDriver= driver;	
		PageFactory.initElements(webDriver, this);
	}
	public void search(String subject){
		searchField.sendKeys(subject);
	}
	
	public void clickOnSearchButton(){
		searchButton.click();
	}
}
