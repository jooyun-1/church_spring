package com.local_church.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.local_church.repository.BannerRepository;

@Service
public class BannerService {
	@Autowired
	private BannerRepository bannerRepository;
	public List<Map<String,Object>> getBanners(String churchName) {
		List<Map<String,Object>> banners = bannerRepository.findByInfo_ChurchName(churchName);
//		if (banners != null) {
			return banners;
//		}else {
//			throw new IllegalArgumentException("No banners found for " + churchName);
//			//return Collections.emptyList();
//		}
		 
	}
}
