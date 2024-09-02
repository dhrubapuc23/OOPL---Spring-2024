package practiceB2;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a,b;
		System.out.println("Enter the value of a: ");
		a = input.nextInt();
		System.out.println("Enter the value of b: ");
		b = input.nextInt();
		System.out.println("Addition of a and b: "+ (a+b));
		System.out.println("Subtraction of a and b: "+ (a-b));
		System.out.println("Multiplication of a and b: "+ (a*b));
		System.out.println("Division of a and b: "+ (a/b));

	}

}
