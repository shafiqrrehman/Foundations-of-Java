import java.util.Scanner;

public class Gradebook {

    private String courseName;
    private String courseInstructor;

    public Gradebook(String nameCourse, String nameIntructor) {
        courseName = nameCourse;
        courseInstructor = nameIntructor;
    }

    public void setCourseName(String name) {
        courseName = name;
    }

    public void setCourseInstructor(String name) {
        courseInstructor = name;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseInstructor() {
        return courseInstructor;
    }

    public void displayMessage() {

        System.out.printf("\nWelcome to the Grade Book for: %s!\n", getCourseName());
        System.out.printf("\nThis course is presented by: %s\n\n", getCourseInstructor());

    }

    public void determineClassAverage() {

        Scanner input = new Scanner(System.in);

        int grade, total, gradeCounter; 
        double average;

        total = 0;
        gradeCounter = 0;

        System.out.print("Enter grade or -1 to Quit: ");
        grade = input.nextInt();

        while( grade != -1 ) {

            total += grade;
            gradeCounter++;

            System.out.print("Enter grade or -1 to Quit: ");
            grade = input.nextInt();
        }

        if ( gradeCounter != 0 ) {

            average = (double) total / 10;
            
            System.out.printf("\nTotal of the %d grades entered is %d\n ", gradeCounter, total);
            System.out.printf("\nClass average is %.2f\n ", average);

        } else {
            System.out.println("No grades were entered!\n");
        }
    }
}