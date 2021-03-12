package com.jbk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class EmployeeController {
	@Autowired
	EmployeeService empService;

	@RequestMapping("namesData")
	String[] giveYourNames() {
		System.out.println(empService);
		System.out.println("in one");
		return empService.giveYourNames();
	}
	
	@RequestMapping("namesData1")
	String[] giveYourNames1() {
		System.out.println(empService);
		return empService.giveYourNames();
	}
}
