package buoi3;
import java.util.Scanner;
import buoi2.Date;

public class SinhVien {
	Scanner sc = new Scanner(System.in);
	private String MSSV,fullname;
	private Date ngaysinh;
	private int sl;
	private String tenhp[];
	private String diemhp[];
	private int stc[];
	
	public SinhVien() {
		MSSV =new String();
		fullname = new String();
		ngaysinh = new Date();
		sl = 0;
		tenhp = new String [80];
		diemhp = new String[80];
		stc  = new int[50];
	}
	
	public SinhVien(SinhVien s) {
		MSSV = new String(s.MSSV);
		fullname = new String(s.fullname);
		ngaysinh = new Date(s.ngaysinh);
		sl = s.sl;
		tenhp = new String[80];
		diemhp = new String[80];
		for(int i=0;i<sl;i++) {
			tenhp[i] = new String(s.tenhp[i]);
			diemhp[i] = new String(s.diemhp[i]);
			stc[i] = s.stc[i];
		}
	}
	
	public void readSV() {
		System.out.println("Nhap ho va ten cua sinh vien: ");
		fullname = sc.nextLine();
		System.out.println("Nhap vao MSSV: ");
		MSSV = sc.nextLine();
		System.out.println("Nhap vao ngay thang nam sinh: ");
		ngaysinh.readDate();
	}
	
	public void readnameHP() {
		System.out.println("Hoc ki nay ban hoc bao nhieu hoc phan: ");
		sl = sc.nextInt();
		sc.nextLine();
		for(int i=0;i<sl;i++) {
			System.out.println("Nhap ten hoc phan thu "+(i+1)+": ");
			tenhp[i] = sc.nextLine();
		}
	}
	
	public void readMark() {
		for(int i=0;i<sl;i++) {
			System.out.println("Nhap diem hoc phan thu "+(i+1)+": ");
			diemhp[i] = sc.nextLine();
			System.out.println("Nhap stc cua hoc phan thu "+(i+1)+": ");
			stc[i] = Integer.parseInt(sc.nextLine());
		}	
	}
	
	public void printSV() {
		System.out.println("--------------------------------------------------------------");
		System.out.println("Ho va ten: "+fullname);
		System.out.println("MSSV: "+MSSV);
		System.out.println("Ngay thang nam sinh: ");
		ngaysinh.printDate();
		System.out.println("Sinh vien "+fullname+" hoc "+sl+" hoc phan");
		for(int i=0;i<sl;i++) {
			System.out.println("Ten hoc phan thu "+(i+1)+": "+tenhp[i]);
			System.out.println("Diem hoc phan thu "+(i+1)+": "+diemhp[i]);
			System.out.println("STC hoc phan thu "+(i+1)+": "+stc[i]);
		}
		System.out.println("--------------------------------------------------------------");
	}
	
	
	public void themHP(String ten, String d,int k) {
		if(sl<tenhp.length-1) {
			tenhp[sl] = new String(ten);
			diemhp[sl] = new String(d);
			stc[sl] = k;
			sl +=1;
		}
	}
	
	public void dangkyThem(){
		sc = new Scanner(System.in);
		System.out.println("Nhap vao so luong hoc phan can dang ky them: ");
		int n = sc.nextInt();
		int k= sl;
		sl = sl +n;
		sc.nextLine();
		for(int i=k;i<sl;i++) {
			System.out.println("Nhap hoc phan thu "+(i+1)+": ");
			tenhp[i] = sc.nextLine();
		}
		for(int i=k;i<sl;i++) {
			System.out.println("Nhap diem hoc phan \""+tenhp[i]+"\": ");
			diemhp[i] =sc.nextLine();
			System.out.println("Nhap stc hoc phan \""+tenhp[i]+"\": ");
			stc[i] = Integer.parseInt(sc.nextLine());
		}
	}
	
	public String toString() {
		String S= "MSSV: "+MSSV+", Ho va ten: "+fullname+", Ngay sinh "+ngaysinh.toString();
		for(int i=0;i<sl;i++) {
			S = S +", " +tenhp[i]+", "+diemhp[i];
		}
		return S;
	}
	
	public double AVG() {
		double s= 0;
		for(int i=0;i<sl;i++) {
			if(diemhp[i].equals("A")) s=s+4;
			else if(diemhp[i].equals("B+")) s=s+3.5; 
			else if(diemhp[i].equals("B")) s=s+3;
			else if(diemhp[i].equals("C+")) s=s+2.5;
			else if(diemhp[i].equals("C")) s=s+2;
			else if(diemhp[i].equals("D+")) s=s+1.5;
			else if(diemhp[i].equals("D")) s=s+1;
			else s=s+0;
		}
		return s/sl;
	}
	
	
	public String layTen() {
		String getname = new String(fullname);
		getname = getname.trim();
		return getname.substring(getname.lastIndexOf(" ")+1);
	}
	
	public void deleteHP(String ten) {
		int key =-1;
		for(int i=0;i<sl;i++) {
			if(tenhp[i].equals(ten)) {
				key = i;
				break;
			}
		}
		if(key!=-1) {
			for(int i=key;i<sl;i++) {
				tenhp[i] = tenhp[i+1];
				diemhp[i] = diemhp[i+1];
				stc[i] = stc[i+1];
			}
			sl -=1;
		}
	}
	
	
	public String layhoTen() {
		return fullname;
	}
	
	public double doidiem() {
		double s=0;
		for(int i=0;i<sl;i++) {
			if(diemhp[i].equals("A")) s= 4;
			else if(diemhp[i].equals("B+")) s=3.5;
			else if(diemhp[i].equals("B")) s=3;
			else if(diemhp[i].equals("C+")) s=2.5;
			else if(diemhp[i].equals("C")) s=2;
			else if(diemhp[i].equals("D+")) s=1.5;
			else if(diemhp[i].equals("D")) s=1;
			else s=0;
		}
		return (double)s;
	}
	/*float tinhdiem(student sv){
	    float total=0;
	    float k=0;
	    for(int i=0;i<sv.shp;i++){
	        total = total + (sv.a[i].diemHp * sv.a[i].stc);
	        k= k + sv.a[i].stc;
	    }
	    return total/k;
	}*/
	
	public double kq() {
		double total =0;
		int count =0;
		for(int i=0;i<sl;i++) {
			count +=stc[i];
			if(diemhp[i].equals("A")) total = total + (4*stc[i]);
			else if(diemhp[i].equals("B+")) total = total + (3.5*stc[i]);
			else if(diemhp[i].equals("B")) total = total + (3*stc[i]);
			else if(diemhp[i].equals("C+")) total = total + (2.5*stc[i]);
			else if(diemhp[i].equals("C")) total = total + (2*stc[i]);
			else if(diemhp[i].equals("D+")) total = total + (1.5*stc[i]);
			else if(diemhp[i].equals("D")) total = total + (1*stc[i]);
			else if(diemhp[i].equals("F")) total = total + 0;
		}
		return (double)total/count;
	}
	public String getUser(){
		return "";
	}
	public String getpassWord(){
		return "";
	}
	public String getEmail(){
		return "";
	}
}