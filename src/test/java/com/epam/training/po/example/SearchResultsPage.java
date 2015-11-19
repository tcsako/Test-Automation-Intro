package com.epam.training.po.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * This class represents the SearchResult page of the PageObject Framework
 * 
 * @author Nandor_Rigo
 *
 */
public class SearchResultsPage extends BasePage{

	@FindBy(id = "ResultSetItems")
	private WebElement resultTable;
	
	public SearchResultsPage(WebDriver driver) {
		super(driver);
	}
	
	public boolean isResultPageOpened() {
		return resultTable.isDisplayed();
	}

}
