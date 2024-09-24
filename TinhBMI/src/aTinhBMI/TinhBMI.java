package aTinhBMI;

import java.util.Scanner;

public class TinhBMI {

	public static void main(String[] args) {
		Scanner banPhim = new Scanner (System.in);
		// Nhập họ tên
		System.out.print("Họ tên: ");
		String hoTen= banPhim.nextLine();
		//Nhập chiều cao
		System.out.print("Chiều cao (m): ");
		double chieuCao = banPhim.nextDouble();
		//Nhập cân nặng
		System.out.print("Cân nặng (kg):");
		double canNang = banPhim.nextDouble();
		
		//Tính chỉ số BMI
		double bmi = canNang/ (chieuCao*chieuCao);
		//In thông tin ra cho người dùng
		System.out.println("Bạn " + hoTen);
		System.out.println("Có chỉ số BMI = " + bmi);
		
	}

}
