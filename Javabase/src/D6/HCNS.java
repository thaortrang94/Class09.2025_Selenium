package D6;

import java.util.Scanner;

public class HCNS extends QLNV {
	private String Chucvu;
	private float thamnien;
	double lcb=10000000;
	double luong;
	
	public double getluong(double lcb, float thamnien) {
		if (thamnien >= 5)
		{
			return lcb*thamnien + lcb*0.3;
		}
		else if (thamnien >= 3 && thamnien < 5)
		{
			return lcb*thamnien + lcb*0.1;
		}
		else
		return lcb*thamnien;
	}
	
	public String getChucvu() {
		return Chucvu;
	}

	public void setChucvu(String chucvu) {
		Chucvu = chucvu;
	}
	
	public float getthamnien() {
		return thamnien;
	}

	

	public void Nhapnhanvien()
	{
		//super.Nhapnhanvien();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập chức vụ nhân viên: ");
		Chucvu = sc.nextLine();
		System.out.println("Nhập thâm niên nhân viên: ");
		thamnien = sc.nextFloat();
	}
	
	public void Innhanvien()
	{
		System.out.println("Mã NV: "+ getMaNV() +", Họ tên là: "+ getHoten() + ", SDT là: "+getSDT()+ ", Chức vụ là: "+ Chucvu+ ", Thâm niên là: "+ thamnien);
	}

}
