package com.epam.training.home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FirstArticle extends OGaborBasePage {
	
	private final By Header = By.cssSelector ("h1[class*='Szeged']");
	
	public boolean isHeaderContainsMyTeam () {
		if (Header.toString().contains("Szeged"))
			return true;
		else 
			return false;
	}
	
	public FirstArticle(WebDriver driver){
		super(driver);
	}
	
}
