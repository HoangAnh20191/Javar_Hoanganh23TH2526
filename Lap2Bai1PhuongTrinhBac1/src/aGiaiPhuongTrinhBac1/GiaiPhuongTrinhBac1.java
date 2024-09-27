package aGiaiPhuongTrinhBac1;

import java.util.Scanner;

public class GiaiPhuongTrinhBac1 {

	public static void main(String[] args) {
		Scanner abc = new Scanner(System.in);
		
		// Nhập hệ số a,b (phương trình bậc 1: a*x + b = 0)
		System.out.println("Nhập hệ số a: ");
		double a = abc.nextDouble();
		System.out.println("Nhập hệ số b: ");
		double b =abc.nextDouble();
		
		//Giải phương trình
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
		}

	}

}
