package com.parthu.service;

import com.parthu.binding.CustomerBinding;
import com.parthu.entity.CustomerEntity;

public interface CustomerService {

	public CustomerEntity insertCustObj(CustomerBinding obj) throws Exception;
}
