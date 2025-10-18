package BTVN_D5;

import java.util.Scanner;

public class App_Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		

		        Scanner sc = new Scanner(System.in);
		        int choice;

		        System.out.println("===== QUẢN LÝ NHÂN VIÊN =====");
		        System.out.println("1. Phòng ban Developer");
		        System.out.println("2. Phòng ban Tester");
		        System.out.print("Chọn phòng ban (1-2): ");
		        choice = sc.nextInt();
		        sc.nextLine(); // bỏ ký tự xuống dòng

		        switch (choice) {
		            case 1:
		                System.out.print("Nhập số lượng nhân viên Dev: ");
		                int soDev = sc.nextInt();
		                sc.nextLine();
		                Developer[] devList = new Developer[soDev];

		                for (int i = 0; i < soDev; i++) {
		                    System.out.println("==> Nhập thông tin Dev thứ " + (i + 1));
		                    devList[i] = new Developer();
		                    devList[i].Nhapthongtin();

		                System.out.println("\n--- DANH SÁCH DEV ---");
		                for (Developer dev : devList) {
		                    dev.Inthongtin();
		                }
		                break;
		                }

		            case 2:
		                System.out.print("Nhập số lượng nhân viên Tester: ");
		                int soTester = sc.nextInt();
		                sc.nextLine();
		                Tester[] testerList = new Tester[soTester];

		                for (int i = 0; i < soTester; i++) {
		                    System.out.println("==> Nhập thông tin Tester thứ " + (i + 1));
		                    testerList[i] = new Tester();
		                    testerList[i].Nhapthongtin();
		                }

		                System.out.println("\n--- DANH SÁCH TESTER ---");
		                for (Tester tester : testerList) {
		                    tester.Inthongtin();
		                }
		                break;
		        

		        
		            default:
		                System.out.println("Lựa chọn không hợp lệ!");
		                break;
		        }
		        
		        sc.close();
		    
	
	}

}
