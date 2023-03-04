package com.jsp.controller;

import java.util.List;

import com.jsp.dto.Room;
import com.jsp.service.PropertyService;

public class TestReadAllRoomsByPropertyId {
	public static void main(String[] args) {
		int property_id = 1;

		PropertyService propertyService = new PropertyService();
		List<Room> rooms = propertyService.readAllRoomsByPropertyId(property_id);

		for (Room room : rooms) {
			System.out.println(room.getRoom_id());
			System.out.println(room.getRoom_price());
			System.out.println(room.getRoom_status());
			System.out.println("property id is " + room.getProperty().getProperty_id());
			System.out.println();
		}
	}
}
