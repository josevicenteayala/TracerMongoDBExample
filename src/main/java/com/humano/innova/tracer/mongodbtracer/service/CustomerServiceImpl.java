/**
 * mongodbtracer - public class CustomerServiceImpl{ }
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
Dec 21, 2017    		1:04:25 PM     	JVAL    Creacion

Inic
JVAL: Jose Vicente Ayala Luna, Intergrupo

 * -------------------------------------------------------------------------------------------------
 */
package com.humano.innova.tracer.mongodbtracer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.humano.innova.tracer.mongodbtracer.dao.CustomerDao;
import com.humano.innova.tracer.mongodbtracer.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDao customerDao;
	
	public List<Customer> listCustomer() {
		return customerDao.listCustomer();
	}

	public void addCustomer(Customer customer) {
		customerDao.addCustomer(customer);
	}

	public void update(Customer customer) {
		customerDao.update(customer);
	}

	public void delete(Customer customer) {
		customerDao.delete(customer);
	}

	public Customer findCustomerId(String id) {
		return customerDao.findCustomerId(id);
	}

}
