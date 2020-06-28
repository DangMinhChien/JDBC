package com.laptrinhjavaweb.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.laptrinhjavaweb.model.Employee;

public class EmployeeMapper implements RowMapper<Employee>{

	@Override
	public Employee mapRow(ResultSet rs) {
		try {
			Employee employee = new Employee();
			employee.setId(rs.getInt("id"));
			employee.setUserName(rs.getString("username"));
			employee.setFullName(rs.getString("fullname"));
			employee.setNumber(rs.getString("phonenumber"));
			return employee;
		} catch (SQLException e) {
			return null;
		}	
	}

}
