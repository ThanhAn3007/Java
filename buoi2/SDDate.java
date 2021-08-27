package buoi2;

import java.util.Scanner;
public class SDDate{
		static Scanner read;
	public static void main(String[] args){
		read = new Scanner(System.in);
		Date useDate = new Date();
		System.out.println("Nhap ngay thang nam");
		useDate.readDate();
		System.out.print("Ngay thang nam vua nhap: ");
		useDate.printDate();
		if(useDate.checkHL()==true) System.out.print("\nNam vua nhap la nam HOP LE");
		else  System.out.print("\nNam vua nhap la nam KHONG HOP LE");
		System.out.print("\nNgay thang nam cua ngay hom sau la: ");
		useDate = useDate.tomorrow();
		useDate.printDate();
		System.out.print("\nNhap so ngay muon cong: ");
		int n = read.nextInt();
		System.out.print("\nNgay thang nam da cong them " + n +" ngay: ");
		useDate = useDate.plusnDay(n);
		useDate.printDate();
	}
}