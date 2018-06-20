package api;


import com.google.inject.Inject;

import core.ReqRest;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.runtime.java.guice.ScenarioScoped;
import io.restassured.RestAssured;


@ScenarioScoped
public class ApiHooks {
	private ReqRest request;	
	@Inject
	public ApiHooks(ReqRest request) {
		this.request = request;
	}
	
	@Before("@rest")
	public void apiData() {
		System.out.println("Start test");
		/*
		 * baseURI method will set globally the URI that you want to connect. It have to
		 * be setted into a constructor or method. After that in given() method of
		 * RestAssured class, this URI will be loaded automatically.
		 * basePath method will set the end point for the API.
		 */
		RestAssured.baseURI = "https://reqres.in/api";
		RestAssured.basePath = "/users/";
	}
	@After("@rest1")
	public void after() {
		System.out.println("End of test");
	}

}
