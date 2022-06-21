package steps_definitions;

import com.driver.manager.InitializeDriver;

import io.cucumber.java8.En;

public class StepsTest implements En {

	private InitializeDriver browser;

	public StepsTest() {
		Given("I open the browser", () -> {
			browser = InitializeDriver.initializeDriver();
			browser.getDriver().get("https://demoqa.com");
		});
	}

}
