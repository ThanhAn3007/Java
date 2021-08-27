package CTJAVA;

import java.util.Scanner;

public class GiaoDich {
	private int mgd;
	private String hten;
	private String ngay;
	private Boolean tthai;
	
	public GiaoDich() {
		mgd =0;
		hten = new String();
		ngay = new String();
		tthai = true;
	}
	
	public GiaoDich(GiaoDich gd) {
		mgd =gd.mgd;
		hten = new String(gd.hten);
		ngay = new String(gd.hten);
		tthai = gd.tthai;
	}
	
	public void read() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma gd: ");
		mgd =sc.nextInt();
		System.out.println("Nhap ho ten: ");
		sc.nextLine();
		hten = sc.nextLine();
		System.out.println("Nhap ngay,thang,nam: ");
		ngay = sc.nextLine();
		System.out.println("Trang thai giao dich: ");
		tthai = sc.nextBoolean();
	}
	
	public void print() {
		System.out.println("Ma giao dich: "+mgd);
		System.out.println("Ho ten: "+hten);
		System.out.println("Ngay-thang-nam: "+ngay);
		if(tthai == true) System.out.println("Giao dich thanh cong");
		else System.out.println("Giao dich that bai");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		GiaoDich gd1 = new GiaoDich();
		System.out.println("Nhap thong tin doi tuong gd1: ");
		gd1.read();
		System.out.println("Thong tin vua nhap cua doi tuong gd1: ");
		gd1.print();
		
		GiaoDich gd2 = new GiaoDich(gd1);
		System.out.println("Thong tin doi tuong gd2 dc copy tu doi tuong gd1");
		gd2.print();
	}

}
