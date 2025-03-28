
public class Cpp_Developer extends Engineer implements Hardware_Engineer {
	
	String expert;  
	
	Cpp_Developer(String name, int age, String profession, String title, String expert) {
		
		super(name, age, profession, title);
		this.expert = expert;  
		
	}
	
    
    @Override
	void display() {
		
		super.display();  // super keyword
		System.out.println("Expert in C++.\n");
		
	}
    
    @Override
	public void memoryDevice() {
		
		System.out.println(this.name + " is developing a memory device with C++.");
    	
	}
	
    
    @Override
	public void networkDevice() {
		
		System.out.println(this.name + " is developing a network device with C++\n");
    	
	}
    
    
    // aggregation
    Java_Developer JavaDev2 = new Java_Developer("Ara", 19, "Employee", "Engineer", "Java");
    
    void webdevelop() {
    	
    	JavaDev2.web();
    	
    }
    

}
