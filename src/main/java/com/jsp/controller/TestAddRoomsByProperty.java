package com.jsp.controller;

import com.jsp.dto.Property;
import com.jsp.service.PropertyService;

public class TestAddRoomsByProperty {
	public static void main(String[] args) {
		Property property = new Property();
		property.setProperty_id(3);

		int room_id=9;
		PropertyService propertyService = new PropertyService();
		propertyService.addRoomsByPropertyId(room_id, property);
	}
}
