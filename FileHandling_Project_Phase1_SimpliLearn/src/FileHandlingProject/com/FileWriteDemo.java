package FileHandlingProject.com;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteDemo {
	public static void main(String[] args) {
		String data = "101, Anil,Banbalore";
		try {
			FileWriter output = new FileWriter("data1.txt");
			output.write(data);
			System.out.println("Data is written succeccfully......");
			output.close();
		} catch (IOException e) {
			System.out.println("File write error.....");
		}
	}

}
