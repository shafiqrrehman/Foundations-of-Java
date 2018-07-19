public class SumArray {

	public static void main(String[] args) {
		
		int[] array = {67, 87, 22, 36, 26, 76, 77, 94, 62, 16};
		int total = 0;

		for (int i = 0; i < array.length; i++) {

			total += array[i];
		}

		System.out.printf("\nTotal of array elements is %d\n", total);
	}
}