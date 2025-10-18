package BTVN_D5;

public class Hinhcn extends Hinhoc{
	double chieudai;
	double chieurong;
	@Override
	public void tinhdientich() {
		// TODO Auto-generated method stub
		double dientichhinhcn=chieudai*chieurong;
		System.out.println("Dien tich hinh chu nhat co chieu dai = "+chieudai +" va chieu rong = "+ chieurong+" la: " + dientichhinhcn );
	} 
	

}
