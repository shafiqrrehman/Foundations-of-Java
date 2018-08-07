public class TwoDimensional {

	// create and output two dimensional arrays
	public static void main(String[] args) {
		
		int[][] array1 = { { 1, 2, 3 }, { 4, 5, 6} };
		int[][] array2 = { { 1, 2 }, { 3 }, { 4, 5, 6 } };

		System.out.println("\nValues in array1 by rows are");
		outputArray( array1 ); // display array1 by row

		System.out.println("\nValues in array2 by rows are");
		outputArray( array2 ); // display array2 by row
	} // end of main method

	public static void outputArray( int[][] array ) {

		// loop through array's row
		for ( int row = 0; row < array.length; row++) {
			
			// loop through array's columns of current row
			for ( int column = 0; column < array[ row ].length; column++)
				System.out.printf( "%d ", array[ row ][ column ] );

			System.out.println();
		} // end of loop
	} // end of outpuArray method
} // end of Twodimensional class 