package com.swing.example.ui;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import com.swing.example.domain.Customer;
import com.swing.table.GenericTableModel;

public class TableUI extends JFrame {
	
	private JPanel panel = new JPanel();
	private JTable tblCustomer;
	private com.swing.table.GenericTableModel<Customer> customerTableModel = new GenericTableModel<Customer>(
			new Customer());
	
	public TableUI(){
		init();
	}
	
	public void init(){
		this.setMinimumSize(new Dimension(300, 300));
		this.setSize(400, 400);
		tblCustomer = new JTable(customerTableModel);
		tblCustomer.setPreferredScrollableViewportSize(new Dimension(400, 200));
		JScrollPane custScrollPane = new JScrollPane(tblCustomer);
		tblCustomer.setFillsViewportHeight(true);
		panel.add(custScrollPane);
		setContentPane(panel);
		pack();
		this.setVisible(true);
	}
	
	public static void main(String[] args){
	try {
		UIManager
			.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (InstantiationException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IllegalAccessException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (UnsupportedLookAndFeelException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		TableUI ui=new TableUI();
	}

}
