package com.sumita.productservice.Dto;

import java.math.BigDecimal;

public class Coupon {
	
	private Long id;
	private String code;
	private BigDecimal discount;
	private String exp_date;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public BigDecimal getDiscount() {
		return discount;
	}
	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
	}
	public String getExp_Date() {
		return exp_date;
	}
	public void setExp_Date(String exp_Date) {
		exp_date = exp_Date;
	}

}
