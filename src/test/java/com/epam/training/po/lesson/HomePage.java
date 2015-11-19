package com.epam.training.po.lesson;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.epam.training.po.lesson.SearchPage;



/**
 * This class represents the Home page of the PageObject Framework
 * 
 * @author Nandor_Rigo
 *
 */

public class HomePage extends BasePage {
	
	@FindBy(id = "gh-ac")
	private WebElement searchField;
	
	@FindBy(id ="gh-btn")
	private WebElement searchButton;
	
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	public HomePage fillSearch(String keyword) {
		fillSearchbox(keyword);
		
		return new HomePage(getDriver());
	}
	
	public SearchPage submitForm() {
		searchButton.click();
		return new SearchPage(getDriver());
	}
	
	
	
	private void fillSearchbox(String keyword) {
		searchField.sendKeys(keyword);
	}
	
	
	//public SearchPage clearSearchField(){
		//searchField.clear();
		//return null;
	//}
	
}