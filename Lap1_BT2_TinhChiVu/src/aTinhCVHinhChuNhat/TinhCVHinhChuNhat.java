package aTinhCVHinhChuNhat;

import java.util.Scanner;

public class TinhCVHinhChuNhat {

	public static void main(String[] args) {
		
		Scanner a = new Scanner (System.in);
		System.out.println("--------Tính chi vi hình chữ nhật--------");
		// Nhập chiều dài và chiều rộng
		System.out.println("Nhập chiều dài: ");
		double chieuDai = a.nextDouble();
		System.out.println("Nhập chiều rộng: ");
		double chieuRong = a.nextDouble();
		
		//Tính chu vi
		double chuVi = (chieuDai + chieuRong)*2;
		//Tính diện tích HCN
		double dienTich = chieuDai*chieuRong;
		//Tìm cạnh nhỏ
		double canhNho = Math.min(chieuDai, chieuRong);
		//In ra kết quả
		System.out.println("Chu vi hình chữ nhật = " + chuVi);
		System.out.println("Diện tích hình chữ nhật = " + dienTich);
		System.out.println("Chanh nhỏ của hình chữ nhật là: " + canhNho);
	}

}
