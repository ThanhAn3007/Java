package buoi4;

import buoi3.SinhVien;
import java.util.Scanner;

public class SDSinhVienCNTT {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Danh sach cua ban co bao nhieu sinh vien");
		int n = Integer.parseInt(sc.nextLine());
		SinhVien ds[] = new SinhVien[n];
		char c;
		for(int i=0;i<ds.length;i++) {
			System.out.println("Nhap vao su lua chon cua ban");
			System.out.println("1. Nhap danh sach sinh vien");
			System.out.println("2. Nhap danh sach sinh vien khoa CNTT");
			c = sc.nextLine().charAt(0);
			if(c=='1') ds[i] = new SinhVien();
			else if(c=='2') ds[i] = new SinhVienCNTT();
			ds[i].readSV();
			ds[i].readnameHP();
			ds[i].readMark();
		}
		System.out.println("Danh sach thong tin sinh vien vua nhap:");
		for(int i=0;i<ds.length;i++) {
			ds[i].printSV();
		}
	}
}
