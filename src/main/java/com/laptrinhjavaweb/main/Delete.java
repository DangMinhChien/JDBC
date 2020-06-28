package com.laptrinhjavaweb.main;

import com.laptrinhjavaweb.imp.EmployeeDAO;
import com.laptrinhjavaweb.model.Employee;

public class Delete {
	public static void delete() {
		int id = Console.getInt("Vui lòng nhập Id muốn xóa: ");
		Employee employee = new Employee();
		employee.setId(id);
		EmployeeDAO empolyeeDAO = new EmployeeDAO();
		empolyeeDAO.delete(id);
		System.out.println("Xóa thành công");
	}
}
