package aNhapXuatHoTen;

import java.util.Scanner;

public class NhapXuatHoTen {

	public static void main(String[] args) {
		// Khai báo các biến chức dữ liệu nhập vào
		String hoTen;
		int tuoi;
		double chieuCao;
		double canNang;
		// Tạo đối tượng của lớp Scanner để nhập dữ liệu
		Scanner banPhim; //Khai báo
		banPhim = new Scanner(System.in); //xin mới
		// Đọc dữ liệu từ bàn phím, cất vào các biến tương ứng
		//In ra hướng dẫn cho User biết cần làm gì
		System.out.print("Họ tên? ");
		hoTen = banPhim.nextLine();
		System.out.print("Tuổi? ");
		tuoi = banPhim.nextInt();
		System.out.print("Chiều cao? ");
		chieuCao = banPhim.nextDouble();
		System.out.print("Cân nặng ");
		canNang = banPhim.nextDouble();	
		
		// Xuất thông tin
		System.out.println("Name: " + hoTen);
		System.out.println("Age: " + tuoi);
		System.out.println("Hight: "+ chieuCao);
		System.out.println("Weight: "+ canNang);
		
	}

}
