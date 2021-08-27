package buoi5;

import java.util.Scanner;

public class SDHoaDon {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Co bao nhieu hoa don: ");
		int n = Integer.parseInt(sc.nextLine());
		HoaDon ds[]  =new HoaDon[n];
		System.out.println("Nhap thong tin cac hoa don");
		for(int i=0;i<n;i++) {
			System.out.println("Nhap hoa don thu "+(i+1));
			ds[i] = new HoaDon();
			ds[i].read();
		}
		System.out.println("Thong tin vua nhap: ");
		for(int i=0;i<n;i++) {
			System.out.println("Thong tin hoa don thu "+(i+1));
			ds[i].print();
		}
	}
}
