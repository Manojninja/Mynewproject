package com.servelet.hibernateproject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.mapping.List;

public class Empconfig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration con= new Configuration();
		SessionFactory factory=con.configure().buildSessionFactory();
		Session session=factory.openSession();
		Transaction tc =session.beginTransaction();
		Employee emp=new Employee();
//		emp.setId(101);
//		emp.setName("manoj");
//		emp.setSalary(15235.3);
//		
//		emp.setId(103);
//		emp.setName("sunli");
//		emp.setSalary(10235.3);
//		
//		emp.setId(104);
//		emp.setName("karthik");
//		emp.setSalary(1622.3);
//session.save(emp);

		
		java.util.List<Object[]> records=session.createNativeQuery("select * from Employee").list();
		
		for(Object[]f:records)
		{
			System.out.println("emp id :"+f[0]);
			System.out.println("emp name :"+f[1]);
			System.out.println("emp salary :"+f[2]);

		}
		tc.commit();
		session.close();
	}

}
