package com.OneToOne;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Employee {
	@Id
	private int id;
	private String dept;
	private String designation;
	private double salary;
	private int experience;
	private String dateofjoining;
	@OneToOne
	private PersonDetails persondetails;
	
	public Employee(int id, String dept, String designation, double salary, int experience, String dateofjoining,
			PersonDetails persondetails) {
		super();
		this.id = id;
		this.dept = dept;
		this.designation = designation;
		this.salary = salary;
		this.experience = experience;
		this.dateofjoining = dateofjoining;
		this.persondetails = persondetails;
	}
	
	public Employee() {
		
	}
	
	
}
