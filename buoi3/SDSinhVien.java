package buoi3;
import java.util.Scanner;

public class SDSinhVien {
	static Scanner sc;
	public static void clrscr(){
		   //Clears Screen in java
		   try {
		       if (System.getProperty("os.name").contains("Windows"))
		           new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		       else
		           Runtime.getRuntime().exec("clear");
		   } catch (Exception ex) {}
		}
	public static void waitForCont()
    {
            System.out.printf("\nPress C to Continue...\n");
            boolean pressed = false;
            String entered = "";
            while(!pressed)
            {
                    entered=sc.next();
                    if((entered.equals("C"))||entered.equals("c"))
                        pressed=true;
            }
      }
	public static void main(String[] args) {
		sc = new Scanner(System.in);
//		SinhVien a = new SinhVien();
//		
//		System.out.print("Nhap thong tinh sinh vien\n");
//		a.readSV();
//		a.readnameHP();
//		a.readMark();
//		a.themHP("LTHDT","A",4);
//		System.out.print("Thong tin sinh vien vua nhap\n");
//		a.printSV();
//		a.dangKyThem();	
//		System.out.print("\nThong tin sinh vien da cap nhat\n");
//		a.printSV();
//		System.out.print("\nNhap ten hoc phan muon xoa: ");
//		String ten = "CTDL";
//		a.deleteHP(ten);
//		System.out.print("\nThong tin sinh vien da cap nhat\n");
//		a.printSV();
		System.out.print("\nDanh sach cua ban co bao nhieu sinh vien: ");
		int n = sc.nextInt();
		SinhVien ds[] = new SinhVien[n];
		boolean danhap = false;
		clrscr();
		while(true) {
			clrscr();
			System.out.print("*************************************************************\n");
			System.out.print("**          		CHUONG TRINH QUAN lY SINH VIEN  		 **\n");
			System.out.print("**              1. Nhap thong tin ca nhan va diem so       **\n");
			System.out.print("**              2. Xuat thong tin vua nhap                 **\n");
			System.out.print("**              3. Sap xep danh sach sinh vien theo ten    **\n");
	        System.out.print("**              4. Tinh diem trung binh cua sinh vien      **\n");
			System.out.print("**              5. Thoat chuong trinh                      **\n");
			System.out.print("*************************************************************\n");
			System.out.print("\nNhap su lua chon cua ban: ");
			int key = sc.nextInt();
			switch(key){
				case 1:{
					clrscr();
					System.out.print("\nBan da chon chuc nang nhap thong tin va diem so sinh vien\n");
					//Nhap danh sach sinh vien
					for(int i=0;i<ds.length;i++) {
						System.out.println("\nNhap thong tin va du lieu hoc phan cua sinh vien thu " + (i+1));
						ds[i] = new SinhVien();
						ds[i].readSV();
						ds[i].readnameHP();
						ds[i].readMark();
					}
					danhap = true;
	                System.out.print("\nBan da nhap thanh cong\n");
	                System.out.print("An phim bat ki de tiep tuc chuong trinh\n");
	                break;
				}
				case 2:{
					if(danhap) {
						clrscr();
	                    System.out.print("Ban da chon chuc nang in thong tin vua nhap\n");
	                    System.out.print("____________________________________________________\n");   
	            		for(int i=0;i<ds.length;i++) {
	            			System.out.println("\nThong tin sinh vien thu " + (i+1));
	            			ds[i].printSV();
	            		}
	                    System.out.print("____________________________________________________\n");
	                    danhap = true;
	                    System.out.print("Ban da xuat thanh cong thong tin vua nhap\n");
	                    System.out.print("An phim bat ki de tiep tuc chuong trinh\n");
	                    waitForCont();
	                    break;
					}
				}
				case 3:{
					if(danhap) {
						clrscr();
						System.out.print("Ban da chon chuc nang sap xep danh sach sinh vien theo ten\n");
						System.out.print("____________________________________________________\n");
						System.out.print("\nDanh sach sinh vien sap xep theo ten\n");
						for(int i=0;i<ds.length-1;i++) {
							for(int j=i+1;j<n;j++) {
								if(ds[i].layTen().compareTo(ds[j].layTen())>0) {
									SinhVien temp = ds[i];
											ds[i] = ds[j];
											ds[j]=temp;
								}
							}
						}
						for(int i=0;i<ds.length;i++) {
							System.out.println("Ten sinh vien thu " + (i+1)+": " + ds[i].layhoTen());
						}
	                    System.out.print("____________________________________________________\n");
	                    danhap = true;
	                    System.out.print("Ban da sap xep thanh cong cac ten sinh vien\n");
	                    System.out.print("An phim bat ki de tiep tuc chuong trinh\n");
	                    waitForCont();
	                    break;
					}
				}
				case 4:{
					if(danhap) {
						clrscr();
						System.out.print("Tinh diem trung binh cua sinh vien\n");
						System.out.print("____________________________________________________\n");
						for(int i=0;i<ds.length;i++) {
							System.out.println(ds[i].layhoTen() + " co diem trung binh hoc ki la: " + ds[i].kq());
						}
						System.out.print("____________________________________________________\n");
						danhap = true;
	                    System.out.print("Ban da tinh thanh cong diem trung binh hoc ki cua cac sinh vien\n");
	                    System.out.print("An phim bat ki de tiep tuc chuong trinh\n");
	                    waitForCont();
	                    break;
					}
				}
				case 5:{
	                    clrscr();
	                    System.out.print("Ban da chon chuc nang thoat chuong trinh\n");
	                    System.out.print("An phim bat ki de thoat chuong trinh\n");
	                    waitForCont();
	                    System.exit(0);
	                
				}
				default:
					clrscr();
					System.out.println("\nKhong co chuc nang so " + key);
					System.out.print("\nAn phim bat ki de lua chon lai chuc nang\n");
					waitForCont();
                    break;
			}
		}
		
		
		//Xuat danh sach thong tin cac sinh vien
		
		/*System.out.print("\nDanh sach thong tin cac sinh vien bi canh cao hoc vu\n");
		System.out.print("\n-----------------------------------------------------------------------------\n");
		for(int i=0;i<ds.length;i++) {
			if(ds[i].AVG()<1)
				ds[i].printSV();
		}
		System.out.print("-----------------------------------------------------------------------------\n");
		double max = ds[0].AVG();
		int k=0;
		for(int i=1;i<ds.length;i++) {
			if(ds[i].AVG()>max) {
				max=ds[i].AVG();
				k=i;
			}
		}
		System.out.print("\nThong tin sinh vien co diem trung binh cao nhat lop\n");
		ds[k].printSV();
		
		System.out.print("Ten da tach tu ho ten cac sinh vien co trong danh sach\n");
		for(int i=0;i<ds.length;i++) {
			System.out.println("Ten sinh vien thu " + (i+1) + ": " + ds[i].layTen());
		}
		System.out.print("\nDanh sach sinh vien sap xep theo ten\n");
		for(int i=0;i<ds.length-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(ds[i].layTen().compareTo(ds[j].layTen())>0) {
					SinhVien temp = ds[i];
							ds[i] = ds[j];
							ds[j]=temp;
				}
			}
		}
		System.out.print("\n-----------------------------------------------------------------------------\n");
		for(int i=0;i<ds.length;i++) {
			System.out.println("Ten sinh vien thu " + (i+1)+": " + ds[i].layhoTen());
		}
		System.out.print("-----------------------------------------------------------------------------\n");
		
		System.out.print("\nDiem trung binh tich luy cua tung sinh vien\n");
		System.out.print("\n-----------------------------------------------------------------------------\n");
		for(int i=0;i<ds.length;i++) {
			System.out.println(ds[i].layhoTen() + " co diem trung binh hoc ki la: " + ds[i].kq());
		}
		System.out.print("-----------------------------------------------------------------------------\n");*/
	}
}