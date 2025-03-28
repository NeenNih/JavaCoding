
public class Bird {
	
	String bird_name;
	static int numberOfBirds;
	
	Bird(String bird_name){
		
		this.bird_name = bird_name;
		numberOfBirds++;
		
	}
	
	static void numberOfBirds() {
		
		System.out.println("Number of birds: " + numberOfBirds);
		
	} // for calling a static variable, the method should also be static
	
	
	void like(Person person, Bird bird) {
		
		System.out.println(person.name + " likes " + this.bird_name);
		
	}
	

}


