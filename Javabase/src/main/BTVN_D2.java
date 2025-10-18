package main;

import java.util.Scanner;

public class BTVN_D2 {
	
	public static void main(String[] args) {
//		double a=0;
//		printKQ();
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Nhập giá trị: ");
//		int b=sc.nextInt();
//		 printchanle(b);
		
		
		printArray();
	}
	
	public static void printKQ ()
	{
		double a= (123*6745)%500;
		System.out.println("Kết quả của (123*6745)/500 là "+a);
		
	}
	public static void printchanle (int b)
	{
		if (b%2==0)
		{
			System.out.println("Số "+b + " là số chẵn");
		}
		else
		{
			System.out.println("Số "+b + " là số lẻ");
		}
	}
	
	public static void printArray()
	{
		Scanner sca = new Scanner(System.in);
		System.out.print("Nhập số giá trị: ");
		int n=sca.nextInt();
		int[] c = new int[n];
		int d=0;
		for (int i=0; i<n; i++)
		{
			  System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
	          c[i] = sca.nextInt();
			  d=d+c[i];
		}
	
		System.out.println("Tổng của dãy số là "+d);
	}
}

