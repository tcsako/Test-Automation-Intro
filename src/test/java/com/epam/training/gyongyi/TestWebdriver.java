package com.epam.training.gyongyi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestWebdriver {

	public static void main(String[] args) {
		WebDriver ffDriver= new FirefoxDriver();
		ffDriver.get("http://www.origo.hu/index.html");
		String pageTitle= ffDriver.getTitle();
		
		System.out.println(pageTitle);
	
		WebElement searchField= ffDriver.findElement(By.id("p_kereso_text"));
		searchField.sendKeys("Magyarország");
		searchField.submit();
		

	}

}
