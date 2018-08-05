/* GradebookTest creates a Gradebook object using an array of grades
	then invokes method processGrades to analyze them. */
public class GradebookTest {

	public static void main(String[] args) {
		
		// Array of stuents grades
		int[] gradesArray = { 87, 97, 78, 62, 75, 96, 33, 89, 94, 86 };

		Gradebook myGradebook = new Gradebook( 
			"CS101 Introduction to Java Programming", gradesArray );
		myGradebook.diplayMessage();
		myGradebook.processGrades();
	}
}