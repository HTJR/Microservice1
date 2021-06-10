package com.example.Microservice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class OrderService {

	List<Order> order = new ArrayList<Order>(Arrays.asList(new Order("Hrashikesh","address 1",4000,
																Arrays.asList(new CartDetails("ITEM 9",12)))));
	
	public List<Order> createOrder(Order orders){
		order.add(orders);
		return order;
	}
	
	public List<Order> getAllOrders(){
		return order;
	}
	
}


