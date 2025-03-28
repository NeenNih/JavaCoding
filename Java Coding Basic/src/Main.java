import javax.swing.JOptionPane;    // For GUI
import java.util.Scanner;          // User input
import java.util.Random;           // Random 

public class Main {

	public static void main(String[] args) {
		
		
		/******************** My First Coding ********************/
		
		System.out.println("\"\\I love Fuchka.\"");
		
		// This is a comment
		
		// We use \ to show a " or \ in a print.
		
		/* For editing any text to another 
		 * click Edit>Find/replace
		 */
		
		// \t is for a tab
		
		// sysout then ctrl+space will print the total print line
		
		System.out.  println("\tIt's so good.......\r"); //space matter
		
		// \n is for new line

		// ctrl+ for zoom in, ctrl- for zoom out
		
		System.out.println("\n");
		
		
		
		/******************** Variable in Java ********************/
		
		int x; //declaration
		
		x = 12; //assignment
		
		int y = 13; // initialization
		
		System.out.println("add(x,y) = " + (x + y));
		
		float a = 3.14f;
		System.out.println("a = " + a);
		
		double b = 3.14;
		System.out.println("b = " + b);
		
		boolean c = true;
		System.out.println("c = " + c);
		
		char symbol = '@';
		System.out.println("symbol = " + symbol);
		
		String name = "Nishi";
		System.out.println("Hello " + name);
		
		System.out.println("\n\n");
		
		
		
		/******************** temp variable in Java ********************/
		
		String q = "Water";
		String r = "Oil";
		System.out.println("q: " + q);
		System.out.println("r: " + r);
		String temp;
		temp = q;
		q = r;
		r = temp;
		System.out.println("q: " + q);
		System.out.println("r: " + r);
		
		System.out.println("\n");
		
		
		
		/******************** GUI ********************/
		
		String name2 = JOptionPane.showInputDialog("Enter your name");
		JOptionPane.showMessageDialog(null, "Hello " + name2);
		
		// showInputDialog return a string
		
		int age1 = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
		JOptionPane.showMessageDialog(null, "You are now " + age1);
		
		//to convert a string to a int or double we have to use a wrapper_class.parse method
		
		double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
		JOptionPane.showMessageDialog(null, "You are " + height + " feet tall");
		
		
		System.out.println();
		
		
		
		/******************** Scanner input ********************/
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What's your name?");
		String name1 = scanner.nextLine();
		
		System.out.println("What's your age?");
		int age = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("What's your favorite food?");
		String food = scanner.nextLine();
		
		System.out.println("Hello " + name1);
		System.out.println("You are now " + age);
		System.out.println("Your favorite food is " + food);
		
		
		System.out.println("\n");
		
		
		
		/******************** Expressions ********************/
		
		// expression = operands & operators
		// operands = values, variables, numbers, quantity
		// operators = + - * / %
		
		int number = 25;
		System.out.println("number: " + number);
		
		number = number + 10;
		System.out.println("after addition : " + number);
		
		number = number - 10;
		System.out.println("after subtraction: " + number);
		
		number = number * 10;
		System.out.println("after multiplication: " + number);
		
		number = number / 10;
		System.out.println("after division: " + number);
		
		number = number % 10;
		System.out.println("the modulus: " + number);
		
		number++;
		System.out.println("after increment: " + number);
		
		number--;
		System.out.println("after decrement: " + number);
		
		System.out.println();

		
		double num = 12.5;
		System.out.println("Fraction number: " + num);
		
		num = num + 3;
		System.out.println("after addition : " + num);
		
		num = num - 3;
		System.out.println("after subtraction: " + num);
		
		num= num* 3;
		System.out.println("after multiplication: " + num);
		
		num = num / 3;
		System.out.println("after division: " + num);
		
		num = num % 3;
		System.out.println("the modulus: " + num);
		
		num++;
		System.out.println("after increment: " + num);
		
		num--;
		System.out.println("after decrement: " + num);
		
		System.out.println("\n\n");
		
		
		
		/******************** Math class ********************/
		
		double u = 3.5;
		double w = -10;
		
		System.out.println("max: " + Math.max(u, w));
		System.out.println("min: " + Math.min(u, w));
		System.out.println("abs of u: " + Math.abs(u));
		System.out.println("abs of w: " + Math.abs(w));
		System.out.println("ceil of u: " + Math.ceil(u));
		System.out.println("floor of u: " + Math.floor(u));
		System.out.println("round of u: " + Math.round(u));
		System.out.println("ceil of w: " + Math.ceil(w));
		System.out.println("floor of w: " + Math.floor(w));
		System.out.println("round of w: " + Math.round(w));
		System.out.println("sqrt of u: " + Math.sqrt(u));
		System.out.println("sqrt of w: " + Math.sqrt(w));
		
		System.out.println("\n\n");
		
		
		
        /******************** Calculate Hypotenuse ********************/
		
		double m;
		double n;
		
		
		System.out.println("Enter the m side: ");
		m = scanner.nextDouble();
		
		System.out.println("Enter the n side: ");
		n = scanner.nextDouble();
		
		System.out.println("Hypotenuse: " + Math.sqrt((m*m)+(n*n)));
		
		scanner.close();
		
		System.out.println("\n\n");
		
		
		
		/******************** Random values ********************/
		
		Random random = new Random();
		
		int ran = random.nextInt(600) + 1;
		double ran1 = random.nextDouble();
		boolean ran2 = random.nextBoolean();
		
		System.out.println("random integer value: " + ran);
		System.out.println("random double value: " + ran1);
		System.out.println("random boolean value: " + ran2);
		
		
	}

}
