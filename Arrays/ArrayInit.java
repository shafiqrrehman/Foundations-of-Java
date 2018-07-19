public class ArrayInit {

	public static void main(String[] args) {
		
		int[] a = {23, 56, 88, 97, 10, 33, 48, 50, 45, 65};

		System.out.printf("\n%s%8s\n", "Index", "Value");

		for (int i = 0; i < a.length; i++) {
			
			System.out.printf("%5d%8d\n", i, a[i]);
		}
	}
}