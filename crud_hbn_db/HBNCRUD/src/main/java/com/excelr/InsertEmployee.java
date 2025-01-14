package com.excelr;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertEmployee {

	public static void main(String[] args) {
		//load config file
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.config.xml");
		
		//create SessionFactory
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		
		//open session
		Session openSession = sessionFactory.openSession();
		
		//create transaction
		Transaction beginTransaction = openSession.beginTransaction();
		
		//insert employee
		Employee e1 = new Employee();
		e1.setE_id(101);
		e1.setE_name("EONE");
		e1.setE_sal(10000);
		e1.setE_image("https://reqres.in/img/faces/1-image.jpg");
		openSession.save(e1);
		
		Employee e2 = new Employee();
		e2.setE_id(201);
		e2.setE_name("ETWO");
		e2.setE_sal(20000);
		e2.setE_image("https://reqres.in/img/faces/2-image.jpg");
		openSession.save(e2);
		
		Employee e3 = new Employee();
		e3.setE_id(301);
		e3.setE_name("ETHREE");
		e3.setE_sal(30000);
		e3.setE_image("https://reqres.in/img/faces/3-image.jpg");
		openSession.save(e3);
		
		Employee e4 = new Employee();
		e4.setE_id(401);
		e4.setE_name("EFOUR");
		e4.setE_sal(40000);
		e4.setE_image("https://reqres.in/img/faces/4-image.jpg");
		openSession.save(e4);
		
		Employee e5 = new Employee();
		e5.setE_id(501);
		e5.setE_name("EFIVE");
		e5.setE_sal(50000);
		e5.setE_image("https://reqres.in/img/faces/5-image.jpg");
		openSession.save(e5);
		System.out.println("Employees records inserted successfully");
		
		beginTransaction.commit();
		openSession.close();
		sessionFactory.close();

	}

}
