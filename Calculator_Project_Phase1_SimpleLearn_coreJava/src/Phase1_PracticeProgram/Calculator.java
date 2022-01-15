package Phase1_PracticeProgram;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first value");
		float a = sc.nextFloat();
		System.out.println("enter the operation i.e(+,-,*,/)");
		sc.nextLine();
		char operation = sc.nextLine().charAt(0);
		System.out.println("enter second value");
		float b = sc.nextFloat();
		float result = 0;
		switch(operation) {
		case'+':
			result = a+b;
			break;
		case'-':
			result = a-b;
			break;
		case'*':
			result = a*b;
			break;
		case'/':
			result = a/b;
			break;
		default:
			System.out.println("invalid operation");	
		}
		System.out.println("the result is:" +result);
		

	}

}
