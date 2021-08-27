package buoi3;

import buoi2.Diem;
import java.lang.Math;


public class DoanThang {
	private Diem first, last;
	
	public DoanThang() {
		first = new Diem();
		last = new Diem();
	}
	
	public DoanThang(Diem a, Diem b) {
		first = new Diem(a);
		last = new Diem(b);
	}
	
	public DoanThang(int a, int b, int  c,int d) {
		first = new Diem(a,b);
		last = new Diem(c,d);
	}
	
	public void readDT() {
		System.out.print("\nNhap vao toa do diem dau cua doan thang:\n");
		first.readPoint();
		System.out.print("\nNhap vao toa do diem cuoi cua doan thang:\n");
		last.readPoint();
	}
	
	public String toString() {
		return ("["+first+","+last+"]");
	}
	
	public void tinhTien(int dx, int dy) {
		first.tinhTien(dx, dy);
		last.tinhTien(dx, dy);
	}
	
	public double doDai() {
		return (double)first.khoangCach(last);
	}
	
	public double goc() {
		double canhhuyen = Math.abs(last.valueY() - first.valueY());
		double canhgocvuong = doDai();
		double kq = Math.asin(canhhuyen/canhgocvuong);
		return (double)kq*(180/(double)Math.PI);
	}
	
}

















