package com.jobiak.mvcforms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jobiak.mvcforms.model.Employee;
import com.jobiak.mvcforms.repository.EmployeeRepository;




@Controller
public class SignupController
{
	@Autowired
	EmployeeRepository repos;

	@RequestMapping(path="/test",method=RequestMethod.GET)
    public String redirect()
	{
		return "signup";
	}

	@RequestMapping(path="/signup",method=RequestMethod.POST)
	public String doSignUp(@ModelAttribute("employee")Employee employee) {
		

		repos.save(employee);
		return "success";

	}
}