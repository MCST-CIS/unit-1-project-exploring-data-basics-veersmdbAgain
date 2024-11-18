/**
 * Veer Mangat
 * Computer Programming II
 * Unit 1 Project: Exploring Data Basics
 * Start Date: 11/12/2024
 * End Date: 11/17/2024
 * Grade Calculator
 */

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner reply1 = new Scanner(System.in);

        System.out.print("Enter the number of assignments: "); 
        int numAssignments = reply1.nextInt();

        double totalAssignmentsScore = 0; 
        for (int i = 1; i <= numAssignments; i++) {
            System.out.print("Enter the score for assignment " + i + " (0-100): ");
            totalAssignmentsScore += reply1.nextDouble();
        }
         // lines 16 - 22 are for data collection, it starts off by figuring out
         // how many test scores there are, then collecting all of them
         // line 27 is arithmetic manipulation to figure out the average

        double averageScore = totalAssignmentsScore / numAssignments;
        boolean passed = averageScore >= 60;

         // f strings, \n's, and \t's, are used to try and make a pretty looking
         // display screen for all the collected data and the results from the
         // arithmetic operations
        System.out.println("\n\tGrade Summary");
        System.out.printf("Total Assignment Score: %.2f\n", totalAssignmentsScore);
        System.out.printf("Average Score: %.2f\n", averageScore);

        if (passed) {
            System.out.println("Passed: Yes");
        } else {
            System.out.println("Passed: No");
        }

        reply1.close();
    }
}
