package com.topjavatutorial;

import org.hibernate.*;
import org.hibernate.cfg.*;
import java.util.*;
 
public class ForOurLogic { 
 
 public static void main(String[] args)
 {
 
 Configuration cfg = new Configuration();
 cfg.configure("hibernate.cfg.xml"); 
 
 SessionFactory factory = cfg.buildSessionFactory();
 Session session = factory.openSession();
 Employee j = new Employee();
 j.setName("afoio Employee");
 
 
 Query qry = session.createQuery("from Employee p where p.name= :java4s");
 qry.setParameter("java4s",j.getName());

List l =qry.list();
System.out.println("Total Number Of Records : "+l.size());
Iterator it = l.iterator();

while(it.hasNext())
{
Object o = (Object) it.next();
Employee p = (Employee)o;
System.out.println("Product Name : "+p.getAge());
System.out.println("Product Price : "+p.getId());
System.out.println("---------------------------");

} 
 
/* Selecting all objects(records) start_______________________ */
 
 /*
 
 Query qry = session.createQuery("from Employee p");
 
 List l =qry.list();
 System.out.println("Total Number Of Records : "+l.size());
 Iterator it = l.iterator();
 
 while(it.hasNext())
 {
 Object o = (Object)it.next();
 Employee p = (Employee)o;
 System.out.println("Product id : "+p.getAge());
 System.out.println("Product Name : "+p.getId());
 System.out.println("Product Price : "+p.getName());
 System.out.println("----------------------");
 } 
 
 */ 
 
/* Selecting all objects(records) end________________________ */ 
 
/* Selecting partial objects(More than one object) start__________ */ 
 
 /* 
 
Query qry = session.createQuery("select p.productId,p.proName from Product p");
 
 List l =qry.list();
 System.out.println("Total Number Of Records : "+l.size());
 Iterator it = l.iterator();
 
 while(it.hasNext())
 {
 Object o[] = (Object[])it.next();
 
 System.out.println("Product id : "+o[0]+ "Product Name : "+o[1]);
 
 System.out.println("----------------");
 } 
 
 */
 
/* Selecting partial objects(More than one object)end_____________ 
 
// Selecting single object start_____________
 
    Query qry = session.createQuery("select p.id from Employee p");
 
 List l =qry.list();
 System.out.println("Total Number Of Records : "+l.size());
 Iterator it = l.iterator();
 
 while(it.hasNext())
 {
 Integer i = (Integer)it.next();
 System.out.println("Product id : "+i.intValue());
 System.out.println("---------------------------");
 
 } 
*/ 
// selecting single object end____________
 
 session.close();
 factory.close();
 }
 
}