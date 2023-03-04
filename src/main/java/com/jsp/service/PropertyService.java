package com.jsp.service;

import java.util.ArrayList;
import java.util.List;

import com.jsp.dao.PropertyDao;
import com.jsp.dto.Property;
import com.jsp.dto.Room;

public class PropertyService {
	PropertyDao propertyDao = new PropertyDao();
	RoomService roomService = new RoomService();

	public void create(Property property) {
		propertyDao.create(property);
	}

	public void update(Property property) {
		propertyDao.update(property);
	}

	public void delete(int id) {
		Property property2 = propertyDao.readPropertyById(id);
		for (Room room : property2.getRoom()) {
			roomService.deleteById(room.getRoom_id());
		}
		propertyDao.delete(id);
	}

	public Property readById(int id) {
		return propertyDao.readPropertyById(id);
	}

	public List<Property> readAllProperty() {
		List<Property> properties = new ArrayList<Property>();
		for (Property property : propertyDao.readAllProperty()) {
			if (property.getLandLord() != null) {
				properties.add(property);
			}
		}
		return properties;
	}

	public void addRoomsByPropertyId(int id, Property property) {
		Property property2 = propertyDao.readPropertyById(property.getProperty_id());
		if (property2.getLandLord() != null) {
			Room room = roomService.readById(id);
			room.setProperty(property);

			ArrayList<Room> rooms = new ArrayList<Room>();
			rooms.add(room);

			property.setRoom(rooms);

			propertyDao.update(property);
			roomService.update(room);
		} else {
			System.out.println("Property Is Not Approved");
		}
	}

	public List<Room> readAllRoomsByPropertyId(int id) {
		return roomService.readAllRoomByPropertyId(id);
	}

}
