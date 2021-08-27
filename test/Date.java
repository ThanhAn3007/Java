package test;

import java.util.Scanner;

public class Date {
	int day;
	private int month;
	private int year;
	
	public Date() {
		day=1;
		month = 1;
		year = 2001;
	}
	
	public Date(Date d) {
		day = d.day;
		month = d.month;
		year = d.year;
	}
	
	public Date(int a, int b, int c) {
		day  =this.day;
		month = this.month;
		year = this.year;
	}

	public void read() {
		Scanner sc = new Scanner (System.in);
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
