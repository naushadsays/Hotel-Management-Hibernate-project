package com.jsp.controller;

import com.jsp.dto.Customer;
import com.jsp.service.CustomerService;

public class TestUpdateCustomer {
	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.setCustomer_id(1);
		customer.setCustomer_name("RAJAN");

		CustomerService customerService = new CustomerService();
		customerService.update(customer);
	}
}
