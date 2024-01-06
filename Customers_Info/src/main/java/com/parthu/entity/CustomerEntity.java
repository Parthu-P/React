package com.parthu.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import lombok.Data;

@Data
@Entity
public class CustomerEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer custId;
	private String custName;
	private Integer custAge;
	private Double custSalary;
	private String custFileName;
	private byte[] custPhoto;
	
	@Lob
	private CustomerFile custFile;
	
}
