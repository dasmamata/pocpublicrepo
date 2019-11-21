package com.tao.poc.gcp.rest.web.dto;

public class CheckBookRequest {

	private Long accountNo;
	private Integer checkBookCount;
	private Integer checkBookPages;
	private String notes;

	public Long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(Long accountNo) {
		this.accountNo = accountNo;
	}
	public Integer getCheckBookCount() {
		return checkBookCount;
	}
	public void setCheckBookCount(Integer checkBookCount) {
		this.checkBookCount = checkBookCount;
	}
	public Integer getCheckBookPages() {
		return checkBookPages;
	}
	public void setCheckBookPages(Integer checkBookPages) {
		this.checkBookPages = checkBookPages;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
}
