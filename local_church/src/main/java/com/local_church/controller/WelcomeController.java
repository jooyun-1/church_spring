package com.local_church.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.local_church.service.WelcomeService;

@Controller
public class WelcomeController {
	@Autowired
	private WelcomeService welcomeService;
	
	@GetMapping("{churchName}/welcome")
	public ResponseEntity<List<Map<String,Object>>> getWelcomeList(
			@PathVariable("churchName") String churchName){
		List<Map<String,Object>> welcomeList = welcomeService.getWelcomeList(churchName);
		return new ResponseEntity<>(welcomeList,HttpStatus.OK);
	}
	
}
