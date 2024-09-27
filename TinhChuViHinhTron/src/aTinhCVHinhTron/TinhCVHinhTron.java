package aTinhCVHinhTron;

import java.util.Scanner;

public class TinhCVHinhTron {

	public static void main(String[] args) {
		Scanner HT = new Scanner(System.in);
		final double PI = 3.141159;
		
		// Nhập bán kính hình tròn
		System.out.println("Nhập bán kính hình tròn: ");
		double banKinh = HT.nextDouble();
		
		//Tính chu vi
		double chuVi = 2*PI*banKinh;
		System.out.println("Chu vi hình tròn = " + chuVi);
		
		//Tính diện tích
		double dienTich = PI*banKinh*banKinh;

	}

}
