package com.user.details.userdetails.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.user.details.userdetails.dto.OrderRequestDto;
import com.user.details.userdetails.dto.OrderResponseDto;
import com.user.details.userdetails.dto.UserResponseDto;
import com.user.details.userdetails.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;
	
	@GetMapping("/port")
	public String getPort() {
		return userService.getPort();
	}

	@GetMapping("/get")
	public Map<Integer, List<OrderResponseDto>> getAll() {
		return userService.getAll();
	}

	@GetMapping("/get/{userId}")
	public UserResponseDto getById(@PathVariable("userId") Integer userId) {
		return userService.getById(userId);
	}

	@PostMapping("/post/{userId}/{userName}")
	public List<OrderResponseDto> postOrder(@PathVariable("userId") Integer userId,
			@PathVariable("userName") String userName, @RequestBody List<OrderResponseDto> orderResponseDtos) {
		return userService.postByVariable(userId, userName, orderResponseDtos);
	}

	@PostMapping("/post")
	public List<OrderRequestDto> postByParam(@RequestParam("userId") Integer userId,
			@RequestParam("userName") String userName, @RequestBody List<OrderRequestDto> orderRequestDtos) {
		return userService.postByParam(userId, userName, orderRequestDtos);
	}
}
