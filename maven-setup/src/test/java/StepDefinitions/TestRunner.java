package StepDefinitions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="file:D:/EclipseWorkispace/maven-setup/src/main/resources/Features",
	glue= {"StepDefinitions"}
		)
public class TestRunner {

	
	
}
