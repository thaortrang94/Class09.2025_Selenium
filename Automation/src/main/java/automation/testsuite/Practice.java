package automation.testsuite;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Practice {

	@Test
	public void tinhtong()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so phan tu:");
		int n = sc.nextInt();
		int a[]= new int[n];
		int sum=0;
		for (int i =0 ; i<n; i++)
		{
			System.out.println("Nhap phan tu thu " + (i+1) + ": ");
			a[i]=sc.nextInt();
			sum=sum+a[i]; //sum+=a[i]
		}
		
		System.out.println("Tong cua mang la: "+ sum);
		
		
	}
	
	
	@Test
	public void timmax()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so phan tu:");
		int n = sc.nextInt();
		int a[]= new int[n];
		
		for (int i =0 ; i<n; i++)
		{
			System.out.println("Nhap phan tu thu " + (i+1) + ": ");
			a[i]=sc.nextInt();
			
		}
		int max = a[0];
		for (int i =1 ; i<n; i++)
		{
			if (a[i] > max)
			{
				max=a[i];
			}
		}
		
		System.out.println("So lon nhat la: "+ max);
		
		
	}
	
	@Test
	public void timmin()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so phan tu:");
		int n = sc.nextInt();
		int a[]= new int[n];
		
		for (int i =0 ; i<n; i++)
		{
			System.out.println("Nhap phan tu thu " + (i+1) + ": ");
			a[i]=sc.nextInt();
			
		}
		int min = a[0];
		for (int i =1 ; i<n; i++)
		{
			if (a[i] < min)
			{
				min=a[i];
			}
		}
		
		System.out.println("So nho nhat la: "+ min);
		
		
	}
	
	
	
}
