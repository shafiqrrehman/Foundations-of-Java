public class Time1Test {

	public static void main(String[] args) {
		
		Time1 time = new Time1();

		System.out.print( "The initial universal time is: " );
		System.out.println( time.toUniversalString() );
		System.out.print( "The initial standard time is: " );
		System.out.println( time.toString() );
		System.out.println();

		// change time and output updated time
		time.setTime( 13, 27, 6);
		System.out.print( "Universal time after setTime is: " );
		System.out.println( time.toUniversalString() );
		System.out.print( "Standard time after setTime is: " );
		System.out.println( time.toString() );
		System.out.println();

		// attempt to set time with invalid values
		try {
			time.setTime( 99, 99, 99 ); // all values are out of range
		} // end try
		catch ( IllegalArgumentException e ) {

			System.out.printf( "Exception: %s\n\n", e.getMessage() );
		} // end catch

		System.out.println( "After attempting invalid settings:" );
		System.out.print( "Universal time: " );
		System.out.println( time.toUniversalString() );
		System.out.print( "Standard time: " );
		System.out.println( time.toString() );
	}
}