package aDoiDonViDo;

import java.util.Scanner;

public class DoiDonViDo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double usd = DT.nextDouble();
		Scanner qd = new Scanner(System.in);
		//Nhập số km cần đổi
		System.out.println("Nhập số km cần đổi:");
		double km = qd.nextDouble();
		double m = km*1000;
		//Xuất ra kết quả
		System.out.println(km + "km = " + m + "m");
		
	}

}
