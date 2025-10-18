package D4;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Moto {
	String brand; 
	String color; 
	String no;
	String regisdate; 
	LocalDate buydate;
	
	public String getinformoto()
	{
		return "brand is " + brand + ", color is " + color + ", bien so xe is " + no + ", Ngay dang ky is " + regisdate + ", Ngay mua is "+ buydate;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		SimpleDateFormat datefomat = new SimpleDateFormat("dd-MM-yyyy");
		DateTimeFormatter formater = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date = LocalDate.parse("10/10/2022", formater);
		
		Moto honda = new Moto();
		honda.brand= "Honda";
		honda.color= "Black";
		honda.no = "89K2-00910";
		honda.regisdate= "22/10/2025";
		honda.buydate= date;
		 System.out.println(honda.getinformoto());
	}

}
