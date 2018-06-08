package test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\DELL 3\\eclipse-workspace\\TestRestApiWithCucumber\\src\\test\\resources\\future",
				 glue = "test",
				 tags = "@rest",
				 plugin = {"pretty","html:target/cucumber-report"}	)
public class RunTest {

	
	

}
