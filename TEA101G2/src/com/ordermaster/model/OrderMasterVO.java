package com.ordermaster.model;

public class OrderMasterVO {
	private String orderMasterId;
	private String memberId;
	private java.sql.Date orderCreateDate;
	private Integer orderAmount;
	private String orderStatus;
	
	
	
	public OrderMasterVO() {
		super();
	}
	
	
	public String getOrderMasterId() {
		return orderMasterId;
	}

	public void setOrderMasterId(String orderMasterId) {
		this.orderMasterId = orderMasterId;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public java.sql.Date getOrderCreateDate() {
		return orderCreateDate;
	}

	public void setOrderCreateDate(java.sql.Date orderCreateDate) {
		this.orderCreateDate = orderCreateDate;
	}

	public Integer getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(Integer orderAmount) {
		this.orderAmount = orderAmount;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	
}