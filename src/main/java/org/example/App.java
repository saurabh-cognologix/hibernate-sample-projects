package org.example;

import org.example.model.Address;
import org.example.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Date;


public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Project Started............" );
        //SessionFactory is a interface that provides session

        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml").buildSessionFactory();

    //    System.out.println(sessionFactory);
    //    System.out.println(sessionFactory.isClosed());

        //creating student
        Student student = new Student();
        student.setStudentId(101);
        student.setStudentCity("Varanasi");
        student.setStudentName("Saurabh");
        System.out.println(student);
        Session session = sessionFactory.openSession();

        //creating Address object
        Address address = new Address();
        address.setStreet("RRK Street");
        address.setCity("Ghaziput");
        address.setOpne(false);
        address.setX(23.56);
        address.setAddedDate(new Date());


        Transaction transaction = session.beginTransaction();
        session.save(student);
        session.save(address);
        transaction.commit();


        session.close();

        System.out.println("Done...");



    }
}
