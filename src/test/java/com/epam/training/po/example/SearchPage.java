package com.epam.training.po.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

/**
 * This class represents the Advanced Search page of the PageObject Framework
 * 
 * @author Nandor_Rigo
 *
 */
public class SearchPage extends BasePage {

	/**
	 * This is the By version of the KeywordTextbox element.
	 * It is not used in this example.
	 */
	
	//private final By keywordTextboxWithBy = By.id("_nkw");
	
	/**
	 * This is the FindBy version of the KeywordTextbox element.
	 */
	
	@FindBy(id = "_nkw")
	private WebElement keywordTextbox;
	
	/**
	 * The rest of the FindBy located elements on the SearchPage.
	 */
	
	@FindBy(css = ".btn.btn-prim")
	private WebElement submitButton;
	
	@FindBy(id = "LH_BIN")
	private WebElement buyItNowCheckbox;
	
	@FindBy(id = "LH_ItemConditionNew")
	private WebElement newCheckbox;
	
	@FindBy(id = "LH_SORT_BY")
	private WebElement selectSort;

	
	public SearchPage(WebDriver driver) {
		super(driver);
	}

	/**
	 * This method fills in the search form with valid data, based on the parameters.
	 * 
	 * @param keyword
	 * @param sortText
	 * @return {@link SearchPage}
	 */
	public SearchPage fillSearchForm(String keyword, String sortText) {
		fillTextbox(keyword);
		selectBuyItNow();
		selectNew();
		setSortBy(sortText);
		return new SearchPage(getDriver());
	}
	
	/**
	 * 
	 * This method clicks on the Submit button, and submits the page.
	 * @return {@link SearchResultsPage}
	 */
	public SearchResultsPage submitForm() {
		submitButton.click();
		return new SearchResultsPage(getDriver());
	}
	
	/**
	 * The remaining methods are the ones, which are responsible for the UI handling. 
	 */
	
	private void fillTextbox(String keyword) {
		keywordTextbox.sendKeys(keyword);
	}
	
	private void selectBuyItNow() {
		if(!buyItNowCheckbox.isSelected()) {
			buyItNowCheckbox.click();
		}
	}
	
	private void selectNew() {
		newCheckbox.click();
	}
	
	private void setSortBy(String sortText) {
		Select selectSortBy = new Select(selectSort); //UI felület manipuláló dolog select választ.
		selectSortBy.selectByVisibleText(sortText);
	}
}
