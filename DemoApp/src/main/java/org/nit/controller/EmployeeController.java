package org.nit.controller;

import javax.servlet.http.HttpServletRequest;

import org.nit.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sun.org.apache.xerces.internal.util.URI;
@Controller
public class EmployeeController {
	@RequestMapping(value = "/show")
	public String showController(Model model) {
		model.addAttribute("employeee", new Employee());
		
		return "employee";
		
		
	}
	@RequestMapping(value = "/helloagain", method = RequestMethod.GET)
    public String sayHelloAgain(Model model) {
        model.addAttribute("employeee", new Employee());
        return "employee";
    }
	
	
	
	//URI requestUri = new URI(req.getRequestURL().toString());
	
	

}
