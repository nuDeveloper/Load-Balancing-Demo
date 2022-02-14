package com.user.details.userdetails.dto;

public class OrderRequestDto {

	Integer orderId;
	String description;

	public OrderRequestDto(Integer orderId, String description) {
		this.orderId = orderId;
		this.description = description;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
