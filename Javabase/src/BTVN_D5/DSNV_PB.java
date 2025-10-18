package BTVN_D5;

import java.util.Scanner;

public class DSNV_PB {
	private String Hoten; 
	private String MaNV; 
	private String SDT;
	private int Phongban;
	public String getHoten() {
		return Hoten;
	}
	public void setHoten(String hoten) {
		Hoten = hoten;
	}
	public String getMaNV() {
		return MaNV;
	}
	public void setMaNV(String maNV) {
		MaNV = maNV;
	}
	public String getSDT() {
		return SDT;
	}
	public void setSDT(String sDT) {
		SDT = sDT;
	} 
	public int getPhongban() {
		return Phongban;
	}
	public void setPhongban(int Phongban) {
		this.Phongban = Phongban;
	} 
	

	    //khởi tạo constructor có tham số
	    public void Nhanvien(String Hoten, String MaNV, String SDT, int Phongban) {
	        this.Hoten = Hoten;
	        this.MaNV = MaNV;
	        this.SDT = SDT;
	        this.Phongban=Phongban;
	       
	    }
	    
	    public static void main(String[] args) {
			// TODO Auto-generated method stub
	    	Scanner sc = new Scanner(System.in);
			System.out.print("Nhập so nv: ");
			int n=sc.nextInt();sc.nextLine();
	    	for (int i =0; i<n; i++ )
	    	{
	    		DSNV_PB nv1 = new DSNV_PB();
	    		System.out.println("Nhập mã nhân viên "+(i+1) +" là: ");
	    		nv1.setMaNV(sc.toString());sc.nextLine();
	    		System.out.println("Nhập tên nhân viên "+(i+1) +" là: ");
	    		nv1.setHoten(sc.toString());sc.nextLine();
	    		System.out.println("Nhập SĐT nhân viên "+(i+1) +" là: ");
	    		nv1.setSDT(sc.toString());sc.nextLine();
	    		System.out.println("Nhập phòng ban nhân viên "+(i+1) +" là: ");
	    		nv1.setPhongban(sc.nextInt());sc.nextLine();
	    	}
	    	
		}
	}


