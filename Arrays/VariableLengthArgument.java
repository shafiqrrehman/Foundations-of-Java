public class VariableLengthArgument {

	public static void main(String[] args) {
		
		double d1 = 10.8;
		double d2 = 20.9;
		double d3 = 30.1;
		double d4 = 40.5;

		System.out.printf( "\nd1 = %.2f\nd2 = %.2f\nd3 = %.2f\nd4 = %.2f\n\n", 
			d1, d2, d3, d4 );

		System.out.printf( "Average of d1 and d2 is %.2f\n", average( d1, d2 ) );

		System.out.printf( "Average of d1, d2, and d3 is %.2f\n", average( d1, d2, d3 ) );

		System.out.printf( "Average of d1, d2, d3 and d4 is %.2f\n", average( d1, d2, d3, d4 ) );
	}

	// calculate average
	public static double average ( double... numbers ) {

		double total = 0.0; // intialize total

		// calculate total by enhanced for loop
		for ( double d : numbers )
			total += d;

		return total / numbers.length; // return average
	} // end average method
} // end VariableLengthargument Lists class