/* GradebookTest creates a Gradebook object using a 
	two-dimensional array of grades
	then invokes method processGrades to analyze them. */
public class GradebookTest {

	public static void main(String[] args) {
		
		// two-dimensional array of stuents grades
		int[][] gradesArray = { { 87, 96, 70 },
							  { 68, 87, 90 },
							  { 94, 100, 90 },
							  { 100, 81, 82 },
							  { 83, 65, 85 },
							  { 78, 87, 65 },
							  { 85, 75, 83 },
							  { 91, 94, 100 },
							  { 76, 72, 84 },
							  { 87, 93, 73 } };

		Gradebook myGradebook = new Gradebook( 
			"CS101 Introduction to Java Programming", gradesArray );
		myGradebook.diplayMessage();
		myGradebook.processGrades();
	}
}