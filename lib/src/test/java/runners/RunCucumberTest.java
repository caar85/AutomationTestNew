package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {
		"pretty" }, features = "src/test/resources/feature_files", glue = "classpath:steps_definitions", tags = "@tag1", dryRun = false)
public class RunCucumberTest {

}
