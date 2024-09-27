package aTinhTienDien;

import java.util.Scanner;

public class TinhTienDien {

	public static void main(String[] args) {
		Scanner abc = new Scanner(System.in);
		System.out.println("Bài toán tính số tiền điện");
		System.out.println("-------------------------------");
		// Nhập số kW điện tiêu thụ
		System.out.println("Nhập số kW điện tiêu thụ: ");
		Double kW = abc.nextDouble();
		
		//Tính số tiền điện tiêu thụ
		if (kW < 50){
			Double tienDien = kW*1000;
			System.out.println("Số tiền điện phải trả = " + tienDien + " đồng");
		}else {
			Double tienDien = kW*1000 + (kW-50)*1200;
			System.out.println("Số tiền điện phải trả = " + tienDien + " đồng)");
		}

	}

}
