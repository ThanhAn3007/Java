package buoi4;

import java.util.Scanner;
import buoi2.Diem;


public class SDDiemMau {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DiemMau a = new DiemMau(5,10,"White");
		System.out.println("Diem mau a vua duoc khoi tao");
		System.out.println("a:"+a.toString());
		DiemMau b = new DiemMau();
		System.out.println("Nhap vao thong tin diem b:");
		b.readPoint();
		b.tinhTien(10, 8);
		b.gan("Yellow");
		System.out.println("Thong tin diem b vua nhap la:");
		System.out.println("b="+b.toString());
		System.out.println("Danh sach co bao nhieu diem.");
		int n = Integer.parseInt(sc.nextLine());
		Diem ds[] = new Diem[n];
		char c;
		for(int i=0;i<ds.length;i++) {
			System.out.println("Nhap su lua chon cua ban");
			System.out.println("1. Nhap diem.");
			System.out.println("2. Nhap diem mau.");
			c = sc.nextLine().charAt(0);
			if(c=='1') ds[i] = new Diem();
			else if(c=='2') ds[i] = new DiemMau();
			ds[i].readPoint();
		}
		
		System.out.println("Thong tin vua nhap la: ");
		for(int i=0;i<ds.length;i++) {
			System.out.println("Thong tin diem thu "+(i+1)+": ");
			System.out.println("Diem ["+(i+1)+"]: "+ds[i].toString());
		}
	}
}
