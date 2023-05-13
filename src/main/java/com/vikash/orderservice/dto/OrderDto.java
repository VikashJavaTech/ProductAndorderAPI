package com.vikash.orderservice.dto;

import java.io.Serializable;

public class OrderDto implements Serializable {
	
	private Long productId;
	private int quantity;
	private String paymentMode;
	
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	@Override
	public String toString() {
		return "OrderDto [productId=" + productId + ", quantity=" + quantity + ", paymentMode=" + paymentMode + "]";
	}
	

}
