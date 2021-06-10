package com.example.Microservice;

import java.util.List;

import com.example.Microservice.CartDetails;

public class Order {
	String clientName, shippingAddress;
	Integer paymentAmount;
	List<CartDetails> cartDetails;
	@Override
	public String toString() {
		return "Order [clientName=" + clientName + ", shippingAddress=" + shippingAddress + ", paymentAmount="
				+ paymentAmount + ", cartDetails=" + cartDetails + "]";
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public String getShippingAddress() {
		return shippingAddress;
	}
	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	public Integer getPaymentAmount() {
		return paymentAmount;
	}
	public void setPaymentAmount(Integer paymentAmount) {
		this.paymentAmount = paymentAmount;
	}
	public List<CartDetails> getCartDetails() {
		return cartDetails;
	}
	public void setCartDetails(List<CartDetails> cartDetails) {
		this.cartDetails = cartDetails;
	}
	public Order(String clientName, String shippingAddress, Integer paymentAmount, List<CartDetails> cartDetails) {
		super();
		this.clientName = clientName;
		this.shippingAddress = shippingAddress;
		this.paymentAmount = paymentAmount;
		this.cartDetails = cartDetails;
	}
}
