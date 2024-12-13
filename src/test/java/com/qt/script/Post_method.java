package com.qt.script;
import static io.restassured.RestAssured.*;
//import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import org.testng.annotations.Test;

public class Post_method {
	@Test
	public void create_method()
	{
		HashMap emp=new HashMap();
		emp.put("ename", "ram");
		emp.put("elocation", "hyd");
		emp.put("compny", "amazon");
		
		given()
		.contentType("application/json")
		//.body(emp)
		.when()
		.post("https://reqres.in/api/users")
		.then()
	
		.log().all();
		
		
	}

}
