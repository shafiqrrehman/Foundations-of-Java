public class OverloadedConstructorsTest {

	public static void main(String[] args) {
		
		OverloadedConstructors t1 = new OverloadedConstructors();
		OverloadedConstructors t2 = new OverloadedConstructors( 2 );
		OverloadedConstructors t3 = new OverloadedConstructors( 21, 34 );
		OverloadedConstructors t4 = new OverloadedConstructors( 12, 25, 42 );
		OverloadedConstructors t5 = new OverloadedConstructors( t4 );

		System.out.println( "Constructed with:" );
		System.out.println( "t1: all arguments defaulted" );
		System.out.printf( "	%s\n", t1.toUniversalString() );
		System.out.printf( "	%s\n", t1.toString() );

		System.out.println( "t2: hour specified: minute and second defaulted" );
		System.out.printf( "	%s\n", t2.toUniversalString() );
		System.out.printf( "	%s\n", t2.toString() );

		System.out.println( "t3: hour and minute specified: second defaulted" );
		System.out.printf( "	%s\n", t3.toUniversalString() );
		System.out.printf( "	%s\n", t3.toString() );

		System.out.println( "t4: hour, minute and second specified" );
		System.out.printf( "	%s\n", t4.toUniversalString() );
		System.out.printf( "	%s\n", t4.toString() );

		System.out.println( "t5: OverloadedConstructors object t4 specified" );
		System.out.printf( "	%s\n", t5.toUniversalString() );
		System.out.printf( "	%s\n", t5.toString() );

		try {

			OverloadedConstructors t6 = new OverloadedConstructors( 27, 74, 99 );
		} 
		catch ( IllegalArgumentException e ) {

			System.out.printf( "\nException while initializing t6: %s\n", 
				e.getMessage() );
		}
	}
}