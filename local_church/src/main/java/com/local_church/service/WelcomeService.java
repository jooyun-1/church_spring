package com.local_church.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.local_church.repository.WelcomeRepository;

@Service
public class WelcomeService {
	@Autowired
	private WelcomeRepository welcomeRepository;
	
	public List<Map<String,Object>> getWelcomeList(String churchName){
		List<Map<String,Object>> welcomeList = welcomeRepository.findByInfo_ChurchName(churchName);
		return welcomeList;
		
	}
}
