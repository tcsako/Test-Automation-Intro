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

import Webelement;

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
    public String searcText;
    @Parameter(1)
    public String searcTectScnd;

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
       // driver.get("http://www.szeged.hu");
    	driver.get("http://www.google.com");

        WebElement element = driver.findElement(By.name("q"));
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // arra valo, hogy ha action utan mindenfelekeppen varjon x ideig
        //driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS); // hajlando vagyok varni a pageloadra
        
        element.sendKeys(searcText);

        element.submit();
        
        WebElement breadcrumbelement = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.id("breadcumb")));
        //WebElement breadcrumbelement = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.id("search")));
        
        Assert.assertTrue(driver.getTitle().contains(searcText));
    }

    /**
     * Closes the browser after the test.
     */
    @After
    public void tearDown() {
        //driver.quit();
    	driver.close();
    }
    
    @Parameters
    public static Object[][] searchParams() {
    	
    	return new Object [][]{
    		
    		{"EPAM", "MOZI"},
    		//{"MOZI" , "MOZI2"},
    		//{"BLIZZARD" ,"MOZI3"},
    		
    	};
    
    }

}
