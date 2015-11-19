package com.epam.training.po.lesson;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.epam.training.po.lesson.SearchPage;

/**
 * This class represents the Home page of the PageObject Framework
 * 
 * @author Kristof_Deak
 *
 */

public class HomePage extends BasePage {
	
	@FindBy (id = "gh-ac")
	private WebElement searchField;
	
	@FindBy (id = "gh-btn")
	private WebElement searchButton;
	
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	/**
	 * 
	 * 
	 *  Filling the searchField text with keyword.
	 * 
	 * @param keyword
	 */
	private void fillSearchbox(String keyword) {   //formnál lehet jelentősége, ha sokat kell kitölteni akkor a fillSearch-be paraméterekkel csak meghívom ezt a külön metódust.
		searchField.sendKeys(keyword);
	}
	
	/**
	 * 
	 * 
	 *  Filling the searchField text with keyword and return with the HomePage object.
	 * @param keyword
	 * @return
	 */
	public HomePage fillSearch(String keyword) {
		fillSearchbox(keyword);
		return new HomePage(getDriver());
	}
	
	/**
	 * 
	 *  Clicking on the searchButton, and go to the SearchPage.
	 * @return
	 */
	public SearchPage submitForm() {
		searchButton.click();
		return new SearchPage(getDriver());
	}
}