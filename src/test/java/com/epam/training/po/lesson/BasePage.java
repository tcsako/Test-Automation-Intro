package com.epam.training.po.lesson;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * This class represents the Parent class for the PageObject Framework
 * It creates the WebDriver instance, so you don't have to instantiate it on every PageObject class
 * 
 * @author Nandor_Rigo
 *
 */

public class BasePage {

	private WebDriver driver;

	public BasePage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(this.driver, this);
	    }

	public WebDriver getDriver() {
		return driver;
	}
}
