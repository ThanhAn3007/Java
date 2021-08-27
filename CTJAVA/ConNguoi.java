package CTJAVA;

import java.util.Scanner;

public class ConNguoi {
	//Thuoc tinh
	private String id;
	private String hoten;
	private String ngay;
	private char phai;
	
	public ConNguoi() {
		id = new String();
		hoten = new String();
		ngay  = new String();
		phai = 'M';
	}
	
	public ConNguoi(ConNguoi cn) {
		id = new String(cn.id);
		hoten = new String(cn.hoten);
		ngay  = new String(cn.ngay);
		phai = cn.phai;
	}
	
	public void read() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ID: ");
		id=sc.nextLine();
		System.out.println("Nhap ho ten: ");
		hoten = sc.nextLine();
		System.out.println("Nhap ngay, thang, nam: ");
		ngay  =sc.nextLine();
		System.out.println("Nhap phai(M la nam)(F la nu):");
		phai = sc.nextLine().charAt(0);
	}
	
	public void print() {
		System.out.println("ID: "+id);
		System.out.println("Ho ten: "+hoten);
		System.out.println("Ngay, thang, nam: "+ngay);
		if(phai == 'M') System.out.println("Gioi tinh nam");
		else if(phai == 'F') System.out.println("Gioi tinh nu");
	}
	public long tinhluong() {
		return 0;
	}
	public String getngaysinh() {
		return ngay;
	}
	public long getsobanthang() {
		return 0;
	}
	
	public static void main(String[] args) {
		Scanner sc  =new Scanner(System.in);
		ConNguoi c1 = new ConNguoi();
		System.out.println("Nhap thong tin cho doi tuong c1:");
		c1.read();
		System.out.println("Thong tin vua nhap cua doi tuong c1:");
		c1.print();
		ConNguoi c2= new ConNguoi(c1);
		System.out.println("Thong tin doi tuong vua nhap duoc coppy tu doi tuong truoc do: ");
		c2.print();
	}

}
