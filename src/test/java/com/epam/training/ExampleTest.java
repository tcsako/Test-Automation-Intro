package com.epam.training;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
    public double number;
    @Parameter(2)
    public boolean bool;
    
    
    
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
     */
    @Test
    public void testExample() {
        driver.get("http://www.google.hu");
 //       driver.manage().timeouts().pageLoadTimeout(10 , TimeUnit.SECONDS);

        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys(searchText);

        element.submit();
        
       new WebDriverWait(driver , 10).until(ExpectedConditions.titleContains(searchText));
        Assert.assertTrue(driver.getTitle().contains(searchText));
    }

    /**
     * Closes the browser after the test.
     */
    @After
    public void tearDown() {
//      driver.quit();
    }
    
    @Parameters
    public static Object[][] searchParams() {
    	return new Object[][] {
    		{"EPAM" ,1 , true},
//    		{"Mozi" , 3 , false},
//    		{"Medve"}
    	}; 
    }

}
