package com.epam.training.home;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OGaborTest {

	private static WebDriver driver;
	
	private OGaborBasePage basePage;
	private OGaborHomePage homePage;
	private WaterPoloPage waterPoloPage;
	private FirstArticle firstArticle;
	
	
	@Before
	public void setUp () {
		driver = new FirefoxDriver ();
		driver.get("http://www.nemzetisport.hu");
		driver.manage().window().maximize();
		
		homePage = new OGaborHomePage(driver);
		waterPoloPage = new WaterPoloPage(driver);
		firstArticle = new FirstArticle(driver);
	}
	
	@After
	public void tearDown () {
		driver.quit();
		
	}
		
	@Test
	
	public void isMyTeamInTheNews () {
		
		homePage.clickOnTeamSportsWaterPolo();
		waterPoloPage.clickOnFirstArticle();
		Assert.assertTrue("Does the waterpolo team is in the news?", firstArticle.isHeaderContainsMyTeam());
	}
	
		
	}
	


