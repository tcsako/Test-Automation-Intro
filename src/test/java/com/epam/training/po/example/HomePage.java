package com.epam.training.po.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * This class represents the Home page of the PageObject Framework
 * 
 * @author Nandor_Rigo
 *
 */

public class HomePage extends BasePage {
	
	private final By searchLink = By.id("gh-as-a");

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	/**
	 * This method clicks on the Advanced search button, and loads the Advanced Search page.
	 * @return {@link SearchPage}
	 */
	public SearchPage clickOnAdvancedSearchLink() {
		getDriver().findElement(searchLink).click();
		return new SearchPage(getDriver());
	}
}