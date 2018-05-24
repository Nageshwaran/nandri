package com.topjavatutorial;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class HibernateUtil {

   public static void main(String[] args) {
       Configuration configuration = new Configuration();
       configuration.configure("hibernate.cfg.xml");
               
       SessionFactory sessionFactory = configuration.buildSessionFactory();
       
       Session session = sessionFactory.openSession();
       Transaction trn = session.beginTransaction();
       
       Employee employee= new Employee();
       employee.setName("First Employee");
       employee.setAge(20);
       
       session.persist(employee);
       trn.commit();
       session.close();;
   }

}
