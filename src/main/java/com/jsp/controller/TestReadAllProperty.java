package com.jsp.controller;

import java.util.List;

import com.jsp.dto.Property;
import com.jsp.service.PropertyService;

public class TestReadAllProperty {
	public static void main(String[] args) {
		PropertyService propertyService = new PropertyService();
		List<Property> properties = propertyService.readAllProperty();

		for (Property property : properties) {
			System.out.println(property.getProperty_id());
			System.out.println(property.getProperty_name());
			System.out.println("Location = "+property.getProperty_location());
			System.out.println("Number of Room = " + property.getNum_of_rooms());
			System.out.println("Property rating = " + property.getRating());
			System.out.println();
		}
	}
}
