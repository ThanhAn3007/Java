package test;

import java.util.Scanner;

public class ChiTietHH {
	private int sl, dg;
	private HangHoa h;
	
	public ChiTietHH() {
		sl = 0;
		dg=0;
		h = new HangHoa();
	}
	public ChiTietHH(ChiTietHH ct) {
		sl = ct.sl;
		dg = ct.dg;
		h = new HangHoa(ct.h);
	}
	
	public void read() {
		Scanner sc = new Scanner(System.in);
		h.read();
		System.out.println("Nhap so luong hang hoa: ");
		sl = sc.nextInt();
		System.out.println("Nhap don gia: ");
		dg = sc.nextInt();	
	}
	public void print() {
		System.out.println("So luong hang hoa: "+sl);
		System.out.println("Don gia: "+dg);
	}
}
