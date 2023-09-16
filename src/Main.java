import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner doubleScanner = new Scanner(System.in);
        String gradeOutput;
        System.out.println("Please enter your grade:");
        double grade = doubleScanner.nextDouble();
        //assigned double just in case someone enters decimals
        //if, if else... until end in else. Not like C++ exactly
        if (grade >= 92.0){
            gradeOutput= "A!";
        } else if (grade >= 89.0 && grade < 92.0){
            gradeOutput = "A-!";
        } else if (grade >= 87.0 && grade < 89.0) {
            gradeOutput = "B+!";
        } else if (grade >= 82.0 && grade < 87.0) {
            gradeOutput = "B!";
        } else if(grade >= 79.0 && grade < 82.0) {
            gradeOutput = "B-!";
        } else if (grade >= 77.0 && grade < 79.0) {
            gradeOutput = "C+!";
        } else if (grade >=72.0 && grade < 77.0) {
            gradeOutput = "C!";
        } else if (grade >= 69.0 && grade < 72.0) {
            gradeOutput = "C-!";
        } else if (grade >= 67.0 && grade < 69.0) {
            gradeOutput = "D+!";
        } else if (grade >= 60.0 && grade < 67.0) {
            gradeOutput = "D!";
        } else if (grade <0) {
            gradeOutput = "ERROR. Cannot compute negative numbers.";
        } else {
            gradeOutput = "F!";
        }
        System.out.println("Your grade is a " + gradeOutput);
    }
}