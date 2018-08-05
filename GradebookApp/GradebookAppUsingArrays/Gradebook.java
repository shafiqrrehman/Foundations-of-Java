public class Gradebook {

	private String courseName;
	private int[] grades;

	public Gradebook ( String name, int[] gradesArray ) {

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

		// call getAverage method to calculate the average grade
		System.out.printf( "\nClass average is %.2f\n", getAverage() );

		// call methods getMinimum and getMaximum
		System.out.printf( "Lowest grade is %d\nHighest grade is %d\n\n", getMinimum(), getMaximum() );

		// call outputBarChart to print grade distribution chart
		outputBarChart();
	} // end of method processGrades


	// Find maximum grade
	public int getMinimum() {

		int lowGrade = grades[ 0 ]; // Assume grades[ 0 ] is smallest

		// Loop through grades arrays
		for ( int grade : grades ) {

			if ( grade < lowGrade ) // if grade is less than highGrade, assign it to highGrade
				lowGrade = grade;	 // new lowest grade
		}

		return lowGrade; // return lowst grade
	} // end of getMinimum method


	// Find maximum grade
	public int getMaximum() {

		int highGrade = grades[ 0 ]; // Assume grades[ 0 ] is largest

		// Loop through grades arrays
		for ( int grade : grades ) {

			if ( grade > highGrade ) // if grade is greater than highGrade, assign it to highGrade
				highGrade = grade;	 // new highest grade
		}

		return highGrade; // return highest grade
	} // end of getMaximum method


	// Determine average grade for test
	public double getAverage() {

		int total = 0;

		// Sum grade for one student
		for ( int grade : grades )
			total += grade;

		return (double) total / grades.length;
	} // end getAverage method


	// Output bar chart displaying grade distribution
	public void outputBarChart() {

		System.out.println( "Grade distribution:" );

		// Store frequency of grades in each range of 10 grades
		int[] frequency = new int[ 11 ];

		// For each grade, increment appropriate frequency
		for ( int grade : grades )
			++frequency[ grade / 10 ];

		// For each grade frequency, print bar in chart
		for ( int count = 0; count < frequency.length; count++ ) {
			
			// Output bar label ( "00-09: ", ..., "90-99: ", "100: "  )
			if ( count == 10)
				System.out.printf( "%5d: ", 100 );
			else
				System.out.printf( "%02d-%02d: ", count * 10, count * 10 + 9 );

			// Print bar of asterisks
			for ( int star = 0; star < frequency[ count ]; star++ )
				System.out.print("*");

			System.out.println(); // Start a new line of output

		} // End of for statement
	} // end of outputBarChart method


	// Outputs the content of grades array
	public void outputGrades() {

		System.out.println( "The Grades are:\n" );

		// Output each student grade
		for ( int student = 0; student < grades.length; student++ ) {
			
			System.out.printf( "Student %2d: %3d\n", student + 1, grades [ student ] );

		} // end of for statement
	} // end of outputGrades method
} // end of Gradebook class