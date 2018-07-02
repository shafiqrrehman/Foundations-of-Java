import java.util.Scanner;

public class GradebookTest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Gradebook myGradebook = new Gradebook("CS101 Introduction to Java Programming");


        // System.out.printf("gradeBook1 course name is: %s\n\n", myGradebook1.getCourseName());
        // System.out.printf("gradeBook1 course instructor is: %s\n\n", myGradebook1.getCourseInstructor());
        // System.out.printf("Initial course name is: %s\n\n", myGradebook.getCourseName);

        // System.out.println("Enter your Gradebook name ?");
        // String gradeBook = input.nextLine();
        // System.out.println();

        // myGradebook.setCourseName(gradeBook);

        myGradebook.displayMessage();
        myGradebook.inputGrades();
        myGradebook.displayGradeReport();
        // myGradebook.determineClassAverage();
    }
}