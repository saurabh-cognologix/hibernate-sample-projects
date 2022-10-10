package com.map1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class MappingDemo {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml").buildSessionFactory();

        Emp emp1 = new Emp();
        Emp emp2 = new Emp();

        emp1.setEmployeeId(34);
        emp1.setEmployeeName("Saurabh");

        emp2.setEmployeeId(35);
        emp2.setEmployeeName("Onkar");

        Project project1 = new Project();
        Project project2 = new Project();
        project1.setProjectId(12121);
        project1.setProjectName("Libray Management System");

        project2.setProjectId(12122);
        project2.setProjectName("Chat Boat");

        List<Emp> list1 = new ArrayList<>();
        List<Project> list2 = new ArrayList<>();

        list1.add(emp1);
        list1.add(emp2);

        list2.add(project1);
        list2.add(project2);

        //
        emp1.setProjectList(list2);
        project2.setEmpList(list1);

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(emp1);
        session.save(emp2);
        session.save(project1);
        session.save(project2);

        transaction.commit();
        session.close();

    }
}
