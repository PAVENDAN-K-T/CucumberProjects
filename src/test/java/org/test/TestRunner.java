package org.test;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.stepdefinition.JVMReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources", glue = "org.stepdefinition", dryRun = false, strict = true, plugin = {
		"html:D:\\Software Testing Tutorial\\eclipse-workspace\\CucumberProject\\Reports\\htmlReport",
		"junit:D:\\Software Testing Tutorial\\eclipse-workspace\\CucumberProject\\Reports\\junitReport\\fb.xml",
		"json:D:\\Software Testing Tutorial\\eclipse-workspace\\CucumberProject\\Reports\\jsonReport\\fbLogin.json" })
public class TestRunner {
	@AfterClass

	public static void report() {
		JVMReport.generateJvmReport(System.getProperty("user.dir") + "\\Reports\\jsonReport\\fbLogin.json");
	}

}
