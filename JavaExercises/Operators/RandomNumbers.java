import java.util.Random;

public class RandomNumbers {

	public static void main(String[] args) {
		
		Random randomNum = new Random();

		int a;

		a = 1 + randomNum.nextInt(6);

		System.out.println( "Random Numbers: " + a );
	}
}