package com.local_church.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.local_church.service.WorshiptimeService;

@Controller
public class WorshiptimeController {
	@Autowired
	private WorshiptimeService worshiptimeService;
	
	@GetMapping("{churchName}/worshiptime")
	public ResponseEntity<List<Map<String,Object>>> getWorshiptime(
			@PathVariable("churchName") String churchName){
		List<Map<String,Object>> worshiptime = worshiptimeService.getWorshipTime(churchName);
		return new ResponseEntity<>(worshiptime,HttpStatus.OK);
	}
}
