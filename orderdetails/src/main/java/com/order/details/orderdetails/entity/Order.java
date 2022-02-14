package com.order.details.orderdetails.entity;

public class Order {

	Integer orderId;
	String description;

	public Order() {
	}

	public Order(Integer orderId, String description) {
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
