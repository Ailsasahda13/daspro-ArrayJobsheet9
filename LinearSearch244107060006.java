import java.util.Scanner;
public class LinearSearch244107060006 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of array elements: ");
        int n = sc.nextInt();

        int[] arrayInt = new int[n];
        int key;
        int result;
        
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print("Enter the array element " + i + ": ");
            arrayInt[i] = sc.nextInt();
        }
        System.out.print("Enter the key you want to search for: ");
         key = sc.nextInt();

         result = -1;

        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] == key) {
                result = i; 
                break; 
            }
        }
        if (result != -1) {
            System.out.println("The key in the array is located at index position " + result);
        } else {
            System.out.println("key not found");
        }
    }
}
