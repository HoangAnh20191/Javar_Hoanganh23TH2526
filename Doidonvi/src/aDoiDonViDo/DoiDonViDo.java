package aDoiDonViDo;

import java.util.Scanner;

public class DoiDonViDo {

	public static void main(String[] args) {
		Scanner abc = new Scanner(System.in);
		
		//Nhập số km cần đổi
		System.out.println("Nhập số kilomet:");
		double km = abc.nextDouble();
		
		//Đổi km sang m
		double m = km*1000;
		
		//In ra kết quả
		System.out.println(km + "km = " + m + "m");
		
	}

}
