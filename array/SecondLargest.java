import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n = in.nextInt();
        System.out.print("Enter the array elements: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=in.nextInt();
        }
        int max = findMax(arr);
        int secondMax = findSecondMax(arr, max);
        System.out.println("The second largest number is: " + secondMax);
    }
    static int findMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) { 
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
    static int findSecondMax(int[] array, int maxF) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) { 
            if (array[i] > max && array[i]!=maxF) {
                max = array[i];
            }
        }
        return max;
    }
    
}
