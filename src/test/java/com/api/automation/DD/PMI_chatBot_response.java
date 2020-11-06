package com.api.automation.DD;

import java.io.IOException;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
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
		
		httpRequest.body(json.toJSONString());
//		System.out.println(json.toJSONString());
	
		Response response = httpRequest.request(Method.POST,"https://marketintelligencedev.navikai.com/ask-navik/api/dialogFlowWebHook");
		int code = response.getStatusCode();
		System.out.println("Status code is: "+code);
		Assert.assertEquals(code,200);
		
		String responseBody = response.getBody().asString();
		System.out.println("Response Body is : \n"+responseBody);
		
		System.out.println("Pretty Response :" +response.jsonPath().prettify());

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
//		String path = System.getProperty("user.dir")+"/src/test/java/com/api/automation/DD/api.xlsx";
		String path = System.getProperty("user.dir")+"/src/test/java/com/api/automation/DD/api2.xlsx";
		
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
