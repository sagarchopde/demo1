package com.jbk;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository

public class EmployeeDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	String[] giveYourNames() {// db call
		System.out.println("sessionFactory >>>"+sessionFactory);
		Employee employee=(Employee)sessionFactory.getCurrentSession().load(Employee.class, 1);
		String xx[] = { employee.getEname(), employee.getEname()+"javabykiran" };
		return xx;
	}
	
 
}









