package buoi2;

	import java.util.Scanner;
	import java.lang.Math;
	public class Diem {
		private int x,y;
		Scanner read = new Scanner(System.in);
		//Khai bao thuoc tinh
		
		public Diem(){
			x=0;
			y=0;
		}
		//Khoi tao gia tri(constructor)

		public Diem(int x1, int x2){
			x=x1;
			y=x2;
		}
		//Ham xay dung co 2 tham so

		public Diem(Diem k){
			x=k.x;
			y=k.y;
		}
		//Ham xay dung 1 tham so
		public void readPoint(){
			System.out.print("Nhap tung do x: ");
			x = read.nextInt();
			System.out.print("Nhap hoanh do y: ");
			y  = read.nextInt();
			
		}
		
		//Ham nhap diem(Diem trong khong gian 2 chieu)
		
		public void printPoint(){
			System.out.print("("+x+","+y+")");
		}
		//Ham in diem
		public String toString() {
			return ("("+x+","+y+")");
		}
		public void tinhTien(int dx, int dy){
			x = x + dx;
			y = y + dy;
		}
		//Ham doi diem di 1 do doi

		public int valueX(){
			return x;
		}
		//Ham lay tung do x

		public int valueY(){
			return y;
		}
		//Ham lay hoanh do y

		public float khoangCach(){
			return (float)Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
		}
		//Ham tinh khoang cach tu diem den goc toa do O

		public float khoangCach(Diem A){
			return (float)Math.sqrt(Math.pow(x-A.x,2)+Math.pow(y-A.y,2));
		}
		//Ham tinh khoang cach tu diem nay den diem kia
	}

