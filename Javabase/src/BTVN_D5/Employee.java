package BTVN_D5;

import java.util.Scanner;

public class Employee {
	private String Hoten; 
	private String CCCD; 
	private String SDT;
	public String getHoten() {
		return Hoten;
	}
	public void setHoten(String hoten) {
		Hoten = hoten;
	}
	public String getCCCD() {
		return CCCD;
	}
	public void setCCCD(String cCCD) {
		CCCD = cCCD;
	}
	public String getSDT() {
		return SDT;
	}
	public void setSDT(String sDT) {
		SDT = sDT;
	}
	
	public void Nhapthongtin()
	{
			Scanner sc = new Scanner(System.in);
	        System.out.print("Nhập họ tên: ");
	        Hoten = sc.nextLine();
	        System.out.print("Nhập CCCD: ");
	        CCCD = sc.nextLine();
	        System.out.print("Nhập số điện thoại: ");
	        SDT = sc.nextLine();
	
	}
    	
    	public void Inthongtin()
    	{
    		System.out.println( "So CCCD"+ CCCD+ "Ho ten "+ Hoten + "So dien thoai"+ SDT);
    	}
		
	
}
