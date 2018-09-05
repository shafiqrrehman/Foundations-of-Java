import java.util.Scanner;

public class OperatorsMaths {

	public static void main(String[] args) {
		
		Scanner input = new Scanner( System.in );
		int a;
		int b;
		int add, subtract, multiply, divide;

		System.out.print( "\nEnter value of A: " );
		a = input.nextInt();
		System.out.print( "Enter value of B: " );
		b = input.nextInt();
		
		System.out.println();

		add = a + b;
		subtract = a - b;
		multiply = a * b;
		divide = a / b;

		System.out.printf( "Sum: %d\n", add );
		System.out.printf( "Minus: %d\n", subtract );
		System.out.printf( "Multiply: %d\n", multiply );
		System.out.printf( "Divide: %d\n", divide );

	}
}