import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number for it's Factorial: ");
		int num = sc.nextInt();
		int factorial = 1;

		for (int i = 1; i <= num; i ++) {
			factorial = factorial * i;
		}
		System.out.print("Factorial of "+ num + " is " + factorial); // 5 x 4 x 3 x 2 x 1 = 120 
	}
}