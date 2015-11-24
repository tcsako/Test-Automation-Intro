package com.epam.training.home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OGaborHomePage extends OGaborBasePage {

	private final By WaterPoloSearchLink = By.xpath ("//*[@id='middle']/ul/li[3]/ul/li[5]/a");
	
	public OGaborHomePage (WebDriver driver) {
		super(driver);
	}
	
	
	public WaterPoloPage clickOnTeamSportsWaterPolo () {
		
		WebElement menu = getDriver().findElement(By.xpath("//*[@id='middle']/ul/li[3]/a")); 
		Actions builder = new Actions(getDriver());
		builder.moveToElement(menu).build().perform();
		WebDriverWait wait = new WebDriverWait(getDriver(), 5);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='middle']/ul/li[3]/ul/li[5]/a")));
		WebElement menuOption = getDriver().findElement(By.xpath("//*[@id='middle']/ul/li[3]/ul/li[5]/a"));
		menuOption.click();
		
		return new WaterPoloPage(getDriver());
		
		
	}
}
