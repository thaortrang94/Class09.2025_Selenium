package BTVN_D5;

import java.util.Scanner;

public class Developer  extends Employee{
	public String Ngonngu;

	public String getNgonngu() {
		return Ngonngu;
	}

	public void setNgonngu(String ngonngu) {
		Ngonngu = ngonngu;
	}
	
	public void Nhapthongtin()
	
	{
		super.Nhapthongtin();
		Scanner sc = new Scanner(System.in);
        System.out.print("Nhập ngon ngu: ");
        Ngonngu = sc.nextLine();
    		
	}
	
    	
    	public void Inthongtin()
    	{
    		System.out.println( "So CCCD"+ getCCCD()+ " Ho ten "+ getHoten() + " So dien thoai"+ getSDT() + " Ngon ngu lap trinh" + Ngonngu);
    	}

		
}
