package buoi4;

import buoi2.Diem;
import java.util.Scanner;

public class DiemMau extends Diem{
	private String color;
	public DiemMau() {
		super();
		color = new String();
	}
	public DiemMau(int a, int b, String m) {
		super(a,b);
		color = new String(m);
	}
	public DiemMau(DiemMau mau) {
		super((Diem)mau);
		color = mau.color;
	}
	
	public void readPoint() {
		super.readPoint();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap mau cua diem: ");
		color = sc.nextLine();
	}
	
	public String toString() {
		return super.toString() + (", Diem co mau: "+color);
	}
	
	public void gan(String mau) {
		color = new String(mau);
	}
	
}
