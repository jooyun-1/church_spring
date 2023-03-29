package com.local_church.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.local_church.repository.LogoRepository;

@Service
public class LogoService {
	@Autowired
	private LogoRepository logoRepository;
	public Map<String, Object> getLogo(String churchName) {
//		Logo logo = logoRepository.findByInfo_ChurchName(churchName);
		Map<String, Object> logo = logoRepository.findByInfo_ChurchName(churchName);
//		LogoDto logoDto = new LogoDto(logo.getLogoImg(), logo.getInfo().getChurchName());
		return logo;
	}
}
