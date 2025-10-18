package D6;

import java.util.Scanner;

public class QLNV {
	private String MaNV; 
	private String Hoten; 
	private String SDT;
	
	public String getMaNV() {
		return MaNV;
	}
	public void setMaNV(String maNV) {
		MaNV = maNV;
	}
	public String getHoten() {
		return Hoten;
	}
	public void setHoten(String hoten) {
		Hoten = hoten;
	}
	public String getSDT() {
		return SDT;
	}
	public void setSDT(String sDT) {
		SDT = sDT;
	}

	public void Nhapnhanvien()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập mã nhân viên: ");
		MaNV = sc.nextLine();
		System.out.println("Nhập họ tên nhân viên: ");
		Hoten = sc.nextLine();
		System.out.println("Nhập SDT nhân viên: ");
		SDT = sc.nextLine();
	}
	
	public void Innhanvien()
	{
		System.out.println("Nhân viên có mã là: "+ MaNV +", Họ tên là: "+ Hoten + ", có SDT là: "+SDT);
	}
}
