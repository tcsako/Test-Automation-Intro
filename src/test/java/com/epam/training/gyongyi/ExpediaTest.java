package com.epam.training.gyongyi;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpediaTest {

	
	public static void main(String[] args) {
		ExpediaTest exp = new ExpediaTest(2);
	}
	
	public ExpediaTest() {
		System.out.println("létrejött");
	}
	
	public ExpediaTest(int a) {
		System.out.println("létrejött a :" + a);
	}
	
	@Test
	public void testExpedia() throws InterruptedException {		
		
		WebDriver ffDriver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(ffDriver, 30);
		
		ffDriver.manage().window().maximize();

		ffDriver.get("https://www.expedia.com/");
		Thread.sleep(5000);
		ffDriver.findElement(By.id("header-account-menu")).click();

		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("header-account-register")));
		ffDriver.findElement(By.id("header-account-register")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("create-account-firstname")));
		ffDriver.findElement(By.id("create-account-firstname")).sendKeys("Gyongyi");
		ffDriver.findElement(By.id("create-account-submit-button")).click();
		
		WebElement errorElement = ffDriver.findElement(By.id("blank-create-param-id"));
		System.out.println(errorElement.getText());
		
		Assert.assertEquals("Please complete all fields..", errorElement.getText());
	}

}
