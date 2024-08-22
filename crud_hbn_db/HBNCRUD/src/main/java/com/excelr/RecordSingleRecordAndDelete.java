package com.excelr;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RecordSingleRecordAndDelete {

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
		Employee employee = openSession.get(Employee.class, 501);
		openSession.delete(employee);
		System.out.println("Employees records deleted successfully");
				
		//step 6 commit transaction
		beginTransaction.commit();
				
		//step 7 close the session
		openSession.close();
				
		//step 8 close the Factory
		sessionFactory.close();

	}

}
