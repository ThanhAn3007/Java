package buoi5;

import java.util.Scanner;

public class Date {
	private int day, month, year;
	
	public Date() {
		day=1;
		month =1;
		year = 2001;
	}
	public Date(Date d) {
		day = d.day;
		month  =d.month;
		year = d.year;
	}
	public Date(int a, int b, int c) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public void read() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ngay: ");
		day = sc.nextInt();
		System.out.println("Nhap thang: ");
		month = sc.nextInt();
		System.out.println("Nhap nam: ");
		year = sc.nextInt();
	}
	public void print() {
		System.out.println(day+"/"+month+"/"+year);
	}
	public String toString() {
		return (day+"/"+month+"/"+year);
	}
}