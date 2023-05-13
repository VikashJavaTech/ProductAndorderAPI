package com.vikash.orderservice.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="order_info")
public class OrderEntity {
	
	@Id
	@Column(name="alt_key")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long altKey;
	
	@Column(name="product_id")
	private long productId;
	
	private int quantity;
	
	@Column(name="total_price")
	private Double totalPrice;
	
	@Column(name="payment_mode")
	private String paymentMode;
	
	@Column(name="sold_date")
	private Date soldDate;
	public long getAltKey() {
		return altKey;
	}
	public void setAltKey(long altKey) {
		this.altKey = altKey;
	}
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	public Date getSoldDate() {
		return soldDate;
	}
	public void setSoldDate(Date soldDate) {
		this.soldDate = soldDate;
	}
	@Override
	public String toString() {
		return "OrderEntity [altKey=" + altKey + ", productId=" + productId + ", quantity=" + quantity + ", totalPrice="
				+ totalPrice + ", paymentMode=" + paymentMode + ", soldDate=" + soldDate + "]";
	}
	

}
