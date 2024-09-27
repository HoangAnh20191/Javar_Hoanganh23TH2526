package aTaoMenu;

import java.util.Scanner;

public class TaoMenu {

	public static void main(String[] args) {
		Scanner abc = new Scanner(System.in);
		int choice;
		do {
			//Hiển thị menu
			System.out.println("    MENU CHƯƠNG TRÌNH   ");
			System.out.println("---------------------------");
			System.out.println("Giải phương trình bậc nhất");
			System.out.println("Giải phương trình bậc 2");
			System.out.println("Tính tiền điện");
			System.out.println("-----------------------");
			System.out.println("Chọn chức năng");
			//Nhập lựa chọn
			choice = abc.nextInt();
			switch (choice) {
			case 1:
				giaiPTBacNhat();
				break;
			case 2:
				giaiPTBac2();
				break;
			case 3:
				tinhTienDien();
				break;
			case 4:
				System.out.println("Kết thúc chương trình");
				break;
			default: 
				System.out.println("Lựa chọn không hợp lệ");
			}
		}
		while (choice !=4);
		 // Hàm giải phương trình bậc nhất
		public static void giaiPTBacNhat() 
		{
			Scanner abc = new Scanner(System.in);		
		// Nhập hệ số a,b (phương trình bậc 1: a*x + b = 0)
		System.out.println("Nhập hệ số a: ");
		double a = abc.nextDouble();
		System.out.println("Nhập hệ số b: ");
		double b =abc.nextDouble();
		if (a==0) {
			if(b==0) {
				System.out.println("Phương trình vô số nghiệm");
			}
			else {
				System.out.println("Phương trình vô nghiệm");
			}
		}
		else {
			double x = -b / a;
			System.out.println("Phương trình có nghiệm x = " + x);
		}}
		
		// Hàm giải phương trình bậc hai
		public static void giaiPTBac2()
		{
		Scanner PT = new Scanner (System.in);
		System.out.println("Phương trình bậc 2: ax^2 + bx + c = 0 ");
		System.out.println("----------------------");
		// Nhập vào các hệ số a,b,c
		System.out.println("Nhập hệ số a: ");
		double a = PT.nextDouble();
		System.out.println("Nhập hệ số b: ");
		double b = PT.nextDouble();
		System.out.println("Nhập hệ số c: ");
		double c = PT.nextDouble();
		//Tính delta
		System.out.println("Delta = b^2 - 4ac");
		double delta = Math.pow(b, 2) - 4*a*c;
		//In ra kết quả
		System.out.println("Delta = " + delta);
		
		//Tính căn bậc 2 denta
		if (delta >=0)
		{
			double canDelta = Math.sqrt(delta);
			System.out.println("Căn bậc hai của delta: " + canDelta);
		}
		else
		{
			System.out.println("Delta âm, phương trình vô nghiệm");
		}}
		 // Hàm tính tiền điện
		public static void tinhTienDien() 
		{
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
