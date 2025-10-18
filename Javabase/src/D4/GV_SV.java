package D4;

public class GV_SV {
	
	private String name;
	private String phoneNumber;
	private String Ngaysinh;
	public String getname ()
	{
		return name;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getNgaysinh() {
		return Ngaysinh;
	}


	public void setNgaysinh(String ngaysinh) {
		Ngaysinh = ngaysinh;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GV_SV st1 = new GV_SV();
		st1.setName("Trang");
		st1.setNgaysinh("20/01/2001");
		st1.setPhoneNumber("010101010101");
		System.out.println(st1.getname()+", "+ st1.getNgaysinh() + ", "+ st1.getPhoneNumber());
		
	}

}
