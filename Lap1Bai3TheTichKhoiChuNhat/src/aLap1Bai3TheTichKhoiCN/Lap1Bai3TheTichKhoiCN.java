package aLap1Bai3TheTichKhoiCN;

import java.util.Scanner;

public class Lap1Bai3TheTichKhoiCN {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		// Nhập canh của khối lập phương
		System.out.println("Nhập cạnh của khối lập phương: ");
		double canh = a.nextDouble();
		//Tính thể tích
		double theTich = canh*canh*canh;
		//In ra kết quả
		System.out.println("----------------------");
		System.out.println("Thể tích khối lập phương = cạnh x cạnh x cạnh");
		System.out.println("Đáp án");
		System.out.println("Thể tích khối lập phương là :" + theTich);
		

	}

}
