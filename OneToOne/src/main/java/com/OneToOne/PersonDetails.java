package com.OneToOne;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class PersonDetails {
	@Id
	private int id;
	private String name;
	private String dob;
	private String email;
	private String address;
	public PersonDetails(int id, String name, String dob, String email, String address) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.email = email;
		this.address = address;
	}
	public PersonDetails() {
		
	}
	

}
