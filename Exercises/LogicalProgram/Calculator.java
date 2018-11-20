import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int num1, num2, result;
		String symbol;

		System.out.print("Enter Num1: ");
		num1 = sc.nextInt();
		System.out.print("Enter Num2: ");
		num2 = sc.nextInt();
		System.out.print("Enter calculatic symbol: ");
		symbol = sc.next();

		switch(symbol){

			case "+":
			result = num1 + num2;
			System.out.println("Plus: " + result);
			break;

			case "-":
			result = num1 - num2;
			System.out.println("Minus: " + result);
			break;

			case "*":
			result = num1 * num2;
			System.out.println("Multiply: " + result);
			break;

			case "/":
			result = num1 / num2;
			System.out.println("Divide: " + result);
			break;

			case "%":
			result = num1 % num2;
			System.out.println("Remainder: " + result);
			break;

			default:
			System.out.println("Invalid Input....");
			break;
		}
	}
}