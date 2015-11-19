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
	
	private final By searchLink = By.id("gh-as-a"); //A searchbox id

	public HomePage(WebDriver driver) { //Elkérem az őstől a drivert
		super(driver);
	}
	
	/**
	 * This method clicks on the Advanced search button, and loads the Advanced Search page.
	 * @return {@link SearchPage}
	 */
	public SearchPage clickOnAdvancedSearchLink() {
		getDriver().findElement(searchLink).click(); //Megklikkeljük a search cuccot
		return new SearchPage(getDriver()); //Meghívja a Searchpag
	}
}