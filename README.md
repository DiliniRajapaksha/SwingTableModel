SwingTableModel
===============

This is a customizable generic table model class which can be used to convert a POJO to a JTable with the aid of annotations.

##Example Senario:

There are serveral domain classes (Customer, Order, etc) which should be represented as tables in a java swing application. In general case, a table model has to be written for each table/domain class. 
With the generic table model class, all the domain classes could be turned to tables only by adding simple annotaions to the domain classes, as shown below.

```java
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

```
The table will look like the one below:

![Generated table](https://github.com/sewdil/SwingTableModel/blob/master/images/exampleTable.jpg?raw=true)

##Example Usage:

```java
GenericTableModel<Customer> customerTableModel = new GenericTableModel<Customer>(new Customer());
JTable tblCustomer = new JTable(customerTableModel);
```
A working example is included in the src.
