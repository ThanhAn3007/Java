package buoi5;

import java.util.Scanner;

public class KhachHangVIP extends KhachHang {
	private float tile;
	private Date ngaylap;
	
	public KhachHangVIP() {
		super();
		tile = 0.0f;
	}
	
	public KhachHangVIP(KhachHangVIP khv) {
		super(khv);
		tile = khv.tile;
	}
	public void read() {
		super.read();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao ti le giam gia cho khach hang VIP: ");
		tile = sc.nextFloat();
	}
	public void print() {
		super.print();
		System.out.println("Ti le giam gia cua khach hang VIP la: "+tile);
	}
}
