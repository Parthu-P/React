package com.parthu.binding;

import javax.persistence.Lob;

import com.parthu.entity.CustomerFile;

import lombok.Data;

@Data
public class CustomerBinding {

	private String custName;
	private Integer custAge;
	private Double custSalary;
	private String custFileName;
	private byte[] custPhoto;
	@Lob
	private CustomerFile custFile;
}
