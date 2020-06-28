package com.laptrinhjavaweb.main;

import com.laptrinhjavaweb.imp.EmployeeDAO;
import com.laptrinhjavaweb.model.Employee;

public class Update {
	public static void update() {
		int id = Console.getInt("Nhập Id muốn cập nhật");
		String userName = Console.getString("Vui lòng nhập tên người dùng: ");
		String fullName = Console.getString("Vui lòng nhập họ và tên: ");
		String phoneNumber = Console.getString("Vui lòng nhập số điện thoại: ");
		Employee employee = new Employee();
		employee.setId(id);
		employee.setUserName(userName);
		employee.setFullName(fullName);
		employee.setNumber(phoneNumber);
		EmployeeDAO empolyeeDAO = new EmployeeDAO();
		empolyeeDAO.update(employee);
		System.out.println("Cập nhật thành công");

	}
}
