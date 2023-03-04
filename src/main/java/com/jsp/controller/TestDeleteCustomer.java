package com.jsp.controller;

import com.jsp.service.CustomerService;

public class TestDeleteCustomer {
	public static void main(String[] args) {
		int customer_id = 1;
		CustomerService customerService = new CustomerService();
		customerService.delete(customer_id);

	}
}
