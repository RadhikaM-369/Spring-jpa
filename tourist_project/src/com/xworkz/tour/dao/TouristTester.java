package com.xworkz.tour.dao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TouristTester {

	public static void main(String[] args) {
		EntityManagerFactory entityManangerFactory=Persistence.createEntityManagerFactory("com.xworkz.tour");
		System.out.println(entityManangerFactory);
	}

}
