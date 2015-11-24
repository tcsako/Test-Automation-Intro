package com.epam.training.home;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WaterPoloPage extends OGaborBasePage {

	private final By FirstArticle = By.xpath("//*[@id='ikontitle']");
	
	public WaterPoloPage (WebDriver driver) {
		super(driver);
		
	}

	public FirstArticle clickOnFirstArticle () {
		getDriver().findElement(FirstArticle).click();
		return new FirstArticle(getDriver());
		
	}
	
}
