package com.local_church.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.local_church.entity.BusInfo;
import com.local_church.repository.BusInfoRepository;

@Service
public class BusInfoService {
	@Autowired
	private BusInfoRepository businfoRepository;
	
	public Map<String,Object> getBusInfo(String churchName){
		Map<String,Object> busInfo = businfoRepository.findByInfo_ChurchName(churchName);
		return busInfo;
	}
}
