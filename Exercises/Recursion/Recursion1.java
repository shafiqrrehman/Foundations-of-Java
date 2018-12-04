public class Recursion1 {

	public static int recusion(int n) {

		if (n == 1) {
			return 0;
		} else {
			return 1 + recusion(n - 1);
		}
	}

	public static void main(String[] args) {
		Recursion1 obj = new Recursion1();
		System.out.println(recusion(11));
	}
}