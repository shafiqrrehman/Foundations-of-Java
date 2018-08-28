public class PackageAccessTest {

	public static void main(String[] args) {
		
		PackageAccess packageAccess = new PackageAccess();

		System.out.printf( "After instantiation:\n%s\n", packageAccess );

		packageAccess.number = 77;
		packageAccess.string = "Goodbye";

		System.out.printf( "\nAfter changing values:\n%s\n", packageAccess );
	}
}

class PackageAccess {

	int number;
	String string;

	public PackageAccess() {

		number = 0;
		string = "Hello";
	}

	public String toString() {

		return String.format( "number: %d string: %s", number, string );
	}
}