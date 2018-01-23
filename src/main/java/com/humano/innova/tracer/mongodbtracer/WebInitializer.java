/***
 * mongodbtracer - public class WebInitializer{ }
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
Dec 20, 2017    		4:35:30 PM     	JVAL    Creacion

Inic
JVAL: Jose Vicente Ayala Luna, Intergrupo

-------------------------------------------------------------------------------------------------
 */

package com.humano.innova.tracer.mongodbtracer;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @author jayala
 *
 */
public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	/**
	*El metodo getRootConfigClasses permite.
	*&lt;p&gt;
	*Preconditions: los parametros no deben ser nulos 
	*&lt;p&gt;
	*Postconditions: procesa la informacion 
	*
	* @return	
	* @exception Ninguna
	* @since 1.0    
	* @bug
	*/
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[]{WebConfig.class};
	}

	/**
	*El metodo getServletConfigClasses permite.
	*&lt;p&gt;
	*Preconditions: los parametros no deben ser nulos 
	*&lt;p&gt;
	*Postconditions: procesa la informacion 
	*
	* @return	
	* @exception Ninguna
	* @since 1.0    
	* @bug
	*/
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return null;
	}

	/**
	*El metodo getServletMappings permite.
	*&lt;p&gt;
	*Preconditions: los parametros no deben ser nulos 
	*&lt;p&gt;
	*Postconditions: procesa la informacion 
	*
	* @return	
	* @exception Ninguna
	* @since 1.0    
	* @bug
	*/
	@Override
	protected String[] getServletMappings() {
		return new String[]{"/"};
	}

}
