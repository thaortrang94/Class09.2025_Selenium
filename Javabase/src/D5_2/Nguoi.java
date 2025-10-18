package D5_2;

public class Nguoi {
	private String Hoten; 
	private long CCCD; 
	private String Add;
	public String getHoten() {
		return Hoten;
	}
	public void setHoten(String hoten) {
		Hoten = hoten;
	}
	public long getCCCD() {
		return CCCD;
	}
	public void setCCCD(long cCCD) {
		CCCD = cCCD;
	}
	public String getAdd() {
		return Add;
	}
	public void setAdd(String add) {
		Add = add;
	} 
	
	public void Dian()
	{
		System.out.println("An luc doi ");
	}
	
	public void Dichoi()
	{
		System.out.println("Di choi khi co thoi gian");
	}
	
}
