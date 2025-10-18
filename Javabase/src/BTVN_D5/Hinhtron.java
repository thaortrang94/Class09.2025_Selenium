package BTVN_D5;

public class Hinhtron extends Hinhoc {
	double bankinh;

	@Override
	public void tinhdientich() {
		// TODO Auto-generated method stub
		
		double dientichhinhtron=bankinh*bankinh*3.14;
		System.out.println("Dien tich hinh tron co ban kinh = "+bankinh + " la: " + dientichhinhtron );
	} 
	

}
