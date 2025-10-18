package D5_2;

public class GV extends Nguoi{
	public float sonam; 
	public String monday; 
	
	public void Diday()
	{
		System.out.println("Giao vien " + getHoten()+" di day mon " +monday +" 3b/tuan");
	}
	
	@Override
	public void Dichoi()
	{
		System.out.println("Di choi neu co nhieu tien");
	}
}
