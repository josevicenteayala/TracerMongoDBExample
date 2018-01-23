/**
 * mongodbtracer - public class UserDao{ }
 * Permite 
 *
 * @autor   Jose Vicente Ayala Luna, Intergrupo, Desarrollo Java
 * @version 1.0.0
 * @since   1.0.0 
 *
 * Cambios:
 * 

Fecha           Hora            Inic    Descripción 
------------    ----------      ----    -------------------------------------------------- 
Dec 21, 2017    		7:58:56 AM     	JVAL    Creacion

Inic
JVAL: Jose Vicente Ayala Luna, Intergrupo

 * -------------------------------------------------------------------------------------------------
 */
package com.humano.innova.tracer.mongodbtracer.dao;

import java.util.List;

import com.humano.innova.tracer.mongodbtracer.model.Customer;

public interface CustomerDao {

	public List<Customer> listCustomer();
	public void addCustomer(Customer customer);	
	public void update(Customer customer);
	public void delete(Customer customer);
	public Customer findCustomerId(String id);
}
