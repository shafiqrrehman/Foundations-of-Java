import java.util.Scanner;

public class StudentPoll {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int[] responses = new int[20];
		int[] frequency = new int[6];

		System.out.println("Enter student's rating: ");

		for (int i = 0; i < responses.length; i++) {

			responses[i] = input.nextInt();
		}

		for (int answer = 0; answer < responses.length; answer++) {
			
			try {

				++frequency[responses[answer]];
			}
			catch (ArrayIndexOutOfBoundsException e) {

				System.out.println(e);
				System.out.printf("\n\tresponses[%d] = %d\n\n", answer, responses[answer]);
			}
		}

		System.out.printf("%s%10s\n", "Rating", "Frequency");

		for (int rating = 1; rating < frequency.length; rating++) {
			System.out.printf("%6s%10s\n", rating, frequency[rating]);
		}
	}
}