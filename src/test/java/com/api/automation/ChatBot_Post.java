package com.api.automation;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

public class ChatBot_Post {

	@Test
	public void testPostData()
	{
		
		RequestSpecification httpRequest = RestAssured.given();
		
		httpRequest.header("Content-Type", "application/json");
		
		JSONObject json = new JSONObject();
				
		json.put("requestStr", "Productivity of sector-14 in jan");
		
		httpRequest.body(json.toJSONString());
		System.out.println(json.toJSONString());
	
		Response response = httpRequest.request(Method.POST,"https://marketintelligencedev.navikai.com/ask-navik/api/dialogFlowWebHook");
		int code = response.getStatusCode();
		System.out.println("Status code is: "+code);
		Assert.assertEquals(code,200);
		
		String responseBody = response.getBody().asString();
		System.out.println("Response Body is : \n"+responseBody);
		
//		Assert.assertEquals(response, equalTo("Top 5 sublocality in 2020 are"));
		
		String responseBody1 = response.jsonPath().get("response");
		Assert.assertEquals(responseBody1, "Productivity of locality Sector 14 in January is 29.3");
		
		
		
		
		
	
	}
}
