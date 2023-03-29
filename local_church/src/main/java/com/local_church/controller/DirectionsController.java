package com.local_church.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.local_church.service.DirectionsService;

@Controller
public class DirectionsController {
	@Autowired
	private DirectionsService directionsService;
	
	@GetMapping("{churchName}/direction")
	public ResponseEntity<Map<String,Object>> getDirection(
			@PathVariable("churchName") String churchName){
		Map<String,Object> direction = directionsService.getDirection(churchName);
		return new ResponseEntity<>(direction,HttpStatus.OK);
	}
}
