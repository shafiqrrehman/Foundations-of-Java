public class EnhancedForTest {

	public static void main(String[] args) {
		
		int[] array = {87, 68, 78, 56, 88, 96, 100, 78, 85, 80};
		int total = 0;

		for (int number: array)
			total += number;

		System.out.printf("\nTotal of array elements is: %d\n", total);
	}
}