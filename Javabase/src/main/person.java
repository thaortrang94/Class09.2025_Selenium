package main;

import java.util.Scanner;

public class person {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Trang");
		//System.out.println("Trang2");
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Nhập số thứ nhất: ");
//		double a=sc.nextDouble();
//		System.out.print("Nhập số thứ hai: ");
//		double b=sc.nextDouble();
//		
//		printlargernumber(a,b);
		
		printArray();
	}



public static void printlargernumber (double a, double b)
{
	if (a>b)
	{
		System.out.println("Số lớn hơn là "+a);
	}
	else 
	{
		System.out.println("Số lớn hơn là "+b);
	}
}

public static void printArray()
{
	int []b = new int[10];
	for (int i=0; i<b.length; i++)
	{
		b[i]=i+10;
	}
	for (int j=0; j<b.length; j++)
	{
		System.out.print(b[j] +" ");
	}
}
}
