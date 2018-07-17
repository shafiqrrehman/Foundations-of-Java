import java.util.Random;

public class Craps {

	private static final Random randomNumbers = new Random();

	private enum Status {CONTINUE, WON, LOST};

	private static final int SNACK_EYE = 2;
	private static final int TREY = 3;
	private static final int SEVEN = 7;
	private static final int YO_LEVEN = 11;
	private static final int BOX_CARS = 12;


	public static void main(String[] args) {
		
	}

	public static int rollDice() {

		int die1 = 1 + randomNumbers.nextInt(6);
		int die2 = 1 + randomNumbers.nextInt(6);

		int sum = die1 + die2;

		System.out.printf("Player rolled %d + %d = %d\n", die1, die2, sum);

		return sum;
	}

}