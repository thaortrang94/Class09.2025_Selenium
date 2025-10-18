package BTVN_D5;

import java.util.Scanner;

public class Tester extends Employee{
	public String Loai;

	public String getLoai() {
		return Loai;
	}

	public void setLoai(String loai) {
		Loai = loai;
	} 

	@Override
	public void Nhapthongtin()
	{
		 super.Nhapthongtin();
		Scanner sc = new Scanner(System.in);
        System.out.print("Nhập loai: ");
        Loai = sc.nextLine();
    }

    @Override
    public void Inthongtin() {
        System.out.println("[TEST] Mã NV: " + getCCCD() + " | Họ tên: " + getHoten() + " | SĐT: " + getSDT() + " | Công cụ test: " + Loai);
    }
}
