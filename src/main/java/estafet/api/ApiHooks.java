package estafet.api;


import com.google.inject.Inject;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.runtime.java.guice.ScenarioScoped;
import estafet.core.ReqRest;
import io.restassured.RestAssured;


@ScenarioScoped
public class ApiHooks {
	private ReqRest request;	
	@Inject
	public ApiHooks(ReqRest request) {
		this.request = request;
	}
	
	@Before("@rest1")
	public void apiData() {
		System.out.println("Start test");
		
		//RestAssured.baseURI = "https://reqres.in/api";
		//RestAssured.basePath = "/users/";
	}
	@After("@rest1")
	public void after() {
		System.out.println("End of test");
	}

}
