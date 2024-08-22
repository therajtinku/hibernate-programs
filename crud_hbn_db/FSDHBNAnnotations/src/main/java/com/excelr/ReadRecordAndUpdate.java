package com.excelr;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ReadRecordAndUpdate {

	public static void main(String[] args) {
		Session openSession = new Configuration().configure("hibernate.config.xml").buildSessionFactory().openSession();
		Transaction beginTransaction = openSession.beginTransaction();
		

	}

}
