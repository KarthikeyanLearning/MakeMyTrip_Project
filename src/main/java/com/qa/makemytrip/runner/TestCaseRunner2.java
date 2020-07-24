package com.qa.makemytrip.runner;

import java.io.File;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.cucumber.listener.ExtentProperties;
import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

@CucumberOptions(features = { ".\\src\\test\\resources\\features" }, glue = {
		"com.qa.makemytrip.stepdefinitions" }, tags = { "@HomePageTest" }, format = { "pretty",
				"html:target/cucumber-reports/cucumber-pretty", "json:target/cucumber-reports/CucumberTestReport.json",
				"rerun:target/cucumber-reports/rerun.txt" }, plugin = {
						"com.cucumber.listener.ExtentCucumberFormatter:output/report.html" })

public class TestCaseRunner2 extends AbstractTestNGCucumberTests {

	private TestNGCucumberRunner testNGCucumberRunner;

	@BeforeClass(alwaysRun = true)
	public void setUpClass() throws Exception {
		ExtentProperties extentProperties = ExtentProperties.INSTANCE;
		extentProperties.setReportPath("output/myreport.html");
		testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());

	}

	@Test(groups = "cucumber", description = "Runs Cucumber Feature", dataProvider = "features")
	public void feature(CucumberFeatureWrapper cucumberFeature) {
		testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
	}

	@DataProvider
	public Object[][] features() {
		return testNGCucumberRunner.provideFeatures();
	}

	@AfterClass(alwaysRun = true)
	public void tearDownClass() throws Exception {
		testNGCucumberRunner.finish();
		Reporter.loadXMLConfig(new File("C:\\Users\\M1052519\\Desktop\\PageObjectModel\\BDDFrameworkTest\\src\\main\\java\\com\\qa\\makemytrip\\config\\extent-config.xml"));
		Reporter.setSystemInfo("User", System.getProperty("user.name"));
		Reporter.setSystemInfo("OS", "Windows");
		Reporter.setTestRunnerOutput("Sample Output message");
	}

}
