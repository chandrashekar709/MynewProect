package com.qt.script;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class Dummy_data {

	@Test
	public void dummy_Method()
	{
		Faker fake=new Faker();	
		String fullname =fake.name().firstName();
		String firstname=fake.name().firstName();
		String lastname=fake.name().lastName();
		String password=fake.internet().password();
		String emailaddress=fake.internet().safeEmailAddress();
		String phonenumber=fake.phoneNumber().cellPhone();
		System.out.println("full name is "+fullname);
		System.out.println("frst name is "+firstname);
		System.out.println("last name is "+lastname);
		System.out.println("password is "+password);
		System.out.println("email address is "+emailaddress);
		System.out.println("phone number is "+phonenumber);
			
	
	}

	
	
}
