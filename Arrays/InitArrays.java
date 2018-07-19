public class InitArrays {

	public static void main(String[] args) {
		
		int[] array = new int[11];

		System.out.printf("\n%s%8s\n", "Index", "Values");

		for (int i = 0; i < 11; i++) {

			System.out.printf("%4d%7d\n", i, array[i]);
		}
	}
}