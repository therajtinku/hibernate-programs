package com.excelr;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class ReadAllRecords {

	public static void main(String[] args) {
		//step 1 load hibernate.config.xml file
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.config.xml");
				
		//step 2 create sessionFactory instance
		SessionFactory sessionFactory = configuration.buildSessionFactory();
						
		//step 3 open session
		Session openSession = sessionFactory.openSession();
						
		//step 4 begin transaction
		Transaction beginTransaction = openSession.beginTransaction();
		
		//step 5 implement business logic
		List<Employee> list = openSession.createQuery("from Employee").list();
		for(Employee employee:list) {
			System.out.println(employee);
		}
		
						
		//step 6 commit transaction
		beginTransaction.commit();
						
		//step 7 close the session
		openSession.close();
						
		//step 8 close the Factory
		sessionFactory.close();


	}

}
