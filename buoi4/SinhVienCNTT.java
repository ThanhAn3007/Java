package buoi4;

import java.util.Scanner;
import buoi3.SinhVien;

public class SinhVienCNTT extends SinhVien{
	private String user, password, email;
	
	public SinhVienCNTT() {
		super();
		user = new String();
		password = new String();
		email = new String();
	}
	
	public SinhVienCNTT(SinhVienCNTT sv) {
		super(sv); 
		user = new String (sv.user);
		password  = new String(sv.password);
		email = new String(sv.email);
	}
	
	public void readSV() {
		super.readSV();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao tai khoan: ");
		user = sc.nextLine();
		System.out.println("Nhap vao mat khau: ");
		password = sc.nextLine();
		System.out.println("Nhap vao email: ");
		email = sc.nextLine();
	}
	
	public void printSV() {
		super.printSV();
		System.out.println("Tai khoan: "+user);
		System.out.println("Pass: "+password);
		System.out.println("Email: "+email);
	}
	
	public void doimatkhau(String pass) {
		password = new String(password);
	}
	
	public String getUer() {
		return user;
	}
	
	public String getPass() {
		return password;
	}
	
	public String getEmail() {
		return email;
	}
}
