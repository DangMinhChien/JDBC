package com.laptrinhjavaweb.main;

import com.laptrinhjavaweb.imp.EmployeeDAO;
import com.laptrinhjavaweb.model.Employee;

public class Save {
	public static void save() {
		String userName = Console.getString("Vui lòng nhập tên người dùng: ");
		String fullName = Console.getString("Vui lòng nhập họ và tên: ");
		String phoneNumber = Console.getString("Vui lòng nhập số điện thoại: ");
		Employee employee = new Employee();
		employee.setUserName(userName);
		employee.setFullName(fullName);
		employee.setNumber(phoneNumber);
		EmployeeDAO empolyeeDAO = new EmployeeDAO();
		int result = empolyeeDAO.save(employee);
		if (result > 0) {
			System.out.println("Thêm nhân viên thành công");
		} else {
			System.out.println("Thêm nhân viên thất bại");
		}
	}

}
