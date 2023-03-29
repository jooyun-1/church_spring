package com.local_church.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.local_church.entity.Logo;
import com.local_church.service.LogoService;

@Controller
public class LogoController {
	@Autowired
	private LogoService logoService;
	
	@GetMapping("{churchName}/logo")
	public ResponseEntity<Map<String, Object>> getLogo(
			@PathVariable("churchName") String churchName){
		Map<String, Object> logo = logoService.getLogo(churchName);
		return new ResponseEntity<>(logo, HttpStatus.OK);
	}
}
 