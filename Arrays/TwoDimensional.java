public class TwoDimensional {

	public static void main(String[] args) {
		
		int[][] array1 = { { 1, 2, 3 }, { 4, 5, 6} };
		int[][] array2 = { { 1, 2 }, { 3 }, { 4, 5, 6 } };
	}

	public static void outputArray( int[] array ) {

		for ( int row = 0; row < array.length; row++) {
			
			for ( int column = 0; column < array[ row ].length; column++)
				System.out.printf( "%d ", array[ row ][ column ] );

			System.out.println();
		}
	}
}