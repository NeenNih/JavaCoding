
public class Person {

	// global variables
	
	String name;        
	int age; 
	String nationality;
	String profession;
	String living_place;  
	
	
	//constructor
	
	Person(String name, int age, String nationality, String profession, String living_place) {
		
		this.name = name; // this keyword is saying that this variable is of this class
		this.age = age;
		this.nationality = nationality;
		this.profession = profession;
		this.living_place = living_place;
		
	}
	
	//overloaded constructors
	
	Person(String name, int age, String nationality, String profession) {
		
		this.name = name;
		this.age = age;
		this.nationality = nationality;
		this.profession = profession;
	
	}
	
	Person(String name, int age, String nationality) {
		
		this.name = name; 
		this.age = age;
		this.nationality = nationality;

	}
	
	Person(String name, int age) {
		
		this.name = name; 
		this.age = age;

	}
	
	Person(String name) {
		
		this.name = name;
		
	}
	
	Person() {
		
		
	}

	
	
	// methods 
	
	void profession() {
		
		System.out.println(this.name + " is a " + this.profession + ".");
		
	}
	
	void living_place() {
		
		System.out.println(this.name + " lives in " + this.living_place + ".");
		
	}
	
	void display() {
		
		System.out.println(this.name + "  " + this.age + "  " + 
		                   this.nationality + "  " + this.profession + "  " + 
				           this.living_place);	
		
	}
	
	
	
	// tostring() method
	
	public String toString() {
		
		return this.nationality;
		
	}
	
	
}
