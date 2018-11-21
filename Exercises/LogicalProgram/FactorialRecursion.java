import java.util.Scanner;

public class FactorialRecursion {

	public static int factorial = 1;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number for it's Factorial: ");
		int num = sc.nextInt();

		FactorialRecursion fr = new FactorialRecursion();
		int result = fr.calcFactorial(num);
		System.out.print("Factorial of "+ num + " is " + result);
	}

	public int calcFactorial( int num ) {

		if ( num >= 1 ) {
			
			factorial = factorial * num;
			calcFactorial( num - 1 );
		}
		return factorial;
	}
}