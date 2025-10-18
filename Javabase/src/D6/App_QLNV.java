package D6;

import java.util.Scanner;

public class App_QLNV {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 NhapNV();
 
 
 
	}
	
	public static void NhapNV()
	{
		double lcb=10000000;
		double tongLuong = 0;
		double tongCP=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số nhân viên: ");
		int snv = sc.nextInt();
        sc.nextLine();
        HCNS[] hcns = new HCNS[snv];
         
       for (int i=0; i<snv; i++ )
       {
    	   System.out.println("==> Nhập thông tin nhân viên thứ " + (i + 1));
           hcns[i] = new HCNS();
           hcns[i].Nhapnhanvien();
       }
       
       System.out.println("Danh sách nhân viên phòng HCNS");
       for (int i=0; i<snv; i++ )
       {
    	   hcns[i].Innhanvien();
       }
     
       for (int i = 0; i < snv; i++) {
          // hcns[i].Innhanvien();
         //  System.out.println("Lương: " + hcns[i].getluong(lcb, hcns[i].getthamnien()));
      //    System.out.println(); // dòng trống để dễ nhìn
           
           tongLuong += hcns[i].getluong(lcb, hcns[i].getthamnien());
       
       
       
	}
       System.out.println("Tổng lương của tất cả nhân viên: " + tongLuong);
       System.out.println("Lương tb của tất cả nhân viên: " + tongLuong/snv);
       
       for (int i = 0; i < snv; i++) {
    	  double  a=hcns[i].getluong(lcb, hcns[i].getthamnien());
    	   if (a>tongLuong/snv)
    	   {
    		   hcns[i].Innhanvien();
    	   }
       }
       
       for (int i = 0; i < snv; i++) {
            
            tongCP += hcns[i].getluong(lcb, hcns[i].getthamnien()) + 0.1 * hcns[i].getluong(lcb, hcns[i].getthamnien());
       }
       System.out.println("Tổng chi phí lương của tất cả nhân viên: " + tongCP);
	

       
	}
	}
