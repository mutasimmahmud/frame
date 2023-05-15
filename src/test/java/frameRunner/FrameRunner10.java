package frameRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions (features= {"src/test/resources/Feature/frame.feature"},
plugin = {"json:target/cucumber.json"},
glue ="Framestepdefinition") // tags ={"@Sanity})

public class FrameRunner10 extends AbstractTestNGCucumberTests {

}
