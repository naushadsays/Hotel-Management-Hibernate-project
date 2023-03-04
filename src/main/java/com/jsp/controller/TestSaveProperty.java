package com.jsp.controller;

import com.jsp.dto.Property;
import com.jsp.service.PropertyService;

public class TestSaveProperty {
	public static void main(String[] args) {
		Property property = new Property();
		property.setProperty_name("TAJ HOTEL");
		property.setProperty_location("MUMBAI");
		property.setNum_of_rooms(3);
		property.setRating(4);

		Property property2 = new Property();
		property2.setProperty_name("THE LALIT");
		property2.setProperty_location("MUMBAI");
		property2.setNum_of_rooms(3);
		property2.setRating(4);

		Property property3 = new Property();
		property3.setProperty_name("IBIS");
		property3.setProperty_location("VASHI");
		property3.setNum_of_rooms(3);
		property3.setRating(5);

		PropertyService propertyService = new PropertyService();
		propertyService.create(property);
		propertyService.create(property2);
		propertyService.create(property3);
		
	}
}
