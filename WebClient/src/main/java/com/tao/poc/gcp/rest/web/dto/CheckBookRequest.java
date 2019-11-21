package com.tao.poc.gcp.rest.web.dto;

public class CheckBookRequest {

	private int accountNumber;
	private int noOfChecks;
	private int noOfCheckBooks;
	private String notes;
	
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
