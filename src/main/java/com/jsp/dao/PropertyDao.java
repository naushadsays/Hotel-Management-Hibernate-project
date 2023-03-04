package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Property;

public class PropertyDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("naushad");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public void create(Property property) {
		entityTransaction.begin();
		entityManager.persist(property);
		entityTransaction.commit();
	}

	public void update(Property property) {
		Property property2 = entityManager.find(Property.class, property.getProperty_id());
		if (property2 != null) {
			entityTransaction.begin();
			if (property.getProperty_name() != null) {
				property2.setProperty_name(property.getProperty_name());
			}
			if (property.getProperty_location() != null) {
				property2.setProperty_location(property.getProperty_location());
			}
			if (property.getNum_of_rooms() != null) {
				property2.setNum_of_rooms(property.getNum_of_rooms());
			}
			if (property.getRating() != null) {
				property2.setRating(property.getRating());
			}
			if (property.getLandLord() != null) {
				property2.setLandLord(property.getLandLord());
			}
			if (property.getRoom() != null) {
				property2.setRoom(property.getRoom());
			}
			entityManager.merge(property2);
			entityTransaction.commit();
		}
	}

	public void delete(int id) {
		Property property2 = entityManager.find(Property.class, id);
		entityTransaction.begin();
		entityManager.remove(property2);
		entityTransaction.commit();
	}

	public Property readPropertyById(int id) {
		return entityManager.find(Property.class, id);
	}

	public List<Property> readAllProperty() {
		String sql = "Select s From Property s";
		Query query = entityManager.createQuery(sql);
		List<Property> properties = query.getResultList();
		return properties;
	}
}
