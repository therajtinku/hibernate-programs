package com.excelr;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;


public class SaveQuestions {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.config.xml").buildSessionFactory();
		Session openSession = sessionFactory.openSession();
		Transaction beginTransaction = openSession.beginTransaction();
		
		Answers answers1 = new Answers();
		answers1.setQanswer("java framework");
		answers1.setPostedBy("Excelr");
		
		Answers answers2 = new Answers();
		answers2.setQanswer("ORM Tool");
		answers2.setPostedBy("Excelr");
		
		List list1 = new ArrayList<Answers>();
		list1.add(answers1);
		list1.add(answers2);
		
		Answers answers3 = new Answers();
		answers3.setQanswer("java database connectivity");
		answers3.setPostedBy("Excelr");
		
		Answers answers4 = new Answers();
		answers4.setQanswer("JDBC is an API");
		answers4.setPostedBy("Excelr");
		
		List list2 = new ArrayList<Answers>();
		list2.add(answers3);
		list2.add(answers4);
		
		Question question1 = new Question();
		question1.setQname("What is jdbc");
		question1.setAnswers(list1);
		
		Question question2 = new Question();
		question2.setQname("What is jdbc");
		question2.setAnswers(list2);
		
		openSession.persist(question1);
		openSession.persist(question2);
		
		beginTransaction.commit();
		openSession.close();
		sessionFactory.close();
		System.out.println("Questions saved successfully");

	}

}
