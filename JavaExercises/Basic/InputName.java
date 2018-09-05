import java.util.Scanner;

public class InputName {

	public static void main(String[] args) {
		
		Scanner input = new Scanner( System.in );

		System.out.print( "Enter your first name ? " );
		String firstName = input.next();

		System.out.print( "Enter your last name ? " );
		String lastName = input.next();
		System.out.println();

		System.out.printf( "Hello %s %s.\n", firstName, lastName );
	}
}