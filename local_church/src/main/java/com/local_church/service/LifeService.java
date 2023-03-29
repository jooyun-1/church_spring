package com.local_church.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.local_church.repository.LifeRepository;

@Service
public class LifeService {
	@Autowired
	private LifeRepository lifeRepository;
	
	public List<Map<String,Object>> getLifeList(String churchName){
		List<Map<String,Object>> lifeList = lifeRepository.findByInfo_ChurchName(churchName);
		return lifeList;
	}
}
