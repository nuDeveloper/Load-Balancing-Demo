package com.order.details.orderdetails.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.order.details.orderdetails.dto.OrderResponseDto;
import com.order.details.orderdetails.entity.Order;

@Service
public class OrderService {

	static Map<Integer, List<Order>> orderMap = new HashMap<Integer, List<Order>>();

	static {

		List<Order> list1 = new ArrayList<Order>();
		list1.add(new Order(101, "Book"));
		list1.add(new Order(102, "Pen"));
		list1.add(new Order(103, "Eraser"));

		List<Order> list2 = new ArrayList<Order>();
		list2.add(new Order(201, "Jeans"));
		list2.add(new Order(202, "Tshits"));
		list2.add(new Order(203, "Shirt"));

		List<Order> list3 = new ArrayList<Order>();
		list3.add(new Order(301, "Watch"));
		list3.add(new Order(302, "Ring"));
		list3.add(new Order(303, "Bracelet"));

		orderMap.put(501, list1);
		orderMap.put(502, list2);
		orderMap.put(503, list3);

	}

	public Map<Integer, List<Order>> getAll() {
		return orderMap;
	}

	public List<Order> getById(Integer userId) {
		return orderMap.get(userId);
	}

	public List<Order> postByVariable(Integer userId, List<Order> orderList) {
		orderMap.put(userId, orderList);
		return orderList;
	}

	public List<Order> postByParam(Integer userId, List<Order> orderList) {
		orderMap.put(userId, orderList);
		return orderList;
	}

	public List<Order> postOrder(List<Order> orderList) {
		// TODO Auto-generated method stub
		return null;
	}

}
