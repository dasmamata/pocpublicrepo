package com.tao.poc.gcp.rest.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(	name = "CARDACCOUNT")
public class CardAccount {

    @Id
    @Column(name = "ACC_NBR", nullable = false)
    private int accountNumber;
    
    @Column(name = "EXPIRY_DATE", nullable = true)
    private Date expiryDate;

	@Column(name = "NAME", nullable = false)
    private String name;

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
    public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
}
