package com.jsp.controller;

import com.jsp.dto.Admin;
import com.jsp.service.AdminService;

public class TestApproveLandlord {
	public static void main(String[] args) {
		Admin admin = new Admin();
		admin.setAdmin_id(1);
		
		int Landlord_id = 3;

		AdminService adminService = new AdminService();
		adminService.approveLandlordById(Landlord_id, admin);
	}

}
