package com.OneToOne;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
    	 int pid;
    	 String name;
         String dob;
    	 String email;
    	 String address;
    	 System.out.print("\nEnter the person id: ");
    	 pid=sc.nextInt();
    	 System.out.print("\nEnter the person name: ");
    	 name=sc.next();
    	 System.out.print("\nEnter the person dob(date.month.year): ");
    	 dob=sc.next();
    	 System.out.print("\nEnter the person email: ");
    	 email=sc.next();
    	 System.out.print("\nEnter the person address: ");
    	 address=sc.next();
    	 PersonDetails pd=new PersonDetails(pid, name, dob, email, address);
    	 int eid;
    	 String dept;
    	 String designation;
    	 double salary;
    	 int experience;
    	 String dateofjoining;
    	
    	 System.out.print("\nEnter the employee id: ");
    	 eid=sc.nextInt();
    	 System.out.print("\nEnter the employee dept: ");
    	 dept=sc.next();
    	 System.out.print("\nEnter the employee designation: ");
    	 designation=sc.next();
    	 System.out.print("\nEnter the employee salary: ");
    	 salary=sc.nextDouble();
    	 System.out.print("\nEnter the employee experience: ");
    	 experience=sc.nextInt();
    	 System.out.print("\nEnter the employee date of joining(date.month.year): ");
    	 dateofjoining=sc.next();
    	 Employee e=new Employee(eid, dept, designation, salary, experience, dateofjoining, pd);
    	 Configuration con=new Configuration().configure().addAnnotatedClass(Employee.class).addAnnotatedClass(PersonDetails.class);
    	 SessionFactory sf=con.buildSessionFactory();
    	 
    	 Session session=sf.openSession();
    	 Transaction tx=session.beginTransaction();
    	 session.save(e);
    	 session.save(pd);
    	 tx.commit();
    }
}
