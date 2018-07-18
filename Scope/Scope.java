public class Scope {

	private static int x = 1;

	public static void main(String[] args) {

		int x = 5;

		System.out.printf("\nLocal X in main is %d \n", x);

		useLocalVariable();
		useField();

		useLocalVariable();
		useField();

		System.out.printf("\nLocal X in main is %d \n", x);
		
	}

	public static void useLocalVariable() {

		int x = 25;

		System.out.printf("\nLocal X on entering method useLocalVariable is %d\n", x);
		++x;
		System.out.printf("Local X on before exiting method useLocalVariable is %d\n", x);

	}

	public static void useField() {

		System.out.printf("\nLocal X on entering method useField is %d\n", x);

		x *= 10;

		System.out.printf("Local X on before exiting method useField is %d\n", x);
	}
}