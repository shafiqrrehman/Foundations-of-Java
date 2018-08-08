public class Gradebook {

	private String courseName;
	private int[][] grades;

	public Gradebook ( String name, int[][] gradesArray ) {

		courseName = name;
		grades = gradesArray;
	}

	public void setCourseName ( String name ) {

		courseName = name;
	}

	public String getCourseName() {

		return courseName;
	}

	public void diplayMessage() {

		System.out.printf( "\nWelcome to the Gradebook for\n%s!\n\n", getCourseName() );
	} // end of displayMessage method


	// Perform various operations on data
	public void processGrades() {

		// output grades array
		outputGrades();

		// call methods getMinimum and getMaximum
		System.out.printf( "\n%s %d\n%s %d\n\n", 
			"Lowest grade in the grade book is", getMinimum(), 
			"Highest grade in the grade book is", getMaximum() );

		// output grades distribution chart of all grades on all tests
		outputBarChart();
	} // end of method processGrades


	// Find maximum grade
	public int getMinimum() {

		// assume first element of grades array is smallest
		int lowGrade = grades[ 0 ][ 0 ];

		// Loop through grades arrays
		for ( int[] studentGrades : grades ) {

			// loop through columns of current row
			for ( int grade : studentGrades ) {

				// if grade less than lowGrade, assign it to lowGrade
				if ( grade < lowGrade )
					lowGrade = grade;
			} // end inner for loop
		} // end outer for loop

		return lowGrade; // return smallest grade
	} // end of getMinimum method


	// find maximum grade
	public int getMaximum() {

		// assume first element of grades array is largest
		int highGrade = grades[ 0 ][ 0 ];

		// Loop through grades arrays
		for ( int[] studentGrades : grades ) {

			// loop through columns of current row
			for ( int grade : studentGrades ) {

				// if grade less than lowGrade, assign it to lowGrade
				if ( grade > highGrade )
					highGrade = grade;
			} // end inner for loop
		} // end outer for loop

		return highGrade; // return highest grade
	} // end of getMaximum method


	// determine average grade for particular set of grades
	public double getAverage( int[] setOfGrades ) {

		int total = 0; // initialize total

		// Sum grade for one student
		for ( int grade : setOfGrades )
			total += grade;

		// return average of grades
		return (double) total / setOfGrades.length;
	} // end getAverage method


	// output bar chart displaying overall grade distribution
	public void outputBarChart() {

		System.out.println( "Overall grade distribution:" );

		// store frequency of grades in each range of 10 grades
		int[] frequency = new int[ 11 ];

		// for each grade in Gradebook, increment appropriate frequency
		for ( int[] studentGrades : grades ) {

			for ( int grade : studentGrades )
				++frequency[ grade / 10 ];
		} // end out for loop

		// for each grade frequency, print bar in chart
		for ( int count = 0; count < frequency.length; count++ ) {
			
			// output bar label ( "00-09: ", ..., "90-99: ", "100: "  )
			if ( count == 10)
				System.out.printf( "%5d: ", 100 );
			else
				System.out.printf( "%02d-%02d: ", count * 10, count * 10 + 9 );

			// print bar of asterisks
			for ( int star = 0; star < frequency[ count ]; star++ )
				System.out.print("*");

			System.out.println(); // start a new line of output

		} // end of for statement
	} // end of outputBarChart method


	// outputs the content of grades array
	public void outputGrades() {

		System.out.println( "The grades are:\n" );
		System.out.print( "               " ); // align column heads

		// create a column heading for each of the tests
		for ( int test = 0; test < grades[ 0 ].length; test++ )
			System.out.printf( "Test %d ", test + 1 );

		System.out.println( "Average" ); // student average column heading

		// create rows/columns of text representing array grades
		for ( int student = 0; student < grades.length; student++) {
			
			System.out.printf( "Student %2d", student + 1 );

			for ( int test : grades[ student ] ) // output student's grades
				System.out.printf( "%8d", test );

			// call method getAverage to calculate student's average grade:
			// pass rpw of grades as the argument to getAverage
			double average = getAverage( grades[ student ] );
			System.out.printf( "%9.2f\n", average );
		} // end outer for loop
	} // end of outputGrades method
} // end of Gradebook class