package CTJAVA;

import java.util.Scanner;

public class Xe {
	private String soxe,loai, ngay;
	private char tthai;
	
	public Xe() {
		soxe = new String();
		loai = new String();
		ngay = new String();
		tthai = 'C';
	}
	
	public Xe(Xe x) {
		soxe = new String(x.soxe);
		loai = new String(x.loai);
		ngay = new String(x.ngay);
		tthai = x.tthai;
	}
	
	public void read() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so xe:");
		soxe = sc.nextLine();
		System.out.println("Nhap loai xe: ");
		loai = sc.nextLine();
		System.out.println("Nhap ngay-thang-nam dang kiem: ");
		ngay = sc.nextLine();
		System.out.println("Nhap trang thai (C/K):");
		tthai =sc.nextLine().charAt(0);
	}
	
	public void print() {
		System.out.println("So xe: "+soxe);
		System.out.println("Loai: "+loai);
		System.out.println("Ngay-thang-nam dang kiem: "+ngay);
		if(tthai == 'C') System.out.println("Xe dc phep luu hanh");
		else System.out.println("Xe ko dc phep luu hanh");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Xe x1 = new Xe();
		System.out.println("Nhap thong tin xe x1: ");
		x1.read();
		System.out.println("Thong tin vua nhap xe x1: ");
		x1.print();

	}

}
