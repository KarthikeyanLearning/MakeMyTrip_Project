package com.qa.makemytrip.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.makemytrip.initializer.Initializer;
import com.qa.makemytrip.util.AppConstants;
import com.qa.makemytrip.util.ElementUtil;
import com.qa.makemytrip.util.JavaScriptUtil;

public class HomePageObject extends Initializer {

	WebDriver driver;
	ElementUtil elementUtil;
	JavaScriptUtil jsUtil;

	public HomePageObject(WebDriver driver) {
		this.driver = driver;
		elementUtil = new ElementUtil(driver);
		jsUtil = new JavaScriptUtil(driver);
	}

	public String getPageTitle() {
		elementUtil.waitForTitlePresent(AppConstants.HOME_PAGE_TITLE);
		return elementUtil.doGetPageTitle();
	}

}
