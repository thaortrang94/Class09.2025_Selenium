package D4;


public class Dog {

	String breed; 
	String size; 
	int age;
	String color; 
	
	public String getinfor()
	{
		return "breed is " + breed + ", size is " + size + ", age is " + age + ", color is " + color;
	}
	

		
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog fox= new Dog(); 
		fox.breed="FOX";
		fox.size="small";
		fox.age=1;
		fox.color="Red";
//		fox.getinfor();
		 System.out.println(fox.getinfor());
		 
		 Dog dog2= new Dog(); 
			dog2.breed="FOX";
			dog2.size="small";
			dog2.age=1;
			dog2.color="Yellow";
			 System.out.println(dog2.getinfor());
		
		
		
	}
	
	


}
