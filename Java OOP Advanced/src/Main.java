import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/* inheritance allows the child class to acquire the attributes and methods 
		   of the parent class.*/
		
		/* method overriding allows the child class to reimplement a method of parent class.*/
		
		/* super keyword refers to the super class of an object, very similar to this keyword.*/
		 
		/* abstract class can't be instantiated but can have subclass.*/
		
		/* abstract method is declared without an implementation.*/
		
		/* encapsulation is the concept where attributes of a class will be hidden or private.
		 * private attributes can be accessed only through methods (getters & setters).
		 * we should make attributes private if we don't have a reason 
		 * to make them public or protected.
		 */
		
		/* interface is like a template that specifies what a class has or must do.
		 * in java, multiple inheritance is not permitted but
		 * a class can implement more than one interface at a time.
		 */
		
		/* polymorphism (poly-"many", morph-"form") is the
		 * ability of an object to be identified as more than one type. 
		 */
		
		/* dynamic polymorphism refers to the polymorphism that is 
		 * decided to another form after compilation (during run-time).
		 */
		
		/* aggregation refers to the concept that the aggregate class contains a reference 
		 * to another class and is said to have ownership of that class (HAS-A relationship). 
		 */
		
		
	    /******************** Abstraction ********************/
	    
	    /* Person person = new Person();
		   person.display(); */
		// will create an error
		
		
	
		/******************** Inheritance ********************/
		
		Student student1 = new Student("Sony", 16, "Student");
		student1.display();
		System.out.println();
		
		Employee employee1 = new Employee("Pony", 26, "Employee");
		employee1.display();
		System.out.println();
		
		Engineer engineer1 = new Engineer("Ony", 36, "Employee", "Engineer");
		engineer1.display();
		System.out.println();
	
		Java_Developer  JavaDev1 = new Java_Developer("Wony", 20, "Employee", "Engineer", "Java");
		Cpp_Developer  CppDev1 = new Cpp_Developer("Kony", 30, "Employee", "Engineer", "C++");
		Python_Developer  PythonDev1 = new Python_Developer("Lony", 40, "Employee", "Engineer", "Python");
		
		System.out.println();
		
		
		
		/******************** Encapsulation ********************/
		
		System.out.println(JavaDev1.profession);
		// System.out.println(JavaDev1.title);   will create an error 
		System.out.println(JavaDev1.getTitle());
		
		System.out.println();
		
		
		
		/******************** Interface ********************/
		
		JavaDev1.web();
		JavaDev1.app();
		
		CppDev1.memoryDevice();
		CppDev1.networkDevice();
		
		PythonDev1.web();
		PythonDev1.app();
		PythonDev1.memoryDevice();
		PythonDev1.networkDevice();
		
		System.out.println();
		
		
		
		/******************** Polymorphism ********************/
		
		Engineer[] dev = {JavaDev1,CppDev1,PythonDev1};
		
		for(Engineer x: dev) {
			
			x.display();   // for each loop
			
		}
		
		
		
		/******************** Dynamic Polymorphism ********************/
		Scanner scanner = new Scanner(System.in);
		Engineer engineer;
		
		System.out.println("Which engineer is needed?");
		System.out.println("(1 = Java Developer) or (2 = C++ Developer) or (3 = Python Developer)");
		
		int choice = scanner.nextInt();
		
		if(choice == 1) {
			
			engineer = new Java_Developer("Kin", 24, "Employee", "Engineer", "Java");
			engineer.display();
			
		}
		else if (choice == 2) {
			
			engineer = new Cpp_Developer("Rin", 23, "Employee", "Engineer", "C++");
			engineer.display();
			
		}
		else if (choice == 3) {
			
			engineer = new Python_Developer("Fin", 25, "Employee", "Engineer", "Python");
			engineer.display();
			
		}
		else {
			
			System.out.println("Invalid Choice");
			
		}
	
		
		
		/******************** Aggregation ********************/
		CppDev1.webdevelop();
		
		
		scanner.close();
	
	}

}
