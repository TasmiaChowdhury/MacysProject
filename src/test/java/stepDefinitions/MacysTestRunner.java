package stepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/",
					glue="stepDefinitions",
					stepNotifications=true,
					plugin = {"pretty", "html:target/reports/report.html", 
							"json:target/reports/report.json",
							"junit:target/reports/report.xml"},
					monochrome=true
					//tags = {}
					)
public class MacysTestRunner {

}
