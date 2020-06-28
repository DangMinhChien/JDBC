package com.laptrinhjavaweb.imp;

import java.util.List;

import com.laptrinhjavaweb.dao.IEmployeeDAO;
import com.laptrinhjavaweb.mapper.EmployeeMapper;
import com.laptrinhjavaweb.model.Employee;

public class EmployeeDAO  extends AbstractDAO<Employee> implements IEmployeeDAO  {

	@Override
	public Integer save(Employee employee) {
		
		StringBuilder sql = new StringBuilder("INSERT INTO employee (username, fullname,phonenumber)");
		sql.append(" VALUES(?, ?, ?)");
		return insert(sql.toString(), employee.getUserName(),employee.getFullName(),employee.getNumber());
	}

	@Override
	public void update(Employee employee) {
		StringBuilder sql = new StringBuilder("UPDATE employee SET username = ?, fullname = ?,phonenumber = ? WHERE id = ?");
		update(sql.toString(), employee.getUserName(),employee.getFullName(),employee.getNumber(),employee.getId());
		
	}

	@Override
	public void delete(Integer id) {
		String sql = "DELETE FROM employee WHERE id = ?";
		update(sql, id);
	}

	@Override
	public List<Employee> findAll() {
		StringBuilder sql = new StringBuilder("SELECT * FROM employee");
		return query(sql.toString(), new EmployeeMapper());
	}

}
