public class Recursion2 {

	public static int recur(int x, int y) { // 5,2

		if (x == 0) {
			return y;
		} else {
			return recur(x-1, x+y);
		}
	}

	public static void main(String[] args) {
		
		Recursion2 obj = new Recursion2();
		System.out.println(recur(5, 2));
	}
}