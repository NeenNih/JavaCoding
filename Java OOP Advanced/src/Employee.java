
public class Employee extends Person{
	
	String name;
	int age;
	String profession;

	Employee(String name, int age, String profession) {
		
		this.name = name;
		this.age = age;
		this.profession = profession;
		
	}
	
	void display() {
		
		System.out.println(this.name + " is an " + this.age + " years old " + this.profession + "."); 
		
	}
	
	

}
