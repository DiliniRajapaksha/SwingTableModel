package com.swing.example.domain;

import com.swing.table.ColumnName;



public class Customer {

	@ColumnName(name = "Customer ID")
	private int id;
	@ColumnName(name = "Customer Name")
	private String name;
	@ColumnName(name = "Contact Number")
	private String contact;
	@ColumnName(name = "Email")
	private String email;

	public Customer(int id, String name, String contact) {
		super();
		this.id = id;
		this.name = name;
		this.contact = contact;
	}

	public Customer() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}


}
