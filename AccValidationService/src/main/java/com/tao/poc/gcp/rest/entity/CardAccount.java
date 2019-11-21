package com.tao.poc.gcp.rest.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(	name = "CARDACCOUNT")
public class CardAccount {

    @Id
    @Column(name = "ACC_NBR", nullable = false)
    private int accountNumber;
    
    @Column(name = "EXPIRY_DATE", nullable = true)
    private Date noOfChecks;

    @Column(name = "NAME", nullable = false)
    private String name;

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
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
