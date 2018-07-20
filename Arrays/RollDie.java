import java.util.Random;

public class RollDie {

	public static void main(String[] args) {
		
		Random randomNumbers = new Random();

		int[] frequency = new int[7];

		for (int roll = 1; roll <= 6000000; roll++) {
			++frequency[1 + randomNumbers.nextInt(6)];
		}

		System.out.printf("\n%s%10s\n", "Face", "Frequency");

		for (int face = 1; face < frequency.length; face++) {
			System.out.printf("%4s%10s\n", face, frequency[face]);
		}
	}
}