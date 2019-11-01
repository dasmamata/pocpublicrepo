package com.tao.poc.gcp.rest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(	name = "CHECKBOOKREQUEST")
public class CheckBookRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int requestNo;
    
    @Column(name = "ACCNT_NBR", nullable = false)
    private int accountNumber;

    @Column(name = "NO_OF_CHECKS", nullable = false)
    private int noOfChecks;

    @Column(name = "NO_OF_CHECK_BOOKS", nullable = false)
    private int noOfCheckBooks;

    @Column(name = "NOTES", nullable = false)
    private String notes;

	public int getRequestNo() {
		return requestNo;
	}

	public void setRequestNo(int requestNo) {
		this.requestNo = requestNo;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getNoOfChecks() {
		return noOfChecks;
	}

	public void setNoOfChecks(int noOfChecks) {
		this.noOfChecks = noOfChecks;
	}

	public int getNoOfCheckBooks() {
		return noOfCheckBooks;
	}

	public void setNoOfCheckBooks(int noOfCheckBooks) {
		this.noOfCheckBooks = noOfCheckBooks;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}
}
