
public class Python_Developer extends Engineer implements Software_Engineer, Hardware_Engineer {
	
	String expert; 
	
    Python_Developer(String name, int age, String profession, String title, String expert) {
		
		super(name, age, profession, title);
		this.expert = expert;  
		
	}
    
 
    @Override
	void display() {
		
		super.display();  // super keyword
		System.out.println("Expert in Python.\n");
		
	}
    
    
    @Override
	public void web() {
		
    	System.out.println(this.name + " is developing an website with Python.");
		
	}
	
    
    @Override
	public void app() {
		
    	System.out.println(this.name + " is developing a mobile app with Python.");
		
	}
    
    @Override
	public void memoryDevice() {
		
    	System.out.println(this.name + " is developing a memory device with Python.");
    	
	}
    
    @Override
	public void networkDevice() {
		
    	System.out.println(this.name + " is developing a network device with Python.\n");
    	
	}

}
