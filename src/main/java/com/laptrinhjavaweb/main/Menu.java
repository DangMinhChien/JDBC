package com.laptrinhjavaweb.main;

public class Menu {
	public static int menu() {
        int choise;
        System.out.println("Chọn từ những lựa chọn này");
        System.out.println("-------------------------\n");
        System.out.println("1 - Xem danh sách nhân viên");
        System.out.println("2 - Thêm nhân viên");
        System.out.println("3 - Sửa thông tin nhân viên");
        System.out.println("4 - Xóa nhân viên");
        System.out.println("5 - Thoát");
        choise = Console.getInt("Chọn chức năng trong menu: ");
        return choise;    
    }
}
