/**
 * 
 */
package com.swing.table;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Is used to specify the preferred column name for a property or field. If no
 * {@code Column} annotation is specified, the field or property name will be
 * used as the column name.
 * 
 * @author Sewwandi
 * 
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface ColumnName {
	String name();

}
