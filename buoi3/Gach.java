package buoi3;

import java.util.Scanner;

public class Gach {
	private String mso, mau;
	private int sl, ngang, doc;
	private long gia;
	
	public Gach() {
		mso = new String ();
		mau = new String();
		sl=0;
		ngang=0;
		doc = 0;
		gia = 0;
	}
	public Gach(String mso, String mau, int sl, int ngang, int doc,long gia) {
		this.mso = new String(mso);
		this.mau = new String(mau);
		this.sl = sl;
		this.ngang = ngang;
		this.doc = doc;
		this.gia = gia;
	}
	public Gach(Gach obj) {
		mso = obj.mso;
		mau = obj.mau;
		sl = obj.sl;
		ngang = obj.ngang;
		doc = obj.doc;
		gia = obj.gia;
	}
	
	
	public void in() {
		System.out.println("Ma so:" +mso+",Mau:"+mau+",So luong:"+sl+", Chieu ngang:"+ngang+", Chieu doc:"+doc+", Gia:"+gia);
	}
	
	public String toString() {
		return ("Ma so:" +mso+",Mau:"+mau+",So luong:"+sl+", Chieu ngang:"+ngang+", Chieu doc:"+doc+", Gia:"+gia);
	}
	
	public int dtich() {
		return ngang * doc * sl;
	}
	
	public double giaLe() {
		return gia/sl * 1.2;
	}
	
	public long giaBan() {
		return gia/dtich();
	}
	
	public int soHop(int D, int N) {
		int sovienngang = N/ngang;
		if(N % ngang !=0) sovienngang ++;
		int soviendai = D/doc;
		int t= soviendai * sovienngang;
		int h= t/sl;
		if(t % sl !=0) soviendai ++;
		return h;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao ma so: ");
		mso =sc.nextLine();
		System.out.println("Nhap vao mau: ");
		mau =sc.nextLine();
		System.out.println("Nhap vao so luong: ");
		sl = sc.nextInt();
		System.out.println("Nhap vao chieu ngang: ");
		ngang = sc.nextInt();
		System.out.println("Nhap vao chieu doc: ");
		doc =sc.nextInt();
		System.out.println("Nhap vao gia: ");
		gia =sc.nextLong();
	}
}






