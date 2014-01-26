SwingTableModel
===============

This is a customizable generic table model class which can be used to convert a POJO to a JTable with the aid of annotations.

##Example Senario:

There are serveral domain classes (Customer, Order, etc) which should be represented as tables in a java swing application. In general case, a table model has to be written for each table/domain class. 
With the generic table model class, all the domain classes could be turned to tables only by adding simple annotaions to the domain classes.
