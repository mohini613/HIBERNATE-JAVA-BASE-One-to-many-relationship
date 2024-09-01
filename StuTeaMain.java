package com.OneToManyStud;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class StuTeaMain {
	 public static void main(String[] args) {
	       SessionFactory sf = HibernateUtil.getSessionFactory();
	       
	        Session session = sf.openSession();

/*	      Transaction tx = session.beginTransaction();

      Teacher t= new Teacher();
         t.setTid("T_01");
          t.setTname("Jadhav sir");
          
          Teacher t1= new Teacher();
          t1.setTid("T_02");
           t1.setTname("Shinde sir");
          
          
         Student s= new Student();
         s.setSid(101);
         s.setSName("Aakash");
         s.setAddrs("Pune");
         s.setTeacher(t);
         
         Student s1= new Student();
         s1.setSid(102);
         s1.setSName("Amol");
         s1.setAddrs("Mumbai");
         s1.setTeacher(t);

         Student s2= new Student();
           s2.setSid(103);
           s2.setSName("Shyam");
           s2.setAddrs("Nashik");
           s2.setTeacher(t1);
           
           session.save(t);
           session.save(t1);
           
           session.save(s);
           session.save(s1);
           session.save(s2);
           tx.commit();*/
	        
	        Teacher t= session.get(Teacher.class, "T_01");

    System.out.println(t.getTid());
    System.out.println(t.getTname());

    List<Student> stu =t.getStudent();
    for(Student  s:stu) {
    	System.out.println(s.getSid());
    	System.out.println(s.getSName());
    	System.out.println(s.getAddrs());

    }
    

       


         session.close();
         sf.close();
}
}
