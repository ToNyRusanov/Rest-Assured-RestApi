package test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/future",
				 glue = {"test","api"},
				 tags = "@rest",
				 plugin = {"pretty","html:target/cucumber-report"}	)
public class RunTest {

	
	

}
