package com.epam.training.gyongyi.po2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Ebay2ResultPage {
	private WebDriver webDriver;
	@FindBy(id = "binBtn_btn")
	private WebElement buyItNowButton;
	
	@FindBy(id = "msku-sel-1")
	private WebElement size;

	public Ebay2ResultPage(WebDriver driver) {
		webDriver = driver;
		PageFactory.initElements(webDriver, this);

	}
	public void selectSize(String addsize){
	Select selectSize= new Select(size);
	selectSize.selectByVisibleText(addsize);
	}

	public void clickOnBuyItNow() {
		buyItNowButton.click();
	}
}
