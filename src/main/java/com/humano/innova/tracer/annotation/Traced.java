/**
 * TracerMessageAspectJ - public class Traced
 * Permite realizar el registro de mensajes generales de las aplicaciones
 *
 * @autor   Jose Vicente Ayala Luna, Intergrupo, Desarrollo Java
 * @version 1.0.0
 * @since   1.0.0 
 *
 * Cambios:
 * 

Fecha           Hora            Inic    Descripción 
------------    ----------      ----    -------------------------------------------------- 
Dec 26, 2017    2:02:05 PM     	JVAL    Creacion

Inic
JVAL: Jose Vicente Ayala Luna, Intergrupo

 * -------------------------------------------------------------------------------------------------
 */
package com.humano.innova.tracer.annotation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.LOCAL_VARIABLE;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(RUNTIME)
@Target({ FIELD, METHOD, PARAMETER, LOCAL_VARIABLE, TYPE })
public @interface Traced {

}
