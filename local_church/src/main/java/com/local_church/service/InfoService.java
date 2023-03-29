package com.local_church.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.local_church.entity.Info;
import com.local_church.repository.InfoRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class InfoService {
	@Autowired
	private InfoRepository infoRepository;
	
//	public Info createInfo(Info info) {
//		Info savedInfo = infoRepository.save(info);
//		return savedInfo;
//	}
	
	public Info getInfo(String churchName){
		return infoRepository.findByChurchName(churchName);
	}
}
