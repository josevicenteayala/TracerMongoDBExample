/**
 * mongodbtracer - public class CustomerController{ }
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
Dec 21, 2017    		1:08:38 PM     	JVAL    Creacion

Inic
JVAL: Jose Vicente Ayala Luna, Intergrupo

 * -------------------------------------------------------------------------------------------------
 */
package com.humano.innova.tracer.mongodbtracer.controller;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.humano.innova.tracer.annotation.Traced;
import com.humano.innova.tracer.mongodbtracer.model.Customer;
import com.humano.innova.tracer.mongodbtracer.service.CustomerService;

@Controller
@RequestMapping(value="/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@Traced
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public ModelAndView list(){
		ModelAndView model = new ModelAndView("customer/list");
		List<Customer> listCustomer = customerService.listCustomer();
		model.addObject("listUser",listCustomer);
		return model;
	}
	
	@RequestMapping(value="/add", method=RequestMethod.GET)
	public ModelAndView add(Customer customer){
		ModelAndView model = new ModelAndView("customer/form");
		model.addObject("customerForm", new Customer());
		return model;		
	}
	
	@RequestMapping(value="/update/{id}", method=RequestMethod.GET)
	public ModelAndView update(@PathVariable("id") String id){
		ModelAndView model = new ModelAndView("customer/form");
		model.addObject("customerForm", customerService.findCustomerId(id));
		return model;		
	}	
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public String save(@Traced @ModelAttribute("customerForm") Customer customer){
		if(Objects.nonNull(customer.getId()) && !StringUtils.isEmpty(customer.getId())){
			customerService.update(customer);	
		}else{
			customerService.addCustomer(customer);
		}
		return "redirect:/customer/list";
	}	
	
	@RequestMapping(value="/delete/{id}", method=RequestMethod.GET)
	public String delete(@PathVariable("id") String id){
		@Traced
		Customer customer = customerService.findCustomerId(id);
		customerService.delete(customer);
		return "redirect:/customer/list";
	}
	
}
