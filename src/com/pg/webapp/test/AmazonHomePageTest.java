package com.pg.webapp.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonHomePageTest {

	public static void main(String[] args) {

		// 1. formulate a test url.
		final String siteURL = "https://www.amazon.in/";

		// 2. locate a browser driver path.
		final String driverPath = "driver\\chromedriver.exe";

		// 3. selenium system property.
		System.setProperty("webdriver.chrome.driver", driverPath);

		// 4. Instantiate selenium webdriver.
		WebDriver driver = new ChromeDriver();

		// 5. launch web browser.
		driver.get(siteURL);

		//6. test evaluation
		String expectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		if(expectedTitle.contentEquals(driver.getTitle())) {
			System.out.println("Test is passed !");
		} else {
			System.out.println("Test is failed !");
		}
		
		//7. close driver
		driver.close();
	}

}
