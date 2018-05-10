import java.util.Scanner;

public class Analyze {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int passes = 0;
		int failures = 0;
		int studentCounter = 1;
		int result;

		while( studentCounter <= 10) {
			System.out.print("Enter result (1 = Pass, 2 = Fail): ");
			result = input.nextInt();

			if ( result == 1 ) {
				passes += 1;
			} else {
				failures += 1;
			}

			studentCounter++;
		}

		System.out.printf("\nPasses %d\n\nFailures %d\n", passes, failures);

		if (passes >= 8) {
			System.out.println("Bonus to Instructor...");
		}
	}
}