package com.qt.script;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;


public class Delete_method {
	@Test
	
	public void delete_Request()
	{
		given()
		.contentType("application/json")
		.when()
		.delete("https://reqres.in/api/users/2")
		.then()
		.statusCode(204)
		.log().all();
		
		
	}

}
