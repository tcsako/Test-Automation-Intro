package com.epam.training.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class OGaborBasePage {

	private WebDriver driver;
	
	public OGaborBasePage (WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
	
	public WebDriver getDriver () {
		return driver;
	}
}
