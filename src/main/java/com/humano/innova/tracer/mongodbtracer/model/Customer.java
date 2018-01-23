/**
 * mongodbtracer - public class Customer{ }
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
Dec 20, 2017    		4:40:55 PM     	JVAL    Creacion

Inic
JVAL: Jose Vicente Ayala Luna, Intergrupo

 * -------------------------------------------------------------------------------------------------
 */
package com.humano.innova.tracer.mongodbtracer.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Customer {

	@Id
	private String id;
	private String first_name;
	private String last_name;
	private String gender;
	private String sex;
	private String identification;
	
	
	public Customer() {
		super();
	}

	public Customer(String id, String firstName) {
		super();
		this.id = id;
		this.first_name = firstName;
	}

	public Customer(String id, String first_name, String last_name, String gender, String sex, String identification) {
		super();
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.gender = gender;
		this.sex = sex;
		this.identification = identification;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the fist_name
	 */
	public String getFirst_name() {
		return first_name;
	}

	/**
	 * @return the last_name
	 */
	public String getLast_name() {
		return last_name;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}

	/**
	 * @return the identification
	 */
	public String getIdentification() {
		return identification;
	}

	/**
	 * @param fist_name the fist_name to set
	 */
	public void setFirst_name(String fist_name) {
		this.first_name = fist_name;
	}

	/**
	 * @param last_name the last_name to set
	 */
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @param sex the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}

	/**
	 * @param identification the identification to set
	 */
	public void setIdentification(String identification) {
		this.identification = identification;
	}
	
}
