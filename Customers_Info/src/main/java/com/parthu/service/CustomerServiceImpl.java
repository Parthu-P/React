package com.parthu.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parthu.binding.CustomerBinding;
import com.parthu.entity.CustomerEntity;
import com.parthu.repo.CustRepo;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustRepo repo;

	@Override
	public CustomerEntity insertCustObj(CustomerBinding obj) throws Exception {
		
		try {
		CustomerEntity entity=new CustomerEntity(); 
		BeanUtils.copyProperties(obj, entity);
		repo.save(entity);
		return entity;
		}
		catch(Exception e) {
			throw new Exception("file saved : "+e.getMessage());
		}
	}

}
