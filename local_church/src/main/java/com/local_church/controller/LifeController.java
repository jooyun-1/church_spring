package com.local_church.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.local_church.service.LifeService;

@Controller
public class LifeController {
	@Autowired
	private LifeService lifeService;
	
	@GetMapping("{churchName}/life")
	public ResponseEntity<List<Map<String,Object>>> getLifeList(
			@PathVariable("churchName") String churchName){
		List<Map<String,Object>> lifeList = lifeService.getLifeList(churchName);
		return new ResponseEntity<>(lifeList,HttpStatus.OK);
	}
	
}
