package runners;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

 @RunWith(Cucumber.class)
 @CucumberOptions(
		features = "/home/sivaneeli/eclipse-workspace/SeleniumCucumberBDDFramework/src/test/resources/FeatureFiles",
		glue= "stepDef", 
		monochrome = true, //display the console output in a proper readable format
		strict = true, //it will check if any step is not defined in step definition file
		dryRun = false
		)

public class TestRunner {

}
