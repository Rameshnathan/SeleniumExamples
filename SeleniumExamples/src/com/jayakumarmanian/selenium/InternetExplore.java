/**
 * 
 */
package com.jayakumarmanian.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * @author Jayakumar Manian
 *
 * Jun 27, 2016
 *
 */
public class InternetExplore {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// Setting the location of the Internet Explorer driver in the system properties
				System.setProperty("webdriver.ie.driver","C:\\Users\\css94809\\git\\Selenium\\SeleniumExamples\\lib\\IEDriverServer.exe");

				WebDriver webDriver = new InternetExplorerDriver();

				// Setting the browser size
				webDriver.manage().window().setSize(new Dimension(1024, 768));

				// Go to wikipedia
				webDriver.navigate().to("https://en.wikipedia.org/wiki/Main_Page");

				// Type in the search-field: "WebDriver"
				webDriver.findElement(By.id("searchInput")).sendKeys("WebDriver");

				// submitting the search query
				webDriver.findElement(By.id("searchInput")).submit();

				// Test if Wikipedia redirects to the correct article:
				// "Selenium (software)"
				String textFound = webDriver.findElement(By.cssSelector("h1"))
						.getText();
				if (textFound.contains("Selenium (software)")) {
					System.out.println("Test passes!");
				} else {
					System.out.println("Test fails!");
				}

				// Waiting a little bit before closing
				Thread.sleep(7000);

				// Closing the browser and webdriver
				webDriver.close();
				webDriver.quit();
	}

}
