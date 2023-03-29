package com.local_church.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.local_church.entity.Info;
import com.local_church.service.InfoService;

@Controller
public class InfoController {
	@Autowired
	private InfoService infoService;
	
	@GetMapping("{church_name}/info")
	public ResponseEntity<Info> getInfo(
			@PathVariable("church_name") String church_name){
		Info info = infoService.getInfo(church_name);
		return new ResponseEntity<>(info,HttpStatus.OK);
		
	}
}
