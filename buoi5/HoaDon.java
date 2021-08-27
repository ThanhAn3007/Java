package buoi5;

import java.util.Scanner;

public class HoaDon {
	private KhachHang kh;
	private KhachHangVIP khv;
	private String mshd;
	private Date ngaylap;
	private ChiTietHH ct[];
	private int n;
	final int max =50;
	
	public HoaDon() {
		kh  =new KhachHang();
		khv  =new KhachHangVIP();
		mshd = new String();
		ngaylap  =new Date();
		ct = new ChiTietHH [max];
		n=0;
	}
	public HoaDon(HoaDon hd) {
		kh  =new KhachHang(hd.kh);
		khv  =new KhachHangVIP(hd.khv);
		mshd = new String(hd.mshd);
		ngaylap  =new Date(hd.ngaylap);
		ct = new ChiTietHH [max];
		n=hd.n;
		for(int i=0;i<n;i++) {
			ct[i] = new ChiTietHH(hd.ct[i]);
		}
	}
	public void read() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Chon thong tin muon nhap hoa don");
		System.out.println("1.Nhap thong tin Khach Hang VIP");
		System.out.println("2.Nhap thong tin Khach Hang NorMal");
		char key;
		key = sc.nextLine().charAt(0);
		
		if(key == '1') kh = new KhachHangVIP();
		else if(key == '2') kh = new KhachHang();
	
		kh.read();
		System.out.println("Nhap ma so hoa don: ");
		mshd = sc.nextLine();
		System.out.println("Nhap ngay lap hoa don: ");
		ngaylap.read();
		System.out.println("Nhap so luong hang hoa can phai mua: ");
		n=sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Nhap thong tin thu "+(i+1)+": ");
			ct[i]  =new ChiTietHH();
			ct[i].read();
		}
	}
	public void print() {
		System.out.println("-------------------------------");
		System.out.println("Thong tin khach hang");
		kh.print();
		System.out.println("Thong tin hoa don cua khach hang");
		System.out.println("Ma so hoa don: "+mshd);
		System.out.println("Ngay lap hoa don: "+ngaylap.toString());
		System.out.println("So luong hang hoa can mua: "+n);
		for(int i=0;i<n;i++) {
			System.out.println("Thong tin thu "+(i+1)+": ");
			ct[i].print();
		}
		System.out.println("-------------------------------");
	}
}
