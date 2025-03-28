import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		/******************** If else condition ********************/
		
		int mark = 70;
		
		if(mark < 0) {
			
			System.out.println("Negative marking not allowed");
			
		}
		else if(mark <= 39) {
			
			System.out.println("Grade: F");
			
		}
		else if(mark <= 49) {
			
			System.out.println("Grade: D");
			
		}
		else if(mark <= 59) {
			
			System.out.println("Grade: C");
			
		}
		else if(mark <= 69) {
			
			System.out.println("Grade: B");
			
		}
		else if(mark <= 79) {
			
			System.out.println("Grade: A");
			
		}
		else if(mark <= 100){
			
			System.out.println("Grade: A+");
			
		}
		else {
			
			System.out.println("Invalid");
			
		}
		
		System.out.println();
		
	
		
		/******************** Switch ********************/
		
		int Mark = 78;
		
		
		switch(Mark/10) {
		
			case 10: 
			case 9: 
			case 8: System.out.println("Grade: A+");
			break;
			
			case 7: System.out.println("Grade: A");
			break;	
			
			case 6: System.out.println("Grade: B");
			break;
			
			case 5: System.out.println("Grade: C");
			break;
			
			case 4: System.out.println("Grade: D");
			break;
			
			default: System.out.println("Grade: F");
		
		}
		
		System.out.println();
		
		
		
		/******************** Logical operator ********************/
		
		/********** AND **********/
		
		int marks = 90;
		
		if(marks > 0 && marks <= 39) {
			
			System.out.println("Grade: F");
			
		}
		else if(marks >= 40 && marks <= 49) {
			
			System.out.println("Grade: D");
			
		}
		else if(marks >= 50 && marks <= 59) {
			
			System.out.println("Grade: C");
			
		}
		else if(marks >= 60 && marks <= 69) {
			
			System.out.println("Grade: B");
			
		}
		else if(marks >= 70 && marks <= 79) {
			
			System.out.println("Grade: A");
			
		}
		else if(marks >= 80 && marks <= 100) {
			
			System.out.println("Grade: A+");
			
		}
		else {
			
			System.out.println("Invalid");
			
		}
		
		System.out.println();
		
		
		/********** OR **********/
		
		String drink = "Fanta";
		
		if(drink == "tea" || drink == "coffee") {
			
			System.out.println("It should be hot...");
			
		}
		else if(drink == "Coke" || drink == "Fanta" || drink == "Mirinda") {
			
			System.out.println("It should be cold...");
			
		}
		else {
			
			System.out.println("It may be normal...");
			
		}
		
		System.out.println();
		
		
		/********** NOT **********/
		
		String food = "Fuchka";
		
		if(food != "Fuchka" ) {
			
			System.out.println("Not so favorite...");
			
		}
		else {
			
			System.out.println("Yes!!! It's my favorite...");
			
		}
		
		System.out.println();
		
		
		
		/******************** While loop ********************/
		
		int a = 50;
		
		while(a < 50) {
			
			a = a + 10;
		}
		
		System.out.println(a);
		
		
		
		/******************** do while loop ********************/
		
		int b = 50;
		
		do{
			
			b = b + 10;
			
		}while(b < 50);
		
		System.out.println(b);
		
		System.out.println("\n");
		
		
		
		/******************** For loop ********************/
		
		for(int i = 1; i < 10; i++) {
			
			System.out.println(i);
			
		}
		
		System.out.println("\n");
		
		for(int i = 9; i > 0; i--) {
			
			System.out.println(i);
			
		}
		
		System.out.println("\n");
		
		for(int i = 0; i <= 10; i += 2) {
			
			System.out.println(i);
			
		}
		
		System.out.println("\n");
		
		for(int i = 9; i >= 0; i -= 2) {
			
			System.out.println(i);
			
		}
		
		System.out.println("\n");
		
		
		
		/******************** Nested For loop ********************/
		
		for(int i = 1; i <= 4; i++) {
			
			System.out.println();
			
			for(int j = 1; j <= i; j++) {
				
				System.out.print("* ");
				
			}
			
		}
		
		System.out.println("\n");
		
		for(int i = 1; i <= 4; i++) {
			
			System.out.println();
			
			for(int j = 4; j >= i; j--) {
				
				System.out.print("* ");
				
			}
			
		}
		
		System.out.println("\n\n");
		
		
		int row, column;
		String symbol;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the row:");
		row = scanner.nextInt();
		
		System.out.println("Enter the column:");
		column = scanner.nextInt();
		
		scanner.nextLine();
		
		System.out.println("Enter the symbol:");
		symbol = scanner.nextLine();
		
		
		for(int i = 1; i <= row; i++) {
			
			System.out.println();
			
			for(int j = 1; j <= column; j++) {
				
				System.out.print(symbol + " ");
				
			}
			
		}
		
		
		System.out.println("\n\n\n");
		
		
		
		/******************** Array ********************/
		
		// array are used to store multiple values of similar type at a single variable
		
		String[] Student = {"Sony", "Poni", "Oni"};
		
		Student[0] = "Sony";
		
		System.out.println(Student[0]);
			
		System.out.println("\n\n");
		
		
		String[] Students = new String[3];
		
		System.out.println("Enter Students' Name:");
		
		for(int i = 0; i < Students.length; i++) {
			
			Students[i] = scanner.nextLine();
			
		}
		
		
		System.out.println("\nStudents' Name:");
		
		for(int i = 0; i < Students.length; i++) {
			
			System.out.println(Students[i]);
			
		}
		
		System.out.println("\n\n");
		
		
		
		/******************** 2D Array ********************/
		
		String[][] students = new String[3][2];
		
		System.out.println("Enter Students' Name & Roll:");
		
		for(int i = 0; i < 3; i++) {
			
			for(int j = 0; j < 2; j++) {
				
				students[i][j] = scanner.nextLine();
				
			}
			
			System.out.println();
			
		}
		
		System.out.println("Students' Name & Roll:");
		
		for(int i = 0; i < 3; i++) {
			
			for(int j = 0; j < 2; j++) {
				
				System.out.print(students[i][j] + "  ");
				
			}
			
			System.out.println();
			
		}
		
		scanner.close();
		
		System.out.println("\n\n");
		
		
		
		/******************** String methods ********************/
		
		String name = " Nishi";
		
		System.out.println(name.equals(" Nishi"));
		System.out.println(name.equals(" nishi"));
		System.out.println(name.equalsIgnoreCase(" nishi"));
		System.out.println(name.length());
		System.out.println(name.charAt(3));
		System.out.println(name.indexOf("i"));
		System.out.println(name.isEmpty());
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.trim());
		System.out.println(name.replace('i', 'a'));
		
		System.out.println("\n\n");
		
		
		
		/******************** For each loop ********************/
		
		String[] Foods = {"Fuchka", "Velpuri", "Chotpoti", "Biriany"};
		
		for(String i : Foods) {
			
			System.out.println(i);
			
		}
		
		System.out.println("\n\n");
		
		
		
		/******************** Method ********************/
		
		String title = "MusaAman";
		int ages = 15;
		
		hello(title, ages);
		
		System.out.println("\n\n");
		
		
		
		/******************** Overloaded method ********************/
		
		// methods that share the same name but different parameters
		// methods name + parameters = Method signature
		
		
		System.out.println(add(1,2));
		System.out.println(add(1,2,3));
		System.out.println(add(1,2,3,4));
		System.out.println(add(1.5,2.5));
		System.out.println(add(1.5,2.5,3.5));
		System.out.println(add(1.5,2.5,3.5,4.5));
		
		System.out.println("\n\n");
		
		
		
		/******************** Final Keyword ********************/
		
		final double PI = 3.14;
		
		// PI = 4;
		// a final value cannot be updated
		
		System.out.println("Value of PI: " + PI);
		
		
	}
	
	
	
	/***** Method *****/
	
	static void hello(String name, int age){
		
		System.out.println("Hello " + name);
		System.out.println("You are " + age + " years old");
		
	}
	
	
	
	/***** Overloaded method *****/
	
	static int add(int a, int b) {
		
		System.out.print("Overloded method #1: ");
		return a + b;
		
	}
	
	static int add(int a, int b, int c) {
		
		System.out.print("Overloded method #2: ");
		return a + b + c;
		
	}
	
	static int add(int a, int b, int c, int d) {
		
		System.out.print("Overloded method #3: ");
		return a + b + c + d;	
		
	}
	
	static double add(double a, double b) {
		
		System.out.print("Overloded method #4: ");
		return a + b;
		
	}
	
	static double add(double a, double b, double c) {
		
		System.out.print("Overloded method #5: ");
		return a + b + c;
		
	}
	
	static double add(double a, double b, double c, double d) {
		
		System.out.print("Overloded method #6: ");
		return a + b + c + d;
		
	}
	

}
