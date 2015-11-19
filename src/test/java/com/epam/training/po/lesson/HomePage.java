package com.epam.training.po.lesson;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * This class represents the Home page of the PageObject Framework
 * 
 * @author Nandor_Rigo
 *
 */

public class HomePage extends BasePage {
	
	@FindBy(id = "gh-ac")
	private WebElement searchField;
	
	@FindBy(id = "gh-btn")
	private WebElement searchButton;
	
	public HomePage fillSearch(String keyword) {
		
		fillSearchBox(keyword);
		return new HomePage(getDriver());
		
	}
	
	public SearchPage submitForm() {
		
		searchButton.click();
		return new SearchPage(getDriver());
	}
	
	private void fillSearchBox(String keyword) {
		searchField.sendKeys(keyword);
	}
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	
}