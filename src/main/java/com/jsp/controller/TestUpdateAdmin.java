package com.jsp.controller;

import com.jsp.dto.Admin;
import com.jsp.service.AdminService;

public class TestUpdateAdmin {
	public static void main(String[] args) {
		Admin admin = new Admin();
		admin.setAdmin_id(1);
		admin.setAdmin_name("NAUSHAD");
		
		
		AdminService adminService = new AdminService();
		adminService.update(admin);
	}
}
