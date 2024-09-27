package aGiaiPhuongTrinhBac2;

import java.util.Scanner;

public class GiaiPhuongTrinhBac2 {

	public static void main(String[] args) {
		Scanner abc = new Scanner(System.in);
		
		// Nhập các hệ số a, b, c (ax^2 + bx + c = 0)
		System.out.println("Nhập hệ số a :");
		double a = abc.nextDouble();
		System.out.println("Nhập hệ số b :");
		double b = abc.nextDouble();
		System.out.println("Nhập hệ số c :");
		double c = abc.nextDouble();
		
		//Giải phương trình
		if (a==0) {
			//Giải phương trình bậc 1 bx + c = 0
			if (b==0) {
				if (c==0) {
					System.out.println("Phương trình vô số nghiệm");
				} 
				else {
					System.out.println("Phương trình vô nghiệm");
				}
			}
			else {
				double x = -c/b;
				System.out.println("Phương trình có nghiệm x = " + x);
			}
			
		}
		
		
		
		

	}

}
