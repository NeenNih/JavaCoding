
public class Java_Developer extends Engineer implements Software_Engineer {
	
	String expert; 
	
	Java_Developer(String name, int age, String profession, String title, String expert) {
		
		super(name, age, profession, title);
		this.expert = expert;  
		
	}
	

    @Override
	void display() {
		
		super.display();  // super keyword
		System.out.println("Expert in Java.\n");
		
	}
    
	
    @Override
	public void web() {
		
		System.out.println(this.name + " is developing an website with Java.");
		
	}
    
    
    @Override
	public void app() {
		
		System.out.println(this.name + " is developing a mobile app with Java.\n");
		
	}

}
