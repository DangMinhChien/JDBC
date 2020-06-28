package com.laptrinhjavaweb.dao;

import java.util.List;

import com.laptrinhjavaweb.model.Employee;

public interface IEmployeeDAO extends GenericDAO<Employee>{
	Integer save(Employee employee);
	void update(Employee employee);
	void delete(Integer id);
	List<Employee> findAll();
}
