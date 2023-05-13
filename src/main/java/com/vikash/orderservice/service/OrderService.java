package com.vikash.orderservice.service;

import com.vikash.orderservice.dto.OrderDto;
import com.vikash.orderservice.entity.OrderEntity;

public interface OrderService {
	
	OrderEntity processOrder(OrderDto orderDto);
	String test();

}
