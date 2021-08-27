package buoi2;

import java.util.Scanner;

public class SDPhanso {
	public static void main(String[] args) {
		PhanSo a = new PhanSo(3,7);
		System.out.print("Phan so A: ");
		a.in();
		PhanSo b = new PhanSo(4,79);
		System.out.print("\nPhan so B: ");
		b.in();
		
		PhanSo X = new PhanSo();
		PhanSo Y = new PhanSo();
		System.out.print("\nNhap X\n");
		X.nhap();
		System.out.print("Nhap Y\n");
		Y.nhap();
		System.out.print("Phan so nghich dao cua X: ");
		X.giatriNghichDao().in();
		
		System.out.print("\nTong: ");
		X.cong(Y).in();
		System.out.print("\nHieu: ");
		X.tru(Y).in();
		System.out.print("\nTich: ");
		X.nhan(Y).in();
		System.out.print("\nThuong: ");
		X.chia(Y).in();
		
		System.out.print("\nNhap so phan tu cua mang PhanSo: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		PhanSo phanSo[] = new PhanSo[n];
		for(int i=0; i<n; i++) {
			phanSo[i] = new PhanSo();
			System.out.printf("Nhap phanSo[%d]\n", i);
			phanSo[i].nhap();
		}
		
		System.out.printf("\nTong %d PhanSo: ", phanSo.length);
		PhanSo Sum = new PhanSo();
		Sum = Sum.tongNPhanSo(phanSo);
		Sum.in();
		
		System.out.print("\nPhanSo lon nhat: ");
		PhanSo Max = new PhanSo();
		Max = Max.max(phanSo);
		Max.in();
		
		for(int i=0; i<n; i++) {
			System.out.printf("\nphanSo[%d]: ", i);
			phanSo[i].in();
		}
		System.out.print("\nMang sau khi swap tang dan");
		PhanSo tmp = new PhanSo();
		for(int i=0; i<phanSo.length; i++) {
			for(int j=i+1; j<phanSo.length; j++) {
				if(phanSo[i].lonHon(phanSo[j])) {
					tmp = phanSo[i];
					phanSo[i] = phanSo[j];
					phanSo[j] = tmp;
				}
			}
			System.out.printf("\nphanSo[%d]: ", i);
			phanSo[i].in();
		}
		sc.close();
	}

}
	