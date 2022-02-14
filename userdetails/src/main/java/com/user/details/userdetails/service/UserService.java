package com.user.details.userdetails.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.details.userdetails.dto.OrderRequestDto;
import com.user.details.userdetails.dto.OrderResponseDto;
import com.user.details.userdetails.dto.UserResponseDto;
import com.user.details.userdetails.entity.User;
import com.user.details.userdetails.feignclient.OrderClient;

@Service
public class UserService {

	@Autowired
	OrderClient orderClient;

	static Map<Integer, User> userDetails = new HashMap<Integer, User>();

	static {
		User user1 = new User(501, "Amit");
		User user2 = new User(502, "Mohan");
		User user3 = new User(503, "Zaheer");
		User user4 = new User(504, "Prakash");

		userDetails.put(501, user1);
		userDetails.put(502, user2);
		userDetails.put(503, user3);
		userDetails.put(504, user4);
	}

	public Map<Integer, List<OrderResponseDto>> getAll() {
		return orderClient.getAllOrders();
	}

	public UserResponseDto getById(int userId) {

		List<OrderResponseDto> orderList = orderClient.getOrdersById(userId);
		User user = userDetails.get(userId);
		UserResponseDto userResponseDto = new UserResponseDto();
		userResponseDto.setId(user.getId());
		userResponseDto.setName(user.getName());
		userResponseDto.setOrderList(orderList);
		return userResponseDto;
	}

	public List<OrderResponseDto> postByVariable(Integer userId, String userName, List<OrderResponseDto> orderResponseDtos) {
		User user = new User(userId, userName);
		userDetails.put(userId, user);
		return orderClient.postByVariable(userId, orderResponseDtos);
	}

	public List<OrderRequestDto> postByParam(Integer userId, String userName, List<OrderRequestDto> orderRequestDtos) {
		User user = new User(userId, userName);
		userDetails.put(userId, user);
		return orderClient.postByParam(userId, orderRequestDtos);
	}

	public String getPort() {
		return orderClient.getPort();
	}
}
