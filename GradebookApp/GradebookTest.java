import java.util.Scanner;

public class GradebookTest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Gradebook myGradebook = new Gradebook("CS101 Introduction to Java Programming");

        myGradebook.displayMessage();
        myGradebook.inputGrades();
        myGradebook.displayGradeReport();

    }
}