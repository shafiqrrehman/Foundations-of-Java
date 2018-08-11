public class CommandLineArguments {

	public static void main(String[] args) {
		
		if ( args.length != 3)
			System.out.println( "Error: Please re-enter the entire command, including\n" 
				+ "an array size, initial value and increment." );
		
		else {

			// get array size from first command line argument
			int arrayLength = Integer.parseInt( args[ 0 ] );
			int[] array = new int[ arrayLength ]; // create array

			// get initial and increament value from command line argument
			int initialValue = Integer.parseInt( args[ 1 ] );
			int increment = Integer.parseInt( args[ 2 ] );

			// calculate value for each array element
			for ( int counter = 0; counter < array.length; counter++)
				array[ counter ] = initialValue + increment * counter;

			System.out.printf( "%s%8s\n", "Index", "Value" );

			// display array index and value
			for ( int counter = 0; counter < array.length; counter++)
				System.out.printf( "%5s%8s\n", counter, array[ counter ] );
		} // end else
	} // end main method
} // end class