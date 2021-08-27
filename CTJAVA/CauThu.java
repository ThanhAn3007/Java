package CTJAVA;
//Ten: 
//MSSV:

import java.util.Scanner;

public class CauThu extends ConNguoi{
	private int so;
	private String vitri;
	private long banthang;
	private String muagiai;
	private String clbo;
	
	public CauThu() {
		super();
		vitri = new String();
		so = 0;
		banthang =0;
		muagiai =new String();
		clbo = new String();
	}
	
	public CauThu(CauThu ct) {
		super(ct);
		vitri = new String(ct.vitri);
		so = ct.so;
		banthang =ct.banthang;
		muagiai =new String(ct.muagiai);
		clbo = new String(ct.clbo);
	}
	
	public void read() {
		super.read();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so ao: ");
		so = Integer.parseInt(sc.nextLine());
		System.out.println("Nhap vi tri cau thu: ");
		vitri = sc.nextLine();
		System.out.println("Nhap so ban thang cua cau thu: ");
		banthang = sc.nextLong();
		System.out.println("Nhap mua giai: ");
		sc.nextLine();
		muagiai = sc.nextLine();
		System.out.println("Nhap cau lac bo: ");
		clbo = sc.nextLine();
	}
	
	public void print() {
		super.print();
		System.out.println("So ao: "+so);
		System.out.println("Vi tri: "+vitri);
		System.out.println("So ban thang cua cau thu: "+banthang);
		System.out.println("Mua giai: "+muagiai);
		System.out.println("Cau lac bo: "+clbo);
	}
	//Tinh Luong
	public long tinhluong() {
		long luongtangthem = 0;
		if(vitri.equals("Thu mon")) luongtangthem = 3000000;
		else if(vitri.equals("Hau ve")) luongtangthem = 4000000;
		else if(vitri.equals("Trung ve")) luongtangthem = 4500000;
		else if(vitri.equals("Tien ve")) luongtangthem = 5000000;
		else if(vitri.equals("Tien dao")) luongtangthem = 7000000;
		return (long)((7000000+luongtangthem+(banthang)*500000)*0.9);
	}
	public String getngaysinh() {
		String h = new String(super.getngaysinh());
		h= h.trim();
		return h.substring(h.lastIndexOf("-")+1);
	}
	public long getsobanthang() {
		return 0;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Danh sach co bao nhieu cau thu:");
		int n= Integer.parseInt(sc.nextLine());
		ConNguoi ds[] = new ConNguoi[n];
		char key;
		for(int i=0;i<ds.length;i++) {
			System.out.println("Nhap lua chon");
			System.out.println("1. Nhap thong tin con nguoi");
			System.out.println("2. Nhap thong tin cau thu");
			key = sc.nextLine().charAt(0);
			if(key == '1') ds[i] = new  ConNguoi();
			else if(key == '2') ds[i] = new CauThu();
			System.out.println("Nhap thong tin doi tuong thu"+(i+1)+": ");
			ds[i].read();
		}
		System.out.println("Thong tin vua nhap");
		for(int i=0;i<ds.length;i++) {
			System.out.println("Thong tin doi tuong vua nhap thu "+(i+1)+": ");
			ds[i].print();
		}
		System.out.println("DS luong cau thu");
		for(int i=0;i<ds.length;i++) {
			System.out.println("Luong cau thu thu thu "+(i+1)+": "+ds[i].tinhluong());
		}
	}

}
