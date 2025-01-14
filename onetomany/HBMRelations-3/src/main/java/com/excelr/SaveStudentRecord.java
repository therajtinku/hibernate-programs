package com.excelr;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SaveStudentRecord {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.config.xml").buildSessionFactory();
		Session openSession = sessionFactory.openSession();
		Transaction beginTransaction = openSession.beginTransaction();
		
		Address address = new Address();
		address.setCity("Hyd");
		address.setState("telangana");
		address.setCountry("india");
		address.setPincode(500034);
		
		Students students1 = new Students();
		students1.setSname("Chintu");
		students1.setScourse("Testing");
		students1.setAddress(address);
		
		Students students2 = new Students();
		students2.setSname("Tinku");
		students2.setScourse("Testing");
		students2.setAddress(address);
		
		Students students3 = new Students();
		students3.setSname("Chintu");
		students3.setScourse("Testing");
		students3.setAddress(address);
		
		
		
		openSession.persist(students1);
		openSession.persist(students2);
		openSession.persist(students3);
		beginTransaction.commit();
		openSession.close();
		sessionFactory.close();
		System.out.println("success");
	}

}
