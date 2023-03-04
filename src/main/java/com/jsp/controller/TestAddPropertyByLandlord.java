package com.jsp.controller;

import com.jsp.dto.LandLord;
import com.jsp.service.LandlordService;

public class TestAddPropertyByLandlord {
	public static void main(String[] args) {
		LandLord landLord = new LandLord();
		landLord.setId(3);

		int property_id = 3;
		LandlordService landlordService = new LandlordService();
		landlordService.addPropertyById(property_id, landLord);

	}
}
