package com.epam.training;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Example test(s) to demonstrate Selenium WebDriver.
 *
 * @author Zsolt_Horvath1
 */
public class ExampleTest {

    /** The {@link WebDriver} instance that will be used during the test. */
    private WebDriver driver;

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
        driver.get("http://www.e-bay.com");

        WebElement element = driver.findElement(By.id("gh-ac"));
        element.sendKeys("Hans Zimmer");
       driver.findElement(By.id("gh-btn")).click();
       WebElement inception = driver.findElement(By.cssSelector("a[title*='INCEPTION']"));
       inception.click();
         
       WebElement buy = driver.findElement(By.id("binBtn_btn"));
       buy.click();
        
        Thread.sleep(5000);

        

      
    }

    /**
     * Closes the browser after the test.
     */
    @After
    public void tearDown() {
        driver.quit();
    }

}
