package automation.testsuite;

import java.util.Scanner;

import org.testng.annotations.Test;

public class BTVN_D7 {
	
	@Test
	public void Nhapthongtin()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số nhân viên: ");
		int snv = sc.nextInt();
        sc.nextLine();
        String hcns[] = new String[snv];
         
       for (int i=0; i<snv; i++ )
       {
    	   System.out.println("Nhập thông tin nhân viên thứ " + (i + 1));
    	   hcns[i] = sc.next();
	}
       
       for (int i=0; i<snv; i++ )
       {
    	   System.out.println("Ten cua nhân viên thứ " + (i+1) +" la: " + hcns[i]);
	}
       
	}

}
