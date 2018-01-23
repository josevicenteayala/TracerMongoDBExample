/**
 * mongodbtracer - public class UserDaoImpl{ }
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
Dec 21, 2017    		9:48:24 AM     	JVAL    Creacion

Inic
JVAL: Jose Vicente Ayala Luna, Intergrupo

 * -------------------------------------------------------------------------------------------------
 */
package com.humano.innova.tracer.mongodbtracer.dao;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.humano.innova.tracer.mongodbtracer.model.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDao {

	private static final String COLLECTION_NAME = "customers";
	@Autowired private MongoTemplate mongoTemplate;
	
	public List<Customer> listCustomer() {
		return mongoTemplate.findAll(Customer.class, COLLECTION_NAME);
	}

	public void addCustomer(Customer customer) {
		if(!mongoTemplate.collectionExists(Customer.class)){
			mongoTemplate.createCollection(Customer.class);
		}
		customer.setId(UUID.randomUUID().toString());
		mongoTemplate.insert(customer,COLLECTION_NAME);
	}

	public void update(Customer customer) {
		mongoTemplate.save(customer,COLLECTION_NAME);
	}

	public void delete(Customer customer) {
		mongoTemplate.remove(customer,COLLECTION_NAME);
	}

	public Customer findCustomerId(String id) {
		return mongoTemplate.findById(id, Customer.class,COLLECTION_NAME);
	}
	

}
