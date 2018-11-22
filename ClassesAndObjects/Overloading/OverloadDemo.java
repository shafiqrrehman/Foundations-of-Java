public class OverloadDemo {

	void test() {
		System.out.println("No parameter.");
	}

	void test( int a ) {
		System.out.println("A: " + a);
	}

	double test( double a, double b ) {
		System.out.printf("A: %.2f B: %.2f", a, b);
		return a * b;
	}

	public static void main(String[] args) {
		
		OverloadDemo od = new OverloadDemo();
		double result;

		od.test();
		od.test(50);
		result = od.test(33.33, 22.21);
		System.out.println("\nResult of test(33.33, 22.21): " + result);
	}
}