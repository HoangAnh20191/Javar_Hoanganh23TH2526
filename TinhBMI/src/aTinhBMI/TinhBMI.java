package aTinhBMI;

import java.util.Scanner;

public class TinhBMI {

	public static void main(String[] args) {
		Scanner banPhim = new Scanner (System.in);
		// Nhập họ tên
		System.out.print("Họ tên: ");
		String hoTen= banPhim.nextLine();
		//Nhập chiều cao
		System.out.print("Chiều cao (m): ");
		double chieuCao = banPhim.nextDouble();
		//Nhập cân nặng
		System.out.print("Cân nặng (kg):");
		double canNang = banPhim.nextDouble();
		
		//Tính chỉ số BMI
		double bmi = canNang/ (chieuCao*chieuCao);
		//In thông tin ra cho người dùng
		System.out.println("Bạn " + hoTen);
		System.out.println("Có chỉ số BMI = " + bmi);
		
		//Đưa ra nhận xét
		if (bmi<18.5)
			System.out.println("Bạn thiếu cân, cần bổ sung thêm nhiều dinh dưỡng");
		else if(bmi<25)
			System.out.println("Chúc mừng, bạn có cân nặng bình thường");
		else if(bmi<30)
			System.out.println("Bạn bị tiền béo phì, cân đối lại chế độ ăn uống nhé!");
		else if(bmi<35)
			System.out.println("Bạn bị béo phì độ 1, bạn cần tập thể dục nhiều hơn");
		else if(bmi<40)
			System.out.println("Bạn bị béo phì độ 2, bạn cần kiểm soát năng lượng nạp vào và tập thể dục nhiều hơn");
		else System.out.println("Bạn bị béo phì độ 3, cần đi đến chuyên gia!!!");
		
	}

}
