package com.parthu.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.parthu.binding.CustomerBinding;
import com.parthu.entity.CustomerEntity;
import com.parthu.service.CustomerService;

@RestController
public class CustomerRestController {

	@Autowired
	private CustomerService service;
	
	@PostMapping("/saveObj")
	public ResponseEntity<CustomerEntity> saveCustObj(@RequestBody CustomerBinding cust) throws Exception{
		
		CustomerEntity entity = service.insertCustObj(cust);
		
		return new ResponseEntity<CustomerEntity>(entity,HttpStatus.CREATED);
		
	}
}
