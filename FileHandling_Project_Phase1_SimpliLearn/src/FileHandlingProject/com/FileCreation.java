package FileHandlingProject.com;

import java.io.File;
import java.io.IOException;
public class FileCreation {
	public static void main(String[] args) {
		File myFile = new File("data1.txt");
		
		try {
			if (myFile.createNewFile()) {
				System.out.println("File created successfully");
			}
			else {
				System.out.println("File creation error.");
			}
		} catch (IOException e) {
			System.out.println("File error..");
		}
		
}
}