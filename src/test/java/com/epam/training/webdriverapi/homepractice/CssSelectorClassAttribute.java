/**
 * 
 */
package com.epam.training.webdriverapi.homepractice;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * This Class represented how to find css class attribute on the mobile.de
 * Results appears on the console block in this IDE  
 * @author Pápai Imre
 *
 */
public class CssSelectorClassAttribute {

	/**
	 * @throws java.lang.Exception
	 */
	@FindBy(id = "qssub")
	private WebElement submitButton;
	
	private WebDriver driver;
	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		PageFactory.initElements(driver, this);
		driver.get("http://www.mobile.de/?lang=de");
		driver.manage().window().maximize();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		driver.close();
	}

	@Test
	public void test() {
		submitButton.click();
		
		new WebDriverWait(driver, 5).until(ExpectedConditions.titleContains(driver.getTitle()));
		String data = driver.findElement(By.cssSelector("h1[class*='h3 text-orange text-normal']")).getText();
		System.out.println("Result page value: "+data);
		System.out.println("And the page Title is: "+driver.getTitle());
	}

}
