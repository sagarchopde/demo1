package com.jbk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	@Autowired
	EmployeeDao employeeDao;

	public String[] giveYourNames() {
		return employeeDao.giveYourNames();
	}

}
