package com.local_church.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.local_church.repository.DirectionsRepository;

@Service
public class DirectionsService {
	@Autowired
	private DirectionsRepository directionsRepository;
	
	public Map<String,Object> getDirection(String churchName) {
		Map<String,Object> direction = directionsRepository.findByInfo_ChurchName(churchName);
		return direction;
	}
}
 