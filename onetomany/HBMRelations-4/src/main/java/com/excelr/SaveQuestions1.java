package com.excelr;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SaveQuestions1 {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.config.xml").buildSessionFactory();
		Session openSession = sessionFactory.openSession();
		Transaction beginTransaction = openSession.beginTransaction();
		
		Answer1 answer11 = new Answer1();
		answer11.setQanswer("Hibernate is a Java Framework");
		answer11.setPostedBy("ExcelR");
		
		Answer1 answer12 = new Answer1();
		answer12.setQanswer("Hibernate is ORM Tool");
		answer12.setPostedBy("ExcelR");
		
		Answer1 answer13 = new Answer1();
		answer13.setQanswer("Hibernate also supports Annotations");
		answer13.setPostedBy("ExcelR");
		
		ArrayList<Answer1> arrayList1 = new ArrayList<Answer1>();
		arrayList1.add(answer11);
		arrayList1.add(answer12);
		arrayList1.add(answer13);
		
		
		Answer1 answer14 = new Answer1();
		answer14.setQanswer("React is Library");
		answer14.setPostedBy("ExcelR");
		
		Answer1 answer15 = new Answer1();
		answer15.setQanswer("React is JavaScript LIbrary");
		answer15.setPostedBy("ExcelR");
		
		Answer1 answer16 = new Answer1();
		answer16.setQanswer("React is Frontend Library");
		answer16.setPostedBy("ExcelR");
		
		ArrayList<Answer1> arrayList2 = new ArrayList<Answer1>();
		arrayList2.add(answer14);
		arrayList2.add(answer15);
		arrayList2.add(answer16);
		
		Question1 question11 = new Question1();
		question11.setQname("What is Hibernate ?");
		question11.setAnswers(arrayList1);
		
		Question1 question12 = new Question1();
		question12.setQname("What is react ?");
		question12.setAnswers(arrayList2);
		
		
		openSession.persist(question11);
		openSession.persist(question12);
		beginTransaction.commit();
		openSession.close();
		sessionFactory.close();
		System.out.println("successfully created");

	}

}
