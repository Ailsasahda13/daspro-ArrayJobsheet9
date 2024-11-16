import java.util.Scanner;
public class ArrayAverageScore244107060006 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
//         int[] score = new int[4];
//         double total = 0;
//         double average;
//         int passedCount = 0;
//         int failedCount = 0;
//         double totalPassedCount = 0;
//         double totalFailedCount = 0;
//         int i = 0;

//         System.out.print("Enter the number of students: ");
//         score[i] = sc.nextInt();
//         for (  i = 0; i < score.length; i++) {
//             System.out.print("Enter student score " + i + ": ");
//             score[i] = sc.nextInt();
        
//             for ( i = 0; i < score.length; i++) {
//                 total += score[i];
            
//                 // System.out.println("Student " + (i+1) + ": ");
//             //     passedCount++;
//             if (score[i] > 70) {
//                passedCount++; // Increment the passed counter
//                totalPassedCount += score[i];
            
//             } else {
//                 failedCount++;
//                 totalFailedCount += score[i];
//             }
//             double averagePassed = (double) totalPassedCount / passedCount;
//         double averageFailed = (double) totalFailedCount / failedCount;
    
//         average = total / score.length;
//         System.out.println("The average score of students who passed is " + average);
//         System.out.println("The average score of students who failed is " + passedCount);
        
//         }   
// }
// }
// }

System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();

        // Create an array to store the scores
        int[] scores = new int[numStudents];

        // Variables for calculations
        int passedCount = 0, failedCount = 0;
        double totalPassedScore = 0, totalFailedScore = 0;

        // Input scores for each student
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter the final score " + i + ": ");
            scores[i] = sc.nextInt();

            // Determine pass/fail and update totals
            if (scores[i] > 70) { // Passing condition
                passedCount++;
                totalPassedScore += scores[i];
            } else { // Failing condition
                failedCount++;
                totalFailedScore += scores[i];
            }
        }

        // Calculate averages
        double averagePassed = (passedCount > 0) ? totalPassedScore / passedCount : 0;
        double averageFailed = (failedCount > 0) ? totalFailedScore / failedCount : 0;

        // Display results
        System.out.println("The average score of students who passed is " + averagePassed);
        System.out.println("The average score of students who failed is " + averageFailed);

        sc.close();
    }
}
