/**
 * mongodbtracer - public class WebConfig{ }
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
Dec 20, 2017    		4:22:34 PM     	JVAL    Creacion

Inic
JVAL: Jose Vicente Ayala Luna, Intergrupo

 * -------------------------------------------------------------------------------------------------
 */
package com.humano.innova.tracer.mongodbtracer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import com.mongodb.MongoClient;


@EnableWebMvc
@Configuration
@ComponentScan({"com.humano.innova.tracer"})
@EnableAspectJAutoProxy
public class WebConfig extends WebMvcConfigurerAdapter{

	@Bean
	public InternalResourceViewResolver viewResolver(){
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setViewClass(JstlView.class);
		viewResolver.setPrefix("/WEB-INF/jsp/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}
	
	@Bean
	public MongoDbFactory mongoDbFactory(){
		MongoClient mongoClient = new MongoClient("localhost",27017);
		return new SimpleMongoDbFactory(mongoClient, "Trazabilidad");
	}
	
	@Bean
	public MongoTemplate mongoTemplate(){
		return new MongoTemplate(mongoDbFactory());
	}
}
