public class Factorial {

	public static void main(String[] args) {
		
		int num = 5;
		int factorial = 1;

		for (int i = 1; i <= num; i ++) {
			factorial = factorial * i;
		}
		System.out.print(factorial); // 5 x 4 x 3 x 2 x 1 = 120 
	}
}