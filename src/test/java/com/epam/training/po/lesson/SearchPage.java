package com.epam.training.po.lesson;

import org.openqa.selenium.WebDriver;

public class SearchPage extends BasePage{

	public SearchPage(WebDriver driver) {
		super(driver);
	}
	
	public String getPageTitle() {
		return getDriver().getTitle();
	}
	
	
	
}
