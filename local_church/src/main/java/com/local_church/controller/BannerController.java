package com.local_church.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.local_church.service.BannerService;

@Controller
public class BannerController {
	@Autowired
	private BannerService bannerService;
	
	@GetMapping("{churchName}/banners")
	public ResponseEntity<List<Map<String,Object>>> getBanners(
			@PathVariable("churchName") String churchName){
		List<Map<String,Object>> banners = bannerService.getBanners(churchName);
		return new ResponseEntity<>(banners,HttpStatus.OK);
	}
}