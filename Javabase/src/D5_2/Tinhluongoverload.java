package D5_2;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Tinhluongoverload {
	
	static int luongcb=10000000;
	static double hsl= 0.5;
	
	
	public static double tinhluong (int luongcb,double hsl)
	{
		return luongcb*hsl;
	}
	
	public static double tinhluong (int luongcb,double hsl, double nam)
	{
		return luongcb*hsl*nam;
	}
	
	public static double tinhluong (int luongcb,double hsl, double nam, int loai)
	{
		if (loai==1)
		{
		return luongcb*hsl*nam + luongcb*0.2;
		}
		else if (loai==2)
			{
				return luongcb*hsl*nam + luongcb*0.45;
			}
			else return luongcb*hsl*nam;
				
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = tinhluong(luongcb,hsl,2);
		BigDecimal number1 = new BigDecimal(a);
		System.out.println(number1);
		DecimalFormat formatter = new DecimalFormat("#");
		System.out.println(formatter.format(tinhluong(luongcb,hsl,2)));
		
		double b= tinhluong(luongcb,hsl,2,1);
		BigDecimal number2 = new BigDecimal(b);
		System.out.println(number2);
	}

}
