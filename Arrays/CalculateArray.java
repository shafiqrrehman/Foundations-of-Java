public class CalculateArray {

	public static void main(String[] args) {
		
		final int ARRAY_LENGTH = 10;
		int[] array = new int[ARRAY_LENGTH];

		for (int count = 0; count < array.length; count++)
			array[count] = 2 + 2 * count;

		System.out.printf("\n%s%8s\n", "Index", "Value");

		for (int i = 0; i < array.length; i++) {
			System.out.printf("%5d%8d\n", i, array[i]);
		}
	}
}