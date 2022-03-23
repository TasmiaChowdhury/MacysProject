package stepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utilities.BaseDrivers;

public class BeforeSceanrio {

	@Before("@chrome")
	public void beforeChromeScenario(Scenario scen) {

		System.out.println(">> Started Chrome Driver Initialization <<");
		try {
			BaseDrivers.setChromeDriver();
			System.out.println(">> ChromeDriver Initialized!<<");
			System.out.println(scen.getName());

		} catch (Exception e) {
			System.out.println(">> ChromeDriver Initialization Failed!!<<");
		}

	}
}
