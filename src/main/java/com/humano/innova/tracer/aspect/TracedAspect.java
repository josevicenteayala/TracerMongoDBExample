/**
 * TracerMessageAspectJ - public class TracedAspect{ }
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
Dec 26, 2017    2:12:19 PM     	JVAL    Creacion

Inic
JVAL: Jose Vicente Ayala Luna, Intergrupo

 * -------------------------------------------------------------------------------------------------
 */
package com.humano.innova.tracer.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public final class TracedAspect {

    //@Pointcut("execution(@Traced * *(..)) || execution(* com.humano.innova.tracer.mongodbtracer.controller.CustomerController.*(..))")
	@Pointcut("@annotation(com.humano.innova.tracer.annotation.Traced)")
    public void registerTracer(){
    	System.out.println("REGISTER TRACER METHOD");
    	System.out.println("REGISTER TRACER METHOD");
    }		
	
	@Around("registerTracer()")
	public final Object traceMessage(ProceedingJoinPoint joinPoint) throws Throwable{
		
		try{			
System.out.println("Al inicio del traceMessage: ");			
			Object proceed = joinPoint.proceed();
System.out.println("El objeto que el aspecto lee es el siguiente: "+proceed);			
			return proceed;
		}finally{
System.err.println("PASO POR EL FINALLY DEL ASPECTO");
		}
		
	}
	
	
	@Before("execution(* com.humano.innova.tracer.mongodbtracer.controller.CustomerController.*(..))")
	public final void beforeCallMethod(final JoinPoint joinPoint){
		System.out.println("ANTES DE LLAMAR AL METODO: "+joinPoint.getSignature().getName());
	}
	
	
	@After("execution(* com.humano.innova.tracer.mongodbtracer.controller.CustomerController.*(..))")
	public final void afterCallMethod(final JoinPoint joinPoint){
		System.out.println("DESPUES DE LLAMAR AL METODO: "+joinPoint.getSignature().getName());
	}	
	
	@AfterReturning("execution(* com.humano.innova.tracer.mongodbtracer.controller.CustomerController.*(..))")
	public final void afterReturnMethod(final JoinPoint joinPoint){
		System.out.println("DESPUES DE RETORNAR LA INFORMACION DEL METODO: "+joinPoint.getSignature().getName());
	}	
}
