package com.epam.training.po.lesson;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LessonTest {

	private static WebDriver driver;

	@Before
	public void setUp() {

		driver = new FirefoxDriver();
		
		//Add URL
		driver.get("https://");
		
		driver.manage().window().maximize();

	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
	
	@Test
	public void navigationTest() {
		
	}

}
