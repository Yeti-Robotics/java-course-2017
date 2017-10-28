import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		System.out.println("Add two numbers");
		System.out.print("Enter the first number: ");
		
		Scanner input = new Scanner(System.in);
		int firstValue = input.nextInt();
		
		System.out.print("Enter the second number: ");
		int secondValue = input.nextInt();
		
		int result = firstValue + secondValue;
		System.out.println("The result is: " + result);
	}

}
