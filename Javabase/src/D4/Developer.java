package D4;

public class Developer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee st1 = new Employee();
		st1.setName("Trang");
		st1.setID("000001");
		//st1.setSalary("10000000");
		System.out.println(st1.getName()+", "+ st1.getID() + ", "+ st1.getSalary());
		
		Employee st2 = new Employee();
		st2.setName("Thao");
		st2.setID("000002");
		//st1.setSalary("10000000");
		System.out.println(st2.getName()+", "+ st2.getID() + ", "+ st2.getSalary());
	}

}
