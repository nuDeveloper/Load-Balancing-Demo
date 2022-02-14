package com.user.details.userdetails.feignclient;

import java.util.List;
import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.user.details.userdetails.dto.OrderRequestDto;
import com.user.details.userdetails.dto.OrderResponseDto;

@FeignClient(name = "http://ORDER-SERVICE/order")
public interface OrderClient {
	
	@GetMapping("/port")
	public String getPort();

	@GetMapping("/get")
	public Map<Integer, List<OrderResponseDto>> getAllOrders();

	@GetMapping("/get/{userId}")
	public List<OrderResponseDto> getOrdersById(@PathVariable("userId") Integer userId);

	@PostMapping("/post/{userId}")
	public List<OrderResponseDto> postByVariable(@PathVariable("userId") Integer userId,
			@RequestBody List<OrderResponseDto> orderResponseDtos);

	@PostMapping("/post")
	public List<OrderRequestDto> postByParam(@RequestParam("userId") Integer userId,
			@RequestBody List<OrderRequestDto> orderList);

}
