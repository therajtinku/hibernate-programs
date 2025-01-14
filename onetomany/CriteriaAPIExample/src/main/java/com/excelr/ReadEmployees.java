package com.excelr;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class ReadEmployees {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.config.xml").buildSessionFactory();
		Session openSession = sessionFactory.openSession();
		Transaction beginTransaction = openSession.beginTransaction();
		
		Criteria criteria = openSession.createCriteria(Employee.class);
		criteria.add(Restrictions.gt("e_sal", 30000));
		List<Employee> list = criteria.list();
		
		for(Employee emp:list) {
			System.out.println(emp.getE_id()+ " " + emp.getE_name()+ " " + emp.getE_sal());
		}
		
		beginTransaction.commit();
		openSession.close();
		sessionFactory.close();

	}

}
