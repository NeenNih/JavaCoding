
public class Main {

	public static void main(String[] args) {
		
		// object is an instance of a class that may contain attributes and methods.
		
		// an constrctor is a special method that is called when an object is created.
		
		// local variable is declared inside a method & is visible only to that method.
		
		/* global variable is declared outside a method but within a class & 
		 * is visible to all parts of that class.
		 */
		
		Person person1 = new Person("Sony", 16, "Bangladeshi", "Student", "Dhaka");
		Person person2 = new Person("Pony", 3, "Bangladeshi");
		
		System.out.println("person1 name: " + person1.name);
		System.out.println("person2 age: " + person2.age);
		
		System.out.println("\n");
		
		
		person1.profession();
		person2.living_place();
		
		System.out.println("\n");
		
		
		
		/* toString() is a special method that is inherited by all objects.
		 * it returns a string that "textually represnts" an object.
		 * it can be overriden.
		 */
		
		System.out.println(person1);  // calling toString method implicitly
		System.out.println(person1.toString());  // calling toString method explicitly
		
		System.out.println("\n");
		
		
		
		/******************** Array of objects ********************/
		
		Person person3 = new Person("Kishore", 14, "Bangladeshi", "Student", "Rocky_Beach");
		Person person4 = new Person("Musa", 14, "African", "Student");	
		Person person5 = new Person("Robin", 14, "Irish");
		
		
		/*Person[] Student = new Person[3];
		Student[0] = person3;
		Student[1] = person4;
		Student[2] = person5;*/
	
		Person[] Student = {person3, person4, person5};
		
		Student[0].display();
		Student[1].display();
		Student[2].display();
		
		System.out.println("\n");
		
		
		
		/******************** Object passing ********************/
		
		Bird bird1 = new Bird("Parrot");
		Bird bird2 = new Bird("Dove");
		Bird bird3 = new Bird("Cuckoo");
		
		
		bird1.like(person3, bird1);
		bird2.like(person4, bird2);
		bird3.like(person5, bird3);
		
		System.out.println("\n");
		
		
		
		/******************** Static keyword ********************/
		
		/* static is a modifier that creates a single copy of variables and methods.
		 * static member is shared by every object of a class.
		 * static member belongs to the class rather than an object.
		 */
		
		System.out.println("Number of Birds: " + Bird.numberOfBirds); // calling static variable
		Bird.numberOfBirds();  // calling static method
		

	}

}
