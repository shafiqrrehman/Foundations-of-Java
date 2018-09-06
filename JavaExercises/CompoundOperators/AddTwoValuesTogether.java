import java.util.Scanner;

public class AddTwoValuesTogether {

	public static void main(String[] args) {
		
		Scanner input = new Scanner( System.in );

		float a, b;

		System.out.print( "\nEnter value A: " );
		a = input.nextFloat();

		System.out.printf( "The value of A before adding: %.2f\n\n", a );

		System.out.print( "Enter value B: " );
		b = input.nextFloat();

		a += b;

		System.out.printf( "The value of A after adding: %.2f\n", a );
	}
}