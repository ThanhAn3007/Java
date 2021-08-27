package buoi3;

import buoi2.Diem;

public class SDDoanThang {
	public static void main(String[]args) {
		Diem a = new Diem(19,12);
		Diem b = new Diem(10,11);
		
		DoanThang ab = new DoanThang(a,b);
		ab.tinhTien(5, 3);
		System.out.print("\nDoan thang sau khi duoc tinh tien: "+ ab);
		DoanThang cd = new DoanThang();
		System.out.print("\nNhap doan thang cd\n");
		cd.readDT();
		System.out.println("Doan thang cd vua nhap: "+ cd);
		System.out.println("Do dai doan thang cd la: "+cd.doDai());
		System.out.println("Goc cua doan thang cd den truc hoanh la: "+cd.goc());
	}
}
