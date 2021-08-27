package buoi2;

import java.util.Scanner;

public class PhanSo {
	private int x,y;
	public PhanSo() {
		x=0;
		y=0;
	}
	public PhanSo(int x1,int y1) {
		x=x1;
		y=y1;
	}
	public PhanSo(PhanSo s) {
		x=s.x;
		y=s.y;
	}
	public PhanSo(PhanSo s[] ) {
		for(int i=1;i<s.length;i++) {
			s[i]= new PhanSo();
		}
	}
	public void nhap() {
		boolean bool =true;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.print("Tu so: ");
			x=sc.nextInt();
			System.out.print("Mau so: ");
			y=sc.nextInt();
			bool=true;
			if(y==0)
				System.out.println("Ban da nhap sai dinh dang.Hay nhap lai mau khac 0!\n");
				bool =false;
		}while(!bool);
	}
	public PhanSo donGian() {
		PhanSo s = new PhanSo(x, y);
		int x1 = s.x, y1 = s.y, ucln = 0;
		if (x1 < 0)
			x1 = -x1;
		if (y1 < 0)
			y1 = -y1;
		if (x1 == 0 || y1 == 0)
			ucln = x1 + y1;
		else {
			while (x1 != y1) {
				if (x1 > y1)
					x1 -= y1;
				else
					y1 -= x1;
			}
			ucln = x1;
		}
		s.x = s.x / ucln;
		s.y = s.y / ucln;
		return s;
	}

	public void in() {
		PhanSo s= new PhanSo(x,y);
		s.donGian();
		if(x==0)
			System.out.print(0);
		else if(y==1)
			System.out.print(1);
		else if(y==0)
			System.out.print("Phan so sai dinh dang!");
		else {
			System.out.print(x+ "/"+y);
		}
	}
	
	public void nghichDao() {
		 int tmp;
		 tmp=x;
		 x=y;
		 y=tmp;
	}
	public PhanSo giatriNghichDao(){
		PhanSo s=new PhanSo(y,x);
		return s;
	}
	
	public float giatriThuc() {
		return (float)x/y;
	}
	
	public boolean lonHon(PhanSo a) {
		return (giatriThuc()>a.giatriThuc())?true :false;
	}
	
	public PhanSo cong(PhanSo a) {
		PhanSo s=new PhanSo(x,y);
		s.x=s.x*a.y + s.y*a.x;
		s.y=s.y*a.y;
		return s.donGian();
	}
	
	public PhanSo tru(PhanSo a) {
		PhanSo s=new PhanSo(x,y);
		s.x=s.x*a.y - s.y*a.x;
		s.y=s.y*a.y;
		return s.donGian();
	}
	  
	public PhanSo nhan(PhanSo a) {
		PhanSo s=new PhanSo(x,y);
		s.x=s.x*a.x;
		s.y=s.y*a.y;
		return s.donGian();
	}
	
	public PhanSo chia(PhanSo a) {
		PhanSo s=new PhanSo(x,y);
		s.x= s.x*a.y;
		s.y= s.y*a.x;
		return s.donGian();
	}
	
	public PhanSo cong(int t) {
		PhanSo s=new PhanSo(x,y);
		s.x=s.x + t*s.y;
		s.y=s.y;
		return s.donGian();
	}
	
	public PhanSo tru(int t) {
		PhanSo s=new PhanSo(x,y);
		s.x=s.x - t*s.y;
		s.y=s.y;
		return s.donGian();
	}
	
	public PhanSo nhan(int t) {
		PhanSo s=new PhanSo(x,y);
		s.x=s.x*t;
		s.y = s.y;
		return s.donGian();
	}
	
	public PhanSo chia(int t) {
		PhanSo s=new PhanSo(x,y);
		s.x=s.x;
		s.y=s.y *t;
		return s.donGian();
	}
	
	public PhanSo tongNPhanSo(PhanSo a[]) {
		PhanSo result = new PhanSo();
		for(int i=0;i<a.length;i++) {
			result = result.cong(a[i]);
		}
		return result;
	}
	
	public PhanSo max(PhanSo a[]) {
		PhanSo result =new PhanSo();
		for(int i=0;i<a.length;i++) {
			if(!result.lonHon(a[i]));
				result= a[i];
		}
		return result;
	}
}







