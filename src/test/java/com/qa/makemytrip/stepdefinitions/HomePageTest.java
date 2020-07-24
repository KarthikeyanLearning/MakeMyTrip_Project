package com.qa.makemytrip.stepdefinitions;

import java.awt.AWTException;
import java.util.Properties;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

import com.qa.makemytrip.initializer.Initializer;
import com.qa.makemytrip.pageobjects.HomePageObject;
import com.qa.makemytrip.util.AppConstants;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HomePageTest {

	WebDriver driver;
	Initializer initializer;
	Properties prop;
	HomePageObject homePageObject;

	/*
	 * @Before() public void setUp() throws AWTException, InterruptedException {
	 * initializer = new Initializer(); prop = initializer.init_properties(); String
	 * browserName = prop.getProperty("browser"); driver =
	 * initializer.init_driver(browserName); driver.get(prop.getProperty("url"));
	 * homePageObject = new HomePageObject( driver); String browserName =
	 * prop.getProperty("browser"); driver = basePage.init_driver(browserName);
	 * driver.get(prop.getProperty("url"));
	 * 
	 * }
	 */
	@Given("^open browser and enter url$")
	public void open_browser_and_enter_url() throws InterruptedException {

		System.out.println("Open Browser");

		initializer = new Initializer();
		prop = initializer.init_properties();
		String browserName = prop.getProperty("browser");
		driver = initializer.init_driver(browserName);
		driver.get(prop.getProperty("url"));
		homePageObject = new HomePageObject(driver);

	}

	@Then("^verify title of the page$")
	public void verify_title_of_the_page() throws InterruptedException {
		System.out.println("Enter URL");
		String pageTitle = homePageObject.getPageTitle();
		Thread.sleep(4000);
		Assert.assertEquals(AppConstants.HOME_PAGE_TITLE, pageTitle);
	}

}
