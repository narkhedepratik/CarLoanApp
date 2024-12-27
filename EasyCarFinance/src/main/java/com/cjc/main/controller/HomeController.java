 package com.cjc.main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.GetExchange;

@RestController
 public class HomeController{
	 
	@GetMapping("/")
	public String testApi()
	{
		return "I am running fine";
	}

	 @GetMapping("/get-all-enquiries")
	public String getAllEnquiries()
	{
		
		return "No enquiries yet";
	}
	 
 }
