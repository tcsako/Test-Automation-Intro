package com.epam.training;



import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Trainging0 {


	@Test
	public void test() {
		WebDriver test = new FirefoxDriver();
		test.get("http://www.szeged.hu");
		
		List<WebElement> newsboxheaders = test.findElements(By.cssSelector(".newsbox>h3"));
		
//		WebElement firstHeaderElement = newsboxheaders.get(0);
//		String firstHeaderText = firstHeaderElement.getText();
		
		
		for (int i=0; i<3; i++){
			
			System.out.println(newsboxheaders.get(i).findElement(By.tagName("a")).getAttribute("href"));
			
		}
		
//		WebElement element = test.findElement(By.cssSelector("something"));
//		Select combobox = new Select(element);
//		combobox.selectByValue("value");
		test.close();
	}

}
