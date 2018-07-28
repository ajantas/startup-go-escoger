package com.startup.oath.service;

import java.util.UUID;

import com.startup.oath.model.MobileData;
import com.startup.oath.repositories.MobileRepository;

public class MobileServiceImpl implements MobileService{

	private final MobileRepository mobileRepository;
	
	public MobileServiceImpl(MobileRepository mobileRepository) {
		this.mobileRepository = mobileRepository;
	}

	@Override
	public MobileData save(MobileData mobile) {
		if(mobile.getId() == null) {
			mobile.setId(UUID.randomUUID());
		}
		this.mobileRepository.save(mobile);
		return mobile;
	}
}
