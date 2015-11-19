package com.epam.training.po.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * This class represents the Parent class for the PageObject Framework
 * It creates the WebDriver instance, so you don't have to instantiate it on every PageObject class
 * 
 * @author Nandor_Rigo
 *
 */
// Minden egyes oldal ebből származik, ez az ős oldal
public class BasePage {

	private WebDriver driver; //Konstruktor

	public BasePage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(this.driver, this);
	    }

	//Elérjük az ős webdriverét
	public WebDriver getDriver() {
		return driver;
	}
}
