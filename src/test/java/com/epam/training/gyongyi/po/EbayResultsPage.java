package com.epam.training.gyongyi.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EbayResultsPage {
private WebDriver webDriver;
@FindBy(id="qtyTextBox")
private WebElement quantityBox;
@FindBy(id="binBtn_btn")
private WebElement buyItNowButton;
public EbayResultsPage(WebDriver driver){
	webDriver= driver;
	PageFactory.initElements(webDriver, this);
}

public void addQuantity(String quantity){
	quantityBox.clear();
	quantityBox.sendKeys(quantity);
}
public void clickOnBuyitNoWButton(){
	buyItNowButton.click();
}
}
