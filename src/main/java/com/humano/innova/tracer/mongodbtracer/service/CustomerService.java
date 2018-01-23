/**
 * mongodbtracer - public class CustomerService{ }
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
Dec 21, 2017    		1:03:20 PM     	JVAL    Creacion

Inic
JVAL: Jose Vicente Ayala Luna, Intergrupo

 * -------------------------------------------------------------------------------------------------
 */
package com.humano.innova.tracer.mongodbtracer.service;

import java.util.List;

import com.humano.innova.tracer.mongodbtracer.model.Customer;

public interface CustomerService {
	public List<Customer> listCustomer();
	public void addCustomer(Customer customer);	
	public void update(Customer customer);
	public void delete(Customer customer);
	public Customer findCustomerId(String id);
}
