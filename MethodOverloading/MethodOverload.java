public class MethodOverload {

	public static void main(String[] args) {
		
		System.out.printf("Square of 7 integer is %d\n", square(7));
		System.out.printf("Square of 7.5 double is %.2f\n", square(7.5));
	}

	public static int square(int intValue) {

		System.out.printf("\nCalled square with int argument: %d\n", intValue);

		return intValue * intValue;
	}

	public static double square(double doubleValue) {

		System.out.printf("\nCalled square with double argument: %.1f\n", doubleValue);

		return doubleValue * doubleValue;
	}
}