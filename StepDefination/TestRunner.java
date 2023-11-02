package StepDefination;

import io.cucumber.junit.Cucumber;

public class TestRunner {
	@RunWith(Cucumber.class)
	@CucumberOption(features="src/test/resources/Features", glue= {"StepDefination"})
	
	
	

}
