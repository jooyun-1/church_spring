package com.local_church.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.local_church.service.BusInfoService;

@Controller
public class BusInfoController {
	@Autowired
	private BusInfoService businfoService;
	
	@GetMapping("{churchName}/businfo")
	public ResponseEntity<Map<String, Object>> getBusInfo(
			@PathVariable("churchName") String churchName){
		Map<String,Object> businfo = businfoService.getBusInfo(churchName);
		return new ResponseEntity<>(businfo,HttpStatus.OK);
	}
	
}
