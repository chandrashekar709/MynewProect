package com.qt.script;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import org.testng.annotations.Test;

public class Looping {
	int id;
	@Test(priority=1)
	public void get_Method()
	{
	given()
	.contentType("application/json")
	.when()
	.get("https://reqres.in/api/users/2")
	.then()
	.statusCode(200)
	.log().all();
	
	}@Test(priority=2)
	public void post_Method()
	{
		HashMap emp=new HashMap();
		emp.put("ename", "ram");
		emp.put("elocation", "hyd");
		emp.put("compny", "amazon");
		
		id=given()
		.contentType("application/json")
		.when()
		.post("https://reqres.in/api/users")
		.jsonPath().getInt("id");
	}
	@Test(priority=3, dependsOnMethods= {"post_Method"})
	
	public void update_Request() 

	{
		HashMap emp=new HashMap();
		emp.put("ename", "ram");
		emp.put("elocation", "vij");
		emp.put("compny", "wipro");
		given()
		.contentType("application/json")
		.when()
		.put("https://reqres.in/api/users/"+id)
		.then()
		.statusCode(200)
		.log().all();
	}
	@Test(priority=4)
	public void delete_Request()
	{
		given()
		.contentType("application/json")
		.when()
		.delete("https://reqres.in/api/users/"+id)
		.then()
		.statusCode(204)
		.log().all();

		
		
	}
	@Test(priority=5)

	
	public void id()
	{
		System.out.println("id no is " +id);
	}

	
	
	
	

}
