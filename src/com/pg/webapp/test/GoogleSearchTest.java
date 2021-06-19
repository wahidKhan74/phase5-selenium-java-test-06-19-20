package com.pg.webapp.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {

	public static void main(String[] args) {
		
		// 1. formulate a test url.
		final String siteURL = "https://www.google.com/";
		
		// 2. locate a browser driver path.
		final String driverPath="driver\\chromedriver.exe";
		
		// 3. selenium system property.
		System.setProperty("webdriver.chrome.driver", driverPath);
		
		// 4. Instantiate selenium webdriver.
		WebDriver driver = new ChromeDriver();
		
		// 5. launch web browser.
		driver.get(siteURL);
		
		// 6. evaluate test	
		String expectedTitle = "Google";
		String actualTitle = driver.getTitle();
		
		//search data on google
		WebElement searchBox = driver.findElement(By.name("q"));		
		searchBox.sendKeys("selenium documentation");		
		searchBox.submit();
		
		if(expectedTitle.equals(actualTitle)) {
			System.out.println("--- Test is Passed ----");
		} else {
			System.out.println("--- Test is Failed ! ----");
		}
		System.out.println("Expected title : "+expectedTitle);
		System.out.println("Actual title : "+actualTitle);
		
		// 7. closed browser/test	
		driver.close();
	}

}
