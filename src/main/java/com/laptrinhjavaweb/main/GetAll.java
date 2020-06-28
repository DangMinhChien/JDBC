package com.laptrinhjavaweb.main;

import java.util.ArrayList;
import java.util.List;

import com.laptrinhjavaweb.imp.EmployeeDAO;
import com.laptrinhjavaweb.model.Employee;

public class GetAll {
	public static void getAll() {
	List<Employee> list= new ArrayList<Employee>();
	EmployeeDAO employeeDAO = new EmployeeDAO();
	list = employeeDAO.findAll();
	String leftAlignFormat = "| %-4s | %-11s | %-25s | %-16s |%n";

	System.out.format("+------+-------------+---------------------------+------------------+%n");
	System.out.format("| ID   |  User name  |         Full Name         |    Phone Number  |%n");
	System.out.format("+------+-------------+---------------------------+------------------+%n");
	for (Employee employee : list) {
		System.out.format(leftAlignFormat, employee.getId(), employee.getUserName(),employee.getFullName(),employee.getNumber());
	}
	System.out.format("+------+-------------+---------------------------+------------------+%n");
}


}
