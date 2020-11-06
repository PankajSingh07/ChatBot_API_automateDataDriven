package com.api.automation;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import org.testng.Assert;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;

public class ChatBot_Post_requestGWT {

	@Test
	public void testPostRequest1() {

		JSONObject request = new JSONObject();
		request.put("requestStr", "what is the overall productivity of Sector-29");
		
//		Response resp = RestAssured.
				given()
				.header("Content-Type", "application/json")
				.header("Accept", "application/json")
//				.header("Access_Token", "eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsImtpZCI6ImtnMkxZczJUMENUaklmajRydDZKSXluZW4zOCJ9.eyJhdWQiOiIxODc3YjM4NS0zODUxLTQxMzgtODEwZC02NGI4NWZlYjYwODAiLCJpc3MiOiJodHRwczovL2xvZ2luLm1pY3Jvc29mdG9ubGluZS5jb20vYWRhNGI3YWMtMWEyMC00OGQ4LTg4NWMtYWE3NjU5MTg5NzRlL3YyLjAiLCJpYXQiOjE2MDM5NTQ0MjcsIm5iZiI6MTYwMzk1NDQyNywiZXhwIjoxNjAzOTU4MzI3LCJhaW8iOiJBVFFBeS84UkFBQUFMbXFNS2s4Y0hPSEJJTk50bEhMZ3B3TDZwMnIyNndhOE1NYW5kUHR3WGVJbXI5MXpEckJ3akVEQk5YSVllZlB3IiwiYXpwIjoiMTg3N2IzODUtMzg1MS00MTM4LTgxMGQtNjRiODVmZWI2MDgwIiwiYXpwYWNyIjoiMCIsIm5hbWUiOiJQYW5rYWoiLCJvaWQiOiIwMjUyNjdhYi1iNmMxLTRmNDUtYjg3ZS05YjAyYWYyNjNmMTAiLCJwcmVmZXJyZWRfdXNlcm5hbWUiOiJwYW5rYWpAbWljcm93YXJlY29tcHV0aW5nLm9ubWljcm9zb2Z0LmNvbSIsInJoIjoiMC5BQUFBckxla3JTQWEyRWlJWEtwMldSaVhUb1d6ZHhoUk9EaEJnUTFrdUZfcllJQldBSncuIiwic2NwIjoicG1pIFVzZXIuUmVhZCIsInN1YiI6ImJ0alJuejU2WFR6ZUNTN2VQUWhvRnNmWnpzWm5jSnRKZVpDbzM3X3NjZU0iLCJ0aWQiOiJhZGE0YjdhYy0xYTIwLTQ4ZDgtODg1Yy1hYTc2NTkxODk3NGUiLCJ1dGkiOiJydDh4YkFqWkxVS1BFX2tlWGZZa0FRIiwidmVyIjoiMi4wIn0.DPy_5RDfXZuB2oa6M0mn4m52rbOA8BpGUm52t2gLvRSSA-ui6mhrVNEdpZ4Xh9BRnBcfgYYTcLN-5a9jAz-cK1izXEBiDVvmubFd6Ip8vFOmxIuLP8FA3fKrOoXAFH_bDUWN7dLgUSLqJNhOye-ZeYtPuyohANN1edoeghHVGCdb15kEz-sRaaLXIevzMrjXEW3AU0jegn8vWv3MxcAIuRFCXBSJfxhqnJqs-fxX5G9IAXfiGbxA2H8o_AHTCbjpJBnWHc_7IAUF5uQR1lhBh2UkJizq5kNZptzCWTuMrmsVF7n7JVCuvuYyPeKs1TgptB1Q4A7QvbRarRksOeULEw")
				.formParam("client_id", "1877b385-3851-4138-810d-64b85feb6080")
				.formParam("grant_type", "Implicit")
				.formParam("Scope", "openid api://1877b385-3851-4138-810d-64b85feb6080/User.Read")
				.formParam("State", "12345")
				.post("https://login.microsoftonline.com/organizations/oauth2/v2.0/authorize");
		
		
//		String token = resp.jsonPath().get("access_token");
		String token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsImtpZCI6ImtnMkxZczJUMENUaklmajRydDZKSXluZW4zOCJ9.eyJhdWQiOiIxODc3YjM4NS0zODUxLTQxMzgtODEwZC02NGI4NWZlYjYwODAiLCJpc3MiOiJodHRwczovL2xvZ2luLm1pY3Jvc29mdG9ubGluZS5jb20vYWRhNGI3YWMtMWEyMC00OGQ4LTg4NWMtYWE3NjU5MTg5NzRlL3YyLjAiLCJpYXQiOjE2MDQzMTA5MDAsIm5iZiI6MTYwNDMxMDkwMCwiZXhwIjoxNjA0MzE0ODAwLCJhaW8iOiJBVFFBeS84UkFBQUF3cjNGcWRnanU0THo3TnU1ZUdwV05YZGsyMmVkeTdrOGxrc2IvbWRwWnlIKzhnUjl4aVFqVC9wNWJ6N2d4YVZSIiwiYXpwIjoiMTg3N2IzODUtMzg1MS00MTM4LTgxMGQtNjRiODVmZWI2MDgwIiwiYXpwYWNyIjoiMCIsIm5hbWUiOiJQYW5rYWoiLCJvaWQiOiIwMjUyNjdhYi1iNmMxLTRmNDUtYjg3ZS05YjAyYWYyNjNmMTAiLCJwcmVmZXJyZWRfdXNlcm5hbWUiOiJwYW5rYWpAbWljcm93YXJlY29tcHV0aW5nLm9ubWljcm9zb2Z0LmNvbSIsInJoIjoiMC5BQUFBckxla3JTQWEyRWlJWEtwMldSaVhUb1d6ZHhoUk9EaEJnUTFrdUZfcllJQldBSncuIiwic2NwIjoicG1pIFVzZXIuUmVhZCIsInN1YiI6ImJ0alJuejU2WFR6ZUNTN2VQUWhvRnNmWnpzWm5jSnRKZVpDbzM3X3NjZU0iLCJ0aWQiOiJhZGE0YjdhYy0xYTIwLTQ4ZDgtODg1Yy1hYTc2NTkxODk3NGUiLCJ1dGkiOiJuNVhHWnhXbDZVU18xS1VwR1lOaEFBIiwidmVyIjoiMi4wIn0.uFh1pNo-W00_NA1sGlD76MCj7vH9Y8IhcUndaAJJuMe3gnkhLIO-QUCVXCmeY7hwD_eWP5kJsMoFjy2xwTGUSB2T8eNlO6nvbYjpzN85HRQKrNL-C3FXbEcPwUI33cZVp0giGC-KWZD-WWcK2EnUsPXnzTCFn3tAMBbdvXhN9kZZ0zKW0FLcrmMlYnK_S89V0xsMfkcZd3CX9KzWijd0m-zlNmiWyxZl4nH5pQkQVM39UB3xmLFa7mLC3P4Hfvzsg9xhsHkDqZdzhhanAecWL1kKDaWZ_Mh9bCKCDjR3Za7LhuZAhUu95Z8Aufxk5-PGs2fyY3DSWQTxW9GvCaiQJA";
		Response resp1=RestAssured.
				given()
				.header("Content-Type","application/json")
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.body(request.toJSONString())
				.auth()
				.oauth2(token)
				.post("https://marketintelligenceuat.navikai.com/ask-navik/api/dialogFlowWebHook");
	

		System.out.println(request.toJSONString());
		System.out.println(resp1.getStatusCode());
		System.out.println(resp1.asString());
		
		
		Assert.assertEquals(resp1.getStatusCode(), 200);
		Assert.assertEquals("Productivity of locality Sector 29 in 2020 is 15.4", "Productivity of locality Sector 29 in 2020 is 15.4");
		
					
		
		
		
		
//		JSONObject request = new JSONObject();
//
//		request.put("requestStr", "Productivity of sector-14 in jan");
//		
////		System.out.println(request);
//		System.out.println(request.toJSONString());
//		
//
//		given().
//			header("Content-Type","application/json").
//			contentType(ContentType.JSON).
//			accept(ContentType.JSON).
//			body(request.toJSONString()).
//		when().
//			post("https://marketintelligenceuat.navikai.com/ask-navik/api/dialogFlowWebHook").
//				  
//		then().
//			statusCode(200).
//			log().all();
////			assertThat().body("response", equalTo("Productivity of locality Sector 14 in January is 29.3"));
//	
		}

	@Test
	public void testPostRequest2() {


		JSONObject request = new JSONObject();

		request.put("requestStr", "what is the overall productivity of Sector-29");
		
//		System.out.println(request);
		System.out.println(request.toJSONString());
		

		given().
			header("Content-Type","application/json").
			contentType(ContentType.JSON).
			accept(ContentType.JSON).
			body(request.toJSONString()).
		when().
			post("https://marketintelligencedev.navikai.com/ask-navik/api/dialogFlowWebHook").
		then().
			statusCode(200).
			log().all().
			assertThat().body("response", equalTo("Productivity of locality Sector 29 is 18.4"));
	
		}

	@Test
	public void testPostRequest3() {


		JSONObject request = new JSONObject();

		request.put("requestStr", "What will be the productivity of the RF in sector-48");
		
//		System.out.println(request);
		System.out.println(request.toJSONString());
		

		given().
			header("Content-Type","application/json").
			contentType(ContentType.JSON).
			accept(ContentType.JSON).
			body(request.toJSONString()).
		when().
			post("https://marketintelligencedev.navikai.com/ask-navik/api/dialogFlowWebHook").
		then().
			statusCode(200).
			log().all().
			assertThat().body("response", equalTo("Productivity of locality Sector 48 for complengthsegment RF is 19.4"));
	
		}

	@Test
	public void testPostRequest4() {


		JSONObject request = new JSONObject();

		request.put("requestStr", "What is the productivity of sector-15 for the LAS24 for LTN in the month of jan");
		
//		System.out.println(request);
		System.out.println(request.toJSONString());
		

		given().
			header("Content-Type","application/json").
			contentType(ContentType.JSON).
			accept(ContentType.JSON).
			body(request.toJSONString()).
		when().
			post("https://marketintelligencedev.navikai.com/ask-navik/api/dialogFlowWebHook").
		then().
			statusCode(200).
			log().all().
			assertThat().body("response", equalTo("Productivity of locality Sector 15 for compflavor LTN agegroup LAS24 in January is 4.0"));
	
		}


}
