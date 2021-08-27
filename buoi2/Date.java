package buoi2;

import java.util.Scanner;
public class Date{
	private int day,month,year;
	Scanner sc = new Scanner(System.in);
	public Date(){
		day = 1;
		month = 1;
		year = 2020;
	}
	public Date(int day1, int month1, int year1){
		day = day1;
		month = month1;
		year = year1;
	}
	public Date(Date t) {
		day=t.day;
		month=t.month;
		year=t.year;
		
	}
	public void readDate(){
	
		do {
			System.out.print("Nhap ngay: ");
			day=sc.nextInt();
			System.out.print("Nhap thang: ");
			month=sc.nextInt();
			System.out.print("Nhap nam: ");
			year=sc.nextInt();
			if(!checkHL()) {
				System.out.print("\nSai dinh dang, nhap lai !\n");
			}
		}while(!checkHL());
	}
	public void printDate(){
		System.out.print(day+"/"+month+"/"+year);
	}
	public String toString() {
		return (day+"/"+month+"/"+year);
	}
	public boolean checkLeapYear(){
		if ((year % 400 == 0)||(year%4==0 && year%100!=0)) return true; 
		else return false; 
	}
	public boolean checkHL(){
		int arr[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		if(checkLeapYear()==true) arr[1] = 29;
		if(year >0 && (month>0 && month<13) && (day>0 && day<=arr[month-1]))
			return true;
		else return false;
	}
	public Date tomorrow() {
		Date useDate = new Date(day,month,year);
		useDate.day+=1;
		if(!useDate.checkHL()) {
			useDate.day=1;
			useDate.month+=1;
			if(!useDate.checkHL()) {
				useDate.month = 1;
				useDate.year++;
			}
		}
		return useDate;
	}
	public Date plusnDay(int n){
		Date useDate = new Date(day,month,year);
		for(int i=0;i<n;i++){
			useDate = useDate.tomorrow();
		}
		return useDate;
	}
}