package com.jsp.service;

import java.util.ArrayList;

import java.util.List;

import com.jsp.dao.LandlordDao;
import com.jsp.dto.LandLord;
import com.jsp.dto.Property;

public class LandlordService {
	LandlordDao landlordDao = new LandlordDao();
	PropertyService propertyService = new PropertyService();

	public void create(LandLord landLord) {
		landLord.setStatus("Not Approved");
		landlordDao.create(landLord);
	}

	public void update(LandLord landLord) {
		landlordDao.update(landLord);
	}

	public void delete(int id) {
		LandLord landLord = landlordDao.readById(id);
		for (Property property : landLord.getPropertys()) {
			propertyService.delete(property.getProperty_id());
		}
		landlordDao.delete(id);
	}

	public LandLord readById(int id) {
		return landlordDao.readById(id);
	}

	public List<LandLord> readAllLandlord() {
		return landlordDao.readAllLandlord();
	}

	public void addPropertyById(int id, LandLord landLord) {
		LandLord landLord1 = landlordDao.readById(landLord.getId());
		if (landLord1.getStatus().equalsIgnoreCase("APPROVED")) {
			Property property = propertyService.readById(id);
			property.setLandLord(landLord1);

			ArrayList<Property> properties = new ArrayList<Property>();
			properties.add(property);

			landLord1.setPropertys(properties);

			landlordDao.update(landLord1);
			propertyService.update(property);

		} else {
			System.out.println("LandLord is not approved");
		}
	}
}
