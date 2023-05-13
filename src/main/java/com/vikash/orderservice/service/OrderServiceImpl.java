package com.vikash.orderservice.service;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.vikash.orderservice.dto.OrderDto;
import com.vikash.orderservice.entity.OrderEntity;
import com.vikash.orderservice.reposistory.OrderReposistory;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	public OrderReposistory orderReposistory;
	
	@Autowired
	public RestTemplate restTemplate;
	@Override
	public OrderEntity processOrder(OrderDto orderDto) {
		
		System.out.println(orderDto);
		
		OrderEntity order = new OrderEntity();
		order.setProductId(orderDto.getProductId());
		order.setPaymentMode(orderDto.getPaymentMode());
		order.setQuantity(orderDto.getQuantity());
		order.setSoldDate(new Date(12, 10, 23));
		
		StringBuilder urlBuilder = new StringBuilder();
		urlBuilder.append("http://localhost:8080/productservice/findProuctPriceById/");
		urlBuilder.append(orderDto.getProductId());
	
		Double price = restTemplate.getForObject(urlBuilder.toString(),Double.class);
		order.setTotalPrice(price*order.getQuantity());
		return orderReposistory.saveOrder(order);
		
	}
	@Override
	public String test() {
		
		return "Success";
	}

}
