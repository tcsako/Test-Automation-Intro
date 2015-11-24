/**
 * 
 */
package com.epam.training.imre_papai;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This is the final exit test - Introduction to Test Automation - Technical Test
 * @author Imre Papai
 * Megjegyzés: Szerettem volna megvalósítani és megvizsgálni a kitöltetlen fieldeket is
 * idő hiányában nem volt rá lehetőségem. Tudom, hogy szebb lett volna, ha parameterezetten 
 * készítem el a feladatot. Ezer évig tudnám írni és finomítani a kódot.
 *
 */
public class FinalTest {
	private WebDriver driver;
	@FindBy(id = "firstName")
	private WebElement elementFirstName;
	@FindBy(id = "lastName")
	private WebElement elementLastName;
	@FindBy(id = "emailAddress")
	private WebElement elementEmailAddress;
	@FindBy(id = "emailAddressConfirmation")
	private WebElement elementEmailConfirm;
	@FindBy(id = "newsletterOptIn1")
	private WebElement elementNewsL;
	
	private String email;
	private String firstName;
	private String lastName;
	private String currentResult;
	
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		PageFactory.initElements(driver, this);
	}

	/**
	 * @throws java.lang.Exception
	 */
//	@After
//	public void tearDown() throws Exception {
//		driver.close();
//	}

	@Test
	public void test() {
		driver.get("https://t7-f0x.rhcloud.com/subscription/subscription.html");
		
		//Datas for Form
		firstName="Imre";
		lastName="Papai";
		email = "imre.papai@gmail.com";
		
		elementFirstName.sendKeys(firstName);
		elementLastName.sendKeys(lastName);
		elementEmailAddress.sendKeys(email);
		elementEmailConfirm.sendKeys(email);
		elementNewsL.click();
		
		WebElement element = driver.findElement(By.cssSelector("input[type='submit']"));
		element.submit();
		currentResult = "You have been registered with the "+email+" e-mail address.";
				
		String resultPageMessage = driver.findElement(By.cssSelector("h2")).getText();
		//Registration Complete Check 
		Assert.assertEquals("Current result is not equals",currentResult , resultPageMessage);
		
	}

}
