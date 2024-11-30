import java.util.Scanner;

public class RemoveDuplicateSortedArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n = in.nextInt();
        System.out.print("Enter the array elements: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        
        // Get the length of the array after removing duplicates
        int newLength = removeDuplicateElements(arr);

        // Print the modified array with unique elements
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
    // Method to remove duplicate elements
    static int removeDuplicateElements(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }

        int index = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[index] = arr[i];
                index++;
            }
        }

        // Return the length of the array with unique elements
        return index;
    }
}
