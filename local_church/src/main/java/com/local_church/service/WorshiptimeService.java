package com.local_church.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.local_church.repository.WorshiptimeRepository;

@Service
public class WorshiptimeService {
	@Autowired
	private WorshiptimeRepository worshiptimeRepository;
	
	public List<Map<String,Object>> getWorshipTime(String churchName){
		List<Map<String,Object>> worshiptime = worshiptimeRepository.findByInfo_ChurchName(churchName);
		return worshiptime;
	}
}
