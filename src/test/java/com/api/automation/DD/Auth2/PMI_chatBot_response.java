package com.api.automation.DD.Auth2;

import static io.restassured.RestAssured.given;

import java.io.IOException;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PMI_chatBot_response {
	
	
	@Test(dataProvider="GetRequest")
	public void testPostData(String req, String res)
	{
//		RestAssured.baseURI = "https://marketintelligencedev.navikai.com/ask-navik/api";
		
RequestSpecification httpRequest = RestAssured.given();
		
		httpRequest.header("Content-Type", "application/json");
		
		JSONObject json = new JSONObject();
		
				
		json.put("requestStr", req);
//		json.put("requestStr", res);
		
		//Authentication Parameters
		given()
		.header("Content-Type", "application/json")
		.header("Accept", "application/json")
//		.header("Access_Token", "eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsImtpZCI6ImtnMkxZczJUMENUaklmajRydDZKSXluZW4zOCJ9.eyJhdWQiOiIxODc3YjM4NS0zODUxLTQxMzgtODEwZC02NGI4NWZlYjYwODAiLCJpc3MiOiJodHRwczovL2xvZ2luLm1pY3Jvc29mdG9ubGluZS5jb20vYWRhNGI3YWMtMWEyMC00OGQ4LTg4NWMtYWE3NjU5MTg5NzRlL3YyLjAiLCJpYXQiOjE2MDM5NTQ0MjcsIm5iZiI6MTYwMzk1NDQyNywiZXhwIjoxNjAzOTU4MzI3LCJhaW8iOiJBVFFBeS84UkFBQUFMbXFNS2s4Y0hPSEJJTk50bEhMZ3B3TDZwMnIyNndhOE1NYW5kUHR3WGVJbXI5MXpEckJ3akVEQk5YSVllZlB3IiwiYXpwIjoiMTg3N2IzODUtMzg1MS00MTM4LTgxMGQtNjRiODVmZWI2MDgwIiwiYXpwYWNyIjoiMCIsIm5hbWUiOiJQYW5rYWoiLCJvaWQiOiIwMjUyNjdhYi1iNmMxLTRmNDUtYjg3ZS05YjAyYWYyNjNmMTAiLCJwcmVmZXJyZWRfdXNlcm5hbWUiOiJwYW5rYWpAbWljcm93YXJlY29tcHV0aW5nLm9ubWljcm9zb2Z0LmNvbSIsInJoIjoiMC5BQUFBckxla3JTQWEyRWlJWEtwMldSaVhUb1d6ZHhoUk9EaEJnUTFrdUZfcllJQldBSncuIiwic2NwIjoicG1pIFVzZXIuUmVhZCIsInN1YiI6ImJ0alJuejU2WFR6ZUNTN2VQUWhvRnNmWnpzWm5jSnRKZVpDbzM3X3NjZU0iLCJ0aWQiOiJhZGE0YjdhYy0xYTIwLTQ4ZDgtODg1Yy1hYTc2NTkxODk3NGUiLCJ1dGkiOiJydDh4YkFqWkxVS1BFX2tlWGZZa0FRIiwidmVyIjoiMi4wIn0.DPy_5RDfXZuB2oa6M0mn4m52rbOA8BpGUm52t2gLvRSSA-ui6mhrVNEdpZ4Xh9BRnBcfgYYTcLN-5a9jAz-cK1izXEBiDVvmubFd6Ip8vFOmxIuLP8FA3fKrOoXAFH_bDUWN7dLgUSLqJNhOye-ZeYtPuyohANN1edoeghHVGCdb15kEz-sRaaLXIevzMrjXEW3AU0jegn8vWv3MxcAIuRFCXBSJfxhqnJqs-fxX5G9IAXfiGbxA2H8o_AHTCbjpJBnWHc_7IAUF5uQR1lhBh2UkJizq5kNZptzCWTuMrmsVF7n7JVCuvuYyPeKs1TgptB1Q4A7QvbRarRksOeULEw")
		.formParam("client_id", "1877b385-3851-4138-810d-64b85feb6080")
		.formParam("grant_type", "Implicit")
		.formParam("Scope", "openid api://1877b385-3851-4138-810d-64b85feb6080/User.Read")
		.formParam("State", "12345")
		.post("https://login.microsoftonline.com/organizations/oauth2/v2.0/authorize");


//	String token = resp.jsonPath().get("access_token");
		String token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsImtpZCI6ImtnMkxZczJUMENUaklmajRydDZKSXluZW4zOCJ9.eyJhdWQiOiIxODc3YjM4NS0zODUxLTQxMzgtODEwZC02NGI4NWZlYjYwODAiLCJpc3MiOiJodHRwczovL2xvZ2luLm1pY3Jvc29mdG9ubGluZS5jb20vYWRhNGI3YWMtMWEyMC00OGQ4LTg4NWMtYWE3NjU5MTg5NzRlL3YyLjAiLCJpYXQiOjE2MDQzODg2OTIsIm5iZiI6MTYwNDM4ODY5MiwiZXhwIjoxNjA0MzkyNTkyLCJhaW8iOiJBVFFBeS84UkFBQUEwaUU5KzZuRzF5YWg4bDdXdjA1Y3pNWXhwS2F3d3N5SVpBUlJjZ1FpUC9PcnhYZlFFWFlTSDVpMis2dStWY1J1IiwiYXpwIjoiMTg3N2IzODUtMzg1MS00MTM4LTgxMGQtNjRiODVmZWI2MDgwIiwiYXpwYWNyIjoiMCIsIm5hbWUiOiJQYW5rYWoiLCJvaWQiOiIwMjUyNjdhYi1iNmMxLTRmNDUtYjg3ZS05YjAyYWYyNjNmMTAiLCJwcmVmZXJyZWRfdXNlcm5hbWUiOiJwYW5rYWpAbWljcm93YXJlY29tcHV0aW5nLm9ubWljcm9zb2Z0LmNvbSIsInJoIjoiMC5BQUFBckxla3JTQWEyRWlJWEtwMldSaVhUb1d6ZHhoUk9EaEJnUTFrdUZfcllJQldBSncuIiwic2NwIjoicG1pIFVzZXIuUmVhZCIsInN1YiI6ImJ0alJuejU2WFR6ZUNTN2VQUWhvRnNmWnpzWm5jSnRKZVpDbzM3X3NjZU0iLCJ0aWQiOiJhZGE0YjdhYy0xYTIwLTQ4ZDgtODg1Yy1hYTc2NTkxODk3NGUiLCJ1dGkiOiI5SE5iZ0hYUXAwbVlCcGNRUVYyWEFBIiwidmVyIjoiMi4wIn0.u2rD3VUiu_7_2GPl0PT7YVwpm6X6AxgD_sGNhE4jEHTqf4Sq24_QqpIcvnTV10k27erBXLKKLmM8NnWEn3Juz7YtariKmD1SJOM0UcZI2YR_TXomVulcZ6TsBLKxaPr5cxWzVLsmVLO6h_MN6tygMj33g-iQVcmyWT96zxKw2o8PZd3pI0xYZdVgG2iJiFMtP7TGzV-9Rl9gJvRBH1q2dxRSqQTzUatpbMuPSwRYa3qa3Xbk8UNB7FFQ52veWss6IR8N8S1czlNjCI9Z-Zu1wWlLlNWvOkF4hXcrCN9ZjmRzZZupPklyFgsusJ_x7W4cKq6wJhcO4Ioz8Euxb7zieQ";
		
		Response resp1=RestAssured.
		given()
		.header("Content-Type","application/json")
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(json.toJSONString())
		.auth()
		.oauth2(token)
		.post("https://marketintelligenceuat.navikai.com/ask-navik/api/dialogFlowWebHook");
	
		httpRequest.body(json.toJSONString());
//		System.out.println(json.toJSONString());
	
//		Response response = httpRequest.request(Method.POST,"https://marketintelligencedev.navikai.com/ask-navik/api/dialogFlowWebHook");
		int code = resp1.getStatusCode();
		System.out.println("Status code is: "+code);
		Assert.assertEquals(code,200);
		
		String responseBody = resp1.getBody().asString();
		System.out.println("Response Body is : \n"+responseBody);
		
//		System.out.println("Pretty Response :" +resp1.jsonPath().prettify());

//		String res1=res;
//		
//		System.out.println(res1);
//		Assert.assertEquals(responseBody.contains(res1),true);
//		Assert.assertTrue(responseBody.contains("\"response\":\"Productivity of locality Sector 29 is 18.4\"")) ;
//		Assert.assertTrue(responseBody.contains(res));
		
		Assert.assertEquals(responseBody.contains(res),true);
		
//		String responseBody1 = response.jsonPath().get("response");
//		System.out.println("Response 2 : "+responseBody1);
		
//		Assert.assertEquals(responseBody1.contains(res),true);
		
	}	
		
		
	@DataProvider(name = "GetRequest")
	String [][] getEmpData() throws IOException
	{
		// Read data from Excel  
		System.out.println(System.getProperty("user.dir"));
		String path = System.getProperty("user.dir")+"/src/test/java/com/api/automation/DD/Auth2/api.xlsx";
//		String path = System.getProperty("user.dir")+"/src/test/java/com/api/automation/DD/Auth2/api2.xlsx";
		
		int rownum=ExcelUtils.getRowCount(path, "Sheet1");
		int colcount=ExcelUtils.getCellCount(path, "Sheet1", 1);  //1 is row number from where actual column data starts
		
		String empdata[][]=new String[rownum][colcount];
		
		for (int i = 1; i <= rownum; i++)
		{
			for (int j = 0; j < colcount; j++)   
			{
				empdata[i - 1][j]= ExcelUtils.getCellData(path, "Sheet1", i, j);
			}
			
		}
		
		return(empdata);
		
	}
	
}
