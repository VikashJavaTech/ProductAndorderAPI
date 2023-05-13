package com.vikash.orderservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vikash.orderservice.dto.OrderDto;
import com.vikash.orderservice.entity.OrderEntity;
import com.vikash.orderservice.service.OrderService;

@RestController
public class OrderController {
	
	@Autowired
	public OrderService orderService;
	
	@PostMapping("/order")
	public OrderEntity processOrder( @RequestBody OrderDto orderDto)
	{
		System.out.println("Controller orderDto: "+orderDto);
		return orderService.processOrder(orderDto);
	}
	@GetMapping("test")
	public String test()
	{
		return orderService.test() ;
	}
}
