package BTVN_D5;

import java.util.Scanner;

public class App_Hinhoc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập ban kinh hinh tron: ");
		int x=sc.nextInt();
		Hinhtron cir1 = new Hinhtron();
		cir1.bankinh=x;
		cir1.tinhdientich();
		
		System.out.print("Nhập chieu dai: ");
		int dai1=sc.nextInt();
		System.out.print("Nhập chieu rong: ");
		int rong1=sc.nextInt();
		Hinhcn rec1 = new Hinhcn();
		rec1.chieudai=dai1;
		rec1.chieurong=rong1;
		rec1.tinhdientich();
		
		
		
	}

}
