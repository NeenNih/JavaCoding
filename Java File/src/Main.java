import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
	
		// file is an abstract representation of file and directory pathnames
		
		File file1 = new File("Poni.txt");
		
		File file2 = new File("E:/Bro Code");   // have to use '/' slash
		
		if(file1.exists()) {
			
			System.out.println("File exist...");
			System.out.println(file1.getPath());
			System.out.println(file1.getAbsolutePath());
			System.out.println(file1.isFile());
			//file1.delete();
			
		}
		else {
			
			System.out.println("File doesn't exist...");
			
		}
		
		System.out.println("\n");
		
		if(file2.exists()) {
			
			System.out.println("File exist...");
			System.out.println(file2.getPath());
			System.out.println(file2.getAbsolutePath());
			System.out.println(file2.isFile());
			//file2.delete();
			
		}
		else {
			
			System.out.println("File doesn't exist...");
			
		}
		
		System.out.println("\n");
		
		
		
		/*FileWriter*/
		
		try {
			
			FileWriter writer = new FileWriter("Poni.txt");
			writer.write("Poni is a yellow chick. \nHe is so foamy. \nI love my Poni.\n");
			writer.append("Poni loves me.");
			writer.close();	
			
		} 
		catch (IOException e) {
			
			e.printStackTrace();
			
		}
		
		System.out.println("\n");
		
		
		
		/*FileReader*/
		
		try {
			
			FileReader reader = new FileReader("Poni.txt");
			int data = reader.read();
			while(data != -1) {
				
				System.out.println((char)data);
				data = reader.read();
				
			}
			reader.close();
			
			
		} 
		catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
