package buoi5;

import java.util.Scanner;

public class HangHoa {
	private String mshh, tenhh, namsx;
	public HangHoa() {
		mshh = new String();
		tenhh = new String();
		namsx = new String();
	}
	public HangHoa(HangHoa hh) {
		mshh = new String(hh.mshh);
		tenhh = new String(hh.tenhh);
		namsx = new String(hh.namsx);
	}
	public void read() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Nhap MSHH: ");
		mshh = sc.nextLine();
		System.out.println("Nhap ten HH: ");
		tenhh = sc.nextLine();
		System.out.println("Nhap nam san xuat: ");
		namsx = sc.nextLine();
	}
	
	public void print() {
		System.out.println("Ma so hang hoa: "+mshh);
		System.out.println("Ten hang hoa: "+tenhh);
		System.out.println("Nam san xuat hang hoa: "+namsx);
	}
}
