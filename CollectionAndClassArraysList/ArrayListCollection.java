import java.util.ArrayList;

public class ArrayListCollection {

	public static void main(String[] args) {
		
		// create a new ArrayList of String with an initial capacity elements 10
		ArrayList< String > items = new ArrayList< String >();
		items.add( "red" );
		items.add( 0, "yellow" );

		// header
		System.out.print( "\nDisplay list contents with counter controlled loop:" );

		// display the color in the list
		for ( int i = 0; i < items.size(); i++ )
			System.out.printf(" %s", items.get( i ) );

		// display colors using foreach in the display method
		display( items, "\nDisplay list contents with enhanced for loop:" );

		items.add( "green" ); // add green to the end of list
		items.add( "yellow" ); // add yellow to the end of list
		display( items, "List with two new elements: " );

		items.remove( "yellow" ); // remove the first yellow
		display( items, "Remove first instance of yellow: " );

		items.remove( 1 ); // remove an item in index 1
		display( items, "Remove second lis element (green): " );

		// check if the red in the list
		System.out.printf( "\"red\" is %sin the list\n", 
			items.contains( "red" ) ? "" : "not " );

		// display number of elements in the list
		System.out.printf( "Size: %s\n", items.size() );
	} // end main

	public static void display ( ArrayList< String > items, String header ) {

		System.out.print( header );

		// display each items lists
		for ( String item : items )
			System.out.printf( " %s", item );

		System.out.println();
	} // end method display
} // end class ArrayListCollection