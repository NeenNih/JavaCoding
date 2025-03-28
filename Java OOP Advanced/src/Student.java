
public class Student extends Person {
	
	String name;
	int age;
	String profession;

	Student(String name, int age, String profession){
		
		this.name = name;
		this.age = age;
		this.profession = profession;
		
	}
	
	void display() {
		
		System.out.println(this.name + " is a " + this.age + " years old " + this.profession + ".");  
		
	}
	
}
