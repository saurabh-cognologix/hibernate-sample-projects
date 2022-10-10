package com.map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml").buildSessionFactory();

        //creating question
        Question question = new Question();
        question.setQuestionId(100);
        question.setQuestion("What is java? ");

        //creating answer
        Answer answer = new Answer();
        answer.setAnswerId(343);
        answer.setAnswer("Java is a Object Oriented Language");

        question.setAnswer(answer);

        //creating question
        Question question1= new Question();
        question1.setQuestionId(242);
        question1.setQuestion("What is collection framework? ");

        //creating answer
        Answer answer1 = new Answer();
        answer1.setAnswerId(344);
        answer1.setAnswer("API to work with java");

        question1.setAnswer(answer1);

        //Session
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        //save
        session.save(question);
        session.save(question1);
        session.save(answer);
        session.save(answer1);
        System.out.println(question);
        System.out.println(question1);
        transaction.commit();

        session.close();
        sessionFactory.close();
    }
}
