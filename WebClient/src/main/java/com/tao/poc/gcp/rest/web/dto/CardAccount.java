package com.tao.poc.gcp.rest.web.dto;

import java.sql.Date;

public class CardAccount {

    private int accNo;
    
    private Long accountNumber;

    private Date noOfChecks;

    private String name;

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public Long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Date getNoOfChecks() {
		return noOfChecks;
	}

	public void setNoOfChecks(Date noOfChecks) {
		this.noOfChecks = noOfChecks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
