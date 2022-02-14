package com.order.details.orderdetails.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.order.details.orderdetails.entity.Order;
import com.order.details.orderdetails.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	OrderService orderService;

	@Autowired
	Environment environment;

	@GetMapping("/port")
	public String getPort() {
		return "Order service running on port : " + environment.getProperty("local.server.port");
	}

	@GetMapping("/get")
	public Map<Integer, List<Order>> getAll() {
		return orderService.getAll();
	}

	@GetMapping("/get/{userId}")
	public List<Order> getById(@PathVariable("userId") Integer userId) {
		return orderService.getById(userId);
	}

	@PostMapping("/post/{userId}")
	public List<Order> postByVariable(@PathVariable("userId") Integer userId, @RequestBody List<Order> orderList) {
		return orderService.postByVariable(userId, orderList);
	}

	@PostMapping("/post")
	public List<Order> postByParam(@RequestParam("userId") Integer userId, @RequestBody List<Order> orderList) {
		return orderService.postByParam(userId, orderList);
	}

}
