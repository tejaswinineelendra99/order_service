package com.example.orderservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class OrderController {
	@Autowired /*provides dependecy injection does not provide loose coupling*/
	IOrderService service;

	@GetMapping("/order")
	public String getOrder() {
	service.getOrder();
	return "test";
	}
	
	@PostMapping("/order")
	public String postOrder()
	{
		service.postOrder();
		return "hello";
	}
}
	


