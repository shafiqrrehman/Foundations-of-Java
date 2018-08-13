import java.util.Arrays;

public class ArrayManipulation {

	public static void main(String[] args) {
		
	}

	// output values in each arrays
	public static void diplayArray ( int[] array, String description ) {

		System.out.printf( "\n%s: ", description );

		for ( int value : array)
			System.out.printf( "%d ", value );
	} // end of method displayArray
} // end of class displayArray