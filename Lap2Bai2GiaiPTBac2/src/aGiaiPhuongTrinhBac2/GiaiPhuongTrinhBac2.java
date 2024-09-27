package aGiaiPhuongTrinhBac2;

import java.util.Scanner;

public class GiaiPhuongTrinhBac2 {

	public static void main(String[] args) {
		Scanner abc = new Scanner(System.in);
		System.out.println("-----Giải phương trình bậc 2-----");
		// Nhập các hệ số a, b, c (ax^2 + bx + c = 0)
		System.out.println("Nhập hệ số a :");
		double a = abc.nextDouble();
		System.out.println("Nhập hệ số b :");
		double b = abc.nextDouble();
		System.out.println("Nhập hệ số c :");
		double c = abc.nextDouble();
		
		//Giải phương trình
	// Trường hợp 1: a = 0
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
	
		else {
			//Trường hợp 2: a khác 0 , tính denta
			double denta = b*b -4*a*c;
			if (denta <0) {
				System.out.println("Phương trình vô nghiệm");
			} else
				if (denta ==0) {
					double x = -b/2*a;
					System.out.println("Phương trình có nghiệm kép x = " + x);
				} else {
					double canDenta = Math.sqrt(denta);
					double x1 = ((-b+canDenta)/2*a);
					double x2 = ((-b-canDenta)/2*a);
					System.out.println("Phương trình có 2 nghiệm: ");
					System.out.println("x1 = " + x1);
					System.out.println("x2 = " + x2);
				}
			
		}
		
		
		
		

	}

}
