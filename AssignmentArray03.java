import java.util.Scanner;
public class AssignmentArray03 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Input number of elements: ");
      int n = sc.nextInt();

      int[] numbers = new int[n];
      
      int sum =0;

      for (int i = 0; i < numbers.length; i++) {
        System.out.print("Enter the final score " + (i + 1) + ": ");
        numbers[i] = sc.nextInt();
      }
      int highest = numbers[0];
      int lowest = numbers[0];
      double average = 0;

      for (int i = 0; i < numbers.length; i++) {
        if (numbers[i] > highest) {
            highest = numbers[i];  
        }
        if (numbers[i] < lowest) {
            lowest = numbers[i];
        }
    
        sum += numbers[i];
    }
     average = sum / n;

    System.out.println("Highest value: " + highest);
    System.out.println("Lowest value: " + lowest);
    System.out.println("Average value: " + average);
}
}

