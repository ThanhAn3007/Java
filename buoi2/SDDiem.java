package buoi2;

public class SDDiem {
	public static void main(String[] args){
		Diem A = new Diem(6,3);
		//Tao diem A co tung do 6 hoanh do 3

		System.out.print("Diem A = ");
		A.printPoint();	
		//Hien thi diem A

		Diem B = new Diem();
		//Tao diem B voi toa do nhap tu ban phim

		System.out.println("\nNhap toa do diem B");
		B.readPoint();
		//Nhap toa do diem B

		System.out.print("Diem B = ");
		B.printPoint();
		//Xuat toa do diem B

		Diem C = new Diem(-B.valueX(),-B.valueY());
		//Tao diem C doi xung vs diem B qua goc toa do O

		System.out.print("\nDiem C = ");
		C.printPoint();
		//Xuat toa do diem C

		System.out.print("\nKhoang cach tu diem B den goc toa do la: " + B.khoangCach());
		System.out.print("\nKhoang cach tu diem A den diem B la: " + B.khoangCach(A));
	}
}
