package aTinhBMI;

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
		
	}

}
