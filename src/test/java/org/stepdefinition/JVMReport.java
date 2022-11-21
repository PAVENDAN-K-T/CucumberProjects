package org.stepdefinition;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {
	public static void generateJvmReport(String jsonFile) {
		// 1.Target location path
		File f = new File(System.getProperty("user.dir") + "\\Reports\\jvmReport");

		// 2.Add Details
		Configuration c = new Configuration(f, "FACEBOOK APPLICATION");

		c.addClassifications("Plateform", "WINDOWS 11");
		c.addClassifications("JDK Version", "1.8");

		// 3.Add the json file to list
		List<String> li = new ArrayList<String>();
		li.add(jsonFile);

		// 4.ReportBuilder
		ReportBuilder r = new ReportBuilder(li, c);
		r.generateReports();

	}
}
