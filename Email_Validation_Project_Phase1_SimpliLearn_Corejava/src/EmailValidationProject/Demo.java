package EmailValidationProject;

import java.util.Scanner;
import java.io.*;

public class Demo {
	static boolean isValid(String email) {
	      String regex = "^[\\w-\\.+]*[\\w-\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
	      return email.matches(regex);
	   }

	   public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);
	       System.out.println("Enter your mail ID");
	      String email = sc.nextLine();
	      System.out.println("The E-mail ID is: " + email);
	      System.out.println(" the email you have entered is:  " + isValid(email));
	   }

}