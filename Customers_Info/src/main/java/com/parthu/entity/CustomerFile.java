package com.parthu.entity;

import javax.persistence.Embeddable;
import javax.persistence.Lob;

import lombok.Data;

@Data
@Embeddable
public class CustomerFile {

	@Lob
    private byte[] productName;
    private Integer productCost;
}
