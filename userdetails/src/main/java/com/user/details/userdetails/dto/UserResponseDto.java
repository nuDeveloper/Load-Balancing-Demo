package com.user.details.userdetails.dto;

import java.util.List;

public class UserResponseDto {

	Integer id;
	String name;
	List<OrderResponseDto> orderList;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<OrderResponseDto> getOrderList() {
		return orderList;
	}

	public void setOrderList(List<OrderResponseDto> orderList) {
		this.orderList = orderList;
	}

}
