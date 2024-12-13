package com.qt.script;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


import java.util.HashMap;

import org.testng.annotations.Test;

public class Update_method {
	@Test
	
	public void update_Request() 

	{
		HashMap emp=new HashMap();
		emp.put("ename", "ram");
		emp.put("elocation", "vij");
		emp.put("compny", "wipro");
		given()
		.contentType("application/json")
		.when()
		.put("https://reqres.in/api/users/2")
		.then()
		.statusCode(200)
		.log().all();
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
