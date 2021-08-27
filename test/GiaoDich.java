package test;

import java.util.Scanner;

public class GiaoDich {
	private int msgd;
	private String hoten;
	private Date ngay;
	private Boolean trangthai;
	
	public GiaoDich() {
		msgd = 0;
		hoten = new String();
		ngay = new Date();
		trangthai = true;
	}
	
	public GiaoDich(GiaoDich gd) {
		msgd = gd.msgd;
		hoten = new String(gd.hoten);
		ngay = new Date(gd.ngay);
		trangthai = gd.trangthai;
	}
	
	public void read() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma so giao dich: ");
		msgd = sc.nextInt();
		System.out.println("Nhap ho ten nguoi giao dich: ");
		hoten = sc.nextLine();
		System.out.println("Nhap ngay thang nam: ");
		ngay.read();
		System.out.println("Trang thai giao dich: ");
		trangthai = sc.nextBoolean();
	}
	
	public void print() {
		System.out.println("Ma so giao dich: "+msgd);
		System.out.println("Ho ten giao dich: "+hoten);
		System.out.println("Ngay thang nam: ");
		ngay.print();
		if(trangthai == true) System.out.println("Giao dich thanh cong");
		else System.out.println("Giao dich that bai");
	}
}
