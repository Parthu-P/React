package com.parthu.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.parthu.entity.CustomerEntity;

public interface CustRepo extends JpaRepository<CustomerEntity, Integer> {

}
