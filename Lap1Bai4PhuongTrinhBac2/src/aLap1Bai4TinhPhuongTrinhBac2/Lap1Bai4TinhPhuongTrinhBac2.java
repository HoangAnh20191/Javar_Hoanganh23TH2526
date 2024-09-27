package aLap1Bai4TinhPhuongTrinhBac2;

import java.util.Scanner;

public class Lap1Bai4TinhPhuongTrinhBac2 {

	public static void main(String[] args) {
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
		}
		
	}

}
