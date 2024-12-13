package com.qt.script;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


import org.json.JSONObject;
import org.testng.annotations.Test;

public class Jsonobject{
	int id;
	@Test
	
	public void jsonMethod1()
	{
		JSONObject obj=new JSONObject();
		obj.put("ename", "raja");
		obj.put("eid", "23");
		obj.put("eloc", "hyd");
		given()
		.contentType("application/json")
		.when()
		.post("https://reqres.in/api/users")
		.then()
		.statusCode(201)
		.body("eid", equalTo(23))
		.log().all();
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
