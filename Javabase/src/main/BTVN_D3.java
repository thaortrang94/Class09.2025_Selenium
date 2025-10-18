package main;

import java.util.Scanner;

public class BTVN_D3 {

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Nhập giá trị: ");
//		int x=sc.nextInt();
//		lasochanhayle (x);
//		int sum=0;
//		tongsochan (sum);
//		nhapmang();
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("sothang: ");
//		int sothang=sc.nextInt();
//		System.out.println(levelnv(sothang));
	
//		sxtangdan();
//		inminmax();
		
		 int kq = inchia2();
		    if (kq != -1) {
		        System.out.println("Phần tử đầu tiên chia hết cho cả 2 và 3 là: " + kq);
		    } else {
		        System.out.println("Không có phần tử nào chia hết cho cả 2 và 3.");
		    }
	
		
	}
	
	public static void lasochanhayle (int x)
	{
		String r;
		r=( x % 2 == 0)? "Số chẵn": "Số lẻ";
		System.out.println(r);
	}
	
	
	public static void tongsochan (int sum )
	{
		for (int i =0; i<=100; i+=2 )
		{
			System.out.print(i + " ");
			sum=sum+i;
		}
		
		System.out.println("\nTổng là "+ sum);
	}
	
	public static void nhapmang ()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập số giá trị: ");
		int n=sc.nextInt();
		int[] c = new int[n];
		for (int i =0; i<n; i++ )
		{
			System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
	          c[i] = sc.nextInt();
		}
		System.out.print("Số chia hết cho 5 là: ");
			for  (int i =0; i<n; i++ )
			{
				if(c[i]%5 ==0)
			{
				System.out.print(c[i]+ " ");
			}
		}
	}
	public static String levelnv (int sothang)
	{
		
		
		// 0-6,6-24,24-48,>48
		if ( sothang>0 & sothang<=6)
			return "fresher";

		else if ( sothang>6 & sothang<=24)
		
			return "junior";
		
		else if ( sothang>24 & sothang<=48)
		
			return "senior";
		
		else if ( sothang>48)
		
			return "special list";
		else return "invalid";
		
	}
	
	public static void sxtangdan ()
	{
		int temp;
		Scanner sca = new Scanner(System.in);
		System.out.print("Nhập số giá trị: ");
		int n=sca.nextInt();
		int[] arr= new int[n];
		for (int i =0; i<n; i++ )
		{
			System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
	          arr[i] = sca.nextInt();
		}
	
		for (int i =0; i<n; i++ )
		{
			for (int j =0; j<n-1; j++ )
			{
				if (arr[j]> arr[j+1])
				{
					temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		
		   
			
		     }
		System.out.println("Mảng sau khi sắp xếp tăng dần:");
		  for (int i = 0; i < n; i++) {
		         System.out.print(arr[i] + " ");
		     }
		 
	}
	
	public static void inminmax ()
	{
		int temp;
		Scanner sca = new Scanner(System.in);
		System.out.print("Nhập số giá trị: ");
		int n=sca.nextInt();
		int[] arr= new int[n];
		for (int i =0; i<n; i++ )
		{
			System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
	          arr[i] = sca.nextInt();
		}
	
		for (int i =0; i<n; i++ )
		{
			for (int j =0; j<n-1; j++ )
			{
				if (arr[j]< arr[j+1])
				{
					temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		
		   
			
		     }
		System.out.println("Số lớn nhất là:" + arr[0]);
		System.out.println("Số nhỏ nhất là:" + arr[n-1]);
		 
	}
	
	public static int inchia2 ()
	{
		Scanner sca = new Scanner(System.in);
		System.out.print("Nhập số giá trị: ");
		int n=sca.nextInt();
		int[] arr= new int[n];
		for (int i =0; i<n; i++ )
		{
			System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
	          arr[i] = sca.nextInt();
		}
		for (int i =0; i<n; i++ )
		{
			if(arr[i]%2 ==0 && arr[i]%3 ==0)
			{
				return arr[i];
			}
		}
		
		return -1;
	}
	
	
	 
}
