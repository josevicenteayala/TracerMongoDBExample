/**
 * TracerMongoDBExample - public class CustomerServiceAspect{ }
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
Jan 16, 2018    		1:19:10 PM     	JVAL    Creacion

Inic
JVAL: Jose Vicente Ayala Luna, Intergrupo

 * -------------------------------------------------------------------------------------------------
 */
package com.humano.innova.tracer.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class CustomerServiceAspect {

	@Before("execution(* com.humano.innova.tracer.mongodbtracer.service.CustomerService.listCustomer())")
	public void beforeList(JoinPoint joinPoint){
		System.out.println("CustomerServiceAspect.beforeList()");
		System.out.println("signature.name: "+joinPoint.getSignature().getName());
		System.out.println("CustomerServiceAspect.beforeList()22");
	}
	
}
