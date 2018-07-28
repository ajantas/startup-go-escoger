package com.startup.oath.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.startup.oath.model.MobileData;
import com.startup.oath.service.MobileService;

@RestController
@RequestMapping("/mobiles")
public class MobileController {

	private final MobileService mobileService;
	
	@Autowired
	public MobileController(MobileService mobileService) {
		this.mobileService = mobileService;
	}
	
	@PostMapping
    public ResponseEntity<MobileData> save(@RequestBody MobileData mobile) {
		MobileData savedMobile = this.mobileService.save(mobile);
        return new ResponseEntity<>(savedMobile, HttpStatus.CREATED);
    }
}
