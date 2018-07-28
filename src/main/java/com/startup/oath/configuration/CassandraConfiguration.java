package com.startup.oath.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.startup.oath.repositories.MobileRepository;
import com.startup.oath.service.MobileService;
import com.startup.oath.service.MobileServiceImpl;

@Configuration
public class CassandraConfiguration {

	@Bean
	public MobileService mobileService(MobileRepository mobileRepository) {
		return new MobileServiceImpl(mobileRepository);
	}
}
