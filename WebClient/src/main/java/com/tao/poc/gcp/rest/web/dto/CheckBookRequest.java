package com.tao.poc.gcp.rest.web.dto;

public class CheckBookRequest {

	private Long accountNumber;
	private Integer noOfChecks;
	private Integer noOfCheckBooks;
	private String notes;
	
	public Long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public Integer getNoOfChecks() {
		return noOfChecks;
	}
	public void setNoOfChecks(Integer noOfChecks) {
		this.noOfChecks = noOfChecks;
	}
	public Integer getNoOfCheckBooks() {
		return noOfCheckBooks;
	}
	public void setNoOfCheckBooks(Integer noOfCheckBooks) {
		this.noOfCheckBooks = noOfCheckBooks;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
}
