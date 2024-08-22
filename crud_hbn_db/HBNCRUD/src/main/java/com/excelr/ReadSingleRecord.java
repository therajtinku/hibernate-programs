package com.excelr;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ReadSingleRecord {

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
				
				Employee employee = openSession.get(Employee.class, 101);
				System.out.println(employee.getE_id() + " " + employee.getE_name() + " " + employee.getE_sal() + " " + employee.getE_image());
				
				beginTransaction.commit();
				openSession.close();
				sessionFactory.close();

	}

}
