package buoi3;

import java.util.Scanner;

public class SDGach {

	public static void main(String[] args) {
		Gach	ds[];
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao so hop gach: ");
		int n= sc.nextInt();
		ds = new Gach[n];
		for(int i=0;i<n;i++) {
			ds[i]=new Gach();
			sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			ds[i].nhap();
		}
		for(int i=0;i<n;i++) {
			ds[i].in();
		}
		long min=Long.MAX_VALUE;
		for(Gach e : ds) {
			if(e.giaBan()<min)
				min =e.giaBan();
		}
		for(Gach e : ds) {
			if(e.giaBan()==min)
				e.in();
		}
		System.out.println("So hop gach de lot nen ngang 20 doc 5");
		for(int i=0;i<n;i++) {
			System.out.println("So hop gach thu "+(i+1)+":"+ds[i].soHop(20, 5));
		}
	}
}
