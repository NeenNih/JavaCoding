
public class Engineer extends Employee {
	
	private String title;
	
	Engineer(String name, int age, String profession, String title) {
		
		super(name, age, profession);  // super keyword
		//this.title = title;
		this.setTitle(title);  // calling setter method
		
		
	}
	
	// getter method
    public String getTitle() {
    	
    	return title;
    	
    }
    
    // setter method
    public void setTitle(String title) {
    	
    	this.title = title;
    	
    }
    
    
	@Override
	void display() {
		
		super.display();  // super keyword
		System.out.println("Works as an " + this.title + ".");  // method overriding
		
	}
	
	
}
