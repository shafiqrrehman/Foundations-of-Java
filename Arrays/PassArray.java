public class PassArray {

	public static void main(String[] args) {
		
		int[] array = { 1, 2, 3, 4, 5 };

		System.out.println( "\nEffects of passing reference to entire array are:\n\n" + 
						  "The value of the original array are:" );

		for ( int value : array )
			System.out.printf( "	%d", value );

		modifiedArray( array );
		System.out.println( "\n\nThe values of modified array are:" );

		for ( int value : array )
			System.out.printf( "	%d", value );

		System.out.printf( 
			"\n\nEffects of passing array element value:\n\n" + 
			"array[3] before modifiedElement: %d\n", array[ 3 ] );

		modifiedElement( array[ 3 ] );
		System.out.printf( "array[ 3 ] after modifiedElement: %d\n", array[ 3 ] );

	}

	public static void modifiedArray(int[] array2) {

		for (int counter = 0; counter < array2.length; counter++) {
			
			array2[ counter ] *= 2;
		}
	}

	public static void modifiedElement(int element) {

		element *= 2;

		System.out.printf("Value of element in modifiedElement: %d\n", element);
	}
}