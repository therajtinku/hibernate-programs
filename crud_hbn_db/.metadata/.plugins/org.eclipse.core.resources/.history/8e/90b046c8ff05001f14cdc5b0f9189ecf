package com.excelr;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertProduct {

	public static void main(String[] args) {
		Session openSession = new Configuration().configure("hibernate.config.xml").buildSessionFactory().openSession();
		Transaction beginTransaction = openSession.beginTransaction();
		
		Product p1 = new Product();
		p1.setP_id(101);
		p1.setP_name("Mobile1");
		p1.setP_cost(10000);
		p1.setP_image("https://excelrfsd.s3.eu-north-1.amazonaws.com/mobile11.jpeg");
		openSession.save(p1);
		
		Product p2 = new Product();
		p2.setP_id(102);
		p2.setP_name("Mobile2");
		p2.setP_cost(10000);
		p2.setP_image("https://excelrfsd.s3.eu-north-1.amazonaws.com/mobile22.jpeg");
		openSession.save(p2);
		
		Product p3 = new Product();
		p3.setP_id(103);
		p3.setP_name("Mobile3");
		p3.setP_cost(10000);
		p3.setP_image("https://excelrfsd.s3.eu-north-1.amazonaws.com/mobile33.jpeg");
		openSession.save(p3);
		
		Product p4 = new Product();
		p4.setP_id(104);
		p4.setP_name("Mobile4");
		p4.setP_cost(10000);
		p4.setP_image("https://excelrfsd.s3.eu-north-1.amazonaws.com/mobile33.jpeg");
		openSession.save(p4);
		
		beginTransaction.commit();
		openSession.close();
		System.out.println("sucessfully inserted");

	}

}
