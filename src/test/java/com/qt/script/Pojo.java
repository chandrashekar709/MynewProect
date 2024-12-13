package com.qt.script;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Pojo {
	@Test(enabled=false)
	public void pojo_method() throws JsonProcessingException
	{
		
		Emp_info obj=new Emp_info();
		obj.setid(20);
		obj.setname("manu");
		obj.setloc("hyd");
		ObjectMapper om =new ObjectMapper();
		String str=om.writerWithDefaultPrettyPrinter().writeValueAsString(obj);
		System.out.println(str);
		
	}
	@Test
	
	public void jsontopojo() throws JsonMappingException, JsonProcessingException   
	{
		String s="{\r\n"
				+ "  \"name\" : \"manu\",\r\n"
				+ "  \"id\" : 20,\r\n"
				+ "  \"loc\" : \"hyd\"\r\n"
				+ "}";
		
		ObjectMapper objm =new ObjectMapper();
		Emp_info data=objm.readValue(s, Emp_info.class);
		System.out.println("stdt id is "+data.emp_id);
		System.out.println("stdt name is "+data.emp_name);
		System.out.println("stdt loc is "+data.emp_loc);

		
	}
	
	

}
