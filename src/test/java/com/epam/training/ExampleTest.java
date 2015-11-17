package com.epam.training;

import org.junit.After;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Example test(s) to demonstrate Selenium WebDriver.
 *
 * @author Zsolt_Horvath1
 */
@RunWith(Parameterized.class)
public class ExampleTest {

    /** The {@link WebDriver} instance that will be used during the test. */
    private WebDriver driver;
    
   
    @Parameter(0)
    public String searchText;
    @Parameter(1)
    public String number;
    @Parameter(2)
    public String bool;
    /**
     * Browser initialization before the test.
     */
    @Before
    public void setUp() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }

    /**
     * Test: Search for 'EPAM' on www.szeged.hu
     *
     * Steps:
     * 1. Open 'http://www.szeged.hu'
     * 2. Type 'EPAM' into the search input field
     * 3. Submit the form
     * 4. Check whether the title of the browser contains the word 'EPAM'
     * @throws InterruptedException 
     */
    @Test
    public void testExample() throws InterruptedException {
        driver.get("http://www.szeged.hu");

        WebElement element = driver.findElement(By.name("a"));
        element.sendKeys("EPAM");
       element.submit();
       Assert.assertTrue(driver.getTitle().contains("EPAM"));
    }
    

    /**
     * Closes the browser after the test.
     */
    @After
    public void tearDown() {
        driver.quit();
    }
    @Parameters
    public static Object[][] searchParams() {
    	return new Object [][] {
    		{ "EPAM"},
   //		{"Mozi"},
    //		{"Medvedisznóember"},
    	};
    }
    

}
