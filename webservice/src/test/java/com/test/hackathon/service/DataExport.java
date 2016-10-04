package com.test.hackathon.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.hackathon.webservice.service.RegistrationService;
import com.test.hackathon.BaseTest;

public class DataExport extends BaseTest{

	String emails[]={"puneet.behl@hcentive.com","Pranav.Nijhawan@hcentive.com","rakshit.jain@hcentive.com"};
	
	@Autowired
	RegistrationService regService;
	
	
	@Test
	public void doRegisterUser(){
		for (String user: emails){
			regService.registration(user, "9711616135", user.split("@")[0], "123456");
		}
	}
	
	@Test
	public void addClaim(){
		
	}
}
