package buoi5;

import java.util.Scanner;

public class KhachHang {
	private String hoten, diachi;
	private Boolean gioitinh;
	private Date ngaysinh;
	
	public KhachHang() {
		hoten  = new String();
		diachi = new String();
		gioitinh = true;
		ngaysinh = new Date();
	}
	public KhachHang(KhachHang kh) {
		hoten  = new String(kh.hoten);
		diachi = new String(kh.diachi);
		gioitinh = kh.gioitinh;
		ngaysinh = new Date(kh.ngaysinh);
	}
	
	public void read() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ho va ten khach hang: ");
		hoten = sc.nextLine();
		System.out.println("Nhap dia chi khach hang: ");
		diachi = sc.nextLine();
		System.out.println("Nhap gioi tinh khach hang (true = nam),(false = nu): ");
		gioitinh = sc.nextBoolean();
		System.out.println("Nhap ngay thang nam sinh khach hang: ");
		ngaysinh.read();
	}
	
	public void print() {
		System.out.println("Ho ten khach hang: "+hoten);
		System.out.println("Dia chi khach hang: "+diachi);
		if(gioitinh == true) System.out.println("Gioi tinh nam");
		else System.out.println("Gioi tinh nu");
		System.out.println("Ngay thang nam sinh: "+ngaysinh.toString());
	}
}
