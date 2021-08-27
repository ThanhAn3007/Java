package buoi5;

import java.util.Scanner;

public class ChiTietHH {
	private HangHoa h;
	private int sl,dg;
	
	public ChiTietHH() {
		sl = 0;
		dg = 0;
		h = new HangHoa();
	}
	public ChiTietHH(ChiTietHH hh) {
		sl = hh.sl;
		dg = hh.dg;
		h = new HangHoa(hh.h);
	}
	
	public void read() {
		Scanner sc = new Scanner (System.in);
		h.read();
		System.out.println("Nhap so luong hang hoa: ");
		sl = sc.nextInt();
		System.out.println("Nhap don gia: ");
		dg = sc.nextInt();
	}
	public void print() {
		System.out.println("So luong: "+sl);
		System.out.println("Don gia: "+dg);
	}
}
